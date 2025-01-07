.class public final Lb1/n$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb1/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lr1/b<",
            "Lb1/i;",
            ">;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lb1/d<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lb1/n$b;->b:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lb1/n$b;->c:Ljava/util/List;

    iput-object p1, p0, Lb1/n$b;->a:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic a(Lb1/i;)Lb1/i;
    .locals 0

    invoke-static {p0}, Lb1/n$b;->f(Lb1/i;)Lb1/i;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic f(Lb1/i;)Lb1/i;
    .locals 0

    return-object p0
.end method


# virtual methods
.method public b(Lb1/d;)Lb1/n$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb1/d<",
            "*>;)",
            "Lb1/n$b;"
        }
    .end annotation

    iget-object v0, p0, Lb1/n$b;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public c(Lb1/i;)Lb1/n$b;
    .locals 2

    iget-object v0, p0, Lb1/n$b;->b:Ljava/util/List;

    new-instance v1, Lb1/o;

    invoke-direct {v1, p1}, Lb1/o;-><init>(Lb1/i;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public d(Ljava/util/Collection;)Lb1/n$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lr1/b<",
            "Lb1/i;",
            ">;>;)",
            "Lb1/n$b;"
        }
    .end annotation

    iget-object v0, p0, Lb1/n$b;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public e()Lb1/n;
    .locals 5

    new-instance v0, Lb1/n;

    iget-object v1, p0, Lb1/n$b;->a:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lb1/n$b;->b:Ljava/util/List;

    iget-object v3, p0, Lb1/n$b;->c:Ljava/util/List;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lb1/n;-><init>(Ljava/util/concurrent/Executor;Ljava/lang/Iterable;Ljava/util/Collection;Lb1/n$a;)V

    return-object v0
.end method
