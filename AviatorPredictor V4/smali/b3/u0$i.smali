.class final Lb3/u0$i;
.super Lb3/u0$g;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lb3/u0$g<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final f:Lb3/u0$j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/u0$j<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/lang/String;ZLb3/u0$j;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lb3/u0$j<",
            "TT;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lb3/u0$g;-><init>(Ljava/lang/String;ZLjava/lang/Object;Lb3/u0$a;)V

    const-string p2, "-bin"

    invoke-virtual {p1, p2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "ASCII header is named %s.  Only binary headers may end with %s"

    invoke-static {v0, v1, p1, p2}, Lq0/l;->k(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string p1, "marshaller"

    invoke-static {p3, p1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb3/u0$j;

    iput-object p1, p0, Lb3/u0$i;->f:Lb3/u0$j;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ZLb3/u0$j;Lb3/u0$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lb3/u0$i;-><init>(Ljava/lang/String;ZLb3/u0$j;)V

    return-void
.end method


# virtual methods
.method h([B)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)TT;"
        }
    .end annotation

    iget-object v0, p0, Lb3/u0$i;->f:Lb3/u0$j;

    invoke-interface {v0, p1}, Lb3/u0$j;->b([B)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method j(Ljava/lang/Object;)[B
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)[B"
        }
    .end annotation

    iget-object v0, p0, Lb3/u0$i;->f:Lb3/u0$j;

    invoke-interface {v0, p1}, Lb3/u0$j;->a(Ljava/lang/Object;)[B

    move-result-object p1

    return-object p1
.end method
