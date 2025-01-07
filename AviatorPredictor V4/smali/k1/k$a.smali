.class public Lk1/k$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk1/z3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk1/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field private a:Lp1/g$b;

.field private final b:Lp1/g;

.field final synthetic c:Lk1/k;


# direct methods
.method public constructor <init>(Lk1/k;Lp1/g;)V
    .locals 0

    iput-object p1, p0, Lk1/k$a;->c:Lk1/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lk1/k$a;->b:Lp1/g;

    return-void
.end method

.method public static synthetic c(Lk1/k$a;)V
    .locals 0

    invoke-direct {p0}, Lk1/k$a;->d()V

    return-void
.end method

.method private synthetic d()V
    .locals 3

    iget-object v0, p0, Lk1/k$a;->c:Lk1/k;

    invoke-virtual {v0}, Lk1/k;->d()I

    move-result v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-string v0, "IndexBackfiller"

    const-string v2, "Documents written: %s"

    invoke-static {v0, v2, v1}, Lp1/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lk1/k;->c()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lk1/k$a;->e(J)V

    return-void
.end method

.method private e(J)V
    .locals 3

    iget-object v0, p0, Lk1/k$a;->b:Lp1/g;

    sget-object v1, Lp1/g$d;->o:Lp1/g$d;

    new-instance v2, Lk1/j;

    invoke-direct {v2, p0}, Lk1/j;-><init>(Lk1/k$a;)V

    invoke-virtual {v0, v1, p1, p2, v2}, Lp1/g;->k(Lp1/g$d;JLjava/lang/Runnable;)Lp1/g$b;

    move-result-object p1

    iput-object p1, p0, Lk1/k$a;->a:Lp1/g$b;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    invoke-static {}, Lk1/k;->b()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lk1/k$a;->e(J)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lk1/k$a;->a:Lp1/g$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lp1/g$b;->c()V

    :cond_0
    return-void
.end method
