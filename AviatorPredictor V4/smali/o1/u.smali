.class public Lo1/u;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo1/u$e;
    }
.end annotation


# static fields
.field private static final g:Lb3/u0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/u0$g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final h:Lb3/u0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/u0$g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final i:Lb3/u0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/u0$g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static volatile j:Ljava/lang/String;


# instance fields
.field private final a:Lp1/g;

.field private final b:Lg1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg1/a<",
            "Lg1/j;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lg1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg1/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lo1/d0;

.field private final e:Ljava/lang/String;

.field private final f:Lo1/e0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lb3/u0;->e:Lb3/u0$d;

    const-string v1, "x-goog-api-client"

    invoke-static {v1, v0}, Lb3/u0$g;->e(Ljava/lang/String;Lb3/u0$d;)Lb3/u0$g;

    move-result-object v1

    sput-object v1, Lo1/u;->g:Lb3/u0$g;

    const-string v1, "google-cloud-resource-prefix"

    invoke-static {v1, v0}, Lb3/u0$g;->e(Ljava/lang/String;Lb3/u0$d;)Lb3/u0$g;

    move-result-object v1

    sput-object v1, Lo1/u;->h:Lb3/u0$g;

    const-string v1, "x-goog-request-params"

    invoke-static {v1, v0}, Lb3/u0$g;->e(Ljava/lang/String;Lb3/u0$d;)Lb3/u0$g;

    move-result-object v0

    sput-object v0, Lo1/u;->i:Lb3/u0$g;

    const-string v0, "gl-java/"

    sput-object v0, Lo1/u;->j:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Lp1/g;Landroid/content/Context;Lg1/a;Lg1/a;Li1/m;Lo1/e0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/g;",
            "Landroid/content/Context;",
            "Lg1/a<",
            "Lg1/j;",
            ">;",
            "Lg1/a<",
            "Ljava/lang/String;",
            ">;",
            "Li1/m;",
            "Lo1/e0;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/u;->a:Lp1/g;

    iput-object p6, p0, Lo1/u;->f:Lo1/e0;

    iput-object p3, p0, Lo1/u;->b:Lg1/a;

    iput-object p4, p0, Lo1/u;->c:Lg1/a;

    new-instance p6, Lo1/q;

    invoke-direct {p6, p3, p4}, Lo1/q;-><init>(Lg1/a;Lg1/a;)V

    new-instance p3, Lo1/d0;

    invoke-direct {p3, p1, p2, p5, p6}, Lo1/d0;-><init>(Lp1/g;Landroid/content/Context;Li1/m;Lb3/b;)V

    iput-object p3, p0, Lo1/u;->d:Lo1/d0;

    invoke-virtual {p5}, Li1/m;->a()Ll1/f;

    move-result-object p1

    const/4 p2, 0x2

    new-array p2, p2, [Ljava/lang/Object;

    invoke-virtual {p1}, Ll1/f;->k()Ljava/lang/String;

    move-result-object p3

    const/4 p4, 0x0

    aput-object p3, p2, p4

    invoke-virtual {p1}, Ll1/f;->i()Ljava/lang/String;

    move-result-object p1

    const/4 p3, 0x1

    aput-object p1, p2, p3

    const-string p1, "projects/%s/databases/%s"

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lo1/u;->e:Ljava/lang/String;

    return-void
.end method

.method public static synthetic a(Lo1/u;Lo0/i;Ljava/lang/Object;Lo0/h;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lo1/u;->j(Lo0/i;Ljava/lang/Object;Lo0/h;)V

    return-void
.end method

.method public static synthetic b(Lo1/u;[Lb3/g;Lo1/f0;Lo0/h;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lo1/u;->i([Lb3/g;Lo1/f0;Lo0/h;)V

    return-void
.end method

.method public static synthetic c(Lo1/u;Lo1/u$e;Ljava/lang/Object;Lo0/h;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lo1/u;->k(Lo1/u$e;Ljava/lang/Object;Lo0/h;)V

    return-void
.end method

.method static synthetic d(Lo1/u;)Lp1/g;
    .locals 0

    iget-object p0, p0, Lo1/u;->a:Lp1/g;

    return-object p0
.end method

.method static synthetic e(Lo1/u;Lb3/f1;)Lcom/google/firebase/firestore/u;
    .locals 0

    invoke-direct {p0, p1}, Lo1/u;->f(Lb3/f1;)Lcom/google/firebase/firestore/u;

    move-result-object p0

    return-object p0
.end method

.method private f(Lb3/f1;)Lcom/google/firebase/firestore/u;
    .locals 3

    invoke-static {p1}, Lo1/m;->h(Lb3/f1;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/firebase/firestore/u;

    invoke-virtual {p1}, Lb3/f1;->m()Lb3/f1$b;

    move-result-object v1

    invoke-virtual {v1}, Lb3/f1$b;->h()I

    move-result v1

    invoke-static {v1}, Lcom/google/firebase/firestore/u$a;->g(I)Lcom/google/firebase/firestore/u$a;

    move-result-object v1

    invoke-virtual {p1}, Lb3/f1;->l()Ljava/lang/Throwable;

    move-result-object p1

    const-string v2, "The Cloud Firestore client failed to establish a secure connection. This is likely a problem with your app, rather than with Cloud Firestore itself. See https://bit.ly/2XFpdma for instructions on how to enable TLS on Android 4.x devices."

    invoke-direct {v0, v2, v1, p1}, Lcom/google/firebase/firestore/u;-><init>(Ljava/lang/String;Lcom/google/firebase/firestore/u$a;Ljava/lang/Throwable;)V

    return-object v0

    :cond_0
    invoke-static {p1}, Lp1/g0;->r(Lb3/f1;)Lcom/google/firebase/firestore/u;

    move-result-object p1

    return-object p1
.end method

.method private g()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    sget-object v1, Lo1/u;->j:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    const-string v2, "24.2.1"

    aput-object v2, v0, v1

    const-string v1, "%s fire/%s grpc/"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private synthetic i([Lb3/g;Lo1/f0;Lo0/h;)V
    .locals 3

    invoke-virtual {p3}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lb3/g;

    const/4 v0, 0x0

    aput-object p3, p1, v0

    aget-object p3, p1, v0

    new-instance v1, Lo1/u$a;

    invoke-direct {v1, p0, p2, p1}, Lo1/u$a;-><init>(Lo1/u;Lo1/f0;[Lb3/g;)V

    invoke-direct {p0}, Lo1/u;->l()Lb3/u0;

    move-result-object v2

    invoke-virtual {p3, v1, v2}, Lb3/g;->e(Lb3/g$a;Lb3/u0;)V

    invoke-interface {p2}, Lo1/f0;->a()V

    aget-object p1, p1, v0

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lb3/g;->c(I)V

    return-void
.end method

.method private synthetic j(Lo0/i;Ljava/lang/Object;Lo0/h;)V
    .locals 1

    invoke-virtual {p3}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lb3/g;

    new-instance v0, Lo1/u$d;

    invoke-direct {v0, p0, p1}, Lo1/u$d;-><init>(Lo1/u;Lo0/i;)V

    invoke-direct {p0}, Lo1/u;->l()Lb3/u0;

    move-result-object p1

    invoke-virtual {p3, v0, p1}, Lb3/g;->e(Lb3/g$a;Lb3/u0;)V

    const/4 p1, 0x2

    invoke-virtual {p3, p1}, Lb3/g;->c(I)V

    invoke-virtual {p3, p2}, Lb3/g;->d(Ljava/lang/Object;)V

    invoke-virtual {p3}, Lb3/g;->b()V

    return-void
.end method

.method private synthetic k(Lo1/u$e;Ljava/lang/Object;Lo0/h;)V
    .locals 1

    invoke-virtual {p3}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lb3/g;

    new-instance v0, Lo1/u$c;

    invoke-direct {v0, p0, p1, p3}, Lo1/u$c;-><init>(Lo1/u;Lo1/u$e;Lb3/g;)V

    invoke-direct {p0}, Lo1/u;->l()Lb3/u0;

    move-result-object p1

    invoke-virtual {p3, v0, p1}, Lb3/g;->e(Lb3/g$a;Lb3/u0;)V

    const/4 p1, 0x1

    invoke-virtual {p3, p1}, Lb3/g;->c(I)V

    invoke-virtual {p3, p2}, Lb3/g;->d(Ljava/lang/Object;)V

    invoke-virtual {p3}, Lb3/g;->b()V

    return-void
.end method

.method private l()Lb3/u0;
    .locals 3

    new-instance v0, Lb3/u0;

    invoke-direct {v0}, Lb3/u0;-><init>()V

    sget-object v1, Lo1/u;->g:Lb3/u0$g;

    invoke-direct {p0}, Lo1/u;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lb3/u0;->p(Lb3/u0$g;Ljava/lang/Object;)V

    sget-object v1, Lo1/u;->h:Lb3/u0$g;

    iget-object v2, p0, Lo1/u;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lb3/u0;->p(Lb3/u0$g;Ljava/lang/Object;)V

    sget-object v1, Lo1/u;->i:Lb3/u0$g;

    iget-object v2, p0, Lo1/u;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lb3/u0;->p(Lb3/u0$g;Ljava/lang/Object;)V

    iget-object v1, p0, Lo1/u;->f:Lo1/e0;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Lo1/e0;->a(Lb3/u0;)V

    :cond_0
    return-object v0
.end method

.method public static p(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lo1/u;->j:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public h()V
    .locals 1

    iget-object v0, p0, Lo1/u;->b:Lg1/a;

    invoke-virtual {v0}, Lg1/a;->b()V

    iget-object v0, p0, Lo1/u;->c:Lg1/a;

    invoke-virtual {v0}, Lg1/a;->b()V

    return-void
.end method

.method m(Lb3/v0;Lo1/f0;)Lb3/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ReqT:",
            "Ljava/lang/Object;",
            "RespT:",
            "Ljava/lang/Object;",
            ">(",
            "Lb3/v0<",
            "TReqT;TRespT;>;",
            "Lo1/f0<",
            "TRespT;>;)",
            "Lb3/g<",
            "TReqT;TRespT;>;"
        }
    .end annotation

    const/4 v0, 0x1

    new-array v0, v0, [Lb3/g;

    const/4 v1, 0x0

    const/4 v2, 0x0

    aput-object v2, v0, v1

    iget-object v1, p0, Lo1/u;->d:Lo1/d0;

    invoke-virtual {v1, p1}, Lo1/d0;->i(Lb3/v0;)Lo0/h;

    move-result-object p1

    iget-object v1, p0, Lo1/u;->a:Lp1/g;

    invoke-virtual {v1}, Lp1/g;->o()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Lo1/t;

    invoke-direct {v2, p0, v0, p2}, Lo1/t;-><init>(Lo1/u;[Lb3/g;Lo1/f0;)V

    invoke-virtual {p1, v1, v2}, Lo0/h;->b(Ljava/util/concurrent/Executor;Lo0/d;)Lo0/h;

    new-instance p2, Lo1/u$b;

    invoke-direct {p2, p0, v0, p1}, Lo1/u$b;-><init>(Lo1/u;[Lb3/g;Lo0/h;)V

    return-object p2
.end method

.method n(Lb3/v0;Ljava/lang/Object;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ReqT:",
            "Ljava/lang/Object;",
            "RespT:",
            "Ljava/lang/Object;",
            ">(",
            "Lb3/v0<",
            "TReqT;TRespT;>;TReqT;)",
            "Lo0/h<",
            "TRespT;>;"
        }
    .end annotation

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    iget-object v1, p0, Lo1/u;->d:Lo1/d0;

    invoke-virtual {v1, p1}, Lo1/d0;->i(Lb3/v0;)Lo0/h;

    move-result-object p1

    iget-object v1, p0, Lo1/u;->a:Lp1/g;

    invoke-virtual {v1}, Lp1/g;->o()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Lo1/r;

    invoke-direct {v2, p0, v0, p2}, Lo1/r;-><init>(Lo1/u;Lo0/i;Ljava/lang/Object;)V

    invoke-virtual {p1, v1, v2}, Lo0/h;->b(Ljava/util/concurrent/Executor;Lo0/d;)Lo0/h;

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method o(Lb3/v0;Ljava/lang/Object;Lo1/u$e;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ReqT:",
            "Ljava/lang/Object;",
            "RespT:",
            "Ljava/lang/Object;",
            ">(",
            "Lb3/v0<",
            "TReqT;TRespT;>;TReqT;",
            "Lo1/u$e<",
            "TRespT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lo1/u;->d:Lo1/d0;

    invoke-virtual {v0, p1}, Lo1/d0;->i(Lb3/v0;)Lo0/h;

    move-result-object p1

    iget-object v0, p0, Lo1/u;->a:Lp1/g;

    invoke-virtual {v0}, Lp1/g;->o()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lo1/s;

    invoke-direct {v1, p0, p3, p2}, Lo1/s;-><init>(Lo1/u;Lo1/u$e;Ljava/lang/Object;)V

    invoke-virtual {p1, v0, v1}, Lo0/h;->b(Ljava/util/concurrent/Executor;Lo0/d;)Lo0/h;

    return-void
.end method

.method public q()V
    .locals 1

    iget-object v0, p0, Lo1/u;->d:Lo1/d0;

    invoke-virtual {v0}, Lo1/d0;->u()V

    return-void
.end method
