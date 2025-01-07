.class public final Lcom/google/firebase/firestore/d0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/firestore/d0$a;
    }
.end annotation


# static fields
.field static final g:Lcom/google/firebase/firestore/d0;


# instance fields
.field private final a:I

.field private final b:I

.field private final c:J

.field private final d:J

.field private final e:Lcom/google/firebase/firestore/d0$a;

.field private final f:Ljava/lang/Exception;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v9, Lcom/google/firebase/firestore/d0;

    sget-object v8, Lcom/google/firebase/firestore/d0$a;->g:Lcom/google/firebase/firestore/d0$a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/google/firebase/firestore/d0;-><init>(IIJJLjava/lang/Exception;Lcom/google/firebase/firestore/d0$a;)V

    sput-object v9, Lcom/google/firebase/firestore/d0;->g:Lcom/google/firebase/firestore/d0;

    return-void
.end method

.method public constructor <init>(IIJJLjava/lang/Exception;Lcom/google/firebase/firestore/d0$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/firebase/firestore/d0;->a:I

    iput p2, p0, Lcom/google/firebase/firestore/d0;->b:I

    iput-wide p3, p0, Lcom/google/firebase/firestore/d0;->c:J

    iput-wide p5, p0, Lcom/google/firebase/firestore/d0;->d:J

    iput-object p8, p0, Lcom/google/firebase/firestore/d0;->e:Lcom/google/firebase/firestore/d0$a;

    iput-object p7, p0, Lcom/google/firebase/firestore/d0;->f:Ljava/lang/Exception;

    return-void
.end method

.method public static a(Lh1/e;)Lcom/google/firebase/firestore/d0;
    .locals 10

    new-instance v9, Lcom/google/firebase/firestore/d0;

    invoke-virtual {p0}, Lh1/e;->e()I

    move-result v2

    invoke-virtual {p0}, Lh1/e;->d()J

    move-result-wide v5

    sget-object v8, Lcom/google/firebase/firestore/d0$a;->f:Lcom/google/firebase/firestore/d0$a;

    const/4 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v7, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/google/firebase/firestore/d0;-><init>(IIJJLjava/lang/Exception;Lcom/google/firebase/firestore/d0$a;)V

    return-object v9
.end method

.method public static b(Lh1/e;)Lcom/google/firebase/firestore/d0;
    .locals 10

    new-instance v9, Lcom/google/firebase/firestore/d0;

    invoke-virtual {p0}, Lh1/e;->e()I

    move-result v1

    invoke-virtual {p0}, Lh1/e;->e()I

    move-result v2

    invoke-virtual {p0}, Lh1/e;->d()J

    move-result-wide v3

    invoke-virtual {p0}, Lh1/e;->d()J

    move-result-wide v5

    sget-object v8, Lcom/google/firebase/firestore/d0$a;->g:Lcom/google/firebase/firestore/d0$a;

    const/4 v7, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/google/firebase/firestore/d0;-><init>(IIJJLjava/lang/Exception;Lcom/google/firebase/firestore/d0$a;)V

    return-object v9
.end method


# virtual methods
.method public c()J
    .locals 2

    iget-wide v0, p0, Lcom/google/firebase/firestore/d0;->c:J

    return-wide v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/google/firebase/firestore/d0;->a:I

    return v0
.end method

.method public e()Lcom/google/firebase/firestore/d0$a;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/d0;->e:Lcom/google/firebase/firestore/d0$a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_9

    const-class v2, Lcom/google/firebase/firestore/d0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lcom/google/firebase/firestore/d0;

    iget v2, p0, Lcom/google/firebase/firestore/d0;->a:I

    iget v3, p1, Lcom/google/firebase/firestore/d0;->a:I

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget v2, p0, Lcom/google/firebase/firestore/d0;->b:I

    iget v3, p1, Lcom/google/firebase/firestore/d0;->b:I

    if-eq v2, v3, :cond_3

    return v1

    :cond_3
    iget-wide v2, p0, Lcom/google/firebase/firestore/d0;->c:J

    iget-wide v4, p1, Lcom/google/firebase/firestore/d0;->c:J

    cmp-long v6, v2, v4

    if-eqz v6, :cond_4

    return v1

    :cond_4
    iget-wide v2, p0, Lcom/google/firebase/firestore/d0;->d:J

    iget-wide v4, p1, Lcom/google/firebase/firestore/d0;->d:J

    cmp-long v6, v2, v4

    if-eqz v6, :cond_5

    return v1

    :cond_5
    iget-object v2, p0, Lcom/google/firebase/firestore/d0;->e:Lcom/google/firebase/firestore/d0$a;

    iget-object v3, p1, Lcom/google/firebase/firestore/d0;->e:Lcom/google/firebase/firestore/d0$a;

    if-eq v2, v3, :cond_6

    return v1

    :cond_6
    iget-object v2, p0, Lcom/google/firebase/firestore/d0;->f:Ljava/lang/Exception;

    iget-object p1, p1, Lcom/google/firebase/firestore/d0;->f:Ljava/lang/Exception;

    if-eqz v2, :cond_7

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_7
    if-nez p1, :cond_8

    goto :goto_0

    :cond_8
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_9
    :goto_1
    return v1
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, Lcom/google/firebase/firestore/d0;->d:J

    return-wide v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lcom/google/firebase/firestore/d0;->b:I

    return v0
.end method

.method public hashCode()I
    .locals 6

    iget v0, p0, Lcom/google/firebase/firestore/d0;->a:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/google/firebase/firestore/d0;->b:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/google/firebase/firestore/d0;->c:J

    const/16 v3, 0x20

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/google/firebase/firestore/d0;->d:J

    ushr-long v3, v1, v3

    xor-long/2addr v1, v3

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/firebase/firestore/d0;->e:Lcom/google/firebase/firestore/d0$a;

    invoke-virtual {v1}, Ljava/lang/Enum;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/firebase/firestore/d0;->f:Ljava/lang/Exception;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method
