.class Lcom/bumptech/glide/load/resource/ImageDecoderResourceDecoder$1$1;
.super Ljava/lang/Object;
.source "ImageDecoderResourceDecoder.java"

# interfaces
.implements Landroid/graphics/ImageDecoder$OnPartialImageListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bumptech/glide/load/resource/ImageDecoderResourceDecoder$1;->onHeaderDecoded(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$ImageInfo;Landroid/graphics/ImageDecoder$Source;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/bumptech/glide/load/resource/ImageDecoderResourceDecoder$1;


# direct methods
.method constructor <init>(Lcom/bumptech/glide/load/resource/ImageDecoderResourceDecoder$1;)V
    .locals 0
    .param p1, "this$1"    # Lcom/bumptech/glide/load/resource/ImageDecoderResourceDecoder$1;

    .prologue
    .line 89
    .local p0, "this":Lcom/bumptech/glide/load/resource/ImageDecoderResourceDecoder$1$1;, "Lcom/bumptech/glide/load/resource/ImageDecoderResourceDecoder$1$1;"
    iput-object p1, p0, Lcom/bumptech/glide/load/resource/ImageDecoderResourceDecoder$1$1;->this$1:Lcom/bumptech/glide/load/resource/ImageDecoderResourceDecoder$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPartialImage(Landroid/graphics/ImageDecoder$DecodeException;)Z
    .locals 1
    .param p1, "e"    # Landroid/graphics/ImageDecoder$DecodeException;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .prologue
    .line 93
    .local p0, "this":Lcom/bumptech/glide/load/resource/ImageDecoderResourceDecoder$1$1;, "Lcom/bumptech/glide/load/resource/ImageDecoderResourceDecoder$1$1;"
    const/4 v0, 0x0

    return v0
.end method
