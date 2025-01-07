.class public final synthetic Lcom/google/firebase/firestore/b0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lcom/google/firebase/firestore/c0$a;

.field public final synthetic f:Lcom/google/firebase/firestore/d0;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/firestore/c0$a;Lcom/google/firebase/firestore/d0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/firestore/b0;->e:Lcom/google/firebase/firestore/c0$a;

    iput-object p2, p0, Lcom/google/firebase/firestore/b0;->f:Lcom/google/firebase/firestore/d0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/firestore/b0;->e:Lcom/google/firebase/firestore/c0$a;

    iget-object v1, p0, Lcom/google/firebase/firestore/b0;->f:Lcom/google/firebase/firestore/d0;

    invoke-static {v0, v1}, Lcom/google/firebase/firestore/c0$a;->a(Lcom/google/firebase/firestore/c0$a;Lcom/google/firebase/firestore/d0;)V

    return-void
.end method
