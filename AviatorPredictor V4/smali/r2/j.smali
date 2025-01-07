.class public Lr2/j;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr2/j$a;,
        Lr2/j$b;,
        Lr2/j$d;,
        Lr2/j$c;
    }
.end annotation


# instance fields
.field private final a:Lr2/b;

.field private final b:Ljava/lang/String;

.field private final c:Lr2/k;

.field private final d:Lr2/b$c;


# direct methods
.method public constructor <init>(Lr2/b;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lr2/q;->b:Lr2/q;

    invoke-direct {p0, p1, p2, v0}, Lr2/j;-><init>(Lr2/b;Ljava/lang/String;Lr2/k;)V

    return-void
.end method

.method public constructor <init>(Lr2/b;Ljava/lang/String;Lr2/k;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lr2/j;-><init>(Lr2/b;Ljava/lang/String;Lr2/k;Lr2/b$c;)V

    return-void
.end method

.method public constructor <init>(Lr2/b;Ljava/lang/String;Lr2/k;Lr2/b$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr2/j;->a:Lr2/b;

    iput-object p2, p0, Lr2/j;->b:Ljava/lang/String;

    iput-object p3, p0, Lr2/j;->c:Lr2/k;

    iput-object p4, p0, Lr2/j;->d:Lr2/b$c;

    return-void
.end method

.method static synthetic a(Lr2/j;)Lr2/k;
    .locals 0

    iget-object p0, p0, Lr2/j;->c:Lr2/k;

    return-object p0
.end method

.method static synthetic b(Lr2/j;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lr2/j;->b:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public c(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lr2/j;->d(Ljava/lang/String;Ljava/lang/Object;Lr2/j$d;)V

    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/Object;Lr2/j$d;)V
    .locals 4

    iget-object v0, p0, Lr2/j;->a:Lr2/b;

    iget-object v1, p0, Lr2/j;->b:Ljava/lang/String;

    iget-object v2, p0, Lr2/j;->c:Lr2/k;

    new-instance v3, Lr2/i;

    invoke-direct {v3, p1, p2}, Lr2/i;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v2, v3}, Lr2/k;->e(Lr2/i;)Ljava/nio/ByteBuffer;

    move-result-object p1

    if-nez p3, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    new-instance p2, Lr2/j$b;

    invoke-direct {p2, p0, p3}, Lr2/j$b;-><init>(Lr2/j;Lr2/j$d;)V

    :goto_0
    invoke-interface {v0, v1, p1, p2}, Lr2/b;->e(Ljava/lang/String;Ljava/nio/ByteBuffer;Lr2/b$b;)V

    return-void
.end method

.method public e(Lr2/j$c;)V
    .locals 3

    iget-object v0, p0, Lr2/j;->d:Lr2/b$c;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lr2/j;->a:Lr2/b;

    iget-object v2, p0, Lr2/j;->b:Ljava/lang/String;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lr2/j$a;

    invoke-direct {v1, p0, p1}, Lr2/j$a;-><init>(Lr2/j;Lr2/j$c;)V

    :goto_0
    iget-object p1, p0, Lr2/j;->d:Lr2/b$c;

    invoke-interface {v0, v2, v1, p1}, Lr2/b;->a(Ljava/lang/String;Lr2/b$a;Lr2/b$c;)V

    goto :goto_2

    :cond_1
    iget-object v0, p0, Lr2/j;->a:Lr2/b;

    iget-object v2, p0, Lr2/j;->b:Ljava/lang/String;

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    new-instance v1, Lr2/j$a;

    invoke-direct {v1, p0, p1}, Lr2/j$a;-><init>(Lr2/j;Lr2/j$c;)V

    :goto_1
    invoke-interface {v0, v2, v1}, Lr2/b;->b(Ljava/lang/String;Lr2/b$a;)V

    :goto_2
    return-void
.end method
