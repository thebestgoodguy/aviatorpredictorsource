package com.google.android.gms.internal.p000firebaseauthapi;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes.dex */
final class g0 {
    static String a(e0 e0Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(e0Var, sb, 0);
        return sb.toString();
    }

    static final void b(StringBuilder sb, int r7, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, r7, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, r7, str, (Map.Entry) it2.next());
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
            sb.append(g1.a(hr.C((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof hr) {
            sb.append(": \"");
            sb.append(g1.a((hr) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof ks) {
            sb.append(" {");
            d((ks) obj, sb, r7 + 2);
            sb.append("\n");
            while (r02 < r7) {
                sb.append(' ');
                r02++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int r8 = r7 + 2;
        b(sb, r8, "key", entry.getKey());
        b(sb, r8, "value", entry.getValue());
        sb.append("\n");
        while (r02 < r7) {
            sb.append(' ');
            r02++;
        }
        sb.append("}");
    }

    private static final String c(String str) {
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

    private static void d(e0 e0Var, StringBuilder sb, int r14) {
        Object obj;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : e0Var.getClass().getDeclaredMethods()) {
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
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String concat = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 4)));
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    b(sb, r14, c(concat), ks.e(method2, e0Var, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String concat2 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 3)));
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    b(sb, r14, c(concat2), ks.e(method3, e0Var, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(substring))) != null && (!substring.endsWith("Bytes") || !hashMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                String concat3 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1)));
                Method method4 = (Method) hashMap.get("get".concat(substring));
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object e5 = ks.e(method4, e0Var, new Object[0]);
                    if (method5 == null) {
                        if (e5 instanceof Boolean) {
                            if (((Boolean) e5).booleanValue()) {
                                b(sb, r14, c(concat3), e5);
                            }
                        } else if (e5 instanceof Integer) {
                            if (((Integer) e5).intValue() != 0) {
                                b(sb, r14, c(concat3), e5);
                            }
                        } else if (e5 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) e5).floatValue()) != 0) {
                                b(sb, r14, c(concat3), e5);
                            }
                        } else if (!(e5 instanceof Double)) {
                            if (e5 instanceof String) {
                                obj = "";
                            } else if (e5 instanceof hr) {
                                obj = hr.f1739f;
                            } else if (!(e5 instanceof e0)) {
                                if ((e5 instanceof Enum) && ((Enum) e5).ordinal() == 0) {
                                }
                                b(sb, r14, c(concat3), e5);
                            } else if (e5 != ((e0) e5).a()) {
                                b(sb, r14, c(concat3), e5);
                            }
                            if (!e5.equals(obj)) {
                                b(sb, r14, c(concat3), e5);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) e5).doubleValue()) != 0) {
                            b(sb, r14, c(concat3), e5);
                        }
                    } else if (((Boolean) ks.e(method5, e0Var, new Object[0])).booleanValue()) {
                        b(sb, r14, c(concat3), e5);
                    }
                }
            }
        }
        if (e0Var instanceof is) {
            throw null;
        }
        j1 j1Var = ((ks) e0Var).zzc;
        if (j1Var != null) {
            j1Var.g(sb, r14);
        }
    }
}
