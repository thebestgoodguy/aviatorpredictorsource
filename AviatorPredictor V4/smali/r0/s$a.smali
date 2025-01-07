.class Lr0/s$a;
.super Lr0/j;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr0/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lr0/j<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field private final transient g:Lr0/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr0/i<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field private final transient h:[Ljava/lang/Object;

.field private final transient i:I

.field private final transient j:I


# direct methods
.method constructor <init>(Lr0/i;[Ljava/lang/Object;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr0/i<",
            "TK;TV;>;[",
            "Ljava/lang/Object;",
            "II)V"
        }
    .end annotation

    invoke-direct {p0}, Lr0/j;-><init>()V

    iput-object p1, p0, Lr0/s$a;->g:Lr0/i;

    iput-object p2, p0, Lr0/s$a;->h:[Ljava/lang/Object;

    iput p3, p0, Lr0/s$a;->i:I

    iput p4, p0, Lr0/s$a;->j:I

    return-void
.end method

.method static synthetic D(Lr0/s$a;)I
    .locals 0

    iget p0, p0, Lr0/s$a;->j:I

    return p0
.end method

.method static synthetic E(Lr0/s$a;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lr0/s$a;->h:[Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic F(Lr0/s$a;)I
    .locals 0

    iget p0, p0, Lr0/s$a;->i:I

    return p0
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v2, p0, Lr0/s$a;->g:Lr0/i;

    invoke-virtual {v2, v0}, Lr0/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method i([Ljava/lang/Object;I)I
    .locals 1

    invoke-virtual {p0}, Lr0/j;->u()Lr0/h;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lr0/h;->i([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lr0/s$a;->t()Lr0/x;

    move-result-object v0

    return-object v0
.end method

.method s()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lr0/s$a;->j:I

    return v0
.end method

.method public t()Lr0/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lr0/x<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lr0/j;->u()Lr0/h;

    move-result-object v0

    invoke-virtual {v0}, Lr0/h;->t()Lr0/x;

    move-result-object v0

    return-object v0
.end method

.method y()Lr0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lr0/h<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, Lr0/s$a$a;

    invoke-direct {v0, p0}, Lr0/s$a$a;-><init>(Lr0/s$a;)V

    return-object v0
.end method
