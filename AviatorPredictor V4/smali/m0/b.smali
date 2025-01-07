.class final Lm0/b;
.super Lt/a$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt/a$a<",
        "Ln0/a;",
        "Lm0/a;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lt/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Landroid/content/Context;Landroid/os/Looper;Lw/d;Ljava/lang/Object;Lt/f$a;Lt/f$b;)Lt/a$f;
    .locals 8

    check-cast p4, Lm0/a;

    new-instance p4, Ln0/a;

    invoke-static {p3}, Ln0/a;->j0(Lw/d;)Landroid/os/Bundle;

    move-result-object v5

    const/4 v3, 0x1

    move-object v0, p4

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Ln0/a;-><init>(Landroid/content/Context;Landroid/os/Looper;ZLw/d;Landroid/os/Bundle;Lt/f$a;Lt/f$b;)V

    return-object p4
.end method
