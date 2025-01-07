.class public final synthetic Lap$-CC;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"


# annotations
.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    kind = 0x7
    versionHash = "79350b666c61fb98f585652cf8eb3be7850d2ab8c16c1e890d0171be2ca2d761"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public static $default$forEach(Lap;Ljava/util/function/Consumer;)V
    .locals 2
    .param p0, "_this"    # Lap;

    .line 0
    invoke-static {p1}, Lai;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0}, Lap;->a()Ljava/util/Set;

    move-result-object v0

    new-instance v1, Lap$$ExternalSyntheticLambda0;

    invoke-direct {v1, p1}, Lap$$ExternalSyntheticLambda0;-><init>(Ljava/util/function/Consumer;)V

    invoke-interface {v0, v1}, Ljava/util/Set;->forEach(Ljava/util/function/Consumer;)V

    return-void
.end method

.method public static $default$spliterator(Lap;)Ljava/util/Spliterator;
    .locals 1
    .param p0, "_this"    # Lap;

    .line 0
    invoke-static {p0}, Lar;->a(Lap;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a(Ljava/util/function/Consumer;Laq;)V
    .locals 2

    .line 0
    invoke-interface {p1}, Laq;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Laq;->b()I

    move-result p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    invoke-interface {p0, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
