.class public final Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;
.super Ljava/lang/Object;
.source "HardwareConfigState.java"


# static fields
.field public static final BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED:Z

.field private static final FD_SIZE_LIST:Ljava/io/File;

.field public static final HARDWARE_BITMAPS_SUPPORTED:Z

.field private static final MAXIMUM_FDS_FOR_HARDWARE_CONFIGS_O:I = 0x2bc

.field private static final MAXIMUM_FDS_FOR_HARDWARE_CONFIGS_P:I = 0x4e20

.field private static final MINIMUM_DECODES_BETWEEN_FD_CHECKS:I = 0x32

.field static final MIN_HARDWARE_DIMENSION_O:I = 0x80
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field private static final MIN_HARDWARE_DIMENSION_P:I = 0x0

.field public static final NO_MAX_FD_COUNT:I = -0x1

.field private static final TAG:Ljava/lang/String; = "HardwareConfig"

.field private static volatile instance:Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;

.field private static volatile manualOverrideMaxFdCount:I


# instance fields
.field private decodesSinceLastFdCheck:I
    .annotation build Landroidx/annotation/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private isFdSizeBelowHardwareLimit:Z
    .annotation build Landroidx/annotation/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private final isHardwareConfigAllowedByAppState:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final isHardwareConfigAllowedByDeviceModel:Z

.field private final minHardwareDimension:I

.field private final sdkBasedMaxFdCount:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 28
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    if-ge v0, v3, :cond_0

    move v0, v1

    :goto_0
    sput-boolean v0, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED:Z

    .line 32
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1a

    if-lt v0, v3, :cond_1

    :goto_1
    sput-boolean v1, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->HARDWARE_BITMAPS_SUPPORTED:Z

    .line 61
    new-instance v0, Ljava/io/File;

    const-string v1, "/proc/self/fd"

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->FD_SIZE_LIST:Ljava/io/File;

    .line 86
    const/4 v0, -0x1

    sput v0, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->manualOverrideMaxFdCount:I

    return-void

    :cond_0
    move v0, v2

    .line 28
    goto :goto_0

    :cond_1
    move v1, v2

    .line 32
    goto :goto_1
.end method

.method constructor <init>()V
    .locals 3
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->isFdSizeBelowHardwareLimit:Z

    .line 104
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->isHardwareConfigAllowedByAppState:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 119
    invoke-static {}, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->isHardwareConfigAllowedByDeviceModel()Z

    move-result v0

    iput-boolean v0, p0, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->isHardwareConfigAllowedByDeviceModel:Z

    .line 120
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 121
    const/16 v0, 0x4e20

    iput v0, p0, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->sdkBasedMaxFdCount:I

    .line 122
    iput v2, p0, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->minHardwareDimension:I

    .line 127
    :goto_0
    return-void

    .line 124
    :cond_0
    const/16 v0, 0x2bc

    iput v0, p0, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->sdkBasedMaxFdCount:I

    .line 125
    const/16 v0, 0x80

    iput v0, p0, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->minHardwareDimension:I

    goto :goto_0
.end method

.method private areHardwareBitmapsBlockedByAppState()Z
    .locals 1

    .prologue
    .line 203
    sget-boolean v0, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->isHardwareConfigAllowedByAppState:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 204
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 203
    :goto_0
    return v0

    .line 204
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static getInstance()Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;
    .locals 2

    .prologue
    .line 107
    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->instance:Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;

    if-nez v0, :cond_1

    .line 108
    const-class v1, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;

    monitor-enter v1

    .line 109
    :try_start_0
    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->instance:Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;

    if-nez v0, :cond_0

    .line 110
    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;

    invoke-direct {v0}, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;-><init>()V

    sput-object v0, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->instance:Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;

    .line 112
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 114
    :cond_1
    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->instance:Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;

    return-object v0

    .line 112
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private getMaxFdCount()I
    .locals 2

    .prologue
    .line 294
    sget v0, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->manualOverrideMaxFdCount:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 295
    sget v0, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->manualOverrideMaxFdCount:I

    .line 294
    :goto_0
    return v0

    .line 296
    :cond_0
    iget v0, p0, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->sdkBasedMaxFdCount:I

    goto :goto_0
.end method

.method private declared-synchronized isFdSizeBelowHardwareLimit()Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 300
    monitor-enter p0

    :try_start_0
    iget v4, p0, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->decodesSinceLastFdCheck:I

    add-int/lit8 v4, v4, 0x1

    iput v4, p0, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->decodesSinceLastFdCheck:I

    const/16 v5, 0x32

    if-lt v4, v5, :cond_1

    .line 301
    const/4 v4, 0x0

    iput v4, p0, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->decodesSinceLastFdCheck:I

    .line 302
    sget-object v4, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->FD_SIZE_LIST:Ljava/io/File;

    invoke-virtual {v4}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v4

    array-length v0, v4

    .line 303
    .local v0, "currentFds":I
    invoke-direct {p0}, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->getMaxFdCount()I

    move-result v4

    int-to-long v2, v4

    .line 304
    .local v2, "maxFdCount":J
    int-to-long v4, v0

    cmp-long v4, v4, v2

    if-gez v4, :cond_0

    const/4 v1, 0x1

    :cond_0
    iput-boolean v1, p0, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->isFdSizeBelowHardwareLimit:Z

    .line 306
    iget-boolean v1, p0, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->isFdSizeBelowHardwareLimit:Z

    if-nez v1, :cond_1

    const-string v1, "Downsampler"

    const/4 v4, 0x5

    invoke-static {v1, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 307
    const-string v1, "Downsampler"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Excluding HARDWARE bitmap config because we\'re over the file descriptor limit, file descriptors "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ", limit "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 317
    .end local v0    # "currentFds":I
    .end local v2    # "maxFdCount":J
    :cond_1
    iget-boolean v1, p0, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->isFdSizeBelowHardwareLimit:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v1

    .line 300
    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method private static isHardwareConfigAllowedByDeviceModel()Z
    .locals 1

    .prologue
    .line 225
    invoke-static {}, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->isHardwareConfigDisallowedByB112551574()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->isHardwareConfigDisallowedByB147430447()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static isHardwareConfigDisallowedByB112551574()Z
    .locals 6

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 259
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1a

    if-eq v3, v4, :cond_1

    .line 290
    .local v0, "prefixOrModelName":Ljava/lang/String;
    :cond_0
    :goto_0
    return v1

    .line 266
    .end local v0    # "prefixOrModelName":Ljava/lang/String;
    :cond_1
    const/16 v3, 0x11

    new-array v3, v3, [Ljava/lang/String;

    const-string v4, "SC-04J"

    aput-object v4, v3, v1

    const-string v4, "SM-N935"

    aput-object v4, v3, v2

    const/4 v4, 0x2

    const-string v5, "SM-J720"

    aput-object v5, v3, v4

    const/4 v4, 0x3

    const-string v5, "SM-G570F"

    aput-object v5, v3, v4

    const/4 v4, 0x4

    const-string v5, "SM-G570M"

    aput-object v5, v3, v4

    const/4 v4, 0x5

    const-string v5, "SM-G960"

    aput-object v5, v3, v4

    const/4 v4, 0x6

    const-string v5, "SM-G965"

    aput-object v5, v3, v4

    const/4 v4, 0x7

    const-string v5, "SM-G935"

    aput-object v5, v3, v4

    const/16 v4, 0x8

    const-string v5, "SM-G930"

    aput-object v5, v3, v4

    const/16 v4, 0x9

    const-string v5, "SM-A520"

    aput-object v5, v3, v4

    const/16 v4, 0xa

    const-string v5, "SM-A720F"

    aput-object v5, v3, v4

    const/16 v4, 0xb

    const-string v5, "moto e5"

    aput-object v5, v3, v4

    const/16 v4, 0xc

    const-string v5, "moto e5 play"

    aput-object v5, v3, v4

    const/16 v4, 0xd

    const-string v5, "moto e5 plus"

    aput-object v5, v3, v4

    const/16 v4, 0xe

    const-string v5, "moto e5 cruise"

    aput-object v5, v3, v4

    const/16 v4, 0xf

    const-string v5, "moto g(6) forge"

    aput-object v5, v3, v4

    const/16 v4, 0x10

    const-string v5, "moto g(6) play"

    aput-object v5, v3, v4

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .restart local v0    # "prefixOrModelName":Ljava/lang/String;
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "prefixOrModelName":Ljava/lang/String;
    check-cast v0, Ljava/lang/String;

    .line 286
    .restart local v0    # "prefixOrModelName":Ljava/lang/String;
    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v1, v2

    .line 287
    goto :goto_0
.end method

.method private static isHardwareConfigDisallowedByB147430447()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 229
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1b

    if-eq v1, v2, :cond_0

    .line 233
    :goto_0
    return v0

    :cond_0
    const/16 v1, 0x15

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "LG-M250"

    aput-object v2, v1, v0

    const/4 v0, 0x1

    const-string v2, "LG-M320"

    aput-object v2, v1, v0

    const/4 v0, 0x2

    const-string v2, "LG-Q710AL"

    aput-object v2, v1, v0

    const/4 v0, 0x3

    const-string v2, "LG-Q710PL"

    aput-object v2, v1, v0

    const/4 v0, 0x4

    const-string v2, "LGM-K121K"

    aput-object v2, v1, v0

    const/4 v0, 0x5

    const-string v2, "LGM-K121L"

    aput-object v2, v1, v0

    const/4 v0, 0x6

    const-string v2, "LGM-K121S"

    aput-object v2, v1, v0

    const/4 v0, 0x7

    const-string v2, "LGM-X320K"

    aput-object v2, v1, v0

    const/16 v0, 0x8

    const-string v2, "LGM-X320L"

    aput-object v2, v1, v0

    const/16 v0, 0x9

    const-string v2, "LGM-X320S"

    aput-object v2, v1, v0

    const/16 v0, 0xa

    const-string v2, "LGM-X401L"

    aput-object v2, v1, v0

    const/16 v0, 0xb

    const-string v2, "LGM-X401S"

    aput-object v2, v1, v0

    const/16 v0, 0xc

    const-string v2, "LM-Q610.FG"

    aput-object v2, v1, v0

    const/16 v0, 0xd

    const-string v2, "LM-Q610.FGN"

    aput-object v2, v1, v0

    const/16 v0, 0xe

    const-string v2, "LM-Q617.FG"

    aput-object v2, v1, v0

    const/16 v0, 0xf

    const-string v2, "LM-Q617.FGN"

    aput-object v2, v1, v0

    const/16 v0, 0x10

    const-string v2, "LM-Q710.FG"

    aput-object v2, v1, v0

    const/16 v0, 0x11

    const-string v2, "LM-Q710.FGN"

    aput-object v2, v1, v0

    const/16 v0, 0x12

    const-string v2, "LM-X220PM"

    aput-object v2, v1, v0

    const/16 v0, 0x13

    const-string v2, "LM-X220QMA"

    aput-object v2, v1, v0

    const/16 v0, 0x14

    const-string v2, "LM-X410PM"

    aput-object v2, v1, v0

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 255
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    goto/16 :goto_0
.end method


# virtual methods
.method public areHardwareBitmapsBlocked()Z
    .locals 1

    .prologue
    .line 130
    invoke-static {}, Lcom/bumptech/glide/util/Util;->assertMainThread()V

    .line 131
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->isHardwareConfigAllowedByAppState:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public blockHardwareBitmaps()V
    .locals 2

    .prologue
    .line 135
    invoke-static {}, Lcom/bumptech/glide/util/Util;->assertMainThread()V

    .line 136
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->isHardwareConfigAllowedByAppState:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 137
    return-void
.end method

.method public isHardwareConfigAllowed(IIZZ)Z
    .locals 3
    .param p1, "targetWidth"    # I
    .param p2, "targetHeight"    # I
    .param p3, "isHardwareConfigAllowed"    # Z
    .param p4, "isExifOrientationRequired"    # Z

    .prologue
    const/4 v2, 0x2

    const/4 v0, 0x0

    .line 149
    if-nez p3, :cond_1

    .line 150
    const-string v1, "HardwareConfig"

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 151
    const-string v1, "HardwareConfig"

    const-string v2, "Hardware config disallowed by caller"

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 199
    :cond_0
    :goto_0
    return v0

    .line 155
    :cond_1
    iget-boolean v1, p0, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->isHardwareConfigAllowedByDeviceModel:Z

    if-nez v1, :cond_2

    .line 156
    const-string v1, "HardwareConfig"

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 157
    const-string v1, "HardwareConfig"

    const-string v2, "Hardware config disallowed by device model"

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 161
    :cond_2
    sget-boolean v1, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->HARDWARE_BITMAPS_SUPPORTED:Z

    if-nez v1, :cond_3

    .line 162
    const-string v1, "HardwareConfig"

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 163
    const-string v1, "HardwareConfig"

    const-string v2, "Hardware config disallowed by sdk"

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 167
    :cond_3
    invoke-direct {p0}, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->areHardwareBitmapsBlockedByAppState()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 168
    const-string v1, "HardwareConfig"

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 169
    const-string v1, "HardwareConfig"

    const-string v2, "Hardware config disallowed by app state"

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 173
    :cond_4
    if-eqz p4, :cond_5

    .line 174
    const-string v1, "HardwareConfig"

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 175
    const-string v1, "HardwareConfig"

    const-string v2, "Hardware config disallowed because exif orientation is required"

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 179
    :cond_5
    iget v1, p0, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->minHardwareDimension:I

    if-ge p1, v1, :cond_6

    .line 180
    const-string v1, "HardwareConfig"

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 181
    const-string v1, "HardwareConfig"

    const-string v2, "Hardware config disallowed because width is too small"

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 185
    :cond_6
    iget v1, p0, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->minHardwareDimension:I

    if-ge p2, v1, :cond_7

    .line 186
    const-string v1, "HardwareConfig"

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 187
    const-string v1, "HardwareConfig"

    const-string v2, "Hardware config disallowed because height is too small"

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 192
    :cond_7
    invoke-direct {p0}, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->isFdSizeBelowHardwareLimit()Z

    move-result v1

    if-nez v1, :cond_8

    .line 193
    const-string v1, "HardwareConfig"

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 194
    const-string v1, "HardwareConfig"

    const-string v2, "Hardware config disallowed because there are insufficient FDs"

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 199
    :cond_8
    const/4 v0, 0x1

    goto/16 :goto_0
.end method

.method setHardwareConfigIfAllowed(IILandroid/graphics/BitmapFactory$Options;ZZ)Z
    .locals 2
    .param p1, "targetWidth"    # I
    .param p2, "targetHeight"    # I
    .param p3, "optionsWithScaling"    # Landroid/graphics/BitmapFactory$Options;
    .param p4, "isHardwareConfigAllowed"    # Z
    .param p5, "isExifOrientationRequired"    # Z
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1a
    .end annotation

    .prologue
    .line 214
    .line 215
    invoke-virtual {p0, p1, p2, p4, p5}, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->isHardwareConfigAllowed(IIZZ)Z

    move-result v0

    .line 217
    .local v0, "result":Z
    if-eqz v0, :cond_0

    .line 218
    sget-object v1, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    iput-object v1, p3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 219
    const/4 v1, 0x0

    iput-boolean v1, p3, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    .line 221
    :cond_0
    return v0
.end method

.method public unblockHardwareBitmaps()V
    .locals 2

    .prologue
    .line 140
    invoke-static {}, Lcom/bumptech/glide/util/Util;->assertMainThread()V

    .line 141
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/HardwareConfigState;->isHardwareConfigAllowedByAppState:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 142
    return-void
.end method
