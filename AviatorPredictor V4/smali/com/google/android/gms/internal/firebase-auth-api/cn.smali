.class abstract Lcom/google/android/gms/internal/firebase-auth-api/cn;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/en;


# instance fields
.field protected final a:I

.field final b:Lcom/google/android/gms/internal/firebase-auth-api/zm;

.field protected c:Lx0/e;

.field protected d:Lcom/google/firebase/auth/z;

.field protected e:Ljava/lang/Object;

.field protected f:La1/r;

.field protected final g:Ljava/util/List;

.field protected h:Ljava/util/concurrent/Executor;

.field protected i:Lcom/google/android/gms/internal/firebase-auth-api/bp;

.field protected j:Lcom/google/android/gms/internal/firebase-auth-api/uo;

.field protected k:Lcom/google/android/gms/internal/firebase-auth-api/fo;

.field protected l:Lcom/google/android/gms/internal/firebase-auth-api/np;

.field protected m:Ljava/lang/String;

.field protected n:Ljava/lang/String;

.field protected o:Lcom/google/firebase/auth/h;

.field protected p:Ljava/lang/String;

.field protected q:Ljava/lang/String;

.field protected r:Lcom/google/android/gms/internal/firebase-auth-api/pi;

.field private s:Z

.field t:Ljava/lang/Object;

.field u:Lcom/google/android/gms/common/api/Status;

.field protected v:Lcom/google/android/gms/internal/firebase-auth-api/bn;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zm;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zm;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/cn;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->b:Lcom/google/android/gms/internal/firebase-auth-api/zm;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->g:Ljava/util/List;

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->a:I

    return-void
.end method

.method static bridge synthetic i(Lcom/google/android/gms/internal/firebase-auth-api/cn;Z)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->s:Z

    return-void
.end method

.method static bridge synthetic j(Lcom/google/android/gms/internal/firebase-auth-api/cn;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->c()V

    iget-boolean p0, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->s:Z

    const-string v0, "no success or failure set on method implementation"

    invoke-static {p0, v0}, Lw/r;->l(ZLjava/lang/Object;)V

    return-void
.end method

.method static bridge synthetic k(Lcom/google/android/gms/internal/firebase-auth-api/cn;Lcom/google/android/gms/common/api/Status;)V
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f:La1/r;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, La1/r;->b(Lcom/google/android/gms/common/api/Status;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public abstract c()V
.end method

.method public final d(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/cn;
    .locals 1

    const-string v0, "external callback cannot be null"

    invoke-static {p1, v0}, Lw/r;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->e:Ljava/lang/Object;

    return-object p0
.end method

.method public final e(La1/r;)Lcom/google/android/gms/internal/firebase-auth-api/cn;
    .locals 1

    const-string v0, "external failure callback cannot be null"

    invoke-static {p1, v0}, Lw/r;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La1/r;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->f:La1/r;

    return-object p0
.end method

.method public final f(Lx0/e;)Lcom/google/android/gms/internal/firebase-auth-api/cn;
    .locals 1

    const-string v0, "firebaseApp cannot be null"

    invoke-static {p1, v0}, Lw/r;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx0/e;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->c:Lx0/e;

    return-object p0
.end method

.method public final g(Lcom/google/firebase/auth/z;)Lcom/google/android/gms/internal/firebase-auth-api/cn;
    .locals 1

    const-string v0, "firebaseUser cannot be null"

    invoke-static {p1, v0}, Lw/r;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/auth/z;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->d:Lcom/google/firebase/auth/z;

    return-object p0
.end method

.method public final h(Lcom/google/firebase/auth/p0$b;Landroid/app/Activity;Ljava/util/concurrent/Executor;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/cn;
    .locals 1

    invoke-static {p4, p1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/rn;->a(Ljava/lang/String;Lcom/google/firebase/auth/p0$b;Lcom/google/android/gms/internal/firebase-auth-api/cn;)Lcom/google/firebase/auth/p0$b;

    move-result-object p1

    iget-object p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->g:Ljava/util/List;

    monitor-enter p4

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->g:Ljava/util/List;

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/auth/p0$b;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit p4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->g:Ljava/util/List;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/tm;->l(Landroid/app/Activity;Ljava/util/List;)V

    :cond_0
    invoke-static {p3}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/Executor;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->h:Ljava/util/concurrent/Executor;

    return-object p0

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final l(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->s:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->u:Lcom/google/android/gms/common/api/Status;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->v:Lcom/google/android/gms/internal/firebase-auth-api/bn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/bn;->a(Ljava/lang/Object;Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public final m(Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->s:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->t:Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->v:Lcom/google/android/gms/internal/firebase-auth-api/bn;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/bn;->a(Ljava/lang/Object;Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method
