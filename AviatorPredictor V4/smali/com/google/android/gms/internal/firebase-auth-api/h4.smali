.class public final Lcom/google/android/gms/internal/firebase-auth-api/h4;
.super Lcom/google/android/gms/internal/firebase-auth-api/q7;
.source ""


# direct methods
.method constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/internal/firebase-auth-api/r7;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/f4;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/m2;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/f4;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/u8;

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/q7;-><init>(Ljava/lang/Class;[Lcom/google/android/gms/internal/firebase-auth-api/r7;)V

    return-void
.end method

.method static bridge synthetic k(IIIIII)Lcom/google/android/gms/internal/firebase-auth-api/o7;
    .locals 1

    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/o7;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/e9;->A()Lcom/google/android/gms/internal/firebase-auth-api/c9;

    move-result-object p2

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h9;->A()Lcom/google/android/gms/internal/firebase-auth-api/g9;

    move-result-object p4

    const/16 v0, 0x10

    invoke-virtual {p4, v0}, Lcom/google/android/gms/internal/firebase-auth-api/g9;->p(I)Lcom/google/android/gms/internal/firebase-auth-api/g9;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p4

    check-cast p4, Lcom/google/android/gms/internal/firebase-auth-api/h9;

    invoke-virtual {p2, p4}, Lcom/google/android/gms/internal/firebase-auth-api/c9;->q(Lcom/google/android/gms/internal/firebase-auth-api/h9;)Lcom/google/android/gms/internal/firebase-auth-api/c9;

    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/firebase-auth-api/c9;->p(I)Lcom/google/android/gms/internal/firebase-auth-api/c9;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/e9;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/xb;->A()Lcom/google/android/gms/internal/firebase-auth-api/wb;

    move-result-object p2

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ac;->A()Lcom/google/android/gms/internal/firebase-auth-api/zb;

    move-result-object p4

    const/4 v0, 0x5

    invoke-virtual {p4, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zb;->q(I)Lcom/google/android/gms/internal/firebase-auth-api/zb;

    invoke-virtual {p4, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zb;->p(I)Lcom/google/android/gms/internal/firebase-auth-api/zb;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p3

    check-cast p3, Lcom/google/android/gms/internal/firebase-auth-api/ac;

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/wb;->q(Lcom/google/android/gms/internal/firebase-auth-api/ac;)Lcom/google/android/gms/internal/firebase-auth-api/wb;

    const/16 p3, 0x20

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/wb;->p(I)Lcom/google/android/gms/internal/firebase-auth-api/wb;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/xb;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/x8;->z()Lcom/google/android/gms/internal/firebase-auth-api/w8;

    move-result-object p3

    invoke-virtual {p3, p0}, Lcom/google/android/gms/internal/firebase-auth-api/w8;->p(Lcom/google/android/gms/internal/firebase-auth-api/e9;)Lcom/google/android/gms/internal/firebase-auth-api/w8;

    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/firebase-auth-api/w8;->q(Lcom/google/android/gms/internal/firebase-auth-api/xb;)Lcom/google/android/gms/internal/firebase-auth-api/w8;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/x8;

    invoke-direct {p1, p0, p5}, Lcom/google/android/gms/internal/firebase-auth-api/o7;-><init>(Ljava/lang/Object;I)V

    return-object p1
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/firebase-auth-api/p7;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/g4;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/x8;

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/g4;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/h4;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final synthetic b(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/e0;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/yr;->a()Lcom/google/android/gms/internal/firebase-auth-api/yr;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/u8;->C(Lcom/google/android/gms/internal/firebase-auth-api/hr;Lcom/google/android/gms/internal/firebase-auth-api/yr;)Lcom/google/android/gms/internal/firebase-auth-api/u8;

    move-result-object p1

    return-object p1
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    return-object v0
.end method

.method public final bridge synthetic d(Lcom/google/android/gms/internal/firebase-auth-api/e0;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/u8;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/u8;->z()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/wf;->c(II)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/k4;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/k4;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/u8;->D()Lcom/google/android/gms/internal/firebase-auth-api/a9;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/k4;->l(Lcom/google/android/gms/internal/firebase-auth-api/a9;)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/z7;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/z7;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/u8;->E()Lcom/google/android/gms/internal/firebase-auth-api/ub;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/z7;->l(Lcom/google/android/gms/internal/firebase-auth-api/ub;)V

    return-void
.end method

.method public final e()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final f()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method
