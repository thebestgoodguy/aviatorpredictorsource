.class public Lw2/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lr2/c$d;


# instance fields
.field private a:Lr2/c$b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic c(Lr2/c$b;Lcom/google/firebase/firestore/d0;)V
    .locals 0

    invoke-static {p0, p1}, Lw2/e;->e(Lr2/c$b;Lcom/google/firebase/firestore/d0;)V

    return-void
.end method

.method public static synthetic d(Lw2/e;Lr2/c$b;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lw2/e;->f(Lr2/c$b;Ljava/lang/Exception;)V

    return-void
.end method

.method private static synthetic e(Lr2/c$b;Lcom/google/firebase/firestore/d0;)V
    .locals 0

    invoke-interface {p0, p1}, Lr2/c$b;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic f(Lr2/c$b;Ljava/lang/Exception;)V
    .locals 2

    invoke-static {p2}, Lx2/a;->a(Ljava/lang/Exception;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p2

    const-string v1, "firebase_firestore"

    invoke-interface {p1, v1, p2, v0}, Lr2/c$b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lw2/e;->a(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 0

    iget-object p1, p0, Lw2/e;->a:Lr2/c$b;

    invoke-interface {p1}, Lr2/c$b;->c()V

    return-void
.end method

.method public b(Ljava/lang/Object;Lr2/c$b;)V
    .locals 2

    iput-object p2, p0, Lw2/e;->a:Lr2/c$b;

    check-cast p1, Ljava/util/Map;

    const-string v0, "bundle"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, [B

    const-string v1, "firestore"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {p1, v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->F([B)Lcom/google/firebase/firestore/c0;

    move-result-object p1

    new-instance v0, Lw2/c;

    invoke-direct {v0, p2}, Lw2/c;-><init>(Lr2/c$b;)V

    invoke-virtual {p1, v0}, Lcom/google/firebase/firestore/c0;->q(Lcom/google/firebase/firestore/f0;)Lcom/google/firebase/firestore/c0;

    new-instance v0, Lw2/d;

    invoke-direct {v0, p0, p2}, Lw2/d;-><init>(Lw2/e;Lr2/c$b;)V

    invoke-virtual {p1, v0}, Lcom/google/firebase/firestore/c0;->e(Lo0/e;)Lo0/h;

    return-void
.end method
