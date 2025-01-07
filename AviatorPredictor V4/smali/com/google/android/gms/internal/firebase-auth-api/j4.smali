.class final Lcom/google/android/gms/internal/firebase-auth-api/j4;
.super Lcom/google/android/gms/internal/firebase-auth-api/p7;
.source ""


# instance fields
.field final synthetic b:Lcom/google/android/gms/internal/firebase-auth-api/k4;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/k4;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/j4;->b:Lcom/google/android/gms/internal/firebase-auth-api/k4;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/p7;-><init>(Ljava/lang/Class;)V

    return-void
.end method

.method public static final g(Lcom/google/android/gms/internal/firebase-auth-api/e9;)Lcom/google/android/gms/internal/firebase-auth-api/a9;
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/a9;->A()Lcom/google/android/gms/internal/firebase-auth-api/z8;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/e9;->E()Lcom/google/android/gms/internal/firebase-auth-api/h9;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/z8;->q(Lcom/google/android/gms/internal/firebase-auth-api/h9;)Lcom/google/android/gms/internal/firebase-auth-api/z8;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/e9;->z()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/uf;->a(I)[B

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->A([B)Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/z8;->p(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/z8;

    const/4 p0, 0x0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/z8;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/z8;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/a9;

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/google/android/gms/internal/firebase-auth-api/e0;)Lcom/google/android/gms/internal/firebase-auth-api/e0;
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/e9;

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/j4;->g(Lcom/google/android/gms/internal/firebase-auth-api/e9;)Lcom/google/android/gms/internal/firebase-auth-api/a9;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic b(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/e0;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/yr;->a()Lcom/google/android/gms/internal/firebase-auth-api/yr;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/e9;->D(Lcom/google/android/gms/internal/firebase-auth-api/hr;Lcom/google/android/gms/internal/firebase-auth-api/yr;)Lcom/google/android/gms/internal/firebase-auth-api/e9;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic d(Lcom/google/android/gms/internal/firebase-auth-api/e0;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/e9;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/j4;->f(Lcom/google/android/gms/internal/firebase-auth-api/e9;)V

    return-void
.end method

.method public final f(Lcom/google/android/gms/internal/firebase-auth-api/e9;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/e9;->z()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/wf;->b(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/j4;->b:Lcom/google/android/gms/internal/firebase-auth-api/k4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/e9;->E()Lcom/google/android/gms/internal/firebase-auth-api/h9;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/k4;->k(Lcom/google/android/gms/internal/firebase-auth-api/k4;Lcom/google/android/gms/internal/firebase-auth-api/h9;)V

    return-void
.end method
