.class public Lc2/e$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:Lc2/c;

.field private b:Ljava/lang/String;

.field private c:Lc2/b$b;

.field private d:Lc2/f;

.field private e:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "GET"

    iput-object v0, p0, Lc2/e$b;->b:Ljava/lang/String;

    new-instance v0, Lc2/b$b;

    invoke-direct {v0}, Lc2/b$b;-><init>()V

    iput-object v0, p0, Lc2/e$b;->c:Lc2/b$b;

    return-void
.end method

.method static synthetic a(Lc2/e$b;)Lc2/c;
    .locals 0

    iget-object p0, p0, Lc2/e$b;->a:Lc2/c;

    return-object p0
.end method

.method static synthetic b(Lc2/e$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lc2/e$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic c(Lc2/e$b;)Lc2/b$b;
    .locals 0

    iget-object p0, p0, Lc2/e$b;->c:Lc2/b$b;

    return-object p0
.end method

.method static synthetic d(Lc2/e$b;)Lc2/f;
    .locals 0

    iget-object p0, p0, Lc2/e$b;->d:Lc2/f;

    return-object p0
.end method

.method static synthetic e(Lc2/e$b;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lc2/e$b;->e:Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public f()Lc2/e;
    .locals 2

    iget-object v0, p0, Lc2/e$b;->a:Lc2/c;

    if-eqz v0, :cond_0

    new-instance v0, Lc2/e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lc2/e;-><init>(Lc2/e$b;Lc2/e$a;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "url == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public g(Ljava/lang/String;Ljava/lang/String;)Lc2/e$b;
    .locals 1

    iget-object v0, p0, Lc2/e$b;->c:Lc2/b$b;

    invoke-virtual {v0, p1, p2}, Lc2/b$b;->f(Ljava/lang/String;Ljava/lang/String;)Lc2/b$b;

    return-object p0
.end method

.method public h(Lc2/c;)Lc2/e$b;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lc2/e$b;->a:Lc2/c;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "url == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
