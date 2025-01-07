.class final Lcom/bumptech/glide/load/engine/executor/RuntimeCompat;
.super Ljava/lang/Object;
.source "RuntimeCompat.java"


# static fields
.field private static final CPU_LOCATION:Ljava/lang/String; = "/sys/devices/system/cpu/"

.field private static final CPU_NAME_REGEX:Ljava/lang/String; = "cpu[0-9]+"

.field private static final TAG:Ljava/lang/String; = "GlideRuntimeCompat"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    return-void
.end method

.method static availableProcessors()I
    .locals 3

    .prologue
    .line 23
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    .line 24
    .local v0, "cpus":I
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x11

    if-ge v1, v2, :cond_0

    .line 25
    invoke-static {}, Lcom/bumptech/glide/load/engine/executor/RuntimeCompat;->getCoreCountPre17()I

    move-result v1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 27
    :cond_0
    return v0
.end method

.method private static getCoreCountPre17()I
    .locals 7

    .prologue
    .line 44
    const/4 v2, 0x0

    .line 45
    .local v2, "cpus":[Ljava/io/File;
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskReads()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v3

    .line 47
    .local v3, "originalPolicy":Landroid/os/StrictMode$ThreadPolicy;
    :try_start_0
    new-instance v0, Ljava/io/File;

    const-string v5, "/sys/devices/system/cpu/"

    invoke-direct {v0, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 48
    .local v0, "cpuInfo":Ljava/io/File;
    const-string v5, "cpu[0-9]+"

    invoke-static {v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    .line 49
    .local v1, "cpuNamePattern":Ljava/util/regex/Pattern;
    new-instance v5, Lcom/bumptech/glide/load/engine/executor/RuntimeCompat$1;

    invoke-direct {v5, v1}, Lcom/bumptech/glide/load/engine/executor/RuntimeCompat$1;-><init>(Ljava/util/regex/Pattern;)V

    .line 50
    invoke-virtual {v0, v5}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 62
    invoke-static {v3}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 64
    .end local v0    # "cpuInfo":Ljava/io/File;
    .end local v1    # "cpuNamePattern":Ljava/util/regex/Pattern;
    :goto_0
    const/4 v6, 0x1

    if-eqz v2, :cond_1

    array-length v5, v2

    :goto_1
    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    return v5

    .line 57
    :catch_0
    move-exception v4

    .line 58
    .local v4, "t":Ljava/lang/Throwable;
    :try_start_1
    const-string v5, "GlideRuntimeCompat"

    const/4 v6, 0x6

    invoke-static {v5, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 59
    const-string v5, "GlideRuntimeCompat"

    const-string v6, "Failed to calculate accurate cpu count"

    invoke-static {v5, v6, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    :cond_0
    invoke-static {v3}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    goto :goto_0

    .end local v4    # "t":Ljava/lang/Throwable;
    :catchall_0
    move-exception v5

    invoke-static {v3}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    throw v5

    .line 64
    :cond_1
    const/4 v5, 0x0

    goto :goto_1
.end method
