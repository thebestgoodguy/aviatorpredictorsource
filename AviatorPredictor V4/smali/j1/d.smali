.class public Lj1/d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj1/d$b;,
        Lj1/d$a;
    }
.end annotation


# instance fields
.field private final a:Lj1/g;

.field private final b:Lj1/d$a;

.field private final c:Lj1/d$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lj1/g;

    invoke-direct {v0}, Lj1/g;-><init>()V

    iput-object v0, p0, Lj1/d;->a:Lj1/g;

    new-instance v0, Lj1/d$a;

    invoke-direct {v0, p0}, Lj1/d$a;-><init>(Lj1/d;)V

    iput-object v0, p0, Lj1/d;->b:Lj1/d$a;

    new-instance v0, Lj1/d$b;

    invoke-direct {v0, p0}, Lj1/d$b;-><init>(Lj1/d;)V

    iput-object v0, p0, Lj1/d;->c:Lj1/d$b;

    return-void
.end method

.method static synthetic a(Lj1/d;)Lj1/g;
    .locals 0

    iget-object p0, p0, Lj1/d;->a:Lj1/g;

    return-object p0
.end method


# virtual methods
.method public b(Ll1/q$c$a;)Lj1/b;
    .locals 1

    sget-object v0, Ll1/q$c$a;->f:Ll1/q$c$a;

    invoke-virtual {p1, v0}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lj1/d;->c:Lj1/d$b;

    return-object p1

    :cond_0
    iget-object p1, p0, Lj1/d;->b:Lj1/d$a;

    return-object p1
.end method

.method public c()[B
    .locals 1

    iget-object v0, p0, Lj1/d;->a:Lj1/g;

    invoke-virtual {v0}, Lj1/g;->a()[B

    move-result-object v0

    return-object v0
.end method

.method public d([B)V
    .locals 1

    iget-object v0, p0, Lj1/d;->a:Lj1/g;

    invoke-virtual {v0, p1}, Lj1/g;->c([B)V

    return-void
.end method
