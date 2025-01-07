package io.flutter.view;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.Keep;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Keep
/* loaded from: classes.dex */
class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private int nextFlutterId;
    private final View rootAccessibilityView;
    private final b reflectionAccessors = new b();
    private final SparseArray<c> flutterIdToOrigin = new SparseArray<>();
    private final Map<c, Integer> originToFlutterId = new HashMap();
    private final Map<View, Rect> embeddedViewToDisplayBounds = new HashMap();

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Method f4807a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f4808b;

        /* renamed from: c, reason: collision with root package name */
        private final Method f4809c;

        /* renamed from: d, reason: collision with root package name */
        private final Method f4810d;

        /* renamed from: e, reason: collision with root package name */
        private final Field f4811e;

        /* renamed from: f, reason: collision with root package name */
        private final Method f4812f;

        /* JADX WARN: Multi-variable type inference failed */
        private b() {
            Method method;
            Method method2;
            Method method3;
            Field field;
            Field declaredField;
            Method method4;
            Method method5;
            Field field2;
            Method method6 = null;
            try {
                method = AccessibilityNodeInfo.class.getMethod("getSourceNodeId", new Class[0]);
            } catch (NoSuchMethodException unused) {
                e2.b.f(AccessibilityViewEmbedder.TAG, "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
                method = null;
            }
            try {
                method2 = AccessibilityRecord.class.getMethod("getSourceNodeId", new Class[0]);
            } catch (NoSuchMethodException unused2) {
                e2.b.f(AccessibilityViewEmbedder.TAG, "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
                method2 = null;
            }
            if (Build.VERSION.SDK_INT > 26) {
                try {
                    declaredField = AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
                    declaredField.setAccessible(true);
                    method4 = Class.forName("android.util.LongArray").getMethod("get", Integer.TYPE);
                    method3 = null;
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException unused3) {
                    e2.b.f(AccessibilityViewEmbedder.TAG, "can't access childNodeIdsField with reflection");
                    method3 = null;
                    field = null;
                }
                this.f4807a = method;
                this.f4808b = method6;
                this.f4809c = method2;
                this.f4810d = method3;
                this.f4811e = declaredField;
                this.f4812f = method4;
            }
            try {
                method5 = AccessibilityNodeInfo.class.getMethod("getParentNodeId", new Class[0]);
            } catch (NoSuchMethodException unused4) {
                e2.b.f(AccessibilityViewEmbedder.TAG, "can't invoke getParentNodeId with reflection");
                method5 = null;
            }
            try {
                method3 = AccessibilityNodeInfo.class.getMethod("getChildId", Integer.TYPE);
                field2 = null;
            } catch (NoSuchMethodException unused5) {
                e2.b.f(AccessibilityViewEmbedder.TAG, "can't invoke getChildId with reflection");
                method3 = null;
                field2 = null;
            }
            method6 = method5;
            field = field2;
            declaredField = field;
            method4 = field;
            this.f4807a = method;
            this.f4808b = method6;
            this.f4809c = method2;
            this.f4810d = method3;
            this.f4811e = declaredField;
            this.f4812f = method4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Long f(AccessibilityNodeInfo accessibilityNodeInfo, int r8) {
            String str;
            Method method = this.f4810d;
            if (method == null && (this.f4811e == null || this.f4812f == null)) {
                return null;
            }
            if (method != null) {
                try {
                    return (Long) method.invoke(accessibilityNodeInfo, Integer.valueOf(r8));
                } catch (IllegalAccessException e5) {
                    e = e5;
                    str = "Failed to access getChildId method.";
                } catch (InvocationTargetException e6) {
                    e = e6;
                    str = "The getChildId method threw an exception when invoked.";
                }
            } else {
                try {
                    return Long.valueOf(((Long) this.f4812f.invoke(this.f4811e.get(accessibilityNodeInfo), Integer.valueOf(r8))).longValue());
                } catch (ArrayIndexOutOfBoundsException e7) {
                    e = e7;
                    str = "The longArrayGetIndex method threw an exception when invoked.";
                    e2.b.g(AccessibilityViewEmbedder.TAG, str, e);
                    return null;
                } catch (IllegalAccessException e8) {
                    e = e8;
                    str = "Failed to access longArrayGetIndex method or the childNodeId field.";
                } catch (InvocationTargetException e9) {
                    e = e9;
                    str = "The longArrayGetIndex method threw an exception when invoked.";
                    e2.b.g(AccessibilityViewEmbedder.TAG, str, e);
                    return null;
                }
            }
            e2.b.g(AccessibilityViewEmbedder.TAG, str, e);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Long g(AccessibilityNodeInfo accessibilityNodeInfo) {
            String str;
            Method method = this.f4808b;
            if (method != null) {
                try {
                    return Long.valueOf(((Long) method.invoke(accessibilityNodeInfo, new Object[0])).longValue());
                } catch (IllegalAccessException e5) {
                    e = e5;
                    str = "Failed to access getParentNodeId method.";
                    e2.b.g(AccessibilityViewEmbedder.TAG, str, e);
                    return l(accessibilityNodeInfo);
                } catch (InvocationTargetException e6) {
                    e = e6;
                    str = "The getParentNodeId method threw an exception when invoked.";
                    e2.b.g(AccessibilityViewEmbedder.TAG, str, e);
                    return l(accessibilityNodeInfo);
                }
            }
            return l(accessibilityNodeInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Long h(AccessibilityRecord accessibilityRecord) {
            String str;
            Method method = this.f4809c;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityRecord, new Object[0]);
            } catch (IllegalAccessException e5) {
                e = e5;
                str = "Failed to access the getRecordSourceNodeId method.";
                e2.b.g(AccessibilityViewEmbedder.TAG, str, e);
                return null;
            } catch (InvocationTargetException e6) {
                e = e6;
                str = "The getRecordSourceNodeId method threw an exception when invoked.";
                e2.b.g(AccessibilityViewEmbedder.TAG, str, e);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Long i(AccessibilityNodeInfo accessibilityNodeInfo) {
            String str;
            Method method = this.f4807a;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityNodeInfo, new Object[0]);
            } catch (IllegalAccessException e5) {
                e = e5;
                str = "Failed to access getSourceNodeId method.";
                e2.b.g(AccessibilityViewEmbedder.TAG, str, e);
                return null;
            } catch (InvocationTargetException e6) {
                e = e6;
                str = "The getSourceNodeId method threw an exception when invoked.";
                e2.b.g(AccessibilityViewEmbedder.TAG, str, e);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int j(long j4) {
            return (int) (j4 >> 32);
        }

        private static boolean k(long j4, int r4) {
            return (j4 & (1 << r4)) != 0;
        }

        private static Long l(AccessibilityNodeInfo accessibilityNodeInfo) {
            if (Build.VERSION.SDK_INT < 26) {
                e2.b.f(AccessibilityViewEmbedder.TAG, "Unexpected Android version. Unable to find the parent ID.");
                return null;
            }
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            Parcel obtain2 = Parcel.obtain();
            obtain2.setDataPosition(0);
            obtain.writeToParcel(obtain2, 0);
            obtain2.setDataPosition(0);
            long readLong = obtain2.readLong();
            if (k(readLong, 0)) {
                obtain2.readInt();
            }
            if (k(readLong, 1)) {
                obtain2.readLong();
            }
            if (k(readLong, 2)) {
                obtain2.readInt();
            }
            Long valueOf = k(readLong, 3) ? Long.valueOf(obtain2.readLong()) : null;
            obtain2.recycle();
            return valueOf;
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final View f4813a;

        /* renamed from: b, reason: collision with root package name */
        final int f4814b;

        private c(View view, int r22) {
            this.f4813a = view;
            this.f4814b = r22;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f4814b == cVar.f4814b && this.f4813a.equals(cVar.f4813a);
        }

        public int hashCode() {
            return ((this.f4813a.hashCode() + 31) * 31) + this.f4814b;
        }
    }

    AccessibilityViewEmbedder(View view, int r4) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = r4;
    }

    private void addChildrenToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        int r12;
        for (int r02 = 0; r02 < accessibilityNodeInfo.getChildCount(); r02++) {
            Long f5 = this.reflectionAccessors.f(accessibilityNodeInfo, r02);
            if (f5 != null) {
                int j4 = b.j(f5.longValue());
                c cVar = new c(view, j4);
                if (this.originToFlutterId.containsKey(cVar)) {
                    r12 = this.originToFlutterId.get(cVar).intValue();
                } else {
                    int r22 = this.nextFlutterId;
                    this.nextFlutterId = r22 + 1;
                    cacheVirtualIdMappings(view, j4, r22);
                    r12 = r22;
                }
                accessibilityNodeInfo2.addChild(this.rootAccessibilityView, r12);
            }
        }
    }

    private void cacheVirtualIdMappings(View view, int r4, int r5) {
        c cVar = new c(view, r4);
        this.originToFlutterId.put(cVar, Integer.valueOf(r5));
        this.flutterIdToOrigin.put(r5, cVar);
    }

    private AccessibilityNodeInfo convertToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, int r4, View view) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, r4);
        obtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtain.setSource(this.rootAccessibilityView, r4);
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        Rect rect = this.embeddedViewToDisplayBounds.get(view);
        copyAccessibilityFields(accessibilityNodeInfo, obtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, obtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, obtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, obtain);
        return obtain;
    }

    private void copyAccessibilityFields(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 18) {
            accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        }
        if (r02 >= 19) {
            accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
            accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
            accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
            accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
            accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
            accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
            accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
            accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
            accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        }
        if (r02 >= 21) {
            accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
            accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        }
        if (r02 >= 23) {
            accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        }
        if (r02 >= 24) {
            accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
            accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        }
        if (r02 >= 26) {
            accessibilityNodeInfo2.setAvailableExtraData(accessibilityNodeInfo.getAvailableExtraData());
            accessibilityNodeInfo2.setHintText(accessibilityNodeInfo.getHintText());
            accessibilityNodeInfo2.setShowingHintText(accessibilityNodeInfo.isShowingHintText());
        }
    }

    private void setFlutterNodeParent(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long g5 = this.reflectionAccessors.g(accessibilityNodeInfo);
        if (g5 == null) {
            return;
        }
        Integer num = this.originToFlutterId.get(new c(view, b.j(g5.longValue())));
        if (num != null) {
            accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
        }
    }

    private void setFlutterNodesTranslateBounds(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int r5) {
        AccessibilityNodeInfo createAccessibilityNodeInfo;
        c cVar = this.flutterIdToOrigin.get(r5);
        if (cVar == null || !this.embeddedViewToDisplayBounds.containsKey(cVar.f4813a) || cVar.f4813a.getAccessibilityNodeProvider() == null || (createAccessibilityNodeInfo = cVar.f4813a.getAccessibilityNodeProvider().createAccessibilityNodeInfo(cVar.f4814b)) == null) {
            return null;
        }
        return convertToFlutterNode(createAccessibilityNodeInfo, r5, cVar.f4813a);
    }

    public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
        Long h5 = this.reflectionAccessors.h(accessibilityRecord);
        if (h5 == null) {
            return null;
        }
        return this.originToFlutterId.get(new c(view, b.j(h5.longValue())));
    }

    public AccessibilityNodeInfo getRootNode(View view, int r5, Rect rect) {
        AccessibilityNodeInfo createAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Long i4 = this.reflectionAccessors.i(createAccessibilityNodeInfo);
        if (i4 == null) {
            return null;
        }
        this.embeddedViewToDisplayBounds.put(view, rect);
        cacheVirtualIdMappings(view, b.j(i4.longValue()), r5);
        return convertToFlutterNode(createAccessibilityNodeInfo, r5, view);
    }

    public boolean onAccessibilityHoverEvent(int r23, MotionEvent motionEvent) {
        c cVar = this.flutterIdToOrigin.get(r23);
        if (cVar == null) {
            return false;
        }
        Rect rect = this.embeddedViewToDisplayBounds.get(cVar.f4813a);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int r32 = 0; r32 < motionEvent.getPointerCount(); r32++) {
            pointerPropertiesArr[r32] = new MotionEvent.PointerProperties();
            motionEvent.getPointerProperties(r32, pointerPropertiesArr[r32]);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(r32, pointerCoords);
            pointerCoordsArr[r32] = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[r32].x -= rect.left;
            pointerCoordsArr[r32].y -= rect.top;
        }
        return cVar.f4813a.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int r32, int r4, Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        c cVar = this.flutterIdToOrigin.get(r32);
        if (cVar == null || (accessibilityNodeProvider = cVar.f4813a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(cVar.f4814b, r4, bundle);
    }

    public View platformViewOfNode(int r22) {
        c cVar = this.flutterIdToOrigin.get(r22);
        if (cVar == null) {
            return null;
        }
        return cVar.f4813a;
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long h5 = this.reflectionAccessors.h(accessibilityEvent);
        if (h5 == null) {
            return false;
        }
        int j4 = b.j(h5.longValue());
        Integer num = this.originToFlutterId.get(new c(view, j4));
        if (num == null) {
            int r32 = this.nextFlutterId;
            this.nextFlutterId = r32 + 1;
            num = Integer.valueOf(r32);
            cacheVirtualIdMappings(view, j4, num.intValue());
        }
        obtain.setSource(this.rootAccessibilityView, num.intValue());
        obtain.setClassName(accessibilityEvent.getClassName());
        obtain.setPackageName(accessibilityEvent.getPackageName());
        for (int r9 = 0; r9 < obtain.getRecordCount(); r9++) {
            AccessibilityRecord record = obtain.getRecord(r9);
            Long h6 = this.reflectionAccessors.h(record);
            if (h6 == null) {
                return false;
            }
            c cVar = new c(view, b.j(h6.longValue()));
            if (!this.originToFlutterId.containsKey(cVar)) {
                return false;
            }
            record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(cVar).intValue());
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, obtain);
    }
}
