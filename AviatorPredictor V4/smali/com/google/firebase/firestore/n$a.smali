.class Lcom/google/firebase/firestore/n$a;
.super Lcom/google/firebase/firestore/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/firestore/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/firebase/firestore/n;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Li1/l$a;


# virtual methods
.method public k()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/firebase/firestore/n;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/firestore/n$a;->a:Ljava/util/List;

    return-object v0
.end method

.method public l()Li1/l$a;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/n$a;->b:Li1/l$a;

    return-object v0
.end method
