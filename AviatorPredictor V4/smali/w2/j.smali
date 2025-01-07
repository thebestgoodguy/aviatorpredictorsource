.class public Lw2/j;
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

.method public static synthetic c(Lr2/c$b;)V
    .locals 0

    invoke-static {p0}, Lw2/j;->d(Lr2/c$b;)V

    return-void
.end method

.method private static synthetic d(Lr2/c$b;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lr2/c$b;->a(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 0

    iget-object p1, p0, Lw2/j;->a:Lcom/google/firebase/firestore/a0;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/google/firebase/firestore/a0;->remove()V

    const/4 p1, 0x0

    iput-object p1, p0, Lw2/j;->a:Lcom/google/firebase/firestore/a0;

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/Object;Lr2/c$b;)V
    .locals 1

    check-cast p1, Ljava/util/Map;

    const-string v0, "firestore"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Lcom/google/firebase/firestore/FirebaseFirestore;

    new-instance v0, Lw2/i;

    invoke-direct {v0, p2}, Lw2/i;-><init>(Lr2/c$b;)V

    invoke-virtual {p1, v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->g(Ljava/lang/Runnable;)Lcom/google/firebase/firestore/a0;

    move-result-object p1

    iput-object p1, p0, Lw2/j;->a:Lcom/google/firebase/firestore/a0;

    return-void
.end method
