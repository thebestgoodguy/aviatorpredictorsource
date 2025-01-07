.class public final Lr2/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr2/c$c;,
        Lr2/c$b;,
        Lr2/c$d;
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

    invoke-direct {p0, p1, p2, v0}, Lr2/c;-><init>(Lr2/b;Ljava/lang/String;Lr2/k;)V

    return-void
.end method

.method public constructor <init>(Lr2/b;Ljava/lang/String;Lr2/k;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lr2/c;-><init>(Lr2/b;Ljava/lang/String;Lr2/k;Lr2/b$c;)V

    return-void
.end method

.method public constructor <init>(Lr2/b;Ljava/lang/String;Lr2/k;Lr2/b$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr2/c;->a:Lr2/b;

    iput-object p2, p0, Lr2/c;->b:Ljava/lang/String;

    iput-object p3, p0, Lr2/c;->c:Lr2/k;

    iput-object p4, p0, Lr2/c;->d:Lr2/b$c;

    return-void
.end method

.method static synthetic a(Lr2/c;)Lr2/k;
    .locals 0

    iget-object p0, p0, Lr2/c;->c:Lr2/k;

    return-object p0
.end method

.method static synthetic b(Lr2/c;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lr2/c;->b:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic c(Lr2/c;)Lr2/b;
    .locals 0

    iget-object p0, p0, Lr2/c;->a:Lr2/b;

    return-object p0
.end method


# virtual methods
.method public d(Lr2/c$d;)V
    .locals 3

    iget-object v0, p0, Lr2/c;->d:Lr2/b$c;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lr2/c;->a:Lr2/b;

    iget-object v2, p0, Lr2/c;->b:Ljava/lang/String;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lr2/c$c;

    invoke-direct {v1, p0, p1}, Lr2/c$c;-><init>(Lr2/c;Lr2/c$d;)V

    :goto_0
    iget-object p1, p0, Lr2/c;->d:Lr2/b$c;

    invoke-interface {v0, v2, v1, p1}, Lr2/b;->a(Ljava/lang/String;Lr2/b$a;Lr2/b$c;)V

    goto :goto_2

    :cond_1
    iget-object v0, p0, Lr2/c;->a:Lr2/b;

    iget-object v2, p0, Lr2/c;->b:Ljava/lang/String;

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    new-instance v1, Lr2/c$c;

    invoke-direct {v1, p0, p1}, Lr2/c$c;-><init>(Lr2/c;Lr2/c$d;)V

    :goto_1
    invoke-interface {v0, v2, v1}, Lr2/b;->b(Ljava/lang/String;Lr2/b$a;)V

    :goto_2
    return-void
.end method
