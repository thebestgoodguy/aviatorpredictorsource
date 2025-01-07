.class public final Lx1/o$b;
.super Lh3/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lh3/a<",
        "Lx1/o$b;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>(Lb3/d;Lb3/c;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lh3/a;-><init>(Lb3/d;Lb3/c;)V

    return-void
.end method

.method synthetic constructor <init>(Lb3/d;Lb3/c;Lx1/o$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lx1/o$b;-><init>(Lb3/d;Lb3/c;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lb3/d;Lb3/c;)Lh3/b;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lx1/o$b;->g(Lb3/d;Lb3/c;)Lx1/o$b;

    move-result-object p1

    return-object p1
.end method

.method protected g(Lb3/d;Lb3/c;)Lx1/o$b;
    .locals 1

    new-instance v0, Lx1/o$b;

    invoke-direct {v0, p1, p2}, Lx1/o$b;-><init>(Lb3/d;Lb3/c;)V

    return-object v0
.end method
