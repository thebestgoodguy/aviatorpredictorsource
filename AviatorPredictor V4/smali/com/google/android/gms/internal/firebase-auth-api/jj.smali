.class final Lcom/google/android/gms/internal/firebase-auth-api/jj;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/hn;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/firebase-auth-api/cq;

.field final synthetic b:Lcom/google/android/gms/internal/firebase-auth-api/am;

.field final synthetic c:Lcom/google/android/gms/internal/firebase-auth-api/ik;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/ik;Lcom/google/android/gms/internal/firebase-auth-api/cq;Lcom/google/android/gms/internal/firebase-auth-api/am;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/jj;->c:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/jj;->a:Lcom/google/android/gms/internal/firebase-auth-api/cq;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/jj;->b:Lcom/google/android/gms/internal/firebase-auth-api/am;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/bp;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/jj;->a:Lcom/google/android/gms/internal/firebase-auth-api/cq;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/cq;->l0(Z)Lcom/google/android/gms/internal/firebase-auth-api/cq;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/jj;->a:Lcom/google/android/gms/internal/firebase-auth-api/cq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/bp;->m0()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cq;->k0(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/cq;

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/jj;->c:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->q(Lcom/google/android/gms/internal/firebase-auth-api/ik;)Lcom/google/android/gms/internal/firebase-auth-api/in;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/jj;->a:Lcom/google/android/gms/internal/firebase-auth-api/cq;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/ij;

    invoke-direct {v1, p0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/ij;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/jj;Lcom/google/android/gms/internal/firebase-auth-api/hn;)V

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/in;->p(Lcom/google/android/gms/internal/firebase-auth-api/cq;Lcom/google/android/gms/internal/firebase-auth-api/hn;)V

    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, La1/l;->a(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/jj;->b:Lcom/google/android/gms/internal/firebase-auth-api/am;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/am;->h(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method
