.class final Lcom/google/android/gms/internal/firebase-auth-api/ol;
.super Lcom/google/android/gms/internal/firebase-auth-api/cn;
.source ""


# instance fields
.field private final w:Lcom/google/android/gms/internal/firebase-auth-api/ci;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/cn;-><init>(I)V

    invoke-static {p1}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/ci;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/ci;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/ol;->w:Lcom/google/android/gms/internal/firebase-auth-api/ci;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "unenrollMfa"

    return-object v0
.end method

.method public final b(Lo0/i;Lcom/google/android/gms/internal/firebase-auth-api/bm;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/bn;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/bn;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/cn;Lo0/i;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->v:Lcom/google/android/gms/internal/firebase-auth-api/bn;

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/ol;->w:Lcom/google/android/gms/internal/firebase-auth-api/ci;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->b:Lcom/google/android/gms/internal/firebase-auth-api/zm;

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/bm;->b(Lcom/google/android/gms/internal/firebase-auth-api/ci;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V

    return-void
.end method

.method public final c()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->e:Ljava/lang/Object;

    check-cast v0, La1/v0;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->i:Lcom/google/android/gms/internal/firebase-auth-api/bp;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->c:Lx0/e;

    iget-object v3, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->j:Lcom/google/android/gms/internal/firebase-auth-api/uo;

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->o(Lx0/e;Lcom/google/android/gms/internal/firebase-auth-api/uo;)La1/m1;

    move-result-object v2

    invoke-interface {v0, v1, v2}, La1/v0;->c(Lcom/google/android/gms/internal/firebase-auth-api/bp;Lcom/google/firebase/auth/z;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->m(Ljava/lang/Object;)V

    return-void
.end method
