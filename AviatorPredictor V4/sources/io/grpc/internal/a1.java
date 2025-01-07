package io.grpc.internal;

import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class a1 {

    /* renamed from: a, reason: collision with root package name */
    private static final long f5005a = TimeUnit.SECONDS.toNanos(1);

    public static List<Map<String, ?>> a(List<?> list) {
        for (int r12 = 0; r12 < list.size(); r12++) {
            if (!(list.get(r12) instanceof Map)) {
                throw new ClassCastException(String.format("value %s for idx %d in %s is not object", list.get(r12), Integer.valueOf(r12), list));
            }
        }
        return list;
    }

    public static List<String> b(List<?> list) {
        for (int r12 = 0; r12 < list.size(); r12++) {
            if (!(list.get(r12) instanceof String)) {
                throw new ClassCastException(String.format("value '%s' for idx %d in '%s' is not string", list.get(r12), Integer.valueOf(r12), list));
            }
        }
        return list;
    }

    private static boolean c(long j4, int r8) {
        if (j4 >= -315576000000L && j4 <= 315576000000L) {
            long j5 = r8;
            if (j5 >= -999999999 && j5 < f5005a) {
                if (j4 >= 0 && r8 >= 0) {
                    return true;
                }
                if (j4 <= 0 && r8 <= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Boolean d(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    public static List<?> e(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    public static List<Map<String, ?>> f(Map<String, ?> map, String str) {
        List<?> e5 = e(map, str);
        if (e5 == null) {
            return null;
        }
        return a(e5);
    }

    public static List<String> g(Map<String, ?> map, String str) {
        List<?> e5 = e(map, str);
        if (e5 == null) {
            return null;
        }
        return b(e5);
    }

    public static Double h(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", obj, str, map));
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", obj, str));
        }
    }

    public static Integer i(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Double)) {
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
        }
        Double d5 = (Double) obj;
        int intValue = d5.intValue();
        if (intValue == d5.doubleValue()) {
            return Integer.valueOf(intValue);
        }
        throw new ClassCastException("Number expected to be integer: " + d5);
    }

    public static Map<String, ?> j(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    public static String k(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    public static Long l(Map<String, ?> map, String str) {
        String k4 = k(map, str);
        if (k4 == null) {
            return null;
        }
        try {
            return Long.valueOf(n(k4));
        } catch (ParseException e5) {
            throw new RuntimeException(e5);
        }
    }

    private static long m(long j4, int r10) {
        long j5 = r10;
        long j6 = f5005a;
        if (j5 <= (-j6) || j5 >= j6) {
            j4 = t0.b.a(j4, j5 / j6);
            r10 = (int) (j5 % j6);
        }
        if (j4 > 0 && r10 < 0) {
            r10 = (int) (r10 + j6);
            j4--;
        }
        if (j4 < 0 && r10 > 0) {
            r10 = (int) (r10 - j6);
            j4++;
        }
        if (c(j4, r10)) {
            return p(TimeUnit.SECONDS.toNanos(j4), r10);
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(j4), Integer.valueOf(r10)));
    }

    private static long n(String str) {
        boolean z4;
        String str2;
        if (str.isEmpty() || str.charAt(str.length() - 1) != 's') {
            throw new ParseException("Invalid duration string: " + str, 0);
        }
        if (str.charAt(0) == '-') {
            str = str.substring(1);
            z4 = true;
        } else {
            z4 = false;
        }
        String substring = str.substring(0, str.length() - 1);
        int indexOf = substring.indexOf(46);
        if (indexOf != -1) {
            str2 = substring.substring(indexOf + 1);
            substring = substring.substring(0, indexOf);
        } else {
            str2 = "";
        }
        long parseLong = Long.parseLong(substring);
        int o4 = str2.isEmpty() ? 0 : o(str2);
        if (parseLong < 0) {
            throw new ParseException("Invalid duration string: " + str, 0);
        }
        if (z4) {
            parseLong = -parseLong;
            o4 = -o4;
        }
        try {
            return m(parseLong, o4);
        } catch (IllegalArgumentException unused) {
            throw new ParseException("Duration value is out of range.", 0);
        }
    }

    private static int o(String str) {
        int r22 = 0;
        for (int r12 = 0; r12 < 9; r12++) {
            r22 *= 10;
            if (r12 < str.length()) {
                if (str.charAt(r12) < '0' || str.charAt(r12) > '9') {
                    throw new ParseException("Invalid nanoseconds.", 0);
                }
                r22 += str.charAt(r12) - '0';
            }
        }
        return r22;
    }

    private static long p(long j4, long j5) {
        long j6 = j4 + j5;
        return (((j5 ^ j4) > 0L ? 1 : ((j5 ^ j4) == 0L ? 0 : -1)) < 0) | ((j4 ^ j6) >= 0) ? j6 : ((j6 >>> 63) ^ 1) + Long.MAX_VALUE;
    }
}
