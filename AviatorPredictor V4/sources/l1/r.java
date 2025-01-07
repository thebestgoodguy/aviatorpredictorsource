package l1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class r extends e<r> {

    /* renamed from: f, reason: collision with root package name */
    public static final r f6563f = y("__name__");

    /* renamed from: g, reason: collision with root package name */
    public static final r f6564g = new r(Collections.emptyList());

    private r(List<String> list) {
        super(list);
    }

    private static boolean A(String str) {
        if (str.isEmpty()) {
            return false;
        }
        char charAt = str.charAt(0);
        if (charAt != '_' && ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z'))) {
            return false;
        }
        for (int r7 = 1; r7 < str.length(); r7++) {
            char charAt2 = str.charAt(r7);
            if (charAt2 != '_' && ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && (charAt2 < '0' || charAt2 > '9')))) {
                return false;
            }
        }
        return true;
    }

    public static r w(List<String> list) {
        return list.isEmpty() ? f6564g : new r(list);
    }

    public static r x(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int r22 = 0;
        boolean z4 = false;
        while (r22 < str.length()) {
            char charAt = str.charAt(r22);
            if (charAt == '\\') {
                r22++;
                if (r22 == str.length()) {
                    throw new IllegalArgumentException("Trailing escape character is not allowed");
                }
                charAt = str.charAt(r22);
            } else if (charAt == '.') {
                if (!z4) {
                    String sb2 = sb.toString();
                    if (sb2.isEmpty()) {
                        throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
                    }
                    StringBuilder sb3 = new StringBuilder();
                    arrayList.add(sb2);
                    sb = sb3;
                    r22++;
                }
            } else if (charAt == '`') {
                z4 = !z4;
                r22++;
            }
            sb.append(charAt);
            r22++;
        }
        String sb4 = sb.toString();
        if (!sb4.isEmpty()) {
            arrayList.add(sb4);
            return new r(arrayList);
        }
        throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
    }

    public static r y(String str) {
        return new r(Collections.singletonList(str));
    }

    @Override // l1.e
    public String h() {
        StringBuilder sb = new StringBuilder();
        for (int r12 = 0; r12 < this.f6539e.size(); r12++) {
            if (r12 > 0) {
                sb.append(".");
            }
            String replace = this.f6539e.get(r12).replace("\\", "\\\\").replace("`", "\\`");
            if (!A(replace)) {
                replace = '`' + replace + '`';
            }
            sb.append(replace);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // l1.e
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public r k(List<String> list) {
        return new r(list);
    }

    public boolean z() {
        return equals(f6563f);
    }
}
