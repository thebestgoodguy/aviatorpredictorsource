.class public abstract Lj1/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lj1/e;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static g(ILl1/l;[B[B)Lj1/e;
    .locals 1

    new-instance v0, Lj1/a;

    invoke-direct {v0, p0, p1, p2, p3}, Lj1/a;-><init>(ILl1/l;[B[B)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lj1/e;

    invoke-virtual {p0, p1}, Lj1/e;->d(Lj1/e;)I

    move-result p1

    return p1
.end method

.method public d(Lj1/e;)I
    .locals 2

    invoke-virtual {p0}, Lj1/e;->n()I

    move-result v0

    invoke-virtual {p1}, Lj1/e;->n()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Lj1/e;->k()Ll1/l;

    move-result-object v0

    invoke-virtual {p1}, Lj1/e;->k()Ll1/l;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll1/l;->g(Ll1/l;)I

    move-result v0

    if-eqz v0, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0}, Lj1/e;->h()[B

    move-result-object v0

    invoke-virtual {p1}, Lj1/e;->h()[B

    move-result-object v1

    invoke-static {v0, v1}, Lp1/g0;->h([B[B)I

    move-result v0

    if-eqz v0, :cond_2

    return v0

    :cond_2
    invoke-virtual {p0}, Lj1/e;->i()[B

    move-result-object v0

    invoke-virtual {p1}, Lj1/e;->i()[B

    move-result-object p1

    invoke-static {v0, p1}, Lp1/g0;->h([B[B)I

    move-result p1

    return p1
.end method

.method public abstract h()[B
.end method

.method public abstract i()[B
.end method

.method public abstract k()Ll1/l;
.end method

.method public abstract n()I
.end method
