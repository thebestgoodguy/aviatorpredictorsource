package com.google.protobuf;

import com.google.protobuf.a0;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes.dex */
final class x0 {
    private static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int r12 = 0; r12 < str.length(); r12++) {
            char charAt = str.charAt(r12);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    private static boolean b(Object obj) {
        Object obj2;
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return Float.floatToRawIntBits(((Float) obj).floatValue()) == 0;
        }
        if (obj instanceof Double) {
            return Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0;
        }
        if (obj instanceof String) {
            obj2 = "";
        } else {
            if (!(obj instanceof j)) {
                return obj instanceof v0 ? obj == ((v0) obj).d() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
            }
            obj2 = j.f2914f;
        }
        return obj.equals(obj2);
    }

    static final void c(StringBuilder sb, int r7, String str, Object obj) {
        String a5;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c(sb, r7, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                c(sb, r7, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int r02 = 0;
        for (int r12 = 0; r12 < r7; r12++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            a5 = s1.c((String) obj);
        } else {
            if (!(obj instanceof j)) {
                if (obj instanceof a0) {
                    sb.append(" {");
                    d((a0) obj, sb, r7 + 2);
                    sb.append("\n");
                    while (r02 < r7) {
                        sb.append(' ');
                        r02++;
                    }
                } else {
                    if (!(obj instanceof Map.Entry)) {
                        sb.append(": ");
                        sb.append(obj.toString());
                        return;
                    }
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int r8 = r7 + 2;
                    c(sb, r8, "key", entry.getKey());
                    c(sb, r8, "value", entry.getValue());
                    sb.append("\n");
                    while (r02 < r7) {
                        sb.append(' ');
                        r02++;
                    }
                }
                sb.append("}");
                return;
            }
            sb.append(": \"");
            a5 = s1.a((j) obj);
        }
        sb.append(a5);
        sb.append('\"');
    }

    private static void d(v0 v0Var, StringBuilder sb, int r15) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : v0Var.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            boolean z4 = true;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String str2 = substring.substring(0, 1).toLowerCase() + substring.substring(1, substring.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    c(sb, r15, a(str2), a0.E(method2, v0Var, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String str3 = substring.substring(0, 1).toLowerCase() + substring.substring(1, substring.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    c(sb, r15, a(str3), a0.E(method3, v0Var, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set" + substring)) != null) {
                if (substring.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                String str4 = substring.substring(0, 1).toLowerCase() + substring.substring(1);
                Method method4 = (Method) hashMap.get("get" + substring);
                Method method5 = (Method) hashMap.get("has" + substring);
                if (method4 != null) {
                    Object E = a0.E(method4, v0Var, new Object[0]);
                    if (method5 != null) {
                        z4 = ((Boolean) a0.E(method5, v0Var, new Object[0])).booleanValue();
                    } else if (b(E)) {
                        z4 = false;
                    }
                    if (z4) {
                        c(sb, r15, a(str4), E);
                    }
                }
            }
        }
        if (v0Var instanceof a0.c) {
            Iterator<Map.Entry<a0.d, Object>> s4 = ((a0.c) v0Var).extensions.s();
            while (s4.hasNext()) {
                Map.Entry<a0.d, Object> next = s4.next();
                c(sb, r15, "[" + next.getKey().e() + "]", next.getValue());
            }
        }
        w1 w1Var = ((a0) v0Var).unknownFields;
        if (w1Var != null) {
            w1Var.l(sb, r15);
        }
    }

    static String e(v0 v0Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(v0Var, sb, 0);
        return sb.toString();
    }
}
