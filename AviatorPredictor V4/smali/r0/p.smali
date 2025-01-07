.class public abstract Lr0/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "TT;>;"
    }
.end annotation


# direct methods
.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/Comparator;)Lr0/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "TT;>;)",
            "Lr0/p<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Lr0/p;

    if-eqz v0, :cond_0

    check-cast p0, Lr0/p;

    goto :goto_0

    :cond_0
    new-instance v0, Lr0/e;

    invoke-direct {v0, p0}, Lr0/e;-><init>(Ljava/util/Comparator;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public b(Lq0/d;)Lr0/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<F:",
            "Ljava/lang/Object;",
            ">(",
            "Lq0/d<",
            "TF;+TT;>;)",
            "Lr0/p<",
            "TF;>;"
        }
    .end annotation

    new-instance v0, Lr0/b;

    invoke-direct {v0, p1, p0}, Lr0/b;-><init>(Lq0/d;Lr0/p;)V

    return-object v0
.end method

.method public abstract compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation
.end method
