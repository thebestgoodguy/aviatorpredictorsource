package l1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class u extends e<u> {

    /* renamed from: f, reason: collision with root package name */
    public static final u f6582f = new u(Collections.emptyList());

    private u(List<String> list) {
        super(list);
    }

    public static u w(List<String> list) {
        return list.isEmpty() ? f6582f : new u(list);
    }

    public static u x(String str) {
        if (str.contains("//")) {
            throw new IllegalArgumentException("Invalid path (" + str + "). Paths must not contain // in them.");
        }
        String[] split = str.split("/");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (!str2.isEmpty()) {
                arrayList.add(str2);
            }
        }
        return new u(arrayList);
    }

    @Override // l1.e
    public String h() {
        StringBuilder sb = new StringBuilder();
        for (int r12 = 0; r12 < this.f6539e.size(); r12++) {
            if (r12 > 0) {
                sb.append("/");
            }
            sb.append(this.f6539e.get(r12));
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // l1.e
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public u k(List<String> list) {
        return new u(list);
    }
}
