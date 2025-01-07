.class final Lcom/google/android/gms/internal/firebase-auth-api/un;
.super Lcom/google/android/gms/internal/firebase-auth-api/am;
.source ""


# instance fields
.field private final c:Ljava/lang/String;

.field final synthetic d:Lcom/google/android/gms/internal/firebase-auth-api/xn;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/xn;Lcom/google/android/gms/internal/firebase-auth-api/am;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/un;->d:Lcom/google/android/gms/internal/firebase-auth-api/xn;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/am;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/un;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;)V
    .locals 5

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/xn;->a()Lz/a;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCodeSent"

    invoke-virtual {v0, v2, v1}, Lz/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/un;->d:Lcom/google/android/gms/internal/firebase-auth-api/xn;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/xn;->d(Lcom/google/android/gms/internal/firebase-auth-api/xn;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/un;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/wn;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/wn;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/firebase-auth-api/am;

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/am;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/wn;->g:Z

    iput-object p1, v0, Lcom/google/android/gms/internal/firebase-auth-api/wn;->d:Ljava/lang/String;

    iget-wide v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/wn;->a:J

    const-wide/16 v3, 0x0

    cmp-long p1, v1, v3

    if-gtz p1, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/un;->d:Lcom/google/android/gms/internal/firebase-auth-api/xn;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/un;->c:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/xn;->g(Lcom/google/android/gms/internal/firebase-auth-api/xn;Ljava/lang/String;)V

    return-void

    :cond_2
    iget-boolean p1, v0, Lcom/google/android/gms/internal/firebase-auth-api/wn;->c:Z

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/un;->d:Lcom/google/android/gms/internal/firebase-auth-api/xn;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/un;->c:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/xn;->f(Lcom/google/android/gms/internal/firebase-auth-api/xn;Ljava/lang/String;)V

    return-void

    :cond_3
    iget-object p1, v0, Lcom/google/android/gms/internal/firebase-auth-api/wn;->e:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/d2;->d(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/un;->d:Lcom/google/android/gms/internal/firebase-auth-api/xn;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/un;->c:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/xn;->e(Lcom/google/android/gms/internal/firebase-auth-api/xn;Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method public final h(Lcom/google/android/gms/common/api/Status;)V
    .locals 5

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/xn;->a()Lz/a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->k0()I

    move-result v1

    invoke-static {v1}, Lt/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->l0()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SMS verification code request failed: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lz/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/un;->d:Lcom/google/android/gms/internal/firebase-auth-api/xn;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/xn;->d(Lcom/google/android/gms/internal/firebase-auth-api/xn;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/un;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/wn;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/wn;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/firebase-auth-api/am;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/am;->h(Lcom/google/android/gms/common/api/Status;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/un;->d:Lcom/google/android/gms/internal/firebase-auth-api/xn;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/un;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/xn;->j(Ljava/lang/String;)V

    return-void
.end method
