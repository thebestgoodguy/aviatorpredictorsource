.class Ld3/n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/grpc/internal/o2;


# instance fields
.field private final a:Lh4/c;

.field private b:I

.field private c:I


# direct methods
.method constructor <init>(Lh4/c;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld3/n;->a:Lh4/c;

    iput p2, p0, Ld3/n;->b:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b()I
    .locals 1

    iget v0, p0, Ld3/n;->c:I

    return v0
.end method

.method public c([BII)V
    .locals 1

    iget-object v0, p0, Ld3/n;->a:Lh4/c;

    invoke-virtual {v0, p1, p2, p3}, Lh4/c;->o0([BII)Lh4/c;

    iget p1, p0, Ld3/n;->b:I

    sub-int/2addr p1, p3

    iput p1, p0, Ld3/n;->b:I

    iget p1, p0, Ld3/n;->c:I

    add-int/2addr p1, p3

    iput p1, p0, Ld3/n;->c:I

    return-void
.end method

.method public d()I
    .locals 1

    iget v0, p0, Ld3/n;->b:I

    return v0
.end method

.method public e(B)V
    .locals 1

    iget-object v0, p0, Ld3/n;->a:Lh4/c;

    invoke-virtual {v0, p1}, Lh4/c;->p0(I)Lh4/c;

    iget p1, p0, Ld3/n;->b:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ld3/n;->b:I

    iget p1, p0, Ld3/n;->c:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ld3/n;->c:I

    return-void
.end method

.method f()Lh4/c;
    .locals 1

    iget-object v0, p0, Ld3/n;->a:Lh4/c;

    return-object v0
.end method
