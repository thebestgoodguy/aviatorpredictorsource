.class Lcom/bumptech/glide/request/target/ViewTarget$1;
.super Ljava/lang/Object;
.source "ViewTarget.java"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bumptech/glide/request/target/ViewTarget;->clearOnDetach()Lcom/bumptech/glide/request/target/ViewTarget;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/bumptech/glide/request/target/ViewTarget;


# direct methods
.method constructor <init>(Lcom/bumptech/glide/request/target/ViewTarget;)V
    .locals 0
    .param p1, "this$0"    # Lcom/bumptech/glide/request/target/ViewTarget;

    .prologue
    .line 112
    .local p0, "this":Lcom/bumptech/glide/request/target/ViewTarget$1;, "Lcom/bumptech/glide/request/target/ViewTarget$1;"
    iput-object p1, p0, Lcom/bumptech/glide/request/target/ViewTarget$1;->this$0:Lcom/bumptech/glide/request/target/ViewTarget;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 115
    .local p0, "this":Lcom/bumptech/glide/request/target/ViewTarget$1;, "Lcom/bumptech/glide/request/target/ViewTarget$1;"
    iget-object v0, p0, Lcom/bumptech/glide/request/target/ViewTarget$1;->this$0:Lcom/bumptech/glide/request/target/ViewTarget;

    invoke-virtual {v0}, Lcom/bumptech/glide/request/target/ViewTarget;->resumeMyRequest()V

    .line 116
    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 120
    .local p0, "this":Lcom/bumptech/glide/request/target/ViewTarget$1;, "Lcom/bumptech/glide/request/target/ViewTarget$1;"
    iget-object v0, p0, Lcom/bumptech/glide/request/target/ViewTarget$1;->this$0:Lcom/bumptech/glide/request/target/ViewTarget;

    invoke-virtual {v0}, Lcom/bumptech/glide/request/target/ViewTarget;->pauseMyRequest()V

    .line 121
    return-void
.end method
