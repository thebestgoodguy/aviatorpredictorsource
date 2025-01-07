.class Lr0/r;
.super Lr0/h;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lr0/h<",
        "TE;>;"
    }
.end annotation


# static fields
.field static final i:Lr0/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr0/h<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final transient g:[Ljava/lang/Object;

.field private final transient h:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lr0/r;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v2, v1}, Lr0/r;-><init>([Ljava/lang/Object;I)V

    sput-object v0, Lr0/r;->i:Lr0/h;

    return-void
.end method

.method constructor <init>([Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Lr0/h;-><init>()V

    iput-object p1, p0, Lr0/r;->g:[Ljava/lang/Object;

    iput p2, p0, Lr0/r;->h:I

    return-void
.end method


# virtual methods
.method public get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    iget v0, p0, Lr0/r;->h:I

    invoke-static {p1, v0}, Lq0/l;->l(II)I

    iget-object v0, p0, Lr0/r;->g:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method i([Ljava/lang/Object;I)I
    .locals 3

    iget-object v0, p0, Lr0/r;->g:[Ljava/lang/Object;

    iget v1, p0, Lr0/r;->h:I

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lr0/r;->h:I

    add-int/2addr p2, p1

    return p2
.end method

.method p()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr0/r;->g:[Ljava/lang/Object;

    return-object v0
.end method

.method q()I
    .locals 1

    iget v0, p0, Lr0/r;->h:I

    return v0
.end method

.method r()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lr0/r;->h:I

    return v0
.end method
