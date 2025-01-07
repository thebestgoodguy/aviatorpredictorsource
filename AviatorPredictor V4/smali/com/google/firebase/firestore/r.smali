.class public final synthetic Lcom/google/firebase/firestore/r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/google/firebase/firestore/FirebaseFirestore;

.field public final synthetic b:Lcom/google/firebase/firestore/t0$a;

.field public final synthetic c:Li1/g1;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/google/firebase/firestore/t0$a;Li1/g1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/firestore/r;->a:Lcom/google/firebase/firestore/FirebaseFirestore;

    iput-object p2, p0, Lcom/google/firebase/firestore/r;->b:Lcom/google/firebase/firestore/t0$a;

    iput-object p3, p0, Lcom/google/firebase/firestore/r;->c:Li1/g1;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/firestore/r;->a:Lcom/google/firebase/firestore/FirebaseFirestore;

    iget-object v1, p0, Lcom/google/firebase/firestore/r;->b:Lcom/google/firebase/firestore/t0$a;

    iget-object v2, p0, Lcom/google/firebase/firestore/r;->c:Li1/g1;

    invoke-static {v0, v1, v2}, Lcom/google/firebase/firestore/FirebaseFirestore;->f(Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/google/firebase/firestore/t0$a;Li1/g1;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
