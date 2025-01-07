package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes22.dex */
public class AnimationUtilsCompat {
    public static Interpolator loadInterpolator(Context context, int r6) throws Resources.NotFoundException {
        Interpolator createInterpolatorFromXml;
        if (Build.VERSION.SDK_INT >= 21) {
            return AnimationUtils.loadInterpolator(context, r6);
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    if (r6 == 17563663) {
                        createInterpolatorFromXml = new FastOutLinearInInterpolator();
                    } else if (r6 == 17563661) {
                        createInterpolatorFromXml = new FastOutSlowInInterpolator();
                        if (0 != 0) {
                            xmlResourceParser.close();
                        }
                    } else if (r6 == 17563662) {
                        createInterpolatorFromXml = new LinearOutSlowInInterpolator();
                        if (0 != 0) {
                            xmlResourceParser.close();
                        }
                    } else {
                        xmlResourceParser = context.getResources().getAnimation(r6);
                        createInterpolatorFromXml = createInterpolatorFromXml(context, context.getResources(), context.getTheme(), xmlResourceParser);
                        if (xmlResourceParser != null) {
                            xmlResourceParser.close();
                        }
                    }
                    return createInterpolatorFromXml;
                } catch (XmlPullParserException e) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(r6));
                    notFoundException.initCause(e);
                    throw notFoundException;
                }
            } catch (IOException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(r6));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x00cc, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.view.animation.Interpolator createInterpolatorFromXml(android.content.Context r4, android.content.res.Resources r5, android.content.res.Resources.Theme r6, org.xmlpull.v1.XmlPullParser r7) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = 0
            int r1 = r7.getDepth()
        L5:
            int r2 = r7.next()
            r3 = 3
            if (r2 != r3) goto L12
            int r3 = r7.getDepth()
            if (r3 <= r1) goto Lcc
        L12:
            r3 = 1
            if (r2 == r3) goto Lcc
            r3 = 2
            if (r2 != r3) goto L5
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)
            java.lang.String r0 = r7.getName()
            java.lang.String r3 = "linearInterpolator"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L2e
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            goto L5
        L2e:
            java.lang.String r3 = "accelerateInterpolator"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L3c
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>(r4, r2)
            goto L5
        L3c:
            java.lang.String r3 = "decelerateInterpolator"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L4a
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>(r4, r2)
            goto L5
        L4a:
            java.lang.String r3 = "accelerateDecelerateInterpolator"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L58
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            goto L5
        L58:
            java.lang.String r3 = "cycleInterpolator"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L66
            android.view.animation.CycleInterpolator r0 = new android.view.animation.CycleInterpolator
            r0.<init>(r4, r2)
            goto L5
        L66:
            java.lang.String r3 = "anticipateInterpolator"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L74
            android.view.animation.AnticipateInterpolator r0 = new android.view.animation.AnticipateInterpolator
            r0.<init>(r4, r2)
            goto L5
        L74:
            java.lang.String r3 = "overshootInterpolator"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L82
            android.view.animation.OvershootInterpolator r0 = new android.view.animation.OvershootInterpolator
            r0.<init>(r4, r2)
            goto L5
        L82:
            java.lang.String r3 = "anticipateOvershootInterpolator"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L91
            android.view.animation.AnticipateOvershootInterpolator r0 = new android.view.animation.AnticipateOvershootInterpolator
            r0.<init>(r4, r2)
            goto L5
        L91:
            java.lang.String r3 = "bounceInterpolator"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto La0
            android.view.animation.BounceInterpolator r0 = new android.view.animation.BounceInterpolator
            r0.<init>()
            goto L5
        La0:
            java.lang.String r3 = "pathInterpolator"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto Laf
            androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat r0 = new androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat
            r0.<init>(r4, r2, r7)
            goto L5
        Laf:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown interpolator name: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r7.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lcc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat.createInterpolatorFromXml(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser):android.view.animation.Interpolator");
    }

    private AnimationUtilsCompat() {
    }
}
