.class public Lj3/a;
.super Ljava/lang/Object;
.source ""


# static fields
.field static final a:Lj3/d;

.field static final b:Lj3/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lj3/d;

    const-string v1, ""

    const-wide/high16 v2, -0x8000000000000000L

    invoke-direct {v0, v1, v2, v3}, Lj3/d;-><init>(Ljava/lang/String;J)V

    sput-object v0, Lj3/a;->a:Lj3/d;

    new-instance v0, Lj3/b;

    invoke-direct {v0, v2, v3}, Lj3/b;-><init>(J)V

    sput-object v0, Lj3/a;->b:Lj3/b;

    return-void
.end method

.method protected constructor <init>(Lj3/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lj3/a;->a:Lj3/d;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "nope"

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method


# virtual methods
.method protected a(Ljava/lang/String;J)Lj3/d;
    .locals 0

    sget-object p1, Lj3/a;->a:Lj3/d;

    return-object p1
.end method

.method protected b(Ljava/lang/String;Lj3/d;)V
    .locals 0

    return-void
.end method

.method protected c(Lj3/b;)V
    .locals 0

    return-void
.end method

.method protected d()Lj3/b;
    .locals 1

    sget-object v0, Lj3/a;->b:Lj3/b;

    return-object v0
.end method

.method protected e(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method protected f(Ljava/lang/String;Lj3/d;)V
    .locals 0

    return-void
.end method

.method protected g(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method protected h(Ljava/lang/String;Lj3/d;)V
    .locals 0

    return-void
.end method
