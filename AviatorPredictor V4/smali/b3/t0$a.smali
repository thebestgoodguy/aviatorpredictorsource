.class Lb3/t0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb3/t0;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lb3/s0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic e:Lb3/t0;


# direct methods
.method constructor <init>(Lb3/t0;)V
    .locals 0

    iput-object p1, p0, Lb3/t0$a;->e:Lb3/t0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lb3/s0;Lb3/s0;)I
    .locals 0

    invoke-virtual {p1}, Lb3/s0;->c()I

    move-result p1

    invoke-virtual {p2}, Lb3/s0;->c()I

    move-result p2

    sub-int/2addr p1, p2

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lb3/s0;

    check-cast p2, Lb3/s0;

    invoke-virtual {p0, p1, p2}, Lb3/t0$a;->a(Lb3/s0;Lb3/s0;)I

    move-result p1

    return p1
.end method
