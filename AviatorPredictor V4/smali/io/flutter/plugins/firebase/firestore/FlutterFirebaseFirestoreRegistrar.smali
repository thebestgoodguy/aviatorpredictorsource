.class public Lio/flutter/plugins/firebase/firestore/FlutterFirebaseFirestoreRegistrar;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb1/i;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lb1/d<",
            "*>;>;"
        }
    .end annotation

    const-string v0, "flutter-fire-fst"

    const-string v1, "3.4.5"

    invoke-static {v0, v1}, Lu1/h;->b(Ljava/lang/String;Ljava/lang/String;)Lb1/d;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
