.class final Lr0/s$c;
.super Lr0/h;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr0/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lr0/h<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field private final transient g:[Ljava/lang/Object;

.field private final transient h:I

.field private final transient i:I


# direct methods
.method constructor <init>([Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, Lr0/h;-><init>()V

    iput-object p1, p0, Lr0/s$c;->g:[Ljava/lang/Object;

    iput p2, p0, Lr0/s$c;->h:I

    iput p3, p0, Lr0/s$c;->i:I

    return-void
.end method


# virtual methods
.method public get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lr0/s$c;->i:I

    invoke-static {p1, v0}, Lq0/l;->l(II)I

    iget-object v0, p0, Lr0/s$c;->g:[Ljava/lang/Object;

    mul-int/lit8 p1, p1, 0x2

    iget v1, p0, Lr0/s$c;->h:I

    add-int/2addr p1, v1

    aget-object p1, v0, p1

    return-object p1
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lr0/s$c;->i:I

    return v0
.end method
