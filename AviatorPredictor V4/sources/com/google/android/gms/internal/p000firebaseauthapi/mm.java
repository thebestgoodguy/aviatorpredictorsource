package com.google.android.gms.internal.p000firebaseauthapi;

import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class mm {
    public static Object a(String str, Type type) {
        if (type == String.class) {
            try {
                Cdo cdo = new Cdo();
                cdo.a(str);
                if (cdo.c()) {
                    return cdo.b();
                }
                throw new jk("No error message: " + str);
            } catch (Exception e5) {
                throw new jk("Json conversion failed! ".concat(String.valueOf(e5.getMessage())), e5);
            }
        }
        if (type == Void.class) {
            return null;
        }
        try {
            om omVar = (om) ((Class) type).getConstructor(new Class[0]).newInstance(new Object[0]);
            try {
                omVar.d(str);
                return omVar;
            } catch (Exception e6) {
                throw new jk("Json conversion failed! ".concat(String.valueOf(e6.getMessage())), e6);
            }
        } catch (Exception e7) {
            throw new jk("Instantiation of JsonResponse failed! ".concat(type.toString()), e7);
        }
    }
}
