.class public Lq2/k;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq2/k$f;,
        Lq2/k$b;,
        Lq2/k$c;,
        Lq2/k$e;,
        Lq2/k$d;,
        Lq2/k$g;
    }
.end annotation


# instance fields
.field private final a:Lr2/j;

.field private b:Lq2/k$g;

.field private final c:Lr2/j$c;


# direct methods
.method public constructor <init>(Lf2/a;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lq2/k$a;

    invoke-direct {v0, p0}, Lq2/k$a;-><init>(Lq2/k;)V

    iput-object v0, p0, Lq2/k;->c:Lr2/j$c;

    new-instance v1, Lr2/j;

    sget-object v2, Lr2/q;->b:Lr2/q;

    const-string v3, "flutter/platform_views"

    invoke-direct {v1, p1, v3, v2}, Lr2/j;-><init>(Lr2/b;Ljava/lang/String;Lr2/k;)V

    iput-object v1, p0, Lq2/k;->a:Lr2/j;

    invoke-virtual {v1, v0}, Lr2/j;->e(Lr2/j$c;)V

    return-void
.end method

.method static synthetic a(Lq2/k;)Lq2/k$g;
    .locals 0

    iget-object p0, p0, Lq2/k;->b:Lq2/k$g;

    return-object p0
.end method

.method static synthetic b(Ljava/lang/Exception;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lq2/k;->c(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static c(Ljava/lang/Exception;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    new-instance v1, Ljava/io/PrintWriter;

    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    invoke-virtual {p0, v1}, Ljava/lang/Exception;->printStackTrace(Ljava/io/PrintWriter;)V

    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public d(I)V
    .locals 2

    iget-object v0, p0, Lq2/k;->a:Lr2/j;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v1, "viewFocused"

    invoke-virtual {v0, v1, p1}, Lr2/j;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public e(Lq2/k$g;)V
    .locals 0

    iput-object p1, p0, Lq2/k;->b:Lq2/k$g;

    return-void
.end method
