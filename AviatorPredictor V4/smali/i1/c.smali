.class public final synthetic Li1/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lcom/google/firebase/firestore/a0;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/firestore/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/c;->e:Lcom/google/firebase/firestore/a0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Li1/c;->e:Lcom/google/firebase/firestore/a0;

    invoke-interface {v0}, Lcom/google/firebase/firestore/a0;->remove()V

    return-void
.end method
