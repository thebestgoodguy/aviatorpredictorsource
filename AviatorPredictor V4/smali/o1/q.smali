.class final Lo1/q;
.super Lb3/b;
.source ""


# static fields
.field private static final c:Lb3/u0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/u0$g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final d:Lb3/u0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/u0$g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lg1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg1/a<",
            "Lg1/j;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lg1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg1/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lb3/u0;->e:Lb3/u0$d;

    const-string v1, "Authorization"

    invoke-static {v1, v0}, Lb3/u0$g;->e(Ljava/lang/String;Lb3/u0$d;)Lb3/u0$g;

    move-result-object v1

    sput-object v1, Lo1/q;->c:Lb3/u0$g;

    const-string v1, "x-firebase-appcheck"

    invoke-static {v1, v0}, Lb3/u0$g;->e(Ljava/lang/String;Lb3/u0$d;)Lb3/u0$g;

    move-result-object v0

    sput-object v0, Lo1/q;->d:Lb3/u0$g;

    return-void
.end method

.method constructor <init>(Lg1/a;Lg1/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg1/a<",
            "Lg1/j;",
            ">;",
            "Lg1/a<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lb3/b;-><init>()V

    iput-object p1, p0, Lo1/q;->a:Lg1/a;

    iput-object p2, p0, Lo1/q;->b:Lg1/a;

    return-void
.end method

.method public static synthetic b(Lo0/h;Lb3/b$a;Lo0/h;Lo0/h;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lo1/q;->c(Lo0/h;Lb3/b$a;Lo0/h;Lo0/h;)V

    return-void
.end method

.method private static synthetic c(Lo0/h;Lb3/b$a;Lo0/h;Lo0/h;)V
    .locals 6

    new-instance p3, Lb3/u0;

    invoke-direct {p3}, Lb3/u0;-><init>()V

    invoke-virtual {p0}, Lo0/h;->p()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v3, "FirestoreCallCredentials"

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    new-array v0, v2, [Ljava/lang/Object;

    const-string v4, "Successfully fetched auth token."

    invoke-static {v3, v4, v0}, Lp1/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p0, :cond_2

    sget-object v0, Lo1/q;->c:Lb3/u0$g;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Bearer "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p3, v0, p0}, Lb3/u0;->p(Lb3/u0$g;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lo0/h;->l()Ljava/lang/Exception;

    move-result-object p0

    instance-of v0, p0, Lx0/b;

    if-eqz v0, :cond_1

    new-array p0, v2, [Ljava/lang/Object;

    const-string v0, "Firebase Auth API not available, not using authentication."

    invoke-static {v3, v0, p0}, Lp1/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    instance-of v0, p0, Lt1/a;

    if-eqz v0, :cond_6

    new-array p0, v2, [Ljava/lang/Object;

    const-string v0, "No user signed in, not using authentication."

    invoke-static {v3, v0, p0}, Lp1/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    :goto_0
    invoke-virtual {p2}, Lo0/h;->p()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-virtual {p2}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_4

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_4

    new-array p2, v2, [Ljava/lang/Object;

    const-string v0, "Successfully fetched AppCheck token."

    invoke-static {v3, v0, p2}, Lp1/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p2, Lo1/q;->d:Lb3/u0$g;

    invoke-virtual {p3, p2, p0}, Lb3/u0;->p(Lb3/u0$g;Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p2}, Lo0/h;->l()Ljava/lang/Exception;

    move-result-object p0

    instance-of p2, p0, Lx0/b;

    if-eqz p2, :cond_5

    new-array p0, v2, [Ljava/lang/Object;

    const-string p2, "Firebase AppCheck API not available."

    invoke-static {v3, p2, p0}, Lp1/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    :goto_1
    invoke-virtual {p1, p3}, Lb3/b$a;->a(Lb3/u0;)V

    return-void

    :cond_5
    new-array p2, v1, [Ljava/lang/Object;

    aput-object p0, p2, v2

    const-string p3, "Failed to get AppCheck token: %s."

    invoke-static {v3, p3, p2}, Lp1/v;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_2
    sget-object p2, Lb3/f1;->n:Lb3/f1;

    invoke-virtual {p2, p0}, Lb3/f1;->p(Ljava/lang/Throwable;)Lb3/f1;

    move-result-object p0

    invoke-virtual {p1, p0}, Lb3/b$a;->b(Lb3/f1;)V

    return-void

    :cond_6
    new-array p2, v1, [Ljava/lang/Object;

    aput-object p0, p2, v2

    const-string p3, "Failed to get auth token: %s."

    invoke-static {v3, p3, p2}, Lp1/v;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2
.end method


# virtual methods
.method public a(Lb3/b$b;Ljava/util/concurrent/Executor;Lb3/b$a;)V
    .locals 3

    iget-object p1, p0, Lo1/q;->a:Lg1/a;

    invoke-virtual {p1}, Lg1/a;->a()Lo0/h;

    move-result-object p1

    iget-object p2, p0, Lo1/q;->b:Lg1/a;

    invoke-virtual {p2}, Lg1/a;->a()Lo0/h;

    move-result-object p2

    const/4 v0, 0x2

    new-array v0, v0, [Lo0/h;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 v1, 0x1

    aput-object p2, v0, v1

    invoke-static {v0}, Lo0/k;->f([Lo0/h;)Lo0/h;

    move-result-object v0

    sget-object v1, Lp1/p;->b:Ljava/util/concurrent/Executor;

    new-instance v2, Lo1/p;

    invoke-direct {v2, p1, p3, p2}, Lo1/p;-><init>(Lo0/h;Lb3/b$a;Lo0/h;)V

    invoke-virtual {v0, v1, v2}, Lo0/h;->b(Ljava/util/concurrent/Executor;Lo0/d;)Lo0/h;

    return-void
.end method
