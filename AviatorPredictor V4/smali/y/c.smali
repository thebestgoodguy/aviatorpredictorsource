.class final Ly/c;
.super Lt/a$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt/a$a<",
        "Ly/e;",
        "Lw/y;",
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
.method public final synthetic b(Landroid/content/Context;Landroid/os/Looper;Lw/d;Ljava/lang/Object;Lu/c;Lu/h;)Lt/a$f;
    .locals 7

    move-object v4, p4

    check-cast v4, Lw/y;

    new-instance p4, Ly/e;

    move-object v0, p4

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Ly/e;-><init>(Landroid/content/Context;Landroid/os/Looper;Lw/d;Lw/y;Lu/c;Lu/h;)V

    return-object p4
.end method
