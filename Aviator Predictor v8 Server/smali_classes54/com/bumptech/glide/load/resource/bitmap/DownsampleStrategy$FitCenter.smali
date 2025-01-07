.class Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy$FitCenter;
.super Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;
.source "DownsampleStrategy.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "FitCenter"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 140
    invoke-direct {p0}, Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;-><init>()V

    return-void
.end method


# virtual methods
.method public getSampleSizeRounding(IIII)Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy$SampleSizeRounding;
    .locals 1
    .param p1, "sourceWidth"    # I
    .param p2, "sourceHeight"    # I
    .param p3, "requestedWidth"    # I
    .param p4, "requestedHeight"    # I

    .prologue
    .line 162
    sget-boolean v0, Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy$FitCenter;->IS_BITMAP_FACTORY_SCALING_SUPPORTED:Z

    if-eqz v0, :cond_0

    .line 163
    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy$SampleSizeRounding;->QUALITY:Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy$SampleSizeRounding;

    .line 168
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy$SampleSizeRounding;->MEMORY:Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy$SampleSizeRounding;

    goto :goto_0
.end method

.method public getScaleFactor(IIII)F
    .locals 6
    .param p1, "sourceWidth"    # I
    .param p2, "sourceHeight"    # I
    .param p3, "requestedWidth"    # I
    .param p4, "requestedHeight"    # I

    .prologue
    const/high16 v3, 0x3f800000    # 1.0f

    .line 145
    sget-boolean v4, Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy$FitCenter;->IS_BITMAP_FACTORY_SCALING_SUPPORTED:Z

    if-eqz v4, :cond_1

    .line 146
    int-to-float v3, p3

    int-to-float v4, p1

    div-float v2, v3, v4

    .line 147
    .local v2, "widthPercentage":F
    int-to-float v3, p4

    int-to-float v4, p2

    div-float v0, v3, v4

    .line 149
    .local v0, "heightPercentage":F
    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    move-result v3

    .line 155
    .end local v0    # "heightPercentage":F
    .end local v2    # "widthPercentage":F
    :cond_0
    :goto_0
    return v3

    .line 153
    :cond_1
    div-int v4, p2, p4

    div-int v5, p1, p3

    .line 154
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 155
    .local v1, "maxIntegerFactor":I
    if-eqz v1, :cond_0

    invoke-static {v1}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    goto :goto_0
.end method
