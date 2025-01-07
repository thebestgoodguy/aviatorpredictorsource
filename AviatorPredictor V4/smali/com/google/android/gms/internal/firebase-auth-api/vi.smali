.class final Lcom/google/android/gms/internal/firebase-auth-api/vi;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/hn;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/firebase-auth-api/gn;

.field final synthetic b:Lcom/google/android/gms/internal/firebase-auth-api/am;

.field final synthetic c:Lcom/google/android/gms/internal/firebase-auth-api/bp;

.field final synthetic d:Lcom/google/android/gms/internal/firebase-auth-api/sp;

.field final synthetic e:Lcom/google/android/gms/internal/firebase-auth-api/ik;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/ik;Lcom/google/android/gms/internal/firebase-auth-api/gn;Lcom/google/android/gms/internal/firebase-auth-api/am;Lcom/google/android/gms/internal/firebase-auth-api/bp;Lcom/google/android/gms/internal/firebase-auth-api/sp;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/vi;->e:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/vi;->a:Lcom/google/android/gms/internal/firebase-auth-api/gn;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/vi;->b:Lcom/google/android/gms/internal/firebase-auth-api/am;

    iput-object p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/vi;->c:Lcom/google/android/gms/internal/firebase-auth-api/bp;

    iput-object p5, p0, Lcom/google/android/gms/internal/firebase-auth-api/vi;->d:Lcom/google/android/gms/internal/firebase-auth-api/sp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 7

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/so;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/so;->j0()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/vi;->e:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/vi;->b:Lcom/google/android/gms/internal/firebase-auth-api/am;

    iget-object v3, p0, Lcom/google/android/gms/internal/firebase-auth-api/vi;->c:Lcom/google/android/gms/internal/firebase-auth-api/bp;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lcom/google/android/gms/internal/firebase-auth-api/uo;

    iget-object v5, p0, Lcom/google/android/gms/internal/firebase-auth-api/vi;->d:Lcom/google/android/gms/internal/firebase-auth-api/sp;

    iget-object v6, p0, Lcom/google/android/gms/internal/firebase-auth-api/vi;->a:Lcom/google/android/gms/internal/firebase-auth-api/gn;

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->v(Lcom/google/android/gms/internal/firebase-auth-api/ik;Lcom/google/android/gms/internal/firebase-auth-api/am;Lcom/google/android/gms/internal/firebase-auth-api/bp;Lcom/google/android/gms/internal/firebase-auth-api/uo;Lcom/google/android/gms/internal/firebase-auth-api/sp;Lcom/google/android/gms/internal/firebase-auth-api/gn;)V

    return-void

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/vi;->a:Lcom/google/android/gms/internal/firebase-auth-api/gn;

    const-string v0, "No users"

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/gn;->d(Ljava/lang/String;)V

    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/vi;->a:Lcom/google/android/gms/internal/firebase-auth-api/gn;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/gn;->d(Ljava/lang/String;)V

    return-void
.end method
