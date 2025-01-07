.class public final synthetic Li1/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Li1/h;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Lcom/google/firebase/firestore/u;


# direct methods
.method public synthetic constructor <init>(Li1/h;Ljava/lang/Object;Lcom/google/firebase/firestore/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/g;->e:Li1/h;

    iput-object p2, p0, Li1/g;->f:Ljava/lang/Object;

    iput-object p3, p0, Li1/g;->g:Lcom/google/firebase/firestore/u;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Li1/g;->e:Li1/h;

    iget-object v1, p0, Li1/g;->f:Ljava/lang/Object;

    iget-object v2, p0, Li1/g;->g:Lcom/google/firebase/firestore/u;

    invoke-static {v0, v1, v2}, Li1/h;->b(Li1/h;Ljava/lang/Object;Lcom/google/firebase/firestore/u;)V

    return-void
.end method
