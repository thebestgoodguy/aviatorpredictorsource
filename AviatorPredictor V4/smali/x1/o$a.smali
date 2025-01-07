.class Lx1/o$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh3/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx1/o;->e(Lb3/d;)Lx1/o$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lh3/b$a<",
        "Lx1/o$b;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lb3/d;Lb3/c;)Lh3/b;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lx1/o$a;->b(Lb3/d;Lb3/c;)Lx1/o$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Lb3/d;Lb3/c;)Lx1/o$b;
    .locals 2

    new-instance v0, Lx1/o$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lx1/o$b;-><init>(Lb3/d;Lb3/c;Lx1/o$a;)V

    return-object v0
.end method
