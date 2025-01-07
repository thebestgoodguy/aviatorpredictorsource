.class final Lcom/google/android/gms/internal/firebase-auth-api/gj;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/hn;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/firebase-auth-api/hn;

.field final synthetic b:Lcom/google/android/gms/internal/firebase-auth-api/hj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/hj;Lcom/google/android/gms/internal/firebase-auth-api/hn;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/gj;->b:Lcom/google/android/gms/internal/firebase-auth-api/hj;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/gj;->a:Lcom/google/android/gms/internal/firebase-auth-api/hn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 10

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/lq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lq;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0x4281

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/gj;->b:Lcom/google/android/gms/internal/firebase-auth-api/hj;

    iget-object v1, v1, Lcom/google/android/gms/internal/firebase-auth-api/hj;->b:Lcom/google/android/gms/internal/firebase-auth-api/am;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lq;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lq;->f()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lcom/google/firebase/auth/n0;->p0(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/auth/n0;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/am;->g(Lcom/google/android/gms/common/api/Status;Lcom/google/firebase/auth/n0;)V

    return-void

    :cond_0
    new-instance v3, Lcom/google/android/gms/internal/firebase-auth-api/bp;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lq;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lq;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lq;->a()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v4, "Bearer"

    invoke-direct {v3, v0, v1, v2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/bp;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/gj;->b:Lcom/google/android/gms/internal/firebase-auth-api/hj;

    iget-object v2, v0, Lcom/google/android/gms/internal/firebase-auth-api/hj;->c:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    const/4 v4, 0x0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lq;->g()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    const/4 v7, 0x0

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/gj;->b:Lcom/google/android/gms/internal/firebase-auth-api/hj;

    iget-object v8, p1, Lcom/google/android/gms/internal/firebase-auth-api/hj;->b:Lcom/google/android/gms/internal/firebase-auth-api/am;

    iget-object v9, p0, Lcom/google/android/gms/internal/firebase-auth-api/gj;->a:Lcom/google/android/gms/internal/firebase-auth-api/hn;

    const-string v5, "phone"

    invoke-static/range {v2 .. v9}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->s(Lcom/google/android/gms/internal/firebase-auth-api/ik;Lcom/google/android/gms/internal/firebase-auth-api/bp;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/google/firebase/auth/n1;Lcom/google/android/gms/internal/firebase-auth-api/am;Lcom/google/android/gms/internal/firebase-auth-api/gn;)V

    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/gj;->a:Lcom/google/android/gms/internal/firebase-auth-api/hn;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/gn;->d(Ljava/lang/String;)V

    return-void
.end method
