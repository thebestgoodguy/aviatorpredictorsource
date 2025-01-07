.class public Lq2/b;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lr2/j;

.field private b:Lg2/a;

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lr2/j$d;",
            ">;>;"
        }
    .end annotation
.end field

.field final d:Lr2/j$c;


# direct methods
.method public constructor <init>(Lf2/a;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lq2/b$a;

    invoke-direct {v0, p0}, Lq2/b$a;-><init>(Lq2/b;)V

    iput-object v0, p0, Lq2/b;->d:Lr2/j$c;

    new-instance v1, Lr2/j;

    sget-object v2, Lr2/q;->b:Lr2/q;

    const-string v3, "flutter/deferredcomponent"

    invoke-direct {v1, p1, v3, v2}, Lr2/j;-><init>(Lr2/b;Ljava/lang/String;Lr2/k;)V

    iput-object v1, p0, Lq2/b;->a:Lr2/j;

    invoke-virtual {v1, v0}, Lr2/j;->e(Lr2/j$c;)V

    invoke-static {}, Le2/a;->e()Le2/a;

    move-result-object p1

    invoke-virtual {p1}, Le2/a;->a()Lg2/a;

    move-result-object p1

    iput-object p1, p0, Lq2/b;->b:Lg2/a;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lq2/b;->c:Ljava/util/Map;

    return-void
.end method

.method static synthetic a(Lq2/b;)Lg2/a;
    .locals 0

    iget-object p0, p0, Lq2/b;->b:Lg2/a;

    return-object p0
.end method

.method static synthetic b(Lq2/b;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lq2/b;->c:Ljava/util/Map;

    return-object p0
.end method


# virtual methods
.method public c(Lg2/a;)V
    .locals 0

    iput-object p1, p0, Lq2/b;->b:Lg2/a;

    return-void
.end method
