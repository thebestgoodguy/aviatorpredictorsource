.class final Lcom/google/android/gms/internal/firebase-auth-api/kj;
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

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/kj;->b:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/kj;->a:Lcom/google/android/gms/internal/firebase-auth-api/am;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/bp;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/sp;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/sp;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/bp;->m0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/sp;->e(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/sp;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/sp;->d(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/sp;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/sp;->g(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/sp;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/kj;->b:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/kj;->a:Lcom/google/android/gms/internal/firebase-auth-api/am;

    invoke-static {v1, v2, p1, v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->u(Lcom/google/android/gms/internal/firebase-auth-api/ik;Lcom/google/android/gms/internal/firebase-auth-api/am;Lcom/google/android/gms/internal/firebase-auth-api/bp;Lcom/google/android/gms/internal/firebase-auth-api/sp;Lcom/google/android/gms/internal/firebase-auth-api/gn;)V

    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, La1/l;->a(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/kj;->a:Lcom/google/android/gms/internal/firebase-auth-api/am;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/am;->h(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method
