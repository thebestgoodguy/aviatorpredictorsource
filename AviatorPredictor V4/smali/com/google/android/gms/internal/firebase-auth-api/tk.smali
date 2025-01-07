.class final Lcom/google/android/gms/internal/firebase-auth-api/tk;
.super Lcom/google/android/gms/internal/firebase-auth-api/cn;
.source ""


# instance fields
.field private final w:Lcom/google/android/gms/internal/firebase-auth-api/tg;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/cn;-><init>(I)V

    const-string v0, "refresh token cannot be null"

    invoke-static {p1, v0}, Lw/r;->f(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/tg;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/tg;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/tk;->w:Lcom/google/android/gms/internal/firebase-auth-api/tg;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "getAccessToken"

    return-object v0
.end method

.method public final b(Lo0/i;Lcom/google/android/gms/internal/firebase-auth-api/bm;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/bn;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/bn;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/cn;Lo0/i;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->v:Lcom/google/android/gms/internal/firebase-auth-api/bn;

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/tk;->w:Lcom/google/android/gms/internal/firebase-auth-api/tg;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->b:Lcom/google/android/gms/internal/firebase-auth-api/zm;

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/bm;->q(Lcom/google/android/gms/internal/firebase-auth-api/tg;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V

    return-void
.end method

.method public final c()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->i:Lcom/google/android/gms/internal/firebase-auth-api/bp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/bp;->n0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->i:Lcom/google/android/gms/internal/firebase-auth-api/bp;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/tk;->w:Lcom/google/android/gms/internal/firebase-auth-api/tg;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/tg;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/bp;->q0(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->e:Ljava/lang/Object;

    check-cast v0, La1/v0;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->i:Lcom/google/android/gms/internal/firebase-auth-api/bp;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->d:Lcom/google/firebase/auth/z;

    invoke-interface {v0, v1, v2}, La1/v0;->c(Lcom/google/android/gms/internal/firebase-auth-api/bp;Lcom/google/firebase/auth/z;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->i:Lcom/google/android/gms/internal/firebase-auth-api/bp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/bp;->m0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La1/b0;->a(Ljava/lang/String;)Lcom/google/firebase/auth/b0;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->m(Ljava/lang/Object;)V

    return-void
.end method
