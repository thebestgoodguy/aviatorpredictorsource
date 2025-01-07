.class final Lcom/bumptech/glide/util/LruCache$Entry;
.super Ljava/lang/Object;
.source "LruCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bumptech/glide/util/LruCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Entry"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Y:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field final size:I

.field final value:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TY;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Object;I)V
    .locals 0
    .param p2, "size"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TY;I)V"
        }
    .end annotation

    .prologue
    .line 203
    .local p0, "this":Lcom/bumptech/glide/util/LruCache$Entry;, "Lcom/bumptech/glide/util/LruCache$Entry<TY;>;"
    .local p1, "value":Ljava/lang/Object;, "TY;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 204
    iput-object p1, p0, Lcom/bumptech/glide/util/LruCache$Entry;->value:Ljava/lang/Object;

    .line 205
    iput p2, p0, Lcom/bumptech/glide/util/LruCache$Entry;->size:I

    .line 206
    return-void
.end method
