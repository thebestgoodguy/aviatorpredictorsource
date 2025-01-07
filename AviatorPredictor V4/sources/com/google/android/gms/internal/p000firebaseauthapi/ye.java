package com.google.android.gms.internal.p000firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class ye {

    /* renamed from: a, reason: collision with root package name */
    private final ECPrivateKey f2374a;

    public ye(ECPrivateKey eCPrivateKey) {
        this.f2374a = eCPrivateKey;
    }

    public final byte[] a(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, int r21, int r22) {
        ECPoint eCPoint;
        ECParameterSpec params;
        ECParameterSpec params2;
        boolean z4;
        ECParameterSpec params3 = this.f2374a.getParams();
        EllipticCurve curve = params3.getCurve();
        int a5 = af.a(curve);
        int r9 = r22 - 1;
        int r13 = 1;
        try {
            if (r9 == 0) {
                int length = bArr.length;
                if (length != a5 + a5 + 1) {
                    throw new GeneralSecurityException("invalid point size");
                }
                if (bArr[0] != 4) {
                    throw new GeneralSecurityException("invalid point format");
                }
                int r7 = a5 + 1;
                eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, r7)), new BigInteger(1, Arrays.copyOfRange(bArr, r7, length)));
            } else if (r9 != 2) {
                BigInteger b5 = af.b(curve);
                int length2 = bArr.length;
                if (length2 != a5 + 1) {
                    throw new GeneralSecurityException("compressed point has wrong length");
                }
                byte b6 = bArr[0];
                if (b6 == 2) {
                    z4 = false;
                } else {
                    if (b6 != 3) {
                        throw new GeneralSecurityException("invalid format");
                    }
                    z4 = true;
                }
                BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, length2));
                if (bigInteger.signum() == -1 || bigInteger.compareTo(b5) >= 0) {
                    throw new GeneralSecurityException("x is out of range");
                }
                eCPoint = new ECPoint(bigInteger, af.c(bigInteger, z4, curve));
                ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(eCPoint, params3);
                cf cfVar = cf.f1461k;
                ECPublicKey eCPublicKey = (ECPublicKey) ((KeyFactory) cfVar.a("EC")).generatePublic(eCPublicKeySpec);
                ECPrivateKey eCPrivateKey = this.f2374a;
                params = eCPublicKey.getParams();
                params2 = eCPrivateKey.getParams();
                if (params.getCurve().equals(params2.getCurve()) || !params.getGenerator().equals(params2.getGenerator()) || !params.getOrder().equals(params2.getOrder()) || params.getCofactor() != params2.getCofactor()) {
                    throw new GeneralSecurityException("invalid public key spec");
                }
                ECPoint w4 = eCPublicKey.getW();
                af.d(w4, eCPrivateKey.getParams().getCurve());
                PublicKey generatePublic = ((KeyFactory) cfVar.a("EC")).generatePublic(new ECPublicKeySpec(w4, eCPrivateKey.getParams()));
                KeyAgreement keyAgreement = (KeyAgreement) cf.f1459i.a("ECDH");
                keyAgreement.init(eCPrivateKey);
                try {
                    keyAgreement.doPhase(generatePublic, true);
                    byte[] generateSecret = keyAgreement.generateSecret();
                    EllipticCurve curve2 = eCPrivateKey.getParams().getCurve();
                    BigInteger bigInteger2 = new BigInteger(1, generateSecret);
                    if (bigInteger2.signum() == -1 || bigInteger2.compareTo(af.b(curve2)) >= 0) {
                        throw new GeneralSecurityException("shared secret is out of range");
                    }
                    af.c(bigInteger2, true, curve2);
                    byte[] c5 = se.c(bArr, generateSecret);
                    Mac mac = (Mac) cf.f1456f.a(str);
                    if (r21 > mac.getMacLength() * 255) {
                        throw new GeneralSecurityException("size too large");
                    }
                    if (bArr2 == null || bArr2.length == 0) {
                        mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
                    } else {
                        mac.init(new SecretKeySpec(bArr2, str));
                    }
                    byte[] bArr4 = new byte[r21];
                    mac.init(new SecretKeySpec(mac.doFinal(c5), str));
                    byte[] bArr5 = new byte[0];
                    int r23 = 0;
                    while (true) {
                        mac.update(bArr5);
                        mac.update((byte[]) null);
                        mac.update((byte) r13);
                        bArr5 = mac.doFinal();
                        int length3 = bArr5.length;
                        int r8 = r23 + length3;
                        if (r8 >= r21) {
                            System.arraycopy(bArr5, 0, bArr4, r23, r21 - r23);
                            return bArr4;
                        }
                        System.arraycopy(bArr5, 0, bArr4, r23, length3);
                        r13++;
                        r23 = r8;
                    }
                } catch (IllegalStateException e5) {
                    throw new GeneralSecurityException(e5);
                }
            } else {
                int length4 = bArr.length;
                if (length4 != a5 + a5) {
                    throw new GeneralSecurityException("invalid point size");
                }
                eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 0, a5)), new BigInteger(1, Arrays.copyOfRange(bArr, a5, length4)));
            }
            params = eCPublicKey.getParams();
            params2 = eCPrivateKey.getParams();
            if (params.getCurve().equals(params2.getCurve())) {
            }
            throw new GeneralSecurityException("invalid public key spec");
        } catch (IllegalArgumentException | NullPointerException e6) {
            throw new GeneralSecurityException(e6);
        }
        af.d(eCPoint, curve);
        ECPublicKeySpec eCPublicKeySpec2 = new ECPublicKeySpec(eCPoint, params3);
        cf cfVar2 = cf.f1461k;
        ECPublicKey eCPublicKey2 = (ECPublicKey) ((KeyFactory) cfVar2.a("EC")).generatePublic(eCPublicKeySpec2);
        ECPrivateKey eCPrivateKey2 = this.f2374a;
    }
}
