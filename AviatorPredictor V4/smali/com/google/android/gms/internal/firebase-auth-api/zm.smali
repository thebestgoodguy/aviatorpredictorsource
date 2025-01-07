.class final Lcom/google/android/gms/internal/firebase-auth-api/zm;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/zl;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/firebase-auth-api/cn;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/cn;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zm;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final o(Lcom/google/android/gms/internal/firebase-auth-api/an;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zm;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->h:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/ym;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ym;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zm;Lcom/google/android/gms/internal/firebase-auth-api/an;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private final p(Lcom/google/android/gms/common/api/Status;Lcom/google/firebase/auth/h;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zm;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->k(Lcom/google/android/gms/internal/firebase-auth-api/cn;Lcom/google/android/gms/common/api/Status;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zm;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    iput-object p2, v0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->o:Lcom/google/firebase/auth/h;

    iput-object p3, v0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->p:Ljava/lang/String;

    iput-object p4, v0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->q:Ljava/lang/String;

    iget-object p2, v0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f:La1/r;

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, La1/r;->b(Lcom/google/android/gms/common/api/Status;)V

    :cond_0
    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zm;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->l(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/firebase-auth-api/np;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zm;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    iget v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->a:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unexpected response type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lw/r;->l(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zm;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    iput-object p1, v0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->l:Lcom/google/android/gms/internal/firebase-auth-api/np;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->j(Lcom/google/android/gms/internal/firebase-auth-api/cn;)V

    return-void
.end method

.method public final b(Lcom/google/android/gms/common/api/Status;Lcom/google/firebase/auth/n0;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zm;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    iget v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->a:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unexpected response type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lw/r;->l(ZLjava/lang/Object;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zm;->p(Lcom/google/android/gms/common/api/Status;Lcom/google/firebase/auth/h;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final c(Lcom/google/android/gms/internal/firebase-auth-api/fo;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zm;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    iget v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->a:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unexpected response type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lw/r;->l(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zm;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    iput-object p1, v0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->k:Lcom/google/android/gms/internal/firebase-auth-api/fo;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->j(Lcom/google/android/gms/internal/firebase-auth-api/cn;)V

    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zm;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    iget v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->a:I

    const/4 v1, 0x1

    const/16 v2, 0x8

    if-ne v0, v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unexpected response type "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lw/r;->l(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zm;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    iput-object p1, v0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->n:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->i(Lcom/google/android/gms/internal/firebase-auth-api/cn;Z)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/wm;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/wm;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zm;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zm;->o(Lcom/google/android/gms/internal/firebase-auth-api/an;)V

    return-void
.end method

.method public final e()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zm;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    iget v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->a:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unexpected response type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lw/r;->l(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zm;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->j(Lcom/google/android/gms/internal/firebase-auth-api/cn;)V

    return-void
.end method

.method public final f(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zm;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    iget v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->a:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unexpected response type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lw/r;->l(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zm;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    iput-object p1, v0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->n:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/um;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/um;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zm;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zm;->o(Lcom/google/android/gms/internal/firebase-auth-api/an;)V

    return-void
.end method

.method public final g(Lcom/google/firebase/auth/n0;)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zm;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    iget v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->a:I

    const/4 v1, 0x1

    const/16 v2, 0x8

    if-ne v0, v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unexpected response type "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lw/r;->l(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zm;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->i(Lcom/google/android/gms/internal/firebase-auth-api/cn;Z)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/vm;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/vm;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zm;Lcom/google/firebase/auth/n0;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zm;->o(Lcom/google/android/gms/internal/firebase-auth-api/an;)V

    return-void
.end method

.method public final h()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zm;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    iget v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->a:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unexpected response type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lw/r;->l(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zm;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->j(Lcom/google/android/gms/internal/firebase-auth-api/cn;)V

    return-void
.end method

.method public final i(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zm;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    iget v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->a:I

    const/4 v1, 0x7

    if-ne v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unexpected response type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lw/r;->l(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zm;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    iput-object p1, v0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->m:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->j(Lcom/google/android/gms/internal/firebase-auth-api/cn;)V

    return-void
.end method

.method public final j(Lcom/google/android/gms/internal/firebase-auth-api/ni;)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ni;->j0()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ni;->k0()Lcom/google/firebase/auth/n1;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ni;->l0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ni;->m0()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, v1, v2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zm;->p(Lcom/google/android/gms/common/api/Status;Lcom/google/firebase/auth/h;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final k(Lcom/google/android/gms/internal/firebase-auth-api/bp;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zm;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    iget v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unexpected response type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lw/r;->l(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zm;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    iput-object p1, v0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->i:Lcom/google/android/gms/internal/firebase-auth-api/bp;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->j(Lcom/google/android/gms/internal/firebase-auth-api/cn;)V

    return-void
.end method

.method public final l(Lcom/google/android/gms/internal/firebase-auth-api/bp;Lcom/google/android/gms/internal/firebase-auth-api/uo;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zm;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    iget v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->a:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unexpected response type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lw/r;->l(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zm;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    iput-object p1, v0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->i:Lcom/google/android/gms/internal/firebase-auth-api/bp;

    iput-object p2, v0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->j:Lcom/google/android/gms/internal/firebase-auth-api/uo;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->j(Lcom/google/android/gms/internal/firebase-auth-api/cn;)V

    return-void
.end method

.method public final m(Lcom/google/android/gms/common/api/Status;)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->l0()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const-string v1, "MISSING_MFA_PENDING_CREDENTIAL"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance p1, Lcom/google/android/gms/common/api/Status;

    const/16 v0, 0x42b9

    invoke-direct {p1, v0}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    goto/16 :goto_0

    :cond_1
    const-string v1, "MISSING_MFA_ENROLLMENT_ID"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance p1, Lcom/google/android/gms/common/api/Status;

    const/16 v0, 0x42ba

    invoke-direct {p1, v0}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    goto/16 :goto_0

    :cond_2
    const-string v1, "INVALID_MFA_PENDING_CREDENTIAL"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance p1, Lcom/google/android/gms/common/api/Status;

    const/16 v0, 0x42bb

    invoke-direct {p1, v0}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    goto/16 :goto_0

    :cond_3
    const-string v1, "MFA_ENROLLMENT_NOT_FOUND"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    new-instance p1, Lcom/google/android/gms/common/api/Status;

    const/16 v0, 0x42bc

    invoke-direct {p1, v0}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    goto :goto_0

    :cond_4
    const-string v1, "ADMIN_ONLY_OPERATION"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance p1, Lcom/google/android/gms/common/api/Status;

    const/16 v0, 0x42bd

    invoke-direct {p1, v0}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    goto :goto_0

    :cond_5
    const-string v1, "UNVERIFIED_EMAIL"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance p1, Lcom/google/android/gms/common/api/Status;

    const/16 v0, 0x42be

    invoke-direct {p1, v0}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    goto :goto_0

    :cond_6
    const-string v1, "SECOND_FACTOR_EXISTS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_7

    new-instance p1, Lcom/google/android/gms/common/api/Status;

    const/16 v0, 0x42bf

    invoke-direct {p1, v0}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    goto :goto_0

    :cond_7
    const-string v1, "SECOND_FACTOR_LIMIT_EXCEEDED"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_8

    new-instance p1, Lcom/google/android/gms/common/api/Status;

    const/16 v0, 0x42c0

    invoke-direct {p1, v0}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    goto :goto_0

    :cond_8
    const-string v1, "UNSUPPORTED_FIRST_FACTOR"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_9

    new-instance p1, Lcom/google/android/gms/common/api/Status;

    const/16 v0, 0x42c1

    invoke-direct {p1, v0}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    goto :goto_0

    :cond_9
    const-string v1, "EMAIL_CHANGE_NEEDS_VERIFICATION"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_a

    new-instance p1, Lcom/google/android/gms/common/api/Status;

    const/16 v0, 0x42c2

    invoke-direct {p1, v0}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    :cond_a
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zm;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    iget v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->a:I

    const/16 v2, 0x8

    if-ne v1, v2, :cond_b

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->i(Lcom/google/android/gms/internal/firebase-auth-api/cn;Z)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/xm;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/xm;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/zm;Lcom/google/android/gms/common/api/Status;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zm;->o(Lcom/google/android/gms/internal/firebase-auth-api/an;)V

    return-void

    :cond_b
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->k(Lcom/google/android/gms/internal/firebase-auth-api/cn;Lcom/google/android/gms/common/api/Status;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zm;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->l(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public final n(Lcom/google/android/gms/internal/firebase-auth-api/pi;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zm;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    iput-object p1, v0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->r:Lcom/google/android/gms/internal/firebase-auth-api/pi;

    const-string p1, "REQUIRES_SECOND_FACTOR_AUTH"

    invoke-static {p1}, La1/l;->a(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->l(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method
