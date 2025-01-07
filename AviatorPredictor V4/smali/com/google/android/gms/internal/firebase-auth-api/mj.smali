.class final Lcom/google/android/gms/internal/firebase-auth-api/mj;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/hn;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/firebase-auth-api/hn;

.field final synthetic b:Lcom/google/android/gms/internal/firebase-auth-api/bp;

.field final synthetic c:Lcom/google/android/gms/internal/firebase-auth-api/nj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/nj;Lcom/google/android/gms/internal/firebase-auth-api/hn;Lcom/google/android/gms/internal/firebase-auth-api/bp;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mj;->c:Lcom/google/android/gms/internal/firebase-auth-api/nj;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/mj;->a:Lcom/google/android/gms/internal/firebase-auth-api/hn;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/mj;->b:Lcom/google/android/gms/internal/firebase-auth-api/bp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 6

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/so;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/so;->j0()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lcom/google/android/gms/internal/firebase-auth-api/uo;

    new-instance v4, Lcom/google/android/gms/internal/firebase-auth-api/sp;

    invoke-direct {v4}, Lcom/google/android/gms/internal/firebase-auth-api/sp;-><init>()V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mj;->b:Lcom/google/android/gms/internal/firebase-auth-api/bp;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/bp;->m0()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Lcom/google/android/gms/internal/firebase-auth-api/sp;->e(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/sp;

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mj;->c:Lcom/google/android/gms/internal/firebase-auth-api/nj;

    iget-object p1, p1, Lcom/google/android/gms/internal/firebase-auth-api/nj;->a:Ljava/lang/String;

    invoke-virtual {v4, p1}, Lcom/google/android/gms/internal/firebase-auth-api/sp;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/sp;

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mj;->c:Lcom/google/android/gms/internal/firebase-auth-api/nj;

    iget-object v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/nj;->c:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    iget-object v1, p1, Lcom/google/android/gms/internal/firebase-auth-api/nj;->b:Lcom/google/android/gms/internal/firebase-auth-api/am;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/mj;->b:Lcom/google/android/gms/internal/firebase-auth-api/bp;

    iget-object v5, p0, Lcom/google/android/gms/internal/firebase-auth-api/mj;->a:Lcom/google/android/gms/internal/firebase-auth-api/hn;

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->v(Lcom/google/android/gms/internal/firebase-auth-api/ik;Lcom/google/android/gms/internal/firebase-auth-api/am;Lcom/google/android/gms/internal/firebase-auth-api/bp;Lcom/google/android/gms/internal/firebase-auth-api/uo;Lcom/google/android/gms/internal/firebase-auth-api/sp;Lcom/google/android/gms/internal/firebase-auth-api/gn;)V

    return-void

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mj;->a:Lcom/google/android/gms/internal/firebase-auth-api/hn;

    const-string v0, "No users."

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/gn;->d(Ljava/lang/String;)V

    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, La1/l;->a(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mj;->c:Lcom/google/android/gms/internal/firebase-auth-api/nj;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/nj;->b:Lcom/google/android/gms/internal/firebase-auth-api/am;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/am;->h(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method
