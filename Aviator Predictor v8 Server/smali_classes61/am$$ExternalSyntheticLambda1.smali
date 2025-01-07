.class public final synthetic Lam$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/util/function/Consumer;


# annotations
.annotation build Lcom/android/tools/r8/annotations/SynthesizedClassV2;
    kind = 0x12
    versionHash = "79350b666c61fb98f585652cf8eb3be7850d2ab8c16c1e890d0171be2ca2d761"
.end annotation


# instance fields
.field public final synthetic f$0:Lam;


# direct methods
.method public synthetic constructor <init>(Lam;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lam$$ExternalSyntheticLambda1;->f$0:Lam;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lam$$ExternalSyntheticLambda1;->f$0:Lam;

    invoke-static {v0, p1}, Lam;->$r8$lambda$1_6Sge72vH4PPvm3izq4tvI-m-s(Lam;Ljava/lang/Object;)V

    return-void
.end method
