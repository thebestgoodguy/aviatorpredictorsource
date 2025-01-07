.class public final synthetic Lav$-CC;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"


# annotations
.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    kind = 0x7
    versionHash = "79350b666c61fb98f585652cf8eb3be7850d2ab8c16c1e890d0171be2ca2d761"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public static synthetic $default$schedule(Lav;Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0
    .param p0, "_this"    # Lav;

    .line 0
    invoke-interface {p0, p1, p2, p3, p4}, Lav;->a(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lat;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic $default$schedule(Lav;Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0
    .param p0, "_this"    # Lav;

    .line 0
    invoke-interface {p0, p1, p2, p3, p4}, Lav;->a(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Lat;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic $default$scheduleAtFixedRate(Lav;Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0
    .param p0, "_this"    # Lav;

    .line 0
    invoke-interface/range {p0 .. p6}, Lav;->a(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lat;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic $default$scheduleWithFixedDelay(Lav;Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0
    .param p0, "_this"    # Lav;

    .line 0
    invoke-interface/range {p0 .. p6}, Lav;->b(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lat;

    move-result-object p1

    return-object p1
.end method
