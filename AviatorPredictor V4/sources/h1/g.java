package h1;

import android.util.Base64;
import com.google.protobuf.e1;
import com.google.protobuf.t1;
import i1.c1;
import i1.q;
import i1.r;
import i1.w0;
import i1.x0;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import l1.l;
import l1.s;
import l1.t;
import l1.u;
import l1.w;
import l1.y;
import o1.j0;
import org.json.JSONArray;
import org.json.JSONObject;
import x0.o;
import x1.a;
import x1.r;
import x1.x;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final SimpleDateFormat f3919a;

    /* renamed from: b, reason: collision with root package name */
    private final j0 f3920b;

    public g(j0 j0Var) {
        this.f3920b = j0Var;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        this.f3919a = simpleDateFormat;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
    }

    private void A(List<r> list, JSONObject jSONObject) {
        l1.r j4;
        String string;
        q.b bVar;
        x xVar;
        j4 = j(jSONObject.getJSONObject("field"));
        string = jSONObject.getString("op");
        string.hashCode();
        switch (string) {
            case "IS_NAN":
                bVar = q.b.EQUAL;
                xVar = y.f6589a;
                list.add(q.f(j4, bVar, xVar));
                return;
            case "IS_NULL":
                bVar = q.b.EQUAL;
                xVar = y.f6590b;
                list.add(q.f(j4, bVar, xVar));
                return;
            case "IS_NOT_NAN":
                bVar = q.b.NOT_EQUAL;
                xVar = y.f6589a;
                list.add(q.f(j4, bVar, xVar));
                return;
            case "IS_NOT_NULL":
                bVar = q.b.NOT_EQUAL;
                xVar = y.f6590b;
                list.add(q.f(j4, bVar, xVar));
                return;
            default:
                throw new IllegalArgumentException("Unexpected unary filter: " + string);
        }
    }

    private x B(JSONObject jSONObject) {
        x.b r02 = x.r0();
        if (jSONObject.has("nullValue")) {
            r02.O(e1.NULL_VALUE);
        } else if (jSONObject.has("booleanValue")) {
            r02.F(jSONObject.optBoolean("booleanValue", false));
        } else if (jSONObject.has("integerValue")) {
            r02.J(jSONObject.optLong("integerValue"));
        } else if (jSONObject.has("doubleValue")) {
            r02.H(jSONObject.optDouble("doubleValue"));
        } else if (jSONObject.has("timestampValue")) {
            y(r02, jSONObject.get("timestampValue"));
        } else if (jSONObject.has("stringValue")) {
            r02.Q(jSONObject.optString("stringValue", ""));
        } else if (jSONObject.has("bytesValue")) {
            r02.G(com.google.protobuf.j.w(Base64.decode(jSONObject.getString("bytesValue"), 0)));
        } else if (jSONObject.has("referenceValue")) {
            r02.P(jSONObject.getString("referenceValue"));
        } else if (jSONObject.has("geoPointValue")) {
            l(r02, jSONObject.getJSONObject("geoPointValue"));
        } else if (jSONObject.has("arrayValue")) {
            a(r02, jSONObject.getJSONObject("arrayValue").optJSONArray("values"));
        } else {
            if (!jSONObject.has("mapValue")) {
                throw new IllegalArgumentException("Unexpected value type: " + jSONObject);
            }
            o(r02, jSONObject.getJSONObject("mapValue").optJSONObject("fields"));
        }
        return r02.t();
    }

    private List<r> C(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null) {
            k(arrayList, jSONObject);
        }
        return arrayList;
    }

    private static int D(String str) {
        int r12 = 0;
        for (int r02 = 0; r02 < 9; r02++) {
            r12 *= 10;
            if (r02 < str.length()) {
                if (str.charAt(r02) < '0' || str.charAt(r02) > '9') {
                    throw new IllegalArgumentException("Invalid nanoseconds: " + str);
                }
                r12 += str.charAt(r02) - '0';
            }
        }
        return r12;
    }

    private void E(JSONArray jSONArray) {
        if (jSONArray.length() != 1) {
            throw new IllegalArgumentException("Only queries with a single 'from' clause are supported by the Android SDK");
        }
    }

    private void F(JSONObject jSONObject) {
        if (jSONObject.has("offset")) {
            throw new IllegalArgumentException("Queries with offsets are not supported by the Android SDK");
        }
    }

    private void G(JSONObject jSONObject) {
        if (jSONObject.has("select")) {
            throw new IllegalArgumentException("Queries with 'select' statements are not supported by the Android SDK");
        }
    }

    private void a(x.b bVar, JSONArray jSONArray) {
        a.b d02 = x1.a.d0();
        if (jSONArray != null) {
            for (int r12 = 0; r12 < jSONArray.length(); r12++) {
                d02.D(B(jSONArray.getJSONObject(r12)));
            }
        }
        bVar.D(d02);
    }

    private i d(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("structuredQuery");
        G(jSONObject2);
        u p4 = p(jSONObject.getString("parent"));
        JSONArray jSONArray = jSONObject2.getJSONArray("from");
        E(jSONArray);
        JSONObject jSONObject3 = jSONArray.getJSONObject(0);
        boolean optBoolean = jSONObject3.optBoolean("allDescendants", false);
        String string = jSONObject3.getString("collectionId");
        if (!optBoolean) {
            p4 = p4.d(string);
            string = null;
        }
        List<r> C = C(jSONObject2.optJSONObject("where"));
        List<w0> r4 = r(jSONObject2.optJSONArray("orderBy"));
        i1.i u4 = u(jSONObject2.optJSONObject("startAt"));
        i1.i g5 = g(jSONObject2.optJSONObject("endAt"));
        F(jSONObject2);
        return new i(new c1(p4, string, C, r4, m(jSONObject2), u4, g5), n(jSONObject));
    }

    private void e(List<r> list, JSONObject jSONObject) {
        if (!jSONObject.getString("op").equals("AND")) {
            throw new IllegalArgumentException("The Android SDK only supports composite filters of type 'AND'");
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("filters");
        if (optJSONArray != null) {
            for (int r02 = 0; r02 < optJSONArray.length(); r02++) {
                k(list, optJSONArray.getJSONObject(r02));
            }
        }
    }

    private i1.i g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new i1.i(s(jSONObject), !jSONObject.optBoolean("before", false));
    }

    private void h(List<r> list, JSONObject jSONObject) {
        list.add(q.f(j(jSONObject.getJSONObject("field")), i(jSONObject.getString("op")), B(jSONObject.getJSONObject("value"))));
    }

    private q.b i(String str) {
        return q.b.valueOf(str);
    }

    private l1.r j(JSONObject jSONObject) {
        return l1.r.x(jSONObject.getString("fieldPath"));
    }

    private void k(List<r> list, JSONObject jSONObject) {
        if (jSONObject.has("compositeFilter")) {
            e(list, jSONObject.getJSONObject("compositeFilter"));
        } else if (jSONObject.has("fieldFilter")) {
            h(list, jSONObject.getJSONObject("fieldFilter"));
        } else if (jSONObject.has("unaryFilter")) {
            A(list, jSONObject.getJSONObject("unaryFilter"));
        }
    }

    private void l(x.b bVar, JSONObject jSONObject) {
        bVar.I(b2.a.Z().B(jSONObject.optDouble("latitude")).D(jSONObject.optDouble("longitude")));
    }

    private int m(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("limit");
        return optJSONObject != null ? optJSONObject.optInt("value", -1) : jSONObject.optInt("limit", -1);
    }

    private x0.a n(JSONObject jSONObject) {
        String optString = jSONObject.optString("limitType", "FIRST");
        if (optString.equals("FIRST")) {
            return x0.a.LIMIT_TO_FIRST;
        }
        if (optString.equals("LAST")) {
            return x0.a.LIMIT_TO_LAST;
        }
        throw new IllegalArgumentException("Invalid limit type for bundle query: " + optString);
    }

    private void o(x.b bVar, JSONObject jSONObject) {
        r.b d02 = x1.r.d0();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                d02.E(next, B(jSONObject.getJSONObject(next)));
            }
        }
        bVar.L(d02);
    }

    private u p(String str) {
        u x4 = u.x(str);
        if (this.f3920b.b0(x4)) {
            return x4.t(5);
        }
        throw new IllegalArgumentException("Resource name is not valid for current instance: " + str);
    }

    private List<w0> r(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int r12 = 0; r12 < jSONArray.length(); r12++) {
                JSONObject jSONObject = jSONArray.getJSONObject(r12);
                arrayList.add(w0.d(jSONObject.optString("direction", "ASCENDING").equals("ASCENDING") ? w0.a.ASCENDING : w0.a.DESCENDING, j(jSONObject.getJSONObject("field"))));
            }
        }
        return arrayList;
    }

    private List<x> s(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("values");
        if (optJSONArray != null) {
            for (int r12 = 0; r12 < optJSONArray.length(); r12++) {
                arrayList.add(B(optJSONArray.getJSONObject(r12)));
            }
        }
        return arrayList;
    }

    private w t(Object obj) {
        return new w(v(obj));
    }

    private i1.i u(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new i1.i(s(jSONObject), jSONObject.optBoolean("before", false));
    }

    private o v(Object obj) {
        if (obj instanceof String) {
            return w((String) obj);
        }
        if (obj instanceof JSONObject) {
            return x((JSONObject) obj);
        }
        throw new IllegalArgumentException("Timestamps must be either ISO 8601-formatted strings or JSON objects");
    }

    private o w(String str) {
        try {
            int indexOf = str.indexOf(84);
            if (indexOf == -1) {
                throw new IllegalArgumentException("Invalid timestamp: " + str);
            }
            int indexOf2 = str.indexOf(90, indexOf);
            if (indexOf2 == -1) {
                indexOf2 = str.indexOf(43, indexOf);
            }
            if (indexOf2 == -1) {
                indexOf2 = str.indexOf(45, indexOf);
            }
            if (indexOf2 == -1) {
                throw new IllegalArgumentException("Invalid timestamp: Missing valid timezone offset: " + str);
            }
            int r02 = 0;
            String substring = str.substring(0, indexOf2);
            String str2 = "";
            int indexOf3 = substring.indexOf(46);
            if (indexOf3 != -1) {
                String substring2 = substring.substring(0, indexOf3);
                str2 = substring.substring(indexOf3 + 1);
                substring = substring2;
            }
            long time = this.f3919a.parse(substring).getTime() / 1000;
            if (!str2.isEmpty()) {
                r02 = D(str2);
            }
            if (str.charAt(indexOf2) != 'Z') {
                long z4 = z(str.substring(indexOf2 + 1));
                time = str.charAt(indexOf2) == '+' ? time - z4 : time + z4;
            } else if (str.length() != indexOf2 + 1) {
                throw new IllegalArgumentException("Invalid timestamp: Invalid trailing data \"" + str.substring(indexOf2) + "\"");
            }
            return new o(time, r02);
        } catch (ParseException e5) {
            throw new IllegalArgumentException("Failed to parse timestamp", e5);
        }
    }

    private o x(JSONObject jSONObject) {
        return new o(jSONObject.optLong("seconds"), jSONObject.optInt("nanos"));
    }

    private void y(x.b bVar, Object obj) {
        o v4 = v(obj);
        bVar.R(t1.Z().D(v4.i()).B(v4.g()));
    }

    private static long z(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            return ((Long.parseLong(str.substring(0, indexOf)) * 60) + Long.parseLong(str.substring(indexOf + 1))) * 60;
        }
        throw new IllegalArgumentException("Invalid offset value: " + str);
    }

    public e b(JSONObject jSONObject) {
        return new e(jSONObject.getString("id"), jSONObject.getInt("version"), t(jSONObject.get("createTime")), jSONObject.getInt("totalDocuments"), jSONObject.getLong("totalBytes"));
    }

    public h c(JSONObject jSONObject) {
        l n4 = l.n(p(jSONObject.getString("name")));
        w t4 = t(jSONObject.get("readTime"));
        boolean optBoolean = jSONObject.optBoolean("exists", false);
        JSONArray optJSONArray = jSONObject.optJSONArray("queries");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int r32 = 0; r32 < optJSONArray.length(); r32++) {
                arrayList.add(optJSONArray.getString(r32));
            }
        }
        return new h(n4, t4, optBoolean, arrayList);
    }

    b f(JSONObject jSONObject) {
        l n4 = l.n(p(jSONObject.getString("name")));
        w t4 = t(jSONObject.get("updateTime"));
        x.b r02 = x.r0();
        o(r02, jSONObject.getJSONObject("fields"));
        return new b(s.p(n4, t4, t.g(r02.B().X())));
    }

    public j q(JSONObject jSONObject) {
        return new j(jSONObject.getString("name"), d(jSONObject.getJSONObject("bundledQuery")), t(jSONObject.get("readTime")));
    }
}
