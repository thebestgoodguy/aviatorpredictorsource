.class public Lcom/google/firebase/firestore/l0;
.super Lcom/google/firebase/firestore/i;
.source ""


# direct methods
.method private constructor <init>(Lcom/google/firebase/firestore/FirebaseFirestore;Ll1/l;Ll1/i;ZZ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/google/firebase/firestore/i;-><init>(Lcom/google/firebase/firestore/FirebaseFirestore;Ll1/l;Ll1/i;ZZ)V

    return-void
.end method

.method static h(Lcom/google/firebase/firestore/FirebaseFirestore;Ll1/i;ZZ)Lcom/google/firebase/firestore/l0;
    .locals 7

    new-instance v6, Lcom/google/firebase/firestore/l0;

    invoke-interface {p1}, Ll1/i;->getKey()Ll1/l;

    move-result-object v2

    move-object v0, v6

    move-object v1, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/firebase/firestore/l0;-><init>(Lcom/google/firebase/firestore/FirebaseFirestore;Ll1/l;Ll1/i;ZZ)V

    return-object v6
.end method


# virtual methods
.method public d()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-super {p0}, Lcom/google/firebase/firestore/i;->d()Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v3, "Data in a QueryDocumentSnapshot should be non-null"

    invoke-static {v2, v3, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method

.method public e(Lcom/google/firebase/firestore/i$a;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/firestore/i$a;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "Provided serverTimestampBehavior value must not be null."

    invoke-static {p1, v0}, Lp1/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-super {p0, p1}, Lcom/google/firebase/firestore/i;->e(Lcom/google/firebase/firestore/i$a;)Ljava/util/Map;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-array v0, v0, [Ljava/lang/Object;

    const-string v2, "Data in a QueryDocumentSnapshot should be non-null"

    invoke-static {v1, v2, v0}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    return-object p1
.end method
