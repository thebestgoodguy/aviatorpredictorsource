.class Lcom/bumptech/glide/request/RequestFutureTarget$Waiter;
.super Ljava/lang/Object;
.source "RequestFutureTarget.java"


# annotations
.annotation build Landroidx/annotation/VisibleForTesting;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bumptech/glide/request/RequestFutureTarget;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Waiter"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 262
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method notifyAll(Ljava/lang/Object;)V
    .locals 0
    .param p1, "toNotify"    # Ljava/lang/Object;

    .prologue
    .line 271
    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 272
    return-void
.end method

.method waitForTimeout(Ljava/lang/Object;J)V
    .locals 0
    .param p1, "toWaitOn"    # Ljava/lang/Object;
    .param p2, "timeoutMillis"    # J
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .prologue
    .line 267
    invoke-virtual {p1, p2, p3}, Ljava/lang/Object;->wait(J)V

    .line 268
    return-void
.end method
