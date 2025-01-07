.class public final synthetic Li1/w;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Li1/l0;

.field public final synthetic b:Lcom/google/firebase/firestore/u0;

.field public final synthetic c:Lp1/t;


# direct methods
.method public synthetic constructor <init>(Li1/l0;Lcom/google/firebase/firestore/u0;Lp1/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/w;->a:Li1/l0;

    iput-object p2, p0, Li1/w;->b:Lcom/google/firebase/firestore/u0;

    iput-object p3, p0, Li1/w;->c:Lp1/t;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Li1/w;->a:Li1/l0;

    iget-object v1, p0, Li1/w;->b:Lcom/google/firebase/firestore/u0;

    iget-object v2, p0, Li1/w;->c:Lp1/t;

    invoke-static {v0, v1, v2}, Li1/l0;->k(Li1/l0;Lcom/google/firebase/firestore/u0;Lp1/t;)Lo0/h;

    move-result-object v0

    return-object v0
.end method
