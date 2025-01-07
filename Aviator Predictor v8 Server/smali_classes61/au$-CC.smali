.class public final synthetic Lau$-CC;
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
.method public static synthetic $default$submit(Lau;Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    .locals 0
    .param p0, "_this"    # Lau;

    .line 0
    invoke-interface {p0, p1}, Lau;->a(Ljava/lang/Runnable;)Las;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic $default$submit(Lau;Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;
    .locals 0
    .param p0, "_this"    # Lau;

    .line 0
    invoke-interface {p0, p1, p2}, Lau;->a(Ljava/lang/Runnable;Ljava/lang/Object;)Las;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic $default$submit(Lau;Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    .locals 0
    .param p0, "_this"    # Lau;

    .line 0
    invoke-interface {p0, p1}, Lau;->a(Ljava/util/concurrent/Callable;)Las;

    move-result-object p1

    return-object p1
.end method
