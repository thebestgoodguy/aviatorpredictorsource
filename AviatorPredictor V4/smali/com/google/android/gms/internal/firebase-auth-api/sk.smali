.class final Lcom/google/android/gms/internal/firebase-auth-api/sk;
.super Lcom/google/android/gms/internal/firebase-auth-api/cn;
.source ""


# instance fields
.field private final w:Lcom/google/android/gms/internal/firebase-auth-api/rg;


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/q0;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/cn;-><init>(I)V

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/rg;

    invoke-virtual {p1}, Lcom/google/firebase/auth/q0;->a()Lcom/google/firebase/auth/n0;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/rg;-><init>(Lcom/google/firebase/auth/n0;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/sk;->w:Lcom/google/android/gms/internal/firebase-auth-api/rg;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "finalizeMfaSignIn"

    return-object v0
.end method

.method public final b(Lo0/i;Lcom/google/android/gms/internal/firebase-auth-api/bm;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/bn;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/bn;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/cn;Lo0/i;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->v:Lcom/google/android/gms/internal/firebase-auth-api/bn;

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/sk;->w:Lcom/google/android/gms/internal/firebase-auth-api/rg;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->b:Lcom/google/android/gms/internal/firebase-auth-api/zm;

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/bm;->p(Lcom/google/android/gms/internal/firebase-auth-api/rg;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V

    return-void
.end method

.method public final c()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->c:Lx0/e;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->j:Lcom/google/android/gms/internal/firebase-auth-api/uo;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->o(Lx0/e;Lcom/google/android/gms/internal/firebase-auth-api/uo;)La1/m1;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->d:Lcom/google/firebase/auth/z;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/google/firebase/auth/z;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, La1/m1;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0x4280

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->l(Lcom/google/android/gms/common/api/Status;)V

    return-void

    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->e:Ljava/lang/Object;

    check-cast v1, La1/v0;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->i:Lcom/google/android/gms/internal/firebase-auth-api/bp;

    invoke-interface {v1, v2, v0}, La1/v0;->c(Lcom/google/android/gms/internal/firebase-auth-api/bp;Lcom/google/firebase/auth/z;)V

    new-instance v1, La1/g1;

    invoke-direct {v1, v0}, La1/g1;-><init>(La1/m1;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->m(Ljava/lang/Object;)V

    return-void
.end method
