package com.google.firebase.firestore;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f2682b = Pattern.compile("[~*/\\[\\]]");

    /* renamed from: c, reason: collision with root package name */
    private static final l f2683c = new l(l1.r.f6563f);

    /* renamed from: a, reason: collision with root package name */
    private final l1.r f2684a;

    private l(List<String> list) {
        this.f2684a = l1.r.w(list);
    }

    private l(l1.r rVar) {
        this.f2684a = rVar;
    }

    public static l a() {
        return f2683c;
    }

    static l b(String str) {
        p1.x.c(str, "Provided field path must not be null.");
        p1.x.a(!f2682b.matcher(str).find(), "Use FieldPath.of() for field names containing '~*/[]'.", new Object[0]);
        try {
            return d(str.split("\\.", -1));
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
        }
    }

    public static l d(String... strArr) {
        p1.x.a(strArr.length > 0, "Invalid field path. Provided path must not be empty.", new Object[0]);
        int r02 = 0;
        while (r02 < strArr.length) {
            boolean z4 = (strArr[r02] == null || strArr[r02].isEmpty()) ? false : true;
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid field name at argument ");
            r02++;
            sb.append(r02);
            sb.append(". Field names must not be null or empty.");
            p1.x.a(z4, sb.toString(), new Object[0]);
        }
        return new l((List<String>) Arrays.asList(strArr));
    }

    l1.r c() {
        return this.f2684a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return this.f2684a.equals(((l) obj).f2684a);
    }

    public int hashCode() {
        return this.f2684a.hashCode();
    }

    public String toString() {
        return this.f2684a.toString();
    }
}
