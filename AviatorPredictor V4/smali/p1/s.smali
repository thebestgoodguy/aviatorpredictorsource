.class public Lp1/s;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp1/s$b;,
        Lp1/s$a;
    }
.end annotation


# direct methods
.method public static a(Ljava/io/File;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lp1/s$a;->a(Ljava/io/File;)V

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lp1/s$b;->a(Ljava/io/File;)V

    :goto_0
    return-void
.end method
