.class public abstract Lt/e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O::",
        "Lt/a$d;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/String;

.field private final c:Lt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt/a<",
            "TO;>;"
        }
    .end annotation
.end field

.field private final d:Lt/a$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TO;"
        }
    .end annotation
.end field

.field private final e:Lu/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu/b<",
            "TO;>;"
        }
    .end annotation
.end field

.field private final f:Landroid/os/Looper;

.field private final g:I

.field private final h:Lt/f;
    .annotation runtime Lorg/checkerframework/checker/initialization/qual/NotOnlyInitialized;
    .end annotation
.end field

.field private final i:Lu/k;

.field protected final j:Lcom/google/android/gms/common/api/internal/c;


# direct methods
.method private constructor <init>(Landroid/content/Context;Landroid/app/Activity;Lt/a;Lt/a$d;Lt/e$a;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/app/Activity;",
            "Lt/a<",
            "TO;>;TO;",
            "Lt/e$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Null context is not permitted."

    invoke-static {p1, v0}, Lw/r;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Api must not be null."

    invoke-static {p3, v0}, Lw/r;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."

    invoke-static {p5, v0}, Lw/r;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lt/e;->a:Landroid/content/Context;

    invoke-static {}, Lb0/j;->i()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    :try_start_0
    const-class v0, Landroid/content/Context;

    const-string v2, "getAttributionTag"

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Class;

    invoke-virtual {v0, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, p1

    goto :goto_0

    :catch_0
    nop

    :cond_0
    :goto_0
    iput-object v1, p0, Lt/e;->b:Ljava/lang/String;

    iput-object p3, p0, Lt/e;->c:Lt/a;

    iput-object p4, p0, Lt/e;->d:Lt/a$d;

    iget-object p1, p5, Lt/e$a;->b:Landroid/os/Looper;

    iput-object p1, p0, Lt/e;->f:Landroid/os/Looper;

    invoke-static {p3, p4, v1}, Lu/b;->a(Lt/a;Lt/a$d;Ljava/lang/String;)Lu/b;

    move-result-object p1

    iput-object p1, p0, Lt/e;->e:Lu/b;

    new-instance p3, Lu/p;

    invoke-direct {p3, p0}, Lu/p;-><init>(Lt/e;)V

    iput-object p3, p0, Lt/e;->h:Lt/f;

    iget-object p3, p0, Lt/e;->a:Landroid/content/Context;

    invoke-static {p3}, Lcom/google/android/gms/common/api/internal/c;->x(Landroid/content/Context;)Lcom/google/android/gms/common/api/internal/c;

    move-result-object p3

    iput-object p3, p0, Lt/e;->j:Lcom/google/android/gms/common/api/internal/c;

    invoke-virtual {p3}, Lcom/google/android/gms/common/api/internal/c;->m()I

    move-result p4

    iput p4, p0, Lt/e;->g:I

    iget-object p4, p5, Lt/e$a;->a:Lu/k;

    iput-object p4, p0, Lt/e;->i:Lu/k;

    if-eqz p2, :cond_1

    instance-of p4, p2, Lcom/google/android/gms/common/api/GoogleApiActivity;

    if-nez p4, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p4

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p5

    if-ne p4, p5, :cond_1

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/common/api/internal/h;->u(Landroid/app/Activity;Lcom/google/android/gms/common/api/internal/c;Lu/b;)V

    :cond_1
    invoke-virtual {p3, p0}, Lcom/google/android/gms/common/api/internal/c;->b(Lt/e;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lt/a;Lt/a$d;Lt/e$a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lt/a<",
            "TO;>;TO;",
            "Lt/e$a;",
            ")V"
        }
    .end annotation

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lt/e;-><init>(Landroid/content/Context;Landroid/app/Activity;Lt/a;Lt/a$d;Lt/e$a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lt/a;Lt/a$d;Lu/k;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lt/a<",
            "TO;>;TO;",
            "Lu/k;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lt/e$a$a;

    invoke-direct {v0}, Lt/e$a$a;-><init>()V

    invoke-virtual {v0, p4}, Lt/e$a$a;->b(Lu/k;)Lt/e$a$a;

    invoke-virtual {v0}, Lt/e$a$a;->a()Lt/e$a;

    move-result-object p4

    invoke-direct {p0, p1, p2, p3, p4}, Lt/e;-><init>(Landroid/content/Context;Lt/a;Lt/a$d;Lt/e$a;)V

    return-void
.end method

.method private final m(ILcom/google/android/gms/common/api/internal/b;)Lcom/google/android/gms/common/api/internal/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lt/a$b;",
            "T:",
            "Lcom/google/android/gms/common/api/internal/b<",
            "+",
            "Lt/k;",
            "TA;>;>(ITT;)TT;"
        }
    .end annotation

    invoke-virtual {p2}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->j()V

    iget-object v0, p0, Lt/e;->j:Lcom/google/android/gms/common/api/internal/c;

    invoke-virtual {v0, p0, p1, p2}, Lcom/google/android/gms/common/api/internal/c;->D(Lt/e;ILcom/google/android/gms/common/api/internal/b;)V

    return-object p2
.end method

.method private final n(ILcom/google/android/gms/common/api/internal/d;)Lo0/h;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lt/a$b;",
            ">(I",
            "Lcom/google/android/gms/common/api/internal/d<",
            "TA;TTResult;>;)",
            "Lo0/h<",
            "TTResult;>;"
        }
    .end annotation

    new-instance v6, Lo0/i;

    invoke-direct {v6}, Lo0/i;-><init>()V

    iget-object v0, p0, Lt/e;->j:Lcom/google/android/gms/common/api/internal/c;

    iget-object v5, p0, Lt/e;->i:Lu/k;

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, v6

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/common/api/internal/c;->E(Lt/e;ILcom/google/android/gms/common/api/internal/d;Lo0/i;Lu/k;)V

    invoke-virtual {v6}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public b()Lt/f;
    .locals 1

    iget-object v0, p0, Lt/e;->h:Lt/f;

    return-object v0
.end method

.method protected c()Lw/d$a;
    .locals 3

    new-instance v0, Lw/d$a;

    invoke-direct {v0}, Lw/d$a;-><init>()V

    iget-object v1, p0, Lt/e;->d:Lt/a$d;

    instance-of v2, v1, Lt/a$d$b;

    if-eqz v2, :cond_0

    check-cast v1, Lt/a$d$b;

    invoke-interface {v1}, Lt/a$d$b;->b()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->j0()Landroid/accounts/Account;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lt/e;->d:Lt/a$d;

    instance-of v2, v1, Lt/a$d$a;

    if-eqz v2, :cond_1

    check-cast v1, Lt/a$d$a;

    invoke-interface {v1}, Lt/a$d$a;->a()Landroid/accounts/Account;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lw/d$a;->d(Landroid/accounts/Account;)Lw/d$a;

    iget-object v1, p0, Lt/e;->d:Lt/a$d;

    instance-of v2, v1, Lt/a$d$b;

    if-eqz v2, :cond_3

    check-cast v1, Lt/a$d$b;

    invoke-interface {v1}, Lt/a$d$b;->b()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->o0()Ljava/util/Set;

    move-result-object v1

    goto :goto_2

    :cond_3
    :goto_1
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v1

    :goto_2
    invoke-virtual {v0, v1}, Lw/d$a;->c(Ljava/util/Collection;)Lw/d$a;

    iget-object v1, p0, Lt/e;->a:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw/d$a;->e(Ljava/lang/String;)Lw/d$a;

    iget-object v1, p0, Lt/e;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw/d$a;->b(Ljava/lang/String;)Lw/d$a;

    return-object v0
.end method

.method public d(Lcom/google/android/gms/common/api/internal/d;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lt/a$b;",
            ">(",
            "Lcom/google/android/gms/common/api/internal/d<",
            "TA;TTResult;>;)",
            "Lo0/h<",
            "TTResult;>;"
        }
    .end annotation

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Lt/e;->n(ILcom/google/android/gms/common/api/internal/d;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public e(Lcom/google/android/gms/common/api/internal/b;)Lcom/google/android/gms/common/api/internal/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lt/a$b;",
            "T:",
            "Lcom/google/android/gms/common/api/internal/b<",
            "+",
            "Lt/k;",
            "TA;>;>(TT;)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lt/e;->m(ILcom/google/android/gms/common/api/internal/b;)Lcom/google/android/gms/common/api/internal/b;

    return-object p1
.end method

.method public f(Lcom/google/android/gms/common/api/internal/d;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lt/a$b;",
            ">(",
            "Lcom/google/android/gms/common/api/internal/d<",
            "TA;TTResult;>;)",
            "Lo0/h<",
            "TTResult;>;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lt/e;->n(ILcom/google/android/gms/common/api/internal/d;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final g()Lu/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lu/b<",
            "TO;>;"
        }
    .end annotation

    iget-object v0, p0, Lt/e;->e:Lu/b;

    return-object v0
.end method

.method protected h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lt/e;->b:Ljava/lang/String;

    return-object v0
.end method

.method public i()Landroid/os/Looper;
    .locals 1

    iget-object v0, p0, Lt/e;->f:Landroid/os/Looper;

    return-object v0
.end method

.method public final j()I
    .locals 1

    iget v0, p0, Lt/e;->g:I

    return v0
.end method

.method public final k(Landroid/os/Looper;Lcom/google/android/gms/common/api/internal/o;)Lt/a$f;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Looper;",
            "Lcom/google/android/gms/common/api/internal/o<",
            "TO;>;)",
            "Lt/a$f;"
        }
    .end annotation

    invoke-virtual {p0}, Lt/e;->c()Lw/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lw/d$a;->a()Lw/d;

    move-result-object v4

    iget-object v0, p0, Lt/e;->c:Lt/a;

    invoke-virtual {v0}, Lt/a;->a()Lt/a$a;

    move-result-object v0

    invoke-static {v0}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lt/a$a;

    iget-object v2, p0, Lt/e;->a:Landroid/content/Context;

    iget-object v5, p0, Lt/e;->d:Lt/a$d;

    move-object v3, p1

    move-object v6, p2

    move-object v7, p2

    invoke-virtual/range {v1 .. v7}, Lt/a$a;->a(Landroid/content/Context;Landroid/os/Looper;Lw/d;Ljava/lang/Object;Lt/f$a;Lt/f$b;)Lt/a$f;

    move-result-object p1

    invoke-virtual {p0}, Lt/e;->h()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    instance-of v0, p1, Lw/c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lw/c;

    invoke-virtual {v0, p2}, Lw/c;->O(Ljava/lang/String;)V

    :cond_0
    if-eqz p2, :cond_1

    instance-of v0, p1, Lu/g;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lu/g;

    invoke-virtual {v0, p2}, Lu/g;->r(Ljava/lang/String;)V

    :cond_1
    return-object p1
.end method

.method public final l(Landroid/content/Context;Landroid/os/Handler;)Lu/a0;
    .locals 2

    new-instance v0, Lu/a0;

    invoke-virtual {p0}, Lt/e;->c()Lw/d$a;

    move-result-object v1

    invoke-virtual {v1}, Lw/d$a;->a()Lw/d;

    move-result-object v1

    invoke-direct {v0, p1, p2, v1}, Lu/a0;-><init>(Landroid/content/Context;Landroid/os/Handler;Lw/d;)V

    return-object v0
.end method
