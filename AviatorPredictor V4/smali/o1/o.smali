.class public Lo1/o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo1/e0;


# static fields
.field private static final d:Lb3/u0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/u0$g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:Lb3/u0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/u0$g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final f:Lb3/u0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/u0$g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lr1/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr1/b<",
            "Lq1/k;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lr1/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr1/b<",
            "Lu1/i;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lx0/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lb3/u0;->e:Lb3/u0$d;

    const-string v1, "x-firebase-client-log-type"

    invoke-static {v1, v0}, Lb3/u0$g;->e(Ljava/lang/String;Lb3/u0$d;)Lb3/u0$g;

    move-result-object v1

    sput-object v1, Lo1/o;->d:Lb3/u0$g;

    const-string v1, "x-firebase-client"

    invoke-static {v1, v0}, Lb3/u0$g;->e(Ljava/lang/String;Lb3/u0$d;)Lb3/u0$g;

    move-result-object v1

    sput-object v1, Lo1/o;->e:Lb3/u0$g;

    const-string v1, "x-firebase-gmpid"

    invoke-static {v1, v0}, Lb3/u0$g;->e(Ljava/lang/String;Lb3/u0$d;)Lb3/u0$g;

    move-result-object v0

    sput-object v0, Lo1/o;->f:Lb3/u0$g;

    return-void
.end method

.method public constructor <init>(Lr1/b;Lr1/b;Lx0/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr1/b<",
            "Lu1/i;",
            ">;",
            "Lr1/b<",
            "Lq1/k;",
            ">;",
            "Lx0/m;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/o;->b:Lr1/b;

    iput-object p2, p0, Lo1/o;->a:Lr1/b;

    iput-object p3, p0, Lo1/o;->c:Lx0/m;

    return-void
.end method

.method private b(Lb3/u0;)V
    .locals 2

    iget-object v0, p0, Lo1/o;->c:Lx0/m;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lx0/m;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lo1/o;->f:Lb3/u0$g;

    invoke-virtual {p1, v1, v0}, Lb3/u0;->p(Lb3/u0$g;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public a(Lb3/u0;)V
    .locals 2

    iget-object v0, p0, Lo1/o;->a:Lr1/b;

    invoke-interface {v0}, Lr1/b;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo1/o;->b:Lr1/b;

    invoke-interface {v0}, Lr1/b;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo1/o;->a:Lr1/b;

    invoke-interface {v0}, Lr1/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq1/k;

    const-string v1, "fire-fst"

    invoke-interface {v0, v1}, Lq1/k;->b(Ljava/lang/String;)Lq1/k$a;

    move-result-object v0

    invoke-virtual {v0}, Lq1/k$a;->d()I

    move-result v0

    if-eqz v0, :cond_1

    sget-object v1, Lo1/o;->d:Lb3/u0$g;

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lb3/u0;->p(Lb3/u0$g;Ljava/lang/Object;)V

    :cond_1
    sget-object v0, Lo1/o;->e:Lb3/u0$g;

    iget-object v1, p0, Lo1/o;->b:Lr1/b;

    invoke-interface {v1}, Lr1/b;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu1/i;

    invoke-interface {v1}, Lu1/i;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lb3/u0;->p(Lb3/u0$g;Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lo1/o;->b(Lb3/u0;)V

    :cond_2
    :goto_0
    return-void
.end method
