.class public Lcom/bumptech/glide/load/resource/transcode/UnitTranscoder;
.super Ljava/lang/Object;
.source "UnitTranscoder.java"

# interfaces
.implements Lcom/bumptech/glide/load/resource/transcode/ResourceTranscoder;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Z:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/resource/transcode/ResourceTranscoder",
        "<TZ;TZ;>;"
    }
.end annotation


# static fields
.field private static final UNIT_TRANSCODER:Lcom/bumptech/glide/load/resource/transcode/UnitTranscoder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/resource/transcode/UnitTranscoder",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 14
    new-instance v0, Lcom/bumptech/glide/load/resource/transcode/UnitTranscoder;

    invoke-direct {v0}, Lcom/bumptech/glide/load/resource/transcode/UnitTranscoder;-><init>()V

    sput-object v0, Lcom/bumptech/glide/load/resource/transcode/UnitTranscoder;->UNIT_TRANSCODER:Lcom/bumptech/glide/load/resource/transcode/UnitTranscoder;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    .local p0, "this":Lcom/bumptech/glide/load/resource/transcode/UnitTranscoder;, "Lcom/bumptech/glide/load/resource/transcode/UnitTranscoder<TZ;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static get()Lcom/bumptech/glide/load/resource/transcode/ResourceTranscoder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Z:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/bumptech/glide/load/resource/transcode/ResourceTranscoder",
            "<TZ;TZ;>;"
        }
    .end annotation

    .prologue
    .line 18
    sget-object v0, Lcom/bumptech/glide/load/resource/transcode/UnitTranscoder;->UNIT_TRANSCODER:Lcom/bumptech/glide/load/resource/transcode/UnitTranscoder;

    return-object v0
.end method


# virtual methods
.method public transcode(Lcom/bumptech/glide/load/engine/Resource;Lcom/bumptech/glide/load/Options;)Lcom/bumptech/glide/load/engine/Resource;
    .locals 0
    .param p1    # Lcom/bumptech/glide/load/engine/Resource;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2, "options"    # Lcom/bumptech/glide/load/Options;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/engine/Resource",
            "<TZ;>;",
            "Lcom/bumptech/glide/load/Options;",
            ")",
            "Lcom/bumptech/glide/load/engine/Resource",
            "<TZ;>;"
        }
    .end annotation

    .prologue
    .line 24
    .local p0, "this":Lcom/bumptech/glide/load/resource/transcode/UnitTranscoder;, "Lcom/bumptech/glide/load/resource/transcode/UnitTranscoder<TZ;>;"
    .local p1, "toTranscode":Lcom/bumptech/glide/load/engine/Resource;, "Lcom/bumptech/glide/load/engine/Resource<TZ;>;"
    return-object p1
.end method
