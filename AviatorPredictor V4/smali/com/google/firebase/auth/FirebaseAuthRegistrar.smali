.class public Lcom/google/firebase/auth/FirebaseAuthRegistrar;
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

.method static synthetic lambda$getComponents$0(Lb1/e;)Lcom/google/firebase/auth/FirebaseAuth;
    .locals 2

    const-class v0, Lx0/e;

    invoke-interface {p0, v0}, Lb1/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx0/e;

    const-class v1, Lq1/j;

    invoke-interface {p0, v1}, Lb1/e;->b(Ljava/lang/Class;)Lr1/b;

    move-result-object p0

    new-instance v1, La1/k1;

    invoke-direct {v1, v0, p0}, La1/k1;-><init>(Lx0/e;Lr1/b;)V

    return-object v1
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 5
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

    const/4 v0, 0x3

    new-array v0, v0, [Lb1/d;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Class;

    const-class v3, La1/b;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-class v3, Lcom/google/firebase/auth/FirebaseAuth;

    invoke-static {v3, v2}, Lb1/d;->d(Ljava/lang/Class;[Ljava/lang/Class;)Lb1/d$b;

    move-result-object v2

    const-class v3, Lx0/e;

    invoke-static {v3}, Lb1/q;->j(Ljava/lang/Class;)Lb1/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Lb1/d$b;->b(Lb1/q;)Lb1/d$b;

    move-result-object v2

    const-class v3, Lq1/j;

    invoke-static {v3}, Lb1/q;->k(Ljava/lang/Class;)Lb1/q;

    move-result-object v3

    invoke-virtual {v2, v3}, Lb1/d$b;->b(Lb1/q;)Lb1/d$b;

    move-result-object v2

    sget-object v3, Lcom/google/firebase/auth/d2;->a:Lcom/google/firebase/auth/d2;

    invoke-virtual {v2, v3}, Lb1/d$b;->e(Lb1/h;)Lb1/d$b;

    move-result-object v2

    invoke-virtual {v2}, Lb1/d$b;->d()Lb1/d$b;

    move-result-object v2

    invoke-virtual {v2}, Lb1/d$b;->c()Lb1/d;

    move-result-object v2

    aput-object v2, v0, v4

    invoke-static {}, Lq1/i;->a()Lb1/d;

    move-result-object v2

    aput-object v2, v0, v1

    const-string v1, "fire-auth"

    const-string v2, "21.0.6"

    invoke-static {v1, v2}, Lu1/h;->b(Ljava/lang/String;Ljava/lang/String;)Lb1/d;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
