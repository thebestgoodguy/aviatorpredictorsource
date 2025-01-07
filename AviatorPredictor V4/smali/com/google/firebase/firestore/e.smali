.class public final synthetic Lcom/google/firebase/firestore/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/firestore/j;


# instance fields
.field public final synthetic a:Lcom/google/firebase/firestore/h;

.field public final synthetic b:Lcom/google/firebase/firestore/j;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/firestore/h;Lcom/google/firebase/firestore/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/firestore/e;->a:Lcom/google/firebase/firestore/h;

    iput-object p2, p0, Lcom/google/firebase/firestore/e;->b:Lcom/google/firebase/firestore/j;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lcom/google/firebase/firestore/u;)V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/firestore/e;->a:Lcom/google/firebase/firestore/h;

    iget-object v1, p0, Lcom/google/firebase/firestore/e;->b:Lcom/google/firebase/firestore/j;

    check-cast p1, Li1/u1;

    invoke-static {v0, v1, p1, p2}, Lcom/google/firebase/firestore/h;->a(Lcom/google/firebase/firestore/h;Lcom/google/firebase/firestore/j;Li1/u1;Lcom/google/firebase/firestore/u;)V

    return-void
.end method
