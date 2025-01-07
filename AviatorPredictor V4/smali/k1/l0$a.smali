.class public Lk1/l0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk1/z3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk1/l0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field private final a:Lp1/g;

.field private final b:Lk1/f0;

.field private c:Z

.field private d:Lp1/g$b;

.field final synthetic e:Lk1/l0;


# direct methods
.method public constructor <init>(Lk1/l0;Lp1/g;Lk1/f0;)V
    .locals 0

    iput-object p1, p0, Lk1/l0$a;->e:Lk1/l0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lk1/l0$a;->c:Z

    iput-object p2, p0, Lk1/l0$a;->a:Lp1/g;

    iput-object p3, p0, Lk1/l0$a;->b:Lk1/f0;

    return-void
.end method

.method public static synthetic c(Lk1/l0$a;)V
    .locals 0

    invoke-direct {p0}, Lk1/l0$a;->d()V

    return-void
.end method

.method private synthetic d()V
    .locals 2

    iget-object v0, p0, Lk1/l0$a;->b:Lk1/f0;

    iget-object v1, p0, Lk1/l0$a;->e:Lk1/l0;

    invoke-virtual {v0, v1}, Lk1/f0;->x(Lk1/l0;)Lk1/l0$c;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lk1/l0$a;->c:Z

    invoke-direct {p0}, Lk1/l0$a;->e()V

    return-void
.end method

.method private e()V
    .locals 5

    iget-boolean v0, p0, Lk1/l0$a;->c:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lk1/l0;->c()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lk1/l0;->d()J

    move-result-wide v0

    :goto_0
    iget-object v2, p0, Lk1/l0$a;->a:Lp1/g;

    sget-object v3, Lp1/g$d;->l:Lp1/g$d;

    new-instance v4, Lk1/k0;

    invoke-direct {v4, p0}, Lk1/k0;-><init>(Lk1/l0$a;)V

    invoke-virtual {v2, v3, v0, v1, v4}, Lp1/g;->k(Lp1/g$d;JLjava/lang/Runnable;)Lp1/g$b;

    move-result-object v0

    iput-object v0, p0, Lk1/l0$a;->d:Lp1/g$b;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    iget-object v0, p0, Lk1/l0$a;->e:Lk1/l0;

    invoke-static {v0}, Lk1/l0;->b(Lk1/l0;)Lk1/l0$b;

    move-result-object v0

    iget-wide v0, v0, Lk1/l0$b;->a:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    invoke-direct {p0}, Lk1/l0$a;->e()V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lk1/l0$a;->d:Lp1/g$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lp1/g$b;->c()V

    :cond_0
    return-void
.end method
