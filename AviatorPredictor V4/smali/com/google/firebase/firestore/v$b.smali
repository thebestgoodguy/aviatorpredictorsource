.class public final Lcom/google/firebase/firestore/v$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/firestore/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Z

.field private c:Z

.field private d:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "firestore.googleapis.com"

    iput-object v0, p0, Lcom/google/firebase/firestore/v$b;->a:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/firebase/firestore/v$b;->b:Z

    iput-boolean v0, p0, Lcom/google/firebase/firestore/v$b;->c:Z

    const-wide/32 v0, 0x6400000

    iput-wide v0, p0, Lcom/google/firebase/firestore/v$b;->d:J

    return-void
.end method

.method static synthetic a(Lcom/google/firebase/firestore/v$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/firestore/v$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic b(Lcom/google/firebase/firestore/v$b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/firebase/firestore/v$b;->b:Z

    return p0
.end method

.method static synthetic c(Lcom/google/firebase/firestore/v$b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/firebase/firestore/v$b;->c:Z

    return p0
.end method

.method static synthetic d(Lcom/google/firebase/firestore/v$b;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/firebase/firestore/v$b;->d:J

    return-wide v0
.end method


# virtual methods
.method public e()Lcom/google/firebase/firestore/v;
    .locals 2

    iget-boolean v0, p0, Lcom/google/firebase/firestore/v$b;->b:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/firestore/v$b;->a:Ljava/lang/String;

    const-string v1, "firestore.googleapis.com"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You can\'t set the \'sslEnabled\' setting unless you also set a non-default \'host\'."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    new-instance v0, Lcom/google/firebase/firestore/v;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/firebase/firestore/v;-><init>(Lcom/google/firebase/firestore/v$b;Lcom/google/firebase/firestore/v$a;)V

    return-object v0
.end method

.method public f(J)Lcom/google/firebase/firestore/v$b;
    .locals 3

    const-wide/16 v0, -0x1

    cmp-long v2, p1, v0

    if-eqz v2, :cond_1

    const-wide/32 v0, 0x100000

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Cache size must be set to at least 1048576 bytes"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-wide p1, p0, Lcom/google/firebase/firestore/v$b;->d:J

    return-object p0
.end method

.method public g(Ljava/lang/String;)Lcom/google/firebase/firestore/v$b;
    .locals 1

    const-string v0, "Provided host must not be null."

    invoke-static {p1, v0}, Lp1/x;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/google/firebase/firestore/v$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public h(Z)Lcom/google/firebase/firestore/v$b;
    .locals 0

    iput-boolean p1, p0, Lcom/google/firebase/firestore/v$b;->c:Z

    return-object p0
.end method

.method public i(Z)Lcom/google/firebase/firestore/v$b;
    .locals 0

    iput-boolean p1, p0, Lcom/google/firebase/firestore/v$b;->b:Z

    return-object p0
.end method
