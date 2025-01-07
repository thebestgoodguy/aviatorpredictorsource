.class public Lb4/s1;
.super Lb4/w1;
.source ""

# interfaces
.implements Lb4/x;


# instance fields
.field private final f:Z


# direct methods
.method public constructor <init>(Lb4/p1;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lb4/w1;-><init>(Z)V

    invoke-virtual {p0, p1}, Lb4/w1;->S(Lb4/p1;)V

    invoke-direct {p0}, Lb4/s1;->t0()Z

    move-result p1

    iput-boolean p1, p0, Lb4/s1;->f:Z

    return-void
.end method

.method private final t0()Z
    .locals 4

    invoke-virtual {p0}, Lb4/w1;->O()Lb4/r;

    move-result-object v0

    instance-of v1, v0, Lb4/s;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lb4/s;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {v0}, Lb4/v1;->z()Lb4/w1;

    move-result-object v0

    invoke-virtual {v0}, Lb4/w1;->L()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    invoke-virtual {v0}, Lb4/w1;->O()Lb4/r;

    move-result-object v0

    instance-of v3, v0, Lb4/s;

    if-eqz v3, :cond_3

    check-cast v0, Lb4/s;

    goto :goto_1

    :cond_3
    move-object v0, v2

    :goto_1
    if-nez v0, :cond_1

    return v1
.end method


# virtual methods
.method public L()Z
    .locals 1

    iget-boolean v0, p0, Lb4/s1;->f:Z

    return v0
.end method

.method public M()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
