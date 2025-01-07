.class public final synthetic Laj$-CC;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"


# annotations
.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    kind = 0x7
    versionHash = "79350b666c61fb98f585652cf8eb3be7850d2ab8c16c1e890d0171be2ca2d761"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public static $default$test(Laj;Ljava/lang/Object;)Z
    .locals 0
    .param p0, "_this"    # Laj;

    .line 0
    invoke-interface {p0, p1}, Laj;->a(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
