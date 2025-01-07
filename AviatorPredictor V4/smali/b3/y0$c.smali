.class final Lb3/y0$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb3/e1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/y0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lb3/e1$b<",
        "Lb3/x0;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lb3/y0$a;)V
    .locals 0

    invoke-direct {p0}, Lb3/y0$c;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lb3/x0;

    invoke-virtual {p0, p1}, Lb3/y0$c;->c(Lb3/x0;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lb3/x0;

    invoke-virtual {p0, p1}, Lb3/y0$c;->d(Lb3/x0;)Z

    move-result p1

    return p1
.end method

.method public c(Lb3/x0;)I
    .locals 0

    invoke-virtual {p1}, Lb3/x0;->e()I

    move-result p1

    return p1
.end method

.method public d(Lb3/x0;)Z
    .locals 0

    invoke-virtual {p1}, Lb3/x0;->d()Z

    move-result p1

    return p1
.end method
