.class final Lb3/t0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb3/e1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/t0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lb3/e1$b<",
        "Lb3/s0;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lb3/t0$a;)V
    .locals 0

    invoke-direct {p0}, Lb3/t0$b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lb3/s0;

    invoke-virtual {p0, p1}, Lb3/t0$b;->c(Lb3/s0;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lb3/s0;

    invoke-virtual {p0, p1}, Lb3/t0$b;->d(Lb3/s0;)Z

    move-result p1

    return p1
.end method

.method public c(Lb3/s0;)I
    .locals 0

    invoke-virtual {p1}, Lb3/s0;->c()I

    move-result p1

    return p1
.end method

.method public d(Lb3/s0;)Z
    .locals 0

    invoke-virtual {p1}, Lb3/s0;->b()Z

    move-result p1

    return p1
.end method
