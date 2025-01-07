.class public Lk0/e;
.super Lt/e;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt/e<",
        "Lt/a$d$c;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 3

    sget-object v0, Lk0/c;->c:Lt/a;

    new-instance v1, Lu/a;

    invoke-direct {v1}, Lu/a;-><init>()V

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, v2, v1}, Lt/e;-><init>(Landroid/content/Context;Lt/a;Lt/a$d;Lu/k;)V

    return-void
.end method


# virtual methods
.method public o([BLjava/lang/String;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Ljava/lang/String;",
            ")",
            "Lo0/h<",
            "Lk0/d$a;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lt/e;->b()Lt/f;

    move-result-object v0

    invoke-static {v0, p1, p2}, Li0/j;->a(Lt/f;[BLjava/lang/String;)Lt/g;

    move-result-object p1

    new-instance p2, Lk0/d$a;

    invoke-direct {p2}, Lk0/d$a;-><init>()V

    invoke-static {p1, p2}, Lw/q;->a(Lt/g;Lt/j;)Lo0/h;

    move-result-object p1

    return-object p1
.end method
