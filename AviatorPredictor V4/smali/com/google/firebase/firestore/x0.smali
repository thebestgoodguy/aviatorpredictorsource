.class public Lcom/google/firebase/firestore/x0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lcom/google/firebase/firestore/FirebaseFirestore;

.field private final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lm1/f;",
            ">;"
        }
    .end annotation
.end field

.field private c:Z


# direct methods
.method constructor <init>(Lcom/google/firebase/firestore/FirebaseFirestore;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/firestore/x0;->b:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/firebase/firestore/x0;->c:Z

    invoke-static {p1}, Lp1/x;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/firestore/FirebaseFirestore;

    iput-object p1, p0, Lcom/google/firebase/firestore/x0;->a:Lcom/google/firebase/firestore/FirebaseFirestore;

    return-void
.end method

.method private e(Lcom/google/firebase/firestore/h;Li1/p1;)Lcom/google/firebase/firestore/x0;
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/firestore/x0;->a:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v0, p1}, Lcom/google/firebase/firestore/FirebaseFirestore;->M(Lcom/google/firebase/firestore/h;)V

    invoke-direct {p0}, Lcom/google/firebase/firestore/x0;->g()V

    iget-object v0, p0, Lcom/google/firebase/firestore/x0;->b:Ljava/util/ArrayList;

    invoke-virtual {p1}, Lcom/google/firebase/firestore/h;->l()Ll1/l;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {v1}, Lm1/m;->a(Z)Lm1/m;

    move-result-object v1

    invoke-virtual {p2, p1, v1}, Li1/p1;->a(Ll1/l;Lm1/m;)Lm1/f;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method private g()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/firebase/firestore/x0;->c:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "A write batch can no longer be used after commit() has been called."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public a()Lo0/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/firebase/firestore/x0;->g()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/firebase/firestore/x0;->c:Z

    iget-object v0, p0, Lcom/google/firebase/firestore/x0;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/firestore/x0;->a:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->s()Li1/l0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/firestore/x0;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Li1/l0;->c0(Ljava/util/List;)Lo0/h;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Lo0/k;->d(Ljava/lang/Object;)Lo0/h;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/firebase/firestore/h;)Lcom/google/firebase/firestore/x0;
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/firestore/x0;->a:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v0, p1}, Lcom/google/firebase/firestore/FirebaseFirestore;->M(Lcom/google/firebase/firestore/h;)V

    invoke-direct {p0}, Lcom/google/firebase/firestore/x0;->g()V

    iget-object v0, p0, Lcom/google/firebase/firestore/x0;->b:Ljava/util/ArrayList;

    new-instance v1, Lm1/c;

    invoke-virtual {p1}, Lcom/google/firebase/firestore/h;->l()Ll1/l;

    move-result-object p1

    sget-object v2, Lm1/m;->c:Lm1/m;

    invoke-direct {v1, p1, v2}, Lm1/c;-><init>(Ll1/l;Lm1/m;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public c(Lcom/google/firebase/firestore/h;Ljava/lang/Object;)Lcom/google/firebase/firestore/x0;
    .locals 1

    sget-object v0, Lcom/google/firebase/firestore/o0;->c:Lcom/google/firebase/firestore/o0;

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/firebase/firestore/x0;->d(Lcom/google/firebase/firestore/h;Ljava/lang/Object;Lcom/google/firebase/firestore/o0;)Lcom/google/firebase/firestore/x0;

    move-result-object p1

    return-object p1
.end method

.method public d(Lcom/google/firebase/firestore/h;Ljava/lang/Object;Lcom/google/firebase/firestore/o0;)Lcom/google/firebase/firestore/x0;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/x0;->a:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v0, p1}, Lcom/google/firebase/firestore/FirebaseFirestore;->M(Lcom/google/firebase/firestore/h;)V

    const-string v0, "Provided data must not be null."

    invoke-static {p2, v0}, Lp1/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Provided options must not be null."

    invoke-static {p3, v0}, Lp1/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lcom/google/firebase/firestore/x0;->g()V

    invoke-virtual {p3}, Lcom/google/firebase/firestore/o0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/firestore/x0;->a:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->x()Lcom/google/firebase/firestore/v0;

    move-result-object v0

    invoke-virtual {p3}, Lcom/google/firebase/firestore/o0;->a()Lm1/d;

    move-result-object p3

    invoke-virtual {v0, p2, p3}, Lcom/google/firebase/firestore/v0;->g(Ljava/lang/Object;Lm1/d;)Li1/o1;

    move-result-object p2

    goto :goto_0

    :cond_0
    iget-object p3, p0, Lcom/google/firebase/firestore/x0;->a:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {p3}, Lcom/google/firebase/firestore/FirebaseFirestore;->x()Lcom/google/firebase/firestore/v0;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/google/firebase/firestore/v0;->l(Ljava/lang/Object;)Li1/o1;

    move-result-object p2

    :goto_0
    iget-object p3, p0, Lcom/google/firebase/firestore/x0;->b:Ljava/util/ArrayList;

    invoke-virtual {p1}, Lcom/google/firebase/firestore/h;->l()Ll1/l;

    move-result-object p1

    sget-object v0, Lm1/m;->c:Lm1/m;

    invoke-virtual {p2, p1, v0}, Li1/o1;->a(Ll1/l;Lm1/m;)Lm1/f;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public f(Lcom/google/firebase/firestore/h;Ljava/util/Map;)Lcom/google/firebase/firestore/x0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/firestore/h;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/firebase/firestore/x0;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/firestore/x0;->a:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->x()Lcom/google/firebase/firestore/v0;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/firebase/firestore/v0;->n(Ljava/util/Map;)Li1/p1;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/firestore/x0;->e(Lcom/google/firebase/firestore/h;Li1/p1;)Lcom/google/firebase/firestore/x0;

    move-result-object p1

    return-object p1
.end method
