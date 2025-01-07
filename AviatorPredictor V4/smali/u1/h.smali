.class public Lu1/h;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu1/h$a;
    }
.end annotation


# direct methods
.method public static synthetic a(Ljava/lang/String;Lu1/h$a;Lb1/e;)Lu1/f;
    .locals 0

    invoke-static {p0, p1, p2}, Lu1/h;->d(Ljava/lang/String;Lu1/h$a;Lb1/e;)Lu1/f;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Lb1/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lb1/d<",
            "*>;"
        }
    .end annotation

    invoke-static {p0, p1}, Lu1/f;->a(Ljava/lang/String;Ljava/lang/String;)Lu1/f;

    move-result-object p0

    const-class p1, Lu1/f;

    invoke-static {p0, p1}, Lb1/d;->i(Ljava/lang/Object;Ljava/lang/Class;)Lb1/d;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/String;Lu1/h$a;)Lb1/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lu1/h$a<",
            "Landroid/content/Context;",
            ">;)",
            "Lb1/d<",
            "*>;"
        }
    .end annotation

    const-class v0, Lu1/f;

    invoke-static {v0}, Lb1/d;->j(Ljava/lang/Class;)Lb1/d$b;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-static {v1}, Lb1/q;->j(Ljava/lang/Class;)Lb1/q;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb1/d$b;->b(Lb1/q;)Lb1/d$b;

    move-result-object v0

    new-instance v1, Lu1/g;

    invoke-direct {v1, p0, p1}, Lu1/g;-><init>(Ljava/lang/String;Lu1/h$a;)V

    invoke-virtual {v0, v1}, Lb1/d$b;->e(Lb1/h;)Lb1/d$b;

    move-result-object p0

    invoke-virtual {p0}, Lb1/d$b;->c()Lb1/d;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic d(Ljava/lang/String;Lu1/h$a;Lb1/e;)Lu1/f;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p2, v0}, Lb1/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/Context;

    invoke-interface {p1, p2}, Lu1/h$a;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lu1/f;->a(Ljava/lang/String;Ljava/lang/String;)Lu1/f;

    move-result-object p0

    return-object p0
.end method
