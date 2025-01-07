.class Lcom/google/firebase/firestore/m0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/firestore/m0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Lcom/google/firebase/firestore/l0;",
        ">;"
    }
.end annotation


# instance fields
.field private final e:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "Ll1/i;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic f:Lcom/google/firebase/firestore/m0;


# direct methods
.method constructor <init>(Lcom/google/firebase/firestore/m0;Ljava/util/Iterator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Iterator<",
            "Ll1/i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/firebase/firestore/m0$a;->f:Lcom/google/firebase/firestore/m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/firebase/firestore/m0$a;->e:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public c()Lcom/google/firebase/firestore/l0;
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/firestore/m0$a;->f:Lcom/google/firebase/firestore/m0;

    iget-object v1, p0, Lcom/google/firebase/firestore/m0$a;->e:Ljava/util/Iterator;

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll1/i;

    invoke-static {v0, v1}, Lcom/google/firebase/firestore/m0;->i(Lcom/google/firebase/firestore/m0;Ll1/i;)Lcom/google/firebase/firestore/l0;

    move-result-object v0

    return-object v0
.end method

.method public hasNext()Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/m0$a;->e:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/firestore/m0$a;->c()Lcom/google/firebase/firestore/l0;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "QuerySnapshot does not support remove()."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
