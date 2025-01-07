.class Lcom/google/firebase/firestore/n$b;
.super Lcom/google/firebase/firestore/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/firestore/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/google/firebase/firestore/l;

.field private final b:Li1/q$b;

.field private final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/firebase/firestore/l;Li1/q$b;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/firestore/n;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/firestore/n$b;->a:Lcom/google/firebase/firestore/l;

    iput-object p2, p0, Lcom/google/firebase/firestore/n$b;->b:Li1/q$b;

    iput-object p3, p0, Lcom/google/firebase/firestore/n$b;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public k()Lcom/google/firebase/firestore/l;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/n$b;->a:Lcom/google/firebase/firestore/l;

    return-object v0
.end method

.method public l()Li1/q$b;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/n$b;->b:Li1/q$b;

    return-object v0
.end method

.method public m()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/n$b;->c:Ljava/lang/Object;

    return-object v0
.end method
