.class final Lq0/f;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static synthetic a()V
    .locals 0

    invoke-static {}, Lq0/f;->b()V

    return-void
.end method

.method private static synthetic b()V
    .locals 0

    return-void
.end method

.method static c()Ljava/lang/String;
    .locals 1

    sget-object v0, Lq0/e;->e:Lq0/e;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    const-string v0, ""

    return-object v0
.end method
