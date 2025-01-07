.class public Lo1/m;
.super Ljava/lang/Object;
.source ""


# static fields
.field static final e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Li1/m;

.field private final b:Lo1/j0;

.field private final c:Lp1/g;

.field private final d:Lo1/u;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Ljava/util/HashSet;

    const-string v1, "date"

    const-string v2, "x-google-backends"

    const-string v3, "x-google-netmon-label"

    const-string v4, "x-google-service"

    const-string v5, "x-google-gfe-request-trace"

    filled-new-array {v1, v2, v3, v4, v5}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lo1/m;->e:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Li1/m;Lp1/g;Lg1/a;Lg1/a;Landroid/content/Context;Lo1/e0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li1/m;",
            "Lp1/g;",
            "Lg1/a<",
            "Lg1/j;",
            ">;",
            "Lg1/a<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/content/Context;",
            "Lo1/e0;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/m;->a:Li1/m;

    iput-object p2, p0, Lo1/m;->c:Lp1/g;

    new-instance v0, Lo1/j0;

    invoke-virtual {p1}, Li1/m;->a()Ll1/f;

    move-result-object v1

    invoke-direct {v0, v1}, Lo1/j0;-><init>(Ll1/f;)V

    iput-object v0, p0, Lo1/m;->b:Lo1/j0;

    invoke-virtual/range {p0 .. p6}, Lo1/m;->g(Li1/m;Lp1/g;Lg1/a;Lg1/a;Landroid/content/Context;Lo1/e0;)Lo1/u;

    move-result-object p1

    iput-object p1, p0, Lo1/m;->d:Lo1/u;

    return-void
.end method

.method public static synthetic a(Lo1/m;Lo0/h;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1}, Lo1/m;->l(Lo0/h;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(Lo1/m;)Lo1/j0;
    .locals 0

    iget-object p0, p0, Lo1/m;->b:Lo1/j0;

    return-object p0
.end method

.method static synthetic c(Lo1/m;)Lo1/u;
    .locals 0

    iget-object p0, p0, Lo1/m;->d:Lo1/u;

    return-object p0
.end method

.method public static h(Lb3/f1;)Z
    .locals 5

    invoke-virtual {p0}, Lb3/f1;->m()Lb3/f1$b;

    move-result-object v0

    invoke-virtual {p0}, Lb3/f1;->l()Ljava/lang/Throwable;

    move-result-object p0

    instance-of v1, p0, Ljavax/net/ssl/SSLHandshakeException;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    const-string v1, "no ciphers available"

    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x15

    if-ge v1, v4, :cond_1

    sget-object v1, Lb3/f1$b;->u:Lb3/f1$b;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    return v2
.end method

.method public static i(Lb3/f1;)Z
    .locals 0

    invoke-virtual {p0}, Lb3/f1;->m()Lb3/f1$b;

    move-result-object p0

    invoke-virtual {p0}, Lb3/f1$b;->h()I

    move-result p0

    invoke-static {p0}, Lcom/google/firebase/firestore/u$a;->g(I)Lcom/google/firebase/firestore/u$a;

    move-result-object p0

    invoke-static {p0}, Lo1/m;->j(Lcom/google/firebase/firestore/u$a;)Z

    move-result p0

    return p0
.end method

.method public static j(Lcom/google/firebase/firestore/u$a;)Z
    .locals 3

    sget-object v0, Lo1/m$b;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown gRPC status code: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const/4 p0, 0x1

    return p0

    :pswitch_1
    const/4 p0, 0x0

    return p0

    :pswitch_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Treated status OK as error"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static k(Lb3/f1;)Z
    .locals 1

    invoke-static {p0}, Lo1/m;->i(Lb3/f1;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lb3/f1;->m()Lb3/f1$b;

    move-result-object p0

    sget-object v0, Lb3/f1$b;->q:Lb3/f1$b;

    invoke-virtual {p0, v0}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private synthetic l(Lo0/h;)Ljava/util/List;
    .locals 6

    invoke-virtual {p1}, Lo0/h;->p()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lo0/h;->l()Ljava/lang/Exception;

    move-result-object v0

    instance-of v0, v0, Lcom/google/firebase/firestore/u;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lo0/h;->l()Ljava/lang/Exception;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/firestore/u;

    invoke-virtual {v0}, Lcom/google/firebase/firestore/u;->a()Lcom/google/firebase/firestore/u$a;

    move-result-object v0

    sget-object v1, Lcom/google/firebase/firestore/u$a;->v:Lcom/google/firebase/firestore/u$a;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo1/m;->d:Lo1/u;

    invoke-virtual {v0}, Lo1/u;->h()V

    :cond_0
    invoke-virtual {p1}, Lo0/h;->l()Ljava/lang/Exception;

    move-result-object p1

    throw p1

    :cond_1
    invoke-virtual {p1}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx1/f;

    iget-object v0, p0, Lo1/m;->b:Lo1/j0;

    invoke-virtual {p1}, Lx1/f;->U()Lcom/google/protobuf/t1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo1/j0;->y(Lcom/google/protobuf/t1;)Ll1/w;

    move-result-object v0

    invoke-virtual {p1}, Lx1/f;->X()I

    move-result v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    invoke-virtual {p1, v3}, Lx1/f;->W(I)Lx1/b0;

    move-result-object v4

    iget-object v5, p0, Lo1/m;->b:Lo1/j0;

    invoke-virtual {v5, v4, v0}, Lo1/j0;->p(Lx1/b0;Ll1/w;)Lm1/i;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-object v2
.end method


# virtual methods
.method public d(Ljava/util/List;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lm1/f;",
            ">;)",
            "Lo0/h<",
            "Ljava/util/List<",
            "Lm1/i;",
            ">;>;"
        }
    .end annotation

    invoke-static {}, Lx1/e;->Z()Lx1/e$b;

    move-result-object v0

    iget-object v1, p0, Lo1/m;->b:Lo1/j0;

    invoke-virtual {v1}, Lo1/j0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx1/e$b;->D(Ljava/lang/String;)Lx1/e$b;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm1/f;

    iget-object v2, p0, Lo1/m;->b:Lo1/j0;

    invoke-virtual {v2, v1}, Lo1/j0;->O(Lm1/f;)Lx1/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx1/e$b;->B(Lx1/y;)Lx1/e$b;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lo1/m;->d:Lo1/u;

    invoke-static {}, Lx1/o;->b()Lb3/v0;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object v0

    check-cast v0, Lx1/e;

    invoke-virtual {p1, v1, v0}, Lo1/u;->n(Lb3/v0;Ljava/lang/Object;)Lo0/h;

    move-result-object p1

    iget-object v0, p0, Lo1/m;->c:Lp1/g;

    invoke-virtual {v0}, Lp1/g;->o()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lo1/l;

    invoke-direct {v1, p0}, Lo1/l;-><init>(Lo1/m;)V

    invoke-virtual {p1, v0, v1}, Lo0/h;->h(Ljava/util/concurrent/Executor;Lo0/a;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method e(Lo1/u0$a;)Lo1/u0;
    .locals 4

    new-instance v0, Lo1/u0;

    iget-object v1, p0, Lo1/m;->d:Lo1/u;

    iget-object v2, p0, Lo1/m;->c:Lp1/g;

    iget-object v3, p0, Lo1/m;->b:Lo1/j0;

    invoke-direct {v0, v1, v2, v3, p1}, Lo1/u0;-><init>(Lo1/u;Lp1/g;Lo1/j0;Lo1/u0$a;)V

    return-object v0
.end method

.method f(Lo1/v0$a;)Lo1/v0;
    .locals 4

    new-instance v0, Lo1/v0;

    iget-object v1, p0, Lo1/m;->d:Lo1/u;

    iget-object v2, p0, Lo1/m;->c:Lp1/g;

    iget-object v3, p0, Lo1/m;->b:Lo1/j0;

    invoke-direct {v0, v1, v2, v3, p1}, Lo1/v0;-><init>(Lo1/u;Lp1/g;Lo1/j0;Lo1/v0$a;)V

    return-object v0
.end method

.method g(Li1/m;Lp1/g;Lg1/a;Lg1/a;Landroid/content/Context;Lo1/e0;)Lo1/u;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li1/m;",
            "Lp1/g;",
            "Lg1/a<",
            "Lg1/j;",
            ">;",
            "Lg1/a<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/content/Context;",
            "Lo1/e0;",
            ")",
            "Lo1/u;"
        }
    .end annotation

    new-instance v7, Lo1/u;

    move-object v0, v7

    move-object v1, p2

    move-object v2, p5

    move-object v3, p3

    move-object v4, p4

    move-object v5, p1

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lo1/u;-><init>(Lp1/g;Landroid/content/Context;Lg1/a;Lg1/a;Li1/m;Lo1/e0;)V

    return-object v7
.end method

.method public m(Ljava/util/List;)Lo0/h;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ll1/l;",
            ">;)",
            "Lo0/h<",
            "Ljava/util/List<",
            "Ll1/s;",
            ">;>;"
        }
    .end annotation

    invoke-static {}, Lx1/c;->Z()Lx1/c$b;

    move-result-object v0

    iget-object v1, p0, Lo1/m;->b:Lo1/j0;

    invoke-virtual {v1}, Lo1/j0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx1/c$b;->D(Ljava/lang/String;)Lx1/c$b;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll1/l;

    iget-object v3, p0, Lo1/m;->b:Lo1/j0;

    invoke-virtual {v3, v2}, Lo1/j0;->L(Ll1/l;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lx1/c$b;->B(Ljava/lang/String;)Lx1/c$b;

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Lo0/i;

    invoke-direct {v2}, Lo0/i;-><init>()V

    iget-object v3, p0, Lo1/m;->d:Lo1/u;

    invoke-static {}, Lx1/o;->a()Lb3/v0;

    move-result-object v4

    invoke-virtual {v0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object v0

    check-cast v0, Lx1/c;

    new-instance v5, Lo1/m$a;

    invoke-direct {v5, p0, v1, p1, v2}, Lo1/m$a;-><init>(Lo1/m;Ljava/util/List;Ljava/util/List;Lo0/i;)V

    invoke-virtual {v3, v4, v0, v5}, Lo1/u;->o(Lb3/v0;Ljava/lang/Object;Lo1/u$e;)V

    invoke-virtual {v2}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method n()V
    .locals 1

    iget-object v0, p0, Lo1/m;->d:Lo1/u;

    invoke-virtual {v0}, Lo1/u;->q()V

    return-void
.end method
