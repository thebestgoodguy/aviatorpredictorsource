package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class WindowMetricsCalculatorCompat implements WindowMetricsCalculator {
    public static final WindowMetricsCalculatorCompat INSTANCE = new WindowMetricsCalculatorCompat();
    private static final String TAG;

    static {
        String simpleName = WindowMetricsCalculatorCompat.class.getSimpleName();
        i.c(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        TAG = simpleName;
    }

    private WindowMetricsCalculatorCompat() {
    }

    private final DisplayCutout getCutoutForDisplay(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
            constructor.setAccessible(true);
            Object newInstance = constructor.newInstance(new Object[0]);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, newInstance);
            Field declaredField = newInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(newInstance);
            if (obj instanceof DisplayCutout) {
                return (DisplayCutout) obj;
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e5) {
            Log.w(TAG, e5);
        }
        return null;
    }

    private final int getNavigationBarHeight(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private final void getRectSizeFromDisplay(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    public WindowMetrics computeCurrentWindowMetrics(Activity activity) {
        i.d(activity, "activity");
        int r02 = Build.VERSION.SDK_INT;
        return new WindowMetrics(r02 >= 30 ? ActivityCompatHelperApi30.INSTANCE.currentWindowBounds(activity) : r02 >= 29 ? computeWindowBoundsQ$window_release(activity) : r02 >= 28 ? computeWindowBoundsP$window_release(activity) : r02 >= 24 ? computeWindowBoundsN$window_release(activity) : computeWindowBoundsIceCreamSandwich$window_release(activity));
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    public WindowMetrics computeMaximumWindowMetrics(Activity activity) {
        Rect rect;
        i.d(activity, "activity");
        if (Build.VERSION.SDK_INT >= 30) {
            rect = ActivityCompatHelperApi30.INSTANCE.maximumWindowBounds(activity);
        } else {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            i.c(defaultDisplay, "display");
            Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(defaultDisplay);
            rect = new Rect(0, 0, realSizeForDisplay$window_release.x, realSizeForDisplay$window_release.y);
        }
        return new WindowMetrics(rect);
    }

    public final Rect computeWindowBoundsIceCreamSandwich$window_release(Activity activity) {
        int r02;
        i.d(activity, "activity");
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        i.c(defaultDisplay, "defaultDisplay");
        Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(defaultDisplay);
        Rect rect = new Rect();
        int r22 = realSizeForDisplay$window_release.x;
        if (r22 == 0 || (r02 = realSizeForDisplay$window_release.y) == 0) {
            defaultDisplay.getRectSize(rect);
        } else {
            rect.right = r22;
            rect.bottom = r02;
        }
        return rect;
    }

    public final Rect computeWindowBoundsN$window_release(Activity activity) {
        i.d(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
            i.c(defaultDisplay, "defaultDisplay");
            Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(defaultDisplay);
            int navigationBarHeight = getNavigationBarHeight(activity);
            int r22 = rect.bottom;
            if (r22 + navigationBarHeight == realSizeForDisplay$window_release.y) {
                rect.bottom = r22 + navigationBarHeight;
            } else {
                int r23 = rect.right;
                if (r23 + navigationBarHeight == realSizeForDisplay$window_release.x) {
                    rect.right = r23 + navigationBarHeight;
                }
            }
        }
        return rect;
    }

    public final Rect computeWindowBoundsP$window_release(Activity activity) {
        DisplayCutout cutoutForDisplay;
        Rect rect;
        i.d(activity, "activity");
        Rect rect2 = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                if (invoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect = (Rect) invoke;
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj, new Object[0]);
                if (invoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect = (Rect) invoke2;
            }
            rect2.set(rect);
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e5) {
            Log.w(TAG, e5);
            getRectSizeFromDisplay(activity, rect2);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        DisplayCompatHelperApi17 displayCompatHelperApi17 = DisplayCompatHelperApi17.INSTANCE;
        i.c(defaultDisplay, "currentDisplay");
        displayCompatHelperApi17.getRealSize(defaultDisplay, point);
        ActivityCompatHelperApi24 activityCompatHelperApi24 = ActivityCompatHelperApi24.INSTANCE;
        if (!activityCompatHelperApi24.isInMultiWindowMode(activity)) {
            int navigationBarHeight = getNavigationBarHeight(activity);
            int r6 = rect2.bottom;
            if (r6 + navigationBarHeight == point.y) {
                rect2.bottom = r6 + navigationBarHeight;
            } else {
                int r62 = rect2.right;
                if (r62 + navigationBarHeight == point.x) {
                    rect2.right = r62 + navigationBarHeight;
                } else if (rect2.left == navigationBarHeight) {
                    rect2.left = 0;
                }
            }
        }
        if ((rect2.width() < point.x || rect2.height() < point.y) && !activityCompatHelperApi24.isInMultiWindowMode(activity) && (cutoutForDisplay = getCutoutForDisplay(defaultDisplay)) != null) {
            int r12 = rect2.left;
            DisplayCompatHelperApi28 displayCompatHelperApi28 = DisplayCompatHelperApi28.INSTANCE;
            if (r12 == displayCompatHelperApi28.safeInsetLeft(cutoutForDisplay)) {
                rect2.left = 0;
            }
            if (point.x - rect2.right == displayCompatHelperApi28.safeInsetRight(cutoutForDisplay)) {
                rect2.right += displayCompatHelperApi28.safeInsetRight(cutoutForDisplay);
            }
            if (rect2.top == displayCompatHelperApi28.safeInsetTop(cutoutForDisplay)) {
                rect2.top = 0;
            }
            if (point.y - rect2.bottom == displayCompatHelperApi28.safeInsetBottom(cutoutForDisplay)) {
                rect2.bottom += displayCompatHelperApi28.safeInsetBottom(cutoutForDisplay);
            }
        }
        return rect2;
    }

    public final Rect computeWindowBoundsQ$window_release(Activity activity) {
        i.d(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            if (invoke != null) {
                return new Rect((Rect) invoke);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e5) {
            Log.w(TAG, e5);
            return computeWindowBoundsP$window_release(activity);
        }
    }

    public final Point getRealSizeForDisplay$window_release(Display display) {
        i.d(display, "display");
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            DisplayCompatHelperApi17.INSTANCE.getRealSize(display, point);
        } else {
            try {
                Method declaredMethod = Display.class.getDeclaredMethod("getRealSize", Point.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(display, point);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e5) {
                Log.w(TAG, e5);
            }
        }
        return point;
    }
}
