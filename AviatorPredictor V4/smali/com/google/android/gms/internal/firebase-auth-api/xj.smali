.class final Lcom/google/android/gms/internal/firebase-auth-api/xj;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/hn;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/firebase-auth-api/am;

.field final synthetic b:Lcom/google/android/gms/internal/firebase-auth-api/ik;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/ik;Lcom/google/android/gms/internal/firebase-auth-api/am;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/xj;->b:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/xj;->a:Lcom/google/android/gms/internal/firebase-auth-api/am;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/bp;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/bp;->m0()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/ro;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ro;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/xj;->b:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->q(Lcom/google/android/gms/internal/firebase-auth-api/ik;)Lcom/google/android/gms/internal/firebase-auth-api/in;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/wj;

    invoke-direct {v2, p0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/wj;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/xj;Lcom/google/android/gms/internal/firebase-auth-api/hn;Lcom/google/android/gms/internal/firebase-auth-api/bp;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/in;->g(Lcom/google/android/gms/internal/firebase-auth-api/ro;Lcom/google/android/gms/internal/firebase-auth-api/hn;)V

    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, La1/l;->a(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/xj;->a:Lcom/google/android/gms/internal/firebase-auth-api/am;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/am;->h(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method
