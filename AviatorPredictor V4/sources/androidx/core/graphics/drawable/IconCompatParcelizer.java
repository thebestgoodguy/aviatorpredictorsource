package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.a;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f209a = aVar.p(iconCompat.f209a, 1);
        iconCompat.f211c = aVar.j(iconCompat.f211c, 2);
        iconCompat.f212d = aVar.r(iconCompat.f212d, 3);
        iconCompat.f213e = aVar.p(iconCompat.f213e, 4);
        iconCompat.f214f = aVar.p(iconCompat.f214f, 5);
        iconCompat.f215g = (ColorStateList) aVar.r(iconCompat.f215g, 6);
        iconCompat.f217i = aVar.t(iconCompat.f217i, 7);
        iconCompat.f218j = aVar.t(iconCompat.f218j, 8);
        iconCompat.l();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.x(true, true);
        iconCompat.m(aVar.f());
        int r12 = iconCompat.f209a;
        if (-1 != r12) {
            aVar.F(r12, 1);
        }
        byte[] bArr = iconCompat.f211c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f212d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int r02 = iconCompat.f213e;
        if (r02 != 0) {
            aVar.F(r02, 4);
        }
        int r03 = iconCompat.f214f;
        if (r03 != 0) {
            aVar.F(r03, 5);
        }
        ColorStateList colorStateList = iconCompat.f215g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f217i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f218j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
