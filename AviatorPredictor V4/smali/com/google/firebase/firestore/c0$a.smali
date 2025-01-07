.class Lcom/google/firebase/firestore/c0$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/firestore/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field a:Ljava/util/concurrent/Executor;

.field b:Lcom/google/firebase/firestore/f0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/firebase/firestore/f0<",
            "Lcom/google/firebase/firestore/d0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/concurrent/Executor;Lcom/google/firebase/firestore/f0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lcom/google/firebase/firestore/f0<",
            "Lcom/google/firebase/firestore/d0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lo0/j;->a:Ljava/util/concurrent/Executor;

    :goto_0
    iput-object p1, p0, Lcom/google/firebase/firestore/c0$a;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/google/firebase/firestore/c0$a;->b:Lcom/google/firebase/firestore/f0;

    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/firestore/c0$a;Lcom/google/firebase/firestore/d0;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/c0$a;->c(Lcom/google/firebase/firestore/d0;)V

    return-void
.end method

.method private synthetic c(Lcom/google/firebase/firestore/d0;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/c0$a;->b:Lcom/google/firebase/firestore/f0;

    invoke-interface {v0, p1}, Lcom/google/firebase/firestore/f0;->a(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public b(Lcom/google/firebase/firestore/d0;)V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/firestore/c0$a;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/google/firebase/firestore/b0;

    invoke-direct {v1, p0, p1}, Lcom/google/firebase/firestore/b0;-><init>(Lcom/google/firebase/firestore/c0$a;Lcom/google/firebase/firestore/d0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/google/firebase/firestore/c0$a;

    iget-object v0, p0, Lcom/google/firebase/firestore/c0$a;->b:Lcom/google/firebase/firestore/f0;

    iget-object p1, p1, Lcom/google/firebase/firestore/c0$a;->b:Lcom/google/firebase/firestore/f0;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/c0$a;->b:Lcom/google/firebase/firestore/f0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
