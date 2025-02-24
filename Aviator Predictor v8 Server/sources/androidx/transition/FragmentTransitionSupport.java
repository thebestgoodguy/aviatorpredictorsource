package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.os.CancellationSignal;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransitionImpl;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"RestrictedApi"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes51.dex */
public class FragmentTransitionSupport extends FragmentTransitionImpl {
    @Override // androidx.fragment.app.FragmentTransitionImpl
    public boolean canHandle(Object transition) {
        return transition instanceof Transition;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public Object cloneTransition(Object transition) {
        if (transition == null) {
            return null;
        }
        Transition copy = ((Transition) transition).mo9clone();
        return copy;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public Object wrapTransitionInSet(Object transition) {
        if (transition == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) transition);
        return transitionSet;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setSharedElementTargets(Object transitionObj, View nonExistentView, ArrayList<View> sharedViews) {
        TransitionSet transition = (TransitionSet) transitionObj;
        List<View> views = transition.getTargets();
        views.clear();
        int count = sharedViews.size();
        for (int i = 0; i < count; i++) {
            View view = sharedViews.get(i);
            bfsAddViewChildren(views, view);
        }
        views.add(nonExistentView);
        sharedViews.add(nonExistentView);
        addTargets(transition, sharedViews);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setEpicenter(Object transitionObj, View view) {
        if (view != null) {
            Transition transition = (Transition) transitionObj;
            final Rect epicenter = new Rect();
            getBoundsOnScreen(view, epicenter);
            transition.setEpicenterCallback(new Transition.EpicenterCallback() { // from class: androidx.transition.FragmentTransitionSupport.1
                @Override // androidx.transition.Transition.EpicenterCallback
                public Rect onGetEpicenter(@NonNull Transition transition2) {
                    return epicenter;
                }
            });
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void addTargets(Object transitionObj, ArrayList<View> views) {
        Transition transition = (Transition) transitionObj;
        if (transition != null) {
            if (transition instanceof TransitionSet) {
                TransitionSet set = (TransitionSet) transition;
                int numTransitions = set.getTransitionCount();
                for (int i = 0; i < numTransitions; i++) {
                    Transition child = set.getTransitionAt(i);
                    addTargets(child, views);
                }
                return;
            }
            if (!hasSimpleTarget(transition)) {
                List<View> targets = transition.getTargets();
                if (isNullOrEmpty(targets)) {
                    int numViews = views.size();
                    for (int i2 = 0; i2 < numViews; i2++) {
                        transition.addTarget(views.get(i2));
                    }
                }
            }
        }
    }

    private static boolean hasSimpleTarget(Transition transition) {
        return (isNullOrEmpty(transition.getTargetIds()) && isNullOrEmpty(transition.getTargetNames()) && isNullOrEmpty(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public Object mergeTransitionsTogether(Object transition1, Object transition2, Object transition3) {
        TransitionSet transitionSet = new TransitionSet();
        if (transition1 != null) {
            transitionSet.addTransition((Transition) transition1);
        }
        if (transition2 != null) {
            transitionSet.addTransition((Transition) transition2);
        }
        if (transition3 != null) {
            transitionSet.addTransition((Transition) transition3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void scheduleHideFragmentView(Object exitTransitionObj, final View fragmentView, final ArrayList<View> exitingViews) {
        Transition exitTransition = (Transition) exitTransitionObj;
        exitTransition.addListener(new Transition.TransitionListener() { // from class: androidx.transition.FragmentTransitionSupport.2
            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionStart(@NonNull Transition transition) {
                transition.removeListener(this);
                transition.addListener(this);
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(@NonNull Transition transition) {
                transition.removeListener(this);
                fragmentView.setVisibility(8);
                int numViews = exitingViews.size();
                for (int i = 0; i < numViews; i++) {
                    ((View) exitingViews.get(i)).setVisibility(0);
                }
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionCancel(@NonNull Transition transition) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionPause(@NonNull Transition transition) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionResume(@NonNull Transition transition) {
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public Object mergeTransitionsInSequence(Object exitTransitionObj, Object enterTransitionObj, Object sharedElementTransitionObj) {
        Transition staggered = null;
        Transition exitTransition = (Transition) exitTransitionObj;
        Transition enterTransition = (Transition) enterTransitionObj;
        Transition sharedElementTransition = (Transition) sharedElementTransitionObj;
        if (exitTransition != null && enterTransition != null) {
            staggered = new TransitionSet().addTransition(exitTransition).addTransition(enterTransition).setOrdering(1);
        } else if (exitTransition != null) {
            staggered = exitTransition;
        } else if (enterTransition != null) {
            staggered = enterTransition;
        }
        if (sharedElementTransition == null) {
            return staggered;
        }
        TransitionSet together = new TransitionSet();
        if (staggered != null) {
            together.addTransition(staggered);
        }
        together.addTransition(sharedElementTransition);
        return together;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void beginDelayedTransition(ViewGroup sceneRoot, Object transition) {
        TransitionManager.beginDelayedTransition(sceneRoot, (Transition) transition);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void scheduleRemoveTargets(Object overallTransitionObj, final Object enterTransition, final ArrayList<View> enteringViews, final Object exitTransition, final ArrayList<View> exitingViews, final Object sharedElementTransition, final ArrayList<View> sharedElementsIn) {
        Transition overallTransition = (Transition) overallTransitionObj;
        overallTransition.addListener(new TransitionListenerAdapter() { // from class: androidx.transition.FragmentTransitionSupport.3
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionStart(@NonNull Transition transition) {
                if (enterTransition != null) {
                    FragmentTransitionSupport.this.replaceTargets(enterTransition, enteringViews, null);
                }
                if (exitTransition != null) {
                    FragmentTransitionSupport.this.replaceTargets(exitTransition, exitingViews, null);
                }
                if (sharedElementTransition != null) {
                    FragmentTransitionSupport.this.replaceTargets(sharedElementTransition, sharedElementsIn, null);
                }
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(@NonNull Transition transition) {
                transition.removeListener(this);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setListenerForTransitionEnd(@NonNull Fragment outFragment, @NonNull Object transition, @NonNull CancellationSignal signal, @NonNull final Runnable transitionCompleteRunnable) {
        final Transition realTransition = (Transition) transition;
        signal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.transition.FragmentTransitionSupport.4
            @Override // androidx.core.os.CancellationSignal.OnCancelListener
            public void onCancel() {
                realTransition.cancel();
            }
        });
        realTransition.addListener(new Transition.TransitionListener() { // from class: androidx.transition.FragmentTransitionSupport.5
            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionStart(@NonNull Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(@NonNull Transition transition2) {
                transitionCompleteRunnable.run();
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionCancel(@NonNull Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionPause(@NonNull Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionResume(@NonNull Transition transition2) {
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void swapSharedElementTargets(Object sharedElementTransitionObj, ArrayList<View> sharedElementsOut, ArrayList<View> sharedElementsIn) {
        TransitionSet sharedElementTransition = (TransitionSet) sharedElementTransitionObj;
        if (sharedElementTransition != null) {
            sharedElementTransition.getTargets().clear();
            sharedElementTransition.getTargets().addAll(sharedElementsIn);
            replaceTargets(sharedElementTransition, sharedElementsOut, sharedElementsIn);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void replaceTargets(Object transitionObj, ArrayList<View> oldTargets, ArrayList<View> newTargets) {
        Transition transition = (Transition) transitionObj;
        if (transition instanceof TransitionSet) {
            TransitionSet set = (TransitionSet) transition;
            int numTransitions = set.getTransitionCount();
            for (int i = 0; i < numTransitions; i++) {
                Transition child = set.getTransitionAt(i);
                replaceTargets(child, oldTargets, newTargets);
            }
            return;
        }
        if (!hasSimpleTarget(transition)) {
            List<View> targets = transition.getTargets();
            if (targets.size() == oldTargets.size() && targets.containsAll(oldTargets)) {
                int targetCount = newTargets == null ? 0 : newTargets.size();
                for (int i2 = 0; i2 < targetCount; i2++) {
                    transition.addTarget(newTargets.get(i2));
                }
                for (int i3 = oldTargets.size() - 1; i3 >= 0; i3--) {
                    transition.removeTarget(oldTargets.get(i3));
                }
            }
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void addTarget(Object transitionObj, View view) {
        if (transitionObj != null) {
            Transition transition = (Transition) transitionObj;
            transition.addTarget(view);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void removeTarget(Object transitionObj, View view) {
        if (transitionObj != null) {
            Transition transition = (Transition) transitionObj;
            transition.removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public void setEpicenter(Object transitionObj, final Rect epicenter) {
        if (transitionObj != null) {
            Transition transition = (Transition) transitionObj;
            transition.setEpicenterCallback(new Transition.EpicenterCallback() { // from class: androidx.transition.FragmentTransitionSupport.6
                @Override // androidx.transition.Transition.EpicenterCallback
                public Rect onGetEpicenter(@NonNull Transition transition2) {
                    if (epicenter == null || epicenter.isEmpty()) {
                        return null;
                    }
                    return epicenter;
                }
            });
        }
    }
}
