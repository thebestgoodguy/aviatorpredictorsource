package q1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
class l {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f7187a;

    public l(Context context, String str) {
        this.f7187a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    private synchronized void a() {
        long j4 = this.f7187a.getLong("fire-count", 0L);
        String str = null;
        String str2 = "";
        for (Map.Entry<String, ?> entry : this.f7187a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str3 : (Set) entry.getValue()) {
                    if (str == null || str.compareTo(str3) > 0) {
                        str2 = entry.getKey();
                        str = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f7187a.getStringSet(str2, new HashSet()));
        hashSet.remove(str);
        this.f7187a.edit().putStringSet(str2, hashSet).putLong("fire-count", j4 - 1).commit();
    }

    private synchronized String d(long j4) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j4).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j4));
    }

    private synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f7187a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    private synchronized void h(String str) {
        String e5 = e(str);
        if (e5 == null) {
            return;
        }
        HashSet hashSet = new HashSet(this.f7187a.getStringSet(e5, new HashSet()));
        hashSet.remove(str);
        (hashSet.isEmpty() ? this.f7187a.edit().remove(e5) : this.f7187a.edit().putStringSet(e5, hashSet)).commit();
    }

    synchronized void b() {
        SharedPreferences.Editor edit = this.f7187a.edit();
        for (Map.Entry<String, ?> entry : this.f7187a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                edit.remove(entry.getKey());
            }
        }
        edit.remove("fire-count");
        edit.commit();
    }

    synchronized List<m> c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.f7187a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                arrayList.add(m.a(entry.getKey(), new ArrayList((Set) entry.getValue())));
            }
        }
        l(System.currentTimeMillis());
        return arrayList;
    }

    synchronized boolean f(long j4, long j5) {
        return d(j4).equals(d(j5));
    }

    synchronized void g() {
        String d5 = d(System.currentTimeMillis());
        this.f7187a.edit().putString("last-used-date", d5).commit();
        h(d5);
    }

    synchronized boolean i(long j4) {
        return j("fire-global", j4);
    }

    synchronized boolean j(String str, long j4) {
        if (!this.f7187a.contains(str)) {
            this.f7187a.edit().putLong(str, j4).commit();
            return true;
        }
        if (f(this.f7187a.getLong(str, -1L), j4)) {
            return false;
        }
        this.f7187a.edit().putLong(str, j4).commit();
        return true;
    }

    synchronized void k(long j4, String str) {
        String d5 = d(j4);
        if (this.f7187a.getString("last-used-date", "").equals(d5)) {
            return;
        }
        long j5 = this.f7187a.getLong("fire-count", 0L);
        if (j5 + 1 == 30) {
            a();
            j5 = this.f7187a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f7187a.getStringSet(str, new HashSet()));
        hashSet.add(d5);
        this.f7187a.edit().putStringSet(str, hashSet).putLong("fire-count", j5 + 1).putString("last-used-date", d5).commit();
    }

    synchronized void l(long j4) {
        this.f7187a.edit().putLong("fire-global", j4).commit();
    }
}
