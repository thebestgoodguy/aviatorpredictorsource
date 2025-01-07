.class final Lcom/google/android/gms/internal/firebase-auth-api/wj;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/hn;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/firebase-auth-api/hn;

.field final synthetic b:Lcom/google/android/gms/internal/firebase-auth-api/bp;

.field final synthetic c:Lcom/google/android/gms/internal/firebase-auth-api/xj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/xj;Lcom/google/android/gms/internal/firebase-auth-api/hn;Lcom/google/android/gms/internal/firebase-auth-api/bp;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/wj;->c:Lcom/google/android/gms/internal/firebase-auth-api/xj;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/wj;->a:Lcom/google/android/gms/internal/firebase-auth-api/hn;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/wj;->b:Lcom/google/android/gms/internal/firebase-auth-api/bp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/so;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/so;->j0()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/wj;->c:Lcom/google/android/gms/internal/firebase-auth-api/xj;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/xj;->a:Lcom/google/android/gms/internal/firebase-auth-api/am;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/wj;->b:Lcom/google/android/gms/internal/firebase-auth-api/bp;

    const/4 v2, 0x0

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/uo;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/am;->i(Lcom/google/android/gms/internal/firebase-auth-api/bp;Lcom/google/android/gms/internal/firebase-auth-api/uo;)V

    return-void

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/wj;->a:Lcom/google/android/gms/internal/firebase-auth-api/hn;

    const-string v0, "No users"

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/gn;->d(Ljava/lang/String;)V

    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/wj;->a:Lcom/google/android/gms/internal/firebase-auth-api/hn;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/gn;->d(Ljava/lang/String;)V

    return-void
.end method
