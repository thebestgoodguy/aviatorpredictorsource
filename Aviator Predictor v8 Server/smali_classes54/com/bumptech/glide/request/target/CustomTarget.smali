.class public abstract Lcom/bumptech/glide/request/target/CustomTarget;
.super Ljava/lang/Object;
.source "CustomTarget.java"

# interfaces
.implements Lcom/bumptech/glide/request/target/Target;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/request/target/Target",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final height:I

.field private request:Lcom/bumptech/glide/request/Request;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final width:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .local p0, "this":Lcom/bumptech/glide/request/target/CustomTarget;, "Lcom/bumptech/glide/request/target/CustomTarget<TT;>;"
    const/high16 v0, -0x80000000

    .line 54
    invoke-direct {p0, v0, v0}, Lcom/bumptech/glide/request/target/CustomTarget;-><init>(II)V

    .line 55
    return-void
.end method

.method public constructor <init>(II)V
    .locals 3
    .param p1, "width"    # I
    .param p2, "height"    # I

    .prologue
    .line 66
    .local p0, "this":Lcom/bumptech/glide/request/target/CustomTarget;, "Lcom/bumptech/glide/request/target/CustomTarget<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    invoke-static {p1, p2}, Lcom/bumptech/glide/util/Util;->isValidDimensions(II)Z

    move-result v0

    if-nez v0, :cond_0

    .line 68
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " and height: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 76
    :cond_0
    iput p1, p0, Lcom/bumptech/glide/request/target/CustomTarget;->width:I

    .line 77
    iput p2, p0, Lcom/bumptech/glide/request/target/CustomTarget;->height:I

    .line 78
    return-void
.end method


# virtual methods
.method public final getRequest()Lcom/bumptech/glide/request/Request;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .prologue
    .line 123
    .local p0, "this":Lcom/bumptech/glide/request/target/CustomTarget;, "Lcom/bumptech/glide/request/target/CustomTarget<TT;>;"
    iget-object v0, p0, Lcom/bumptech/glide/request/target/CustomTarget;->request:Lcom/bumptech/glide/request/Request;

    return-object v0
.end method

.method public final getSize(Lcom/bumptech/glide/request/target/SizeReadyCallback;)V
    .locals 2
    .param p1, "cb"    # Lcom/bumptech/glide/request/target/SizeReadyCallback;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .prologue
    .line 107
    .local p0, "this":Lcom/bumptech/glide/request/target/CustomTarget;, "Lcom/bumptech/glide/request/target/CustomTarget<TT;>;"
    iget v0, p0, Lcom/bumptech/glide/request/target/CustomTarget;->width:I

    iget v1, p0, Lcom/bumptech/glide/request/target/CustomTarget;->height:I

    invoke-interface {p1, v0, v1}, Lcom/bumptech/glide/request/target/SizeReadyCallback;->onSizeReady(II)V

    .line 108
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .prologue
    .line 93
    .local p0, "this":Lcom/bumptech/glide/request/target/CustomTarget;, "Lcom/bumptech/glide/request/target/CustomTarget<TT;>;"
    return-void
.end method

.method public onLoadFailed(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .param p1, "errorDrawable"    # Landroid/graphics/drawable/Drawable;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 103
    .local p0, "this":Lcom/bumptech/glide/request/target/CustomTarget;, "Lcom/bumptech/glide/request/target/CustomTarget<TT;>;"
    return-void
.end method

.method public onLoadStarted(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .param p1, "placeholder"    # Landroid/graphics/drawable/Drawable;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 98
    .local p0, "this":Lcom/bumptech/glide/request/target/CustomTarget;, "Lcom/bumptech/glide/request/target/CustomTarget<TT;>;"
    return-void
.end method

.method public onStart()V
    .locals 0

    .prologue
    .line 83
    .local p0, "this":Lcom/bumptech/glide/request/target/CustomTarget;, "Lcom/bumptech/glide/request/target/CustomTarget<TT;>;"
    return-void
.end method

.method public onStop()V
    .locals 0

    .prologue
    .line 88
    .local p0, "this":Lcom/bumptech/glide/request/target/CustomTarget;, "Lcom/bumptech/glide/request/target/CustomTarget<TT;>;"
    return-void
.end method

.method public final removeCallback(Lcom/bumptech/glide/request/target/SizeReadyCallback;)V
    .locals 0
    .param p1, "cb"    # Lcom/bumptech/glide/request/target/SizeReadyCallback;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .prologue
    .line 113
    .local p0, "this":Lcom/bumptech/glide/request/target/CustomTarget;, "Lcom/bumptech/glide/request/target/CustomTarget<TT;>;"
    return-void
.end method

.method public final setRequest(Lcom/bumptech/glide/request/Request;)V
    .locals 0
    .param p1, "request"    # Lcom/bumptech/glide/request/Request;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 117
    .local p0, "this":Lcom/bumptech/glide/request/target/CustomTarget;, "Lcom/bumptech/glide/request/target/CustomTarget<TT;>;"
    iput-object p1, p0, Lcom/bumptech/glide/request/target/CustomTarget;->request:Lcom/bumptech/glide/request/Request;

    .line 118
    return-void
.end method
