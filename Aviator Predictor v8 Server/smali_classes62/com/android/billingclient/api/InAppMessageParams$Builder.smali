.class public final Lcom/android/billingclient/api/InAppMessageParams$Builder;
.super Ljava/lang/Object;


# annotations
.annotation build Lcom/android/billingclient/api/zzf;
.end annotation


# instance fields
.field private final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/android/billingclient/api/InAppMessageParams$Builder;->a:Ljava/util/Set;

    return-void
.end method
