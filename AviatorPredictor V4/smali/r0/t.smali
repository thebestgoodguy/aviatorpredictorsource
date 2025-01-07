.class final Lr0/t;
.super Lr0/j;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lr0/j<",
        "TE;>;"
    }
.end annotation


# static fields
.field static final l:Lr0/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr0/t<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final transient g:[Ljava/lang/Object;

.field final transient h:[Ljava/lang/Object;

.field private final transient i:I

.field private final transient j:I

.field private final transient k:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v6, Lr0/t;

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lr0/t;-><init>([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    sput-object v6, Lr0/t;->l:Lr0/t;

    return-void
.end method

.method constructor <init>([Ljava/lang/Object;I[Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, Lr0/j;-><init>()V

    iput-object p1, p0, Lr0/t;->g:[Ljava/lang/Object;

    iput-object p3, p0, Lr0/t;->h:[Ljava/lang/Object;

    iput p4, p0, Lr0/t;->i:I

    iput p2, p0, Lr0/t;->j:I

    iput p5, p0, Lr0/t;->k:I

    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 4

    iget-object v0, p0, Lr0/t;->h:[Ljava/lang/Object;

    const/4 v1, 0x0

    if-eqz p1, :cond_3

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p1}, Lr0/f;->b(Ljava/lang/Object;)I

    move-result v2

    :goto_0
    iget v3, p0, Lr0/t;->i:I

    and-int/2addr v2, v3

    aget-object v3, v0, v2

    if-nez v3, :cond_1

    return v1

    :cond_1
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lr0/t;->j:I

    return v0
.end method

.method i([Ljava/lang/Object;I)I
    .locals 3

    iget-object v0, p0, Lr0/t;->g:[Ljava/lang/Object;

    iget v1, p0, Lr0/t;->k:I

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lr0/t;->k:I

    add-int/2addr p2, p1

    return p2
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lr0/t;->t()Lr0/x;

    move-result-object v0

    return-object v0
.end method

.method p()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr0/t;->g:[Ljava/lang/Object;

    return-object v0
.end method

.method q()I
    .locals 1

    iget v0, p0, Lr0/t;->k:I

    return v0
.end method

.method r()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method s()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lr0/t;->k:I

    return v0
.end method

.method public t()Lr0/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lr0/x<",
            "TE;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lr0/j;->u()Lr0/h;

    move-result-object v0

    invoke-virtual {v0}, Lr0/h;->t()Lr0/x;

    move-result-object v0

    return-object v0
.end method

.method y()Lr0/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lr0/h<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, Lr0/t;->g:[Ljava/lang/Object;

    iget v1, p0, Lr0/t;->k:I

    invoke-static {v0, v1}, Lr0/h;->v([Ljava/lang/Object;I)Lr0/h;

    move-result-object v0

    return-object v0
.end method

.method z()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
