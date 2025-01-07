.class public abstract Ld4/o;
.super Lkotlinx/coroutines/internal/n;
.source ""

# interfaces
.implements Ld4/q;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlinx/coroutines/internal/n;",
        "Ld4/q<",
        "TE;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkotlinx/coroutines/internal/n;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ld4/o;->y()Lkotlinx/coroutines/internal/y;

    move-result-object v0

    return-object v0
.end method

.method public y()Lkotlinx/coroutines/internal/y;
    .locals 1

    sget-object v0, Ld4/b;->b:Lkotlinx/coroutines/internal/y;

    return-object v0
.end method

.method public abstract z(Ld4/j;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld4/j<",
            "*>;)V"
        }
    .end annotation
.end method
