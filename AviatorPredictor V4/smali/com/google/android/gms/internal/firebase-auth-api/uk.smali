.class final Lcom/google/android/gms/internal/firebase-auth-api/uk;
.super Lcom/google/android/gms/internal/firebase-auth-api/cn;
.source ""


# instance fields
.field private final w:Lcom/google/firebase/auth/j;


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/j;)V
    .locals 2

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/cn;-><init>(I)V

    const-string v0, "credential cannot be null"

    invoke-static {p1, v0}, Lw/r;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/j;

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/uk;->w:Lcom/google/firebase/auth/j;

    invoke-virtual {p1}, Lcom/google/firebase/auth/j;->o0()Ljava/lang/String;

    move-result-object v0

    const-string v1, "email cannot be null"

    invoke-static {v0, v1}, Lw/r;->f(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/firebase/auth/j;->p0()Ljava/lang/String;

    move-result-object p1

    const-string v0, "password cannot be null"

    invoke-static {p1, v0}, Lw/r;->f(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "linkEmailAuthCredential"

    return-object v0
.end method

.method public final b(Lo0/i;Lcom/google/android/gms/internal/firebase-auth-api/bm;)V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/bn;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/bn;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/cn;Lo0/i;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->v:Lcom/google/android/gms/internal/firebase-auth-api/bn;

    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/xg;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/uk;->w:Lcom/google/firebase/auth/j;

    invoke-virtual {v0}, Lcom/google/firebase/auth/j;->o0()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/uk;->w:Lcom/google/firebase/auth/j;

    invoke-virtual {v1}, Lcom/google/firebase/auth/j;->p0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->d:Lcom/google/firebase/auth/z;

    invoke-virtual {v2}, Lcom/google/firebase/auth/z;->H0()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/xg;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->b:Lcom/google/android/gms/internal/firebase-auth-api/zm;

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/bm;->s(Lcom/google/android/gms/internal/firebase-auth-api/xg;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V

    return-void
.end method

.method public final c()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->c:Lx0/e;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->j:Lcom/google/android/gms/internal/firebase-auth-api/uo;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->o(Lx0/e;Lcom/google/android/gms/internal/firebase-auth-api/uo;)La1/m1;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->e:Ljava/lang/Object;

    check-cast v1, La1/v0;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->i:Lcom/google/android/gms/internal/firebase-auth-api/bp;

    invoke-interface {v1, v2, v0}, La1/v0;->c(Lcom/google/android/gms/internal/firebase-auth-api/bp;Lcom/google/firebase/auth/z;)V

    new-instance v1, La1/g1;

    invoke-direct {v1, v0}, La1/g1;-><init>(La1/m1;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->m(Ljava/lang/Object;)V

    return-void
.end method
