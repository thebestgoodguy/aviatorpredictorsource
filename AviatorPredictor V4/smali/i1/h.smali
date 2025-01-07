.class public Li1/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/firestore/j;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/firebase/firestore/j<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Lcom/google/firebase/firestore/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/firebase/firestore/j<",
            "TT;>;"
        }
    .end annotation
.end field

.field private volatile c:Z


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lcom/google/firebase/firestore/j;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lcom/google/firebase/firestore/j<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Li1/h;->c:Z

    iput-object p1, p0, Li1/h;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Li1/h;->b:Lcom/google/firebase/firestore/j;

    return-void
.end method

.method public static synthetic b(Li1/h;Ljava/lang/Object;Lcom/google/firebase/firestore/u;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li1/h;->c(Ljava/lang/Object;Lcom/google/firebase/firestore/u;)V

    return-void
.end method

.method private synthetic c(Ljava/lang/Object;Lcom/google/firebase/firestore/u;)V
    .locals 1

    iget-boolean v0, p0, Li1/h;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Li1/h;->b:Lcom/google/firebase/firestore/j;

    invoke-interface {v0, p1, p2}, Lcom/google/firebase/firestore/j;->a(Ljava/lang/Object;Lcom/google/firebase/firestore/u;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lcom/google/firebase/firestore/u;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/firebase/firestore/u;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Li1/h;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Li1/g;

    invoke-direct {v1, p0, p1, p2}, Li1/g;-><init>(Li1/h;Ljava/lang/Object;Lcom/google/firebase/firestore/u;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public d()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Li1/h;->c:Z

    return-void
.end method
