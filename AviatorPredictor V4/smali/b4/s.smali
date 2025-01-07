.class public final Lb4/s;
.super Lb4/r1;
.source ""

# interfaces
.implements Lb4/r;


# instance fields
.field public final i:Lb4/t;


# direct methods
.method public constructor <init>(Lb4/t;)V
    .locals 0

    invoke-direct {p0}, Lb4/r1;-><init>()V

    iput-object p1, p0, Lb4/s;->i:Lb4/t;

    return-void
.end method


# virtual methods
.method public getParent()Lb4/p1;
    .locals 1

    invoke-virtual {p0}, Lb4/v1;->z()Lb4/w1;

    move-result-object v0

    return-object v0
.end method

.method public i(Ljava/lang/Throwable;)Z
    .locals 1

    invoke-virtual {p0}, Lb4/v1;->z()Lb4/w1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lb4/w1;->D(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lb4/s;->y(Ljava/lang/Throwable;)V

    sget-object p1, Lk3/s;->a:Lk3/s;

    return-object p1
.end method

.method public y(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lb4/s;->i:Lb4/t;

    invoke-virtual {p0}, Lb4/v1;->z()Lb4/w1;

    move-result-object v0

    invoke-interface {p1, v0}, Lb4/t;->t(Lb4/d2;)V

    return-void
.end method
