.class public abstract Lcom/bumptech/glide/request/target/ThumbnailImageViewTarget;
.super Lcom/bumptech/glide/request/target/ImageViewTarget;
.source "ThumbnailImageViewTarget.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/bumptech/glide/request/target/ImageViewTarget",
        "<TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;)V
    .locals 0
    .param p1, "view"    # Landroid/widget/ImageView;

    .prologue
    .line 27
    .local p0, "this":Lcom/bumptech/glide/request/target/ThumbnailImageViewTarget;, "Lcom/bumptech/glide/request/target/ThumbnailImageViewTarget<TT;>;"
    invoke-direct {p0, p1}, Lcom/bumptech/glide/request/target/ImageViewTarget;-><init>(Landroid/widget/ImageView;)V

    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/widget/ImageView;Z)V
    .locals 0
    .param p1, "view"    # Landroid/widget/ImageView;
    .param p2, "waitForLayout"    # Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 34
    .local p0, "this":Lcom/bumptech/glide/request/target/ThumbnailImageViewTarget;, "Lcom/bumptech/glide/request/target/ThumbnailImageViewTarget<TT;>;"
    invoke-direct {p0, p1, p2}, Lcom/bumptech/glide/request/target/ImageViewTarget;-><init>(Landroid/widget/ImageView;Z)V

    .line 35
    return-void
.end method


# virtual methods
.method protected abstract getDrawable(Ljava/lang/Object;)Landroid/graphics/drawable/Drawable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Landroid/graphics/drawable/Drawable;"
        }
    .end annotation
.end method

.method protected setResource(Ljava/lang/Object;)V
    .locals 5
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 39
    .local p0, "this":Lcom/bumptech/glide/request/target/ThumbnailImageViewTarget;, "Lcom/bumptech/glide/request/target/ThumbnailImageViewTarget<TT;>;"
    .local p1, "resource":Ljava/lang/Object;, "TT;"
    iget-object v3, p0, Lcom/bumptech/glide/request/target/ThumbnailImageViewTarget;->view:Landroid/view/View;

    check-cast v3, Landroid/widget/ImageView;

    invoke-virtual {v3}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 40
    .local v0, "layoutParams":Landroid/view/ViewGroup$LayoutParams;
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/request/target/ThumbnailImageViewTarget;->getDrawable(Ljava/lang/Object;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 41
    .local v1, "result":Landroid/graphics/drawable/Drawable;
    if-eqz v0, :cond_0

    iget v3, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-lez v3, :cond_0

    iget v3, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-lez v3, :cond_0

    .line 42
    new-instance v2, Lcom/bumptech/glide/request/target/FixedSizeDrawable;

    iget v3, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget v4, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-direct {v2, v1, v3, v4}, Lcom/bumptech/glide/request/target/FixedSizeDrawable;-><init>(Landroid/graphics/drawable/Drawable;II)V

    .end local v1    # "result":Landroid/graphics/drawable/Drawable;
    .local v2, "result":Landroid/graphics/drawable/Drawable;
    move-object v1, v2

    .line 45
    .end local v2    # "result":Landroid/graphics/drawable/Drawable;
    .restart local v1    # "result":Landroid/graphics/drawable/Drawable;
    :cond_0
    iget-object v3, p0, Lcom/bumptech/glide/request/target/ThumbnailImageViewTarget;->view:Landroid/view/View;

    check-cast v3, Landroid/widget/ImageView;

    invoke-virtual {v3, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 46
    return-void
.end method
