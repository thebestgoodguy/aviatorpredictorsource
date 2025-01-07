.class Ld3/o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/grpc/internal/p2;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Lio/grpc/internal/o2;
    .locals 2

    const/16 v0, 0x1000

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    const/high16 v0, 0x100000

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    new-instance v0, Ld3/n;

    new-instance v1, Lh4/c;

    invoke-direct {v1}, Lh4/c;-><init>()V

    invoke-direct {v0, v1, p1}, Ld3/n;-><init>(Lh4/c;I)V

    return-object v0
.end method
