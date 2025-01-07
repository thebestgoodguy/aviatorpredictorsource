.class final Lk0/p;
.super Lt/a$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt/a$a<",
        "Li0/m;",
        "Lt/a$d$c;",
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
.method public final synthetic a(Landroid/content/Context;Landroid/os/Looper;Lw/d;Ljava/lang/Object;Lt/f$a;Lt/f$b;)Lt/a$f;
    .locals 6

    new-instance p4, Li0/m;

    move-object v0, p4

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Li0/m;-><init>(Landroid/content/Context;Landroid/os/Looper;Lw/d;Lt/f$a;Lt/f$b;)V

    return-object p4
.end method
