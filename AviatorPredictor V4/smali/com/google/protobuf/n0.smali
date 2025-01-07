.class final Lcom/google/protobuf/n0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/protobuf/o1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/n0$b;
    }
.end annotation


# static fields
.field private static final b:Lcom/google/protobuf/u0;


# instance fields
.field private final a:Lcom/google/protobuf/u0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/protobuf/n0$a;

    invoke-direct {v0}, Lcom/google/protobuf/n0$a;-><init>()V

    sput-object v0, Lcom/google/protobuf/n0;->b:Lcom/google/protobuf/u0;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/protobuf/n0;->b()Lcom/google/protobuf/u0;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/n0;-><init>(Lcom/google/protobuf/u0;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/u0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "messageInfoFactory"

    invoke-static {p1, v0}, Lcom/google/protobuf/d0;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/protobuf/u0;

    iput-object p1, p0, Lcom/google/protobuf/n0;->a:Lcom/google/protobuf/u0;

    return-void
.end method

.method private static b()Lcom/google/protobuf/u0;
    .locals 4

    new-instance v0, Lcom/google/protobuf/n0$b;

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/google/protobuf/u0;

    invoke-static {}, Lcom/google/protobuf/z;->c()Lcom/google/protobuf/z;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Lcom/google/protobuf/n0;->c()Lcom/google/protobuf/u0;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-direct {v0, v1}, Lcom/google/protobuf/n0$b;-><init>([Lcom/google/protobuf/u0;)V

    return-object v0
.end method

.method private static c()Lcom/google/protobuf/u0;
    .locals 4

    :try_start_0
    const-string v0, "com.google.protobuf.DescriptorMessageInfoFactory"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getInstance"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/u0;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    sget-object v0, Lcom/google/protobuf/n0;->b:Lcom/google/protobuf/u0;

    return-object v0
.end method

.method private static d(Lcom/google/protobuf/t0;)Z
    .locals 1

    invoke-interface {p0}, Lcom/google/protobuf/t0;->a()Lcom/google/protobuf/h1;

    move-result-object p0

    sget-object v0, Lcom/google/protobuf/h1;->e:Lcom/google/protobuf/h1;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static e(Ljava/lang/Class;Lcom/google/protobuf/t0;)Lcom/google/protobuf/n1;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/google/protobuf/t0;",
            ")",
            "Lcom/google/protobuf/n1<",
            "TT;>;"
        }
    .end annotation

    const-class v0, Lcom/google/protobuf/a0;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcom/google/protobuf/n0;->d(Lcom/google/protobuf/t0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/protobuf/c1;->b()Lcom/google/protobuf/a1;

    move-result-object v3

    invoke-static {}, Lcom/google/protobuf/l0;->b()Lcom/google/protobuf/l0;

    move-result-object v4

    invoke-static {}, Lcom/google/protobuf/p1;->M()Lcom/google/protobuf/v1;

    move-result-object v5

    invoke-static {}, Lcom/google/protobuf/u;->b()Lcom/google/protobuf/s;

    move-result-object v6

    invoke-static {}, Lcom/google/protobuf/s0;->b()Lcom/google/protobuf/q0;

    move-result-object v7

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Lcom/google/protobuf/y0;->R(Ljava/lang/Class;Lcom/google/protobuf/t0;Lcom/google/protobuf/a1;Lcom/google/protobuf/l0;Lcom/google/protobuf/v1;Lcom/google/protobuf/s;Lcom/google/protobuf/q0;)Lcom/google/protobuf/y0;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/protobuf/c1;->b()Lcom/google/protobuf/a1;

    move-result-object v2

    invoke-static {}, Lcom/google/protobuf/l0;->b()Lcom/google/protobuf/l0;

    move-result-object v3

    invoke-static {}, Lcom/google/protobuf/p1;->M()Lcom/google/protobuf/v1;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {}, Lcom/google/protobuf/s0;->b()Lcom/google/protobuf/q0;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v6}, Lcom/google/protobuf/y0;->R(Ljava/lang/Class;Lcom/google/protobuf/t0;Lcom/google/protobuf/a1;Lcom/google/protobuf/l0;Lcom/google/protobuf/v1;Lcom/google/protobuf/s;Lcom/google/protobuf/q0;)Lcom/google/protobuf/y0;

    move-result-object p0

    :goto_0
    return-object p0

    :cond_1
    invoke-static {p1}, Lcom/google/protobuf/n0;->d(Lcom/google/protobuf/t0;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/google/protobuf/c1;->a()Lcom/google/protobuf/a1;

    move-result-object v3

    invoke-static {}, Lcom/google/protobuf/l0;->a()Lcom/google/protobuf/l0;

    move-result-object v4

    invoke-static {}, Lcom/google/protobuf/p1;->H()Lcom/google/protobuf/v1;

    move-result-object v5

    invoke-static {}, Lcom/google/protobuf/u;->a()Lcom/google/protobuf/s;

    move-result-object v6

    invoke-static {}, Lcom/google/protobuf/s0;->a()Lcom/google/protobuf/q0;

    move-result-object v7

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Lcom/google/protobuf/y0;->R(Ljava/lang/Class;Lcom/google/protobuf/t0;Lcom/google/protobuf/a1;Lcom/google/protobuf/l0;Lcom/google/protobuf/v1;Lcom/google/protobuf/s;Lcom/google/protobuf/q0;)Lcom/google/protobuf/y0;

    move-result-object p0

    goto :goto_1

    :cond_2
    invoke-static {}, Lcom/google/protobuf/c1;->a()Lcom/google/protobuf/a1;

    move-result-object v2

    invoke-static {}, Lcom/google/protobuf/l0;->a()Lcom/google/protobuf/l0;

    move-result-object v3

    invoke-static {}, Lcom/google/protobuf/p1;->I()Lcom/google/protobuf/v1;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {}, Lcom/google/protobuf/s0;->a()Lcom/google/protobuf/q0;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v6}, Lcom/google/protobuf/y0;->R(Ljava/lang/Class;Lcom/google/protobuf/t0;Lcom/google/protobuf/a1;Lcom/google/protobuf/l0;Lcom/google/protobuf/v1;Lcom/google/protobuf/s;Lcom/google/protobuf/q0;)Lcom/google/protobuf/y0;

    move-result-object p0

    :goto_1
    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lcom/google/protobuf/n1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/google/protobuf/n1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/protobuf/p1;->J(Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/protobuf/n0;->a:Lcom/google/protobuf/u0;

    invoke-interface {v0, p1}, Lcom/google/protobuf/u0;->b(Ljava/lang/Class;)Lcom/google/protobuf/t0;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/protobuf/t0;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    const-class v1, Lcom/google/protobuf/a0;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/google/protobuf/p1;->M()Lcom/google/protobuf/v1;

    move-result-object p1

    invoke-static {}, Lcom/google/protobuf/u;->b()Lcom/google/protobuf/s;

    move-result-object v1

    :goto_0
    invoke-interface {v0}, Lcom/google/protobuf/t0;->b()Lcom/google/protobuf/v0;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lcom/google/protobuf/z0;->m(Lcom/google/protobuf/v1;Lcom/google/protobuf/s;Lcom/google/protobuf/v0;)Lcom/google/protobuf/z0;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lcom/google/protobuf/p1;->H()Lcom/google/protobuf/v1;

    move-result-object p1

    invoke-static {}, Lcom/google/protobuf/u;->a()Lcom/google/protobuf/s;

    move-result-object v1

    goto :goto_0

    :cond_1
    invoke-static {p1, v0}, Lcom/google/protobuf/n0;->e(Ljava/lang/Class;Lcom/google/protobuf/t0;)Lcom/google/protobuf/n1;

    move-result-object p1

    return-object p1
.end method
