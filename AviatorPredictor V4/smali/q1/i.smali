.class public Lq1/i;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a()Lb1/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb1/d<",
            "*>;"
        }
    .end annotation

    new-instance v0, Lq1/i$a;

    invoke-direct {v0}, Lq1/i$a;-><init>()V

    const-class v1, Lq1/h;

    invoke-static {v0, v1}, Lb1/d;->i(Ljava/lang/Object;Ljava/lang/Class;)Lb1/d;

    move-result-object v0

    return-object v0
.end method
