.class public Lw/w;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Landroid/content/Context;)Lw/x;
    .locals 1

    sget-object v0, Lw/y;->b:Lw/y;

    invoke-static {p0, v0}, Lw/w;->b(Landroid/content/Context;Lw/y;)Lw/x;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Lw/y;)Lw/x;
    .locals 1

    new-instance v0, Ly/d;

    invoke-direct {v0, p0, p1}, Ly/d;-><init>(Landroid/content/Context;Lw/y;)V

    return-object v0
.end method
