.class public final synthetic Lak$-CC;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"


# annotations
.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    kind = 0x7
    versionHash = "79350b666c61fb98f585652cf8eb3be7850d2ab8c16c1e890d0171be2ca2d761"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public static synthetic $default$values(Lak;)Ljava/util/Collection;
    .locals 1
    .param p0, "_this"    # Lak;

    .line 0
    invoke-interface {p0}, Lak;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
