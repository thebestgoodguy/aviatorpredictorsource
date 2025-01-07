.class public final Lu2/t0$f$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu2/t0$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/Double;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lu2/t0$f;
    .locals 2

    new-instance v0, Lu2/t0$f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lu2/t0$f;-><init>(Lu2/t0$a;)V

    iget-object v1, p0, Lu2/t0$f$a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lu2/t0$f;->b(Ljava/lang/String;)V

    iget-object v1, p0, Lu2/t0$f$a;->b:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Lu2/t0$f;->c(Ljava/lang/Double;)V

    iget-object v1, p0, Lu2/t0$f$a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lu2/t0$f;->d(Ljava/lang/String;)V

    iget-object v1, p0, Lu2/t0$f$a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lu2/t0$f;->f(Ljava/lang/String;)V

    iget-object v1, p0, Lu2/t0$f$a;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lu2/t0$f;->e(Ljava/lang/String;)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lu2/t0$f$a;
    .locals 0

    iput-object p1, p0, Lu2/t0$f$a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/Double;)Lu2/t0$f$a;
    .locals 0

    iput-object p1, p0, Lu2/t0$f$a;->b:Ljava/lang/Double;

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lu2/t0$f$a;
    .locals 0

    iput-object p1, p0, Lu2/t0$f$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public e(Ljava/lang/String;)Lu2/t0$f$a;
    .locals 0

    iput-object p1, p0, Lu2/t0$f$a;->e:Ljava/lang/String;

    return-object p0
.end method

.method public f(Ljava/lang/String;)Lu2/t0$f$a;
    .locals 0

    iput-object p1, p0, Lu2/t0$f$a;->d:Ljava/lang/String;

    return-object p0
.end method
