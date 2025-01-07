.class public final synthetic Li1/v;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Li1/l0;

.field public final synthetic f:Lo0/i;

.field public final synthetic g:Landroid/content/Context;

.field public final synthetic h:Lcom/google/firebase/firestore/v;


# direct methods
.method public synthetic constructor <init>(Li1/l0;Lo0/i;Landroid/content/Context;Lcom/google/firebase/firestore/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/v;->e:Li1/l0;

    iput-object p2, p0, Li1/v;->f:Lo0/i;

    iput-object p3, p0, Li1/v;->g:Landroid/content/Context;

    iput-object p4, p0, Li1/v;->h:Lcom/google/firebase/firestore/v;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Li1/v;->e:Li1/l0;

    iget-object v1, p0, Li1/v;->f:Lo0/i;

    iget-object v2, p0, Li1/v;->g:Landroid/content/Context;

    iget-object v3, p0, Li1/v;->h:Lcom/google/firebase/firestore/v;

    invoke-static {v0, v1, v2, v3}, Li1/l0;->h(Li1/l0;Lo0/i;Landroid/content/Context;Lcom/google/firebase/firestore/v;)V

    return-void
.end method
