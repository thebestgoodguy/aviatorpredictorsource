.class public final Lcom/google/android/gms/internal/firebase-auth-api/n6;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static final a:[B

.field public static final b:Lcom/google/android/gms/internal/firebase-auth-api/xc;

.field public static final c:Lcom/google/android/gms/internal/firebase-auth-api/xc;

.field public static final d:Lcom/google/android/gms/internal/firebase-auth-api/xc;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/n6;->a:[B

    sget-object v7, Lcom/google/android/gms/internal/firebase-auth-api/b4;->a:Lcom/google/android/gms/internal/firebase-auth-api/xc;

    const/4 v1, 0x4

    const/4 v2, 0x5

    const/4 v3, 0x3

    const/4 v5, 0x3

    move-object v4, v7

    move-object v6, v0

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/n6;->a(IIILcom/google/android/gms/internal/firebase-auth-api/xc;I[B)Lcom/google/android/gms/internal/firebase-auth-api/xc;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/firebase-auth-api/n6;->b:Lcom/google/android/gms/internal/firebase-auth-api/xc;

    const/4 v1, 0x4

    const/4 v3, 0x4

    const/4 v5, 0x5

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/n6;->a(IIILcom/google/android/gms/internal/firebase-auth-api/xc;I[B)Lcom/google/android/gms/internal/firebase-auth-api/xc;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/firebase-auth-api/n6;->c:Lcom/google/android/gms/internal/firebase-auth-api/xc;

    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/b4;->e:Lcom/google/android/gms/internal/firebase-auth-api/xc;

    const/4 v1, 0x4

    const/4 v3, 0x3

    const/4 v5, 0x3

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/n6;->a(IIILcom/google/android/gms/internal/firebase-auth-api/xc;I[B)Lcom/google/android/gms/internal/firebase-auth-api/xc;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/n6;->d:Lcom/google/android/gms/internal/firebase-auth-api/xc;

    return-void
.end method

.method public static a(IIILcom/google/android/gms/internal/firebase-auth-api/xc;I[B)Lcom/google/android/gms/internal/firebase-auth-api/xc;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/xa;->z()Lcom/google/android/gms/internal/firebase-auth-api/wa;

    move-result-object p0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/kb;->z()Lcom/google/android/gms/internal/firebase-auth-api/jb;

    move-result-object p1

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/jb;->q(I)Lcom/google/android/gms/internal/firebase-auth-api/jb;

    const/4 v0, 0x5

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/jb;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/jb;

    invoke-static {p5}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->A([B)Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object p5

    invoke-virtual {p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/jb;->p(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/jb;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/kb;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ua;->z()Lcom/google/android/gms/internal/firebase-auth-api/ta;

    move-result-object p5

    invoke-virtual {p5, p3}, Lcom/google/android/gms/internal/firebase-auth-api/ta;->p(Lcom/google/android/gms/internal/firebase-auth-api/xc;)Lcom/google/android/gms/internal/firebase-auth-api/ta;

    invoke-virtual {p5}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p3

    check-cast p3, Lcom/google/android/gms/internal/firebase-auth-api/ua;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ab;->A()Lcom/google/android/gms/internal/firebase-auth-api/za;

    move-result-object p5

    invoke-virtual {p5, p1}, Lcom/google/android/gms/internal/firebase-auth-api/za;->q(Lcom/google/android/gms/internal/firebase-auth-api/kb;)Lcom/google/android/gms/internal/firebase-auth-api/za;

    invoke-virtual {p5, p3}, Lcom/google/android/gms/internal/firebase-auth-api/za;->p(Lcom/google/android/gms/internal/firebase-auth-api/ua;)Lcom/google/android/gms/internal/firebase-auth-api/za;

    invoke-virtual {p5, p2}, Lcom/google/android/gms/internal/firebase-auth-api/za;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/za;

    invoke-virtual {p5}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/ab;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/wa;->p(Lcom/google/android/gms/internal/firebase-auth-api/ab;)Lcom/google/android/gms/internal/firebase-auth-api/wa;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/xa;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/xc;->z()Lcom/google/android/gms/internal/firebase-auth-api/wc;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/firebase-auth-api/f6;

    invoke-direct {p2}, Lcom/google/android/gms/internal/firebase-auth-api/f6;-><init>()V

    const-string p2, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey"

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/wc;->p(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/wc;

    invoke-virtual {p1, p4}, Lcom/google/android/gms/internal/firebase-auth-api/wc;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/wc;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/rq;->g()Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/wc;->q(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/wc;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/xc;

    return-object p0
.end method
