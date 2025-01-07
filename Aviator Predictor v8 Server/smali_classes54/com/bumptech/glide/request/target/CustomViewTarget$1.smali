.class Lcom/bumptech/glide/request/target/CustomViewTarget$1;
.super Ljava/lang/Object;
.source "CustomViewTarget.java"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bumptech/glide/request/target/CustomViewTarget;->clearOnDetach()Lcom/bumptech/glide/request/target/CustomViewTarget;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/bumptech/glide/request/target/CustomViewTarget;


# direct methods
.method constructor <init>(Lcom/bumptech/glide/request/target/CustomViewTarget;)V
    .locals 0
    .param p1, "this$0"    # Lcom/bumptech/glide/request/target/CustomViewTarget;

    .prologue
    .line 140
    .local p0, "this":Lcom/bumptech/glide/request/target/CustomViewTarget$1;, "Lcom/bumptech/glide/request/target/CustomViewTarget$1;"
    iput-object p1, p0, Lcom/bumptech/glide/request/target/CustomViewTarget$1;->this$0:Lcom/bumptech/glide/request/target/CustomViewTarget;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 143
    .local p0, "this":Lcom/bumptech/glide/request/target/CustomViewTarget$1;, "Lcom/bumptech/glide/request/target/CustomViewTarget$1;"
    iget-object v0, p0, Lcom/bumptech/glide/request/target/CustomViewTarget$1;->this$0:Lcom/bumptech/glide/request/target/CustomViewTarget;

    invoke-virtual {v0}, Lcom/bumptech/glide/request/target/CustomViewTarget;->resumeMyRequest()V

    .line 144
    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 148
    .local p0, "this":Lcom/bumptech/glide/request/target/CustomViewTarget$1;, "Lcom/bumptech/glide/request/target/CustomViewTarget$1;"
    iget-object v0, p0, Lcom/bumptech/glide/request/target/CustomViewTarget$1;->this$0:Lcom/bumptech/glide/request/target/CustomViewTarget;

    invoke-virtual {v0}, Lcom/bumptech/glide/request/target/CustomViewTarget;->pauseMyRequest()V

    .line 149
    return-void
.end method
