.class public final Lcom/google/firebase/firestore/u0$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/firestore/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x5

    iput v0, p0, Lcom/google/firebase/firestore/u0$b;->a:I

    return-void
.end method


# virtual methods
.method public a()Lcom/google/firebase/firestore/u0;
    .locals 3

    new-instance v0, Lcom/google/firebase/firestore/u0;

    iget v1, p0, Lcom/google/firebase/firestore/u0$b;->a:I

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/firebase/firestore/u0;-><init>(ILcom/google/firebase/firestore/u0$a;)V

    return-object v0
.end method

.method public b(I)Lcom/google/firebase/firestore/u0$b;
    .locals 1

    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    iput p1, p0, Lcom/google/firebase/firestore/u0$b;->a:I

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Max attempts must be at least 1"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
