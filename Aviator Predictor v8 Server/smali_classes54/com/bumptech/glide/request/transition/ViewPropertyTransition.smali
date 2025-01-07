.class public Lcom/bumptech/glide/request/transition/ViewPropertyTransition;
.super Ljava/lang/Object;
.source "ViewPropertyTransition.java"

# interfaces
.implements Lcom/bumptech/glide/request/transition/Transition;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/request/transition/ViewPropertyTransition$Animator;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/request/transition/Transition",
        "<TR;>;"
    }
.end annotation


# instance fields
.field private final animator:Lcom/bumptech/glide/request/transition/ViewPropertyTransition$Animator;


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/request/transition/ViewPropertyTransition$Animator;)V
    .locals 0
    .param p1, "animator"    # Lcom/bumptech/glide/request/transition/ViewPropertyTransition$Animator;

    .prologue
    .line 24
    .local p0, "this":Lcom/bumptech/glide/request/transition/ViewPropertyTransition;, "Lcom/bumptech/glide/request/transition/ViewPropertyTransition<TR;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/bumptech/glide/request/transition/ViewPropertyTransition;->animator:Lcom/bumptech/glide/request/transition/ViewPropertyTransition$Animator;

    .line 26
    return-void
.end method


# virtual methods
.method public transition(Ljava/lang/Object;Lcom/bumptech/glide/request/transition/Transition$ViewAdapter;)Z
    .locals 3
    .param p2, "adapter"    # Lcom/bumptech/glide/request/transition/Transition$ViewAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;",
            "Lcom/bumptech/glide/request/transition/Transition$ViewAdapter;",
            ")Z"
        }
    .end annotation

    .prologue
    .line 39
    .local p0, "this":Lcom/bumptech/glide/request/transition/ViewPropertyTransition;, "Lcom/bumptech/glide/request/transition/ViewPropertyTransition<TR;>;"
    .local p1, "current":Ljava/lang/Object;, "TR;"
    invoke-interface {p2}, Lcom/bumptech/glide/request/transition/Transition$ViewAdapter;->getView()Landroid/view/View;

    move-result-object v0

    .line 40
    .local v0, "view":Landroid/view/View;
    if-eqz v0, :cond_0

    .line 41
    iget-object v1, p0, Lcom/bumptech/glide/request/transition/ViewPropertyTransition;->animator:Lcom/bumptech/glide/request/transition/ViewPropertyTransition$Animator;

    invoke-interface {p2}, Lcom/bumptech/glide/request/transition/Transition$ViewAdapter;->getView()Landroid/view/View;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/bumptech/glide/request/transition/ViewPropertyTransition$Animator;->animate(Landroid/view/View;)V

    .line 43
    :cond_0
    const/4 v1, 0x0

    return v1
.end method
