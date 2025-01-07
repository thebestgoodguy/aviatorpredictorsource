.class public Lcom/google/firebase/firestore/FirestoreRegistrar;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb1/i;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lb1/e;)Lcom/google/firebase/firestore/w;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/firestore/FirestoreRegistrar;->lambda$getComponents$0(Lb1/e;)Lcom/google/firebase/firestore/w;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Lb1/e;)Lcom/google/firebase/firestore/w;
    .locals 9

    new-instance v6, Lcom/google/firebase/firestore/w;

    const-class v0, Landroid/content/Context;

    invoke-interface {p0, v0}, Lb1/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    const-class v0, Lx0/e;

    invoke-interface {p0, v0}, Lb1/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lx0/e;

    const-class v0, La1/b;

    invoke-interface {p0, v0}, Lb1/e;->e(Ljava/lang/Class;)Lr1/a;

    move-result-object v3

    const-class v0, Lz0/b;

    invoke-interface {p0, v0}, Lb1/e;->e(Ljava/lang/Class;)Lr1/a;

    move-result-object v4

    new-instance v5, Lo1/o;

    const-class v0, Lu1/i;

    invoke-interface {p0, v0}, Lb1/e;->b(Ljava/lang/Class;)Lr1/b;

    move-result-object v0

    const-class v7, Lq1/k;

    invoke-interface {p0, v7}, Lb1/e;->b(Ljava/lang/Class;)Lr1/b;

    move-result-object v7

    const-class v8, Lx0/m;

    invoke-interface {p0, v8}, Lb1/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lx0/m;

    invoke-direct {v5, v0, v7, p0}, Lo1/o;-><init>(Lr1/b;Lr1/b;Lx0/m;)V

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/google/firebase/firestore/w;-><init>(Landroid/content/Context;Lx0/e;Lr1/a;Lr1/a;Lo1/e0;)V

    return-object v6
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 3
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lb1/d<",
            "*>;>;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Lb1/d;

    const-class v1, Lcom/google/firebase/firestore/w;

    invoke-static {v1}, Lb1/d;->c(Ljava/lang/Class;)Lb1/d$b;

    move-result-object v1

    const-class v2, Lx0/e;

    invoke-static {v2}, Lb1/q;->j(Ljava/lang/Class;)Lb1/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Lb1/d$b;->b(Lb1/q;)Lb1/d$b;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    invoke-static {v2}, Lb1/q;->j(Ljava/lang/Class;)Lb1/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Lb1/d$b;->b(Lb1/q;)Lb1/d$b;

    move-result-object v1

    const-class v2, Lq1/k;

    invoke-static {v2}, Lb1/q;->i(Ljava/lang/Class;)Lb1/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Lb1/d$b;->b(Lb1/q;)Lb1/d$b;

    move-result-object v1

    const-class v2, Lu1/i;

    invoke-static {v2}, Lb1/q;->i(Ljava/lang/Class;)Lb1/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Lb1/d$b;->b(Lb1/q;)Lb1/d$b;

    move-result-object v1

    const-class v2, La1/b;

    invoke-static {v2}, Lb1/q;->a(Ljava/lang/Class;)Lb1/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Lb1/d$b;->b(Lb1/q;)Lb1/d$b;

    move-result-object v1

    const-class v2, Lz0/b;

    invoke-static {v2}, Lb1/q;->a(Ljava/lang/Class;)Lb1/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Lb1/d$b;->b(Lb1/q;)Lb1/d$b;

    move-result-object v1

    const-class v2, Lx0/m;

    invoke-static {v2}, Lb1/q;->h(Ljava/lang/Class;)Lb1/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Lb1/d$b;->b(Lb1/q;)Lb1/d$b;

    move-result-object v1

    sget-object v2, Lcom/google/firebase/firestore/x;->a:Lcom/google/firebase/firestore/x;

    invoke-virtual {v1, v2}, Lb1/d$b;->e(Lb1/h;)Lb1/d$b;

    move-result-object v1

    invoke-virtual {v1}, Lb1/d$b;->c()Lb1/d;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "fire-fst"

    const-string v2, "24.2.1"

    invoke-static {v1, v2}, Lu1/h;->b(Ljava/lang/String;Ljava/lang/String;)Lb1/d;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
