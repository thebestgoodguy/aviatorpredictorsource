.class public final synthetic Li1/h0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Li1/l0;

.field public final synthetic f:Lh1/f;

.field public final synthetic g:Lcom/google/firebase/firestore/c0;


# direct methods
.method public synthetic constructor <init>(Li1/l0;Lh1/f;Lcom/google/firebase/firestore/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/h0;->e:Li1/l0;

    iput-object p2, p0, Li1/h0;->f:Lh1/f;

    iput-object p3, p0, Li1/h0;->g:Lcom/google/firebase/firestore/c0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Li1/h0;->e:Li1/l0;

    iget-object v1, p0, Li1/h0;->f:Lh1/f;

    iget-object v2, p0, Li1/h0;->g:Lcom/google/firebase/firestore/c0;

    invoke-static {v0, v1, v2}, Li1/l0;->j(Li1/l0;Lh1/f;Lcom/google/firebase/firestore/c0;)V

    return-void
.end method
