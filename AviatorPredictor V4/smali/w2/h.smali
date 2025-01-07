.class public Lw2/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lr2/c$d;


# instance fields
.field a:Lcom/google/firebase/firestore/a0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic c(Lw2/h;Lr2/c$b;Lcom/google/firebase/firestore/m0;Lcom/google/firebase/firestore/u;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lw2/h;->d(Lr2/c$b;Lcom/google/firebase/firestore/m0;Lcom/google/firebase/firestore/u;)V

    return-void
.end method

.method private synthetic d(Lr2/c$b;Lcom/google/firebase/firestore/m0;Lcom/google/firebase/firestore/u;)V
    .locals 1

    if-eqz p3, :cond_0

    invoke-static {p3}, Lx2/a;->a(Ljava/lang/Exception;)Ljava/util/Map;

    move-result-object p2

    invoke-virtual {p3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p3

    const-string v0, "firebase_firestore"

    invoke-interface {p1, v0, p3, p2}, Lr2/c$b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p1}, Lr2/c$b;->c()V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lw2/h;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, p2}, Lr2/c$b;->a(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 0

    iget-object p1, p0, Lw2/h;->a:Lcom/google/firebase/firestore/a0;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/google/firebase/firestore/a0;->remove()V

    const/4 p1, 0x0

    iput-object p1, p0, Lw2/h;->a:Lcom/google/firebase/firestore/a0;

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/Object;Lr2/c$b;)V
    .locals 2

    check-cast p1, Ljava/util/Map;

    const-string v0, "includeMetadataChanges"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/firebase/firestore/e0;->f:Lcom/google/firebase/firestore/e0;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/google/firebase/firestore/e0;->e:Lcom/google/firebase/firestore/e0;

    :goto_0
    const-string v1, "query"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/firestore/k0;

    if-eqz p1, :cond_1

    new-instance v1, Lw2/g;

    invoke-direct {v1, p0, p2}, Lw2/g;-><init>(Lw2/h;Lr2/c$b;)V

    invoke-virtual {p1, v0, v1}, Lcom/google/firebase/firestore/k0;->d(Lcom/google/firebase/firestore/e0;Lcom/google/firebase/firestore/j;)Lcom/google/firebase/firestore/a0;

    move-result-object p1

    iput-object p1, p0, Lw2/h;->a:Lcom/google/firebase/firestore/a0;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "An error occurred while parsing query arguments, see native logs for more information. Please report this issue."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
