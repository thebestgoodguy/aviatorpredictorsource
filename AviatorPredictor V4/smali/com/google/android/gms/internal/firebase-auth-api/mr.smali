.class final Lcom/google/android/gms/internal/firebase-auth-api/mr;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/p0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

.field private b:I

.field private c:I

.field private d:I


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/lr;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    const-string v0, "input"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/f;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    iput-object p0, p1, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c:Lcom/google/android/gms/internal/firebase-auth-api/mr;

    return-void
.end method

.method private final O(Lcom/google/android/gms/internal/firebase-auth-api/q0;Lcom/google/android/gms/internal/firebase-auth-api/yr;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->c:I

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    ushr-int/lit8 v1, v1, 0x3

    shl-int/lit8 v1, v1, 0x3

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->c:I

    :try_start_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/firebase-auth-api/q0;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1, p0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/q0;->j(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/p0;Lcom/google/android/gms/internal/firebase-auth-api/yr;)V

    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/q0;->b(Ljava/lang/Object;)V

    iget p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    iget p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, p2, :cond_0

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->c:I

    return-object v1

    :cond_0
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->g()Lcom/google/android/gms/internal/firebase-auth-api/h;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->c:I

    throw p1
.end method

.method private final P(Lcom/google/android/gms/internal/firebase-auth-api/q0;Lcom/google/android/gms/internal/firebase-auth-api/yr;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    iget v2, v1, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a:I

    iget v3, v1, Lcom/google/android/gms/internal/firebase-auth-api/lr;->b:I

    if-ge v2, v3, :cond_0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->b(I)I

    move-result v0

    invoke-interface {p1}, Lcom/google/android/gms/internal/firebase-auth-api/q0;->d()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    iget v3, v2, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v2, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a:I

    invoke-interface {p1, v1, p0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/q0;->j(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/p0;Lcom/google/android/gms/internal/firebase-auth-api/yr;)V

    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/q0;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->g(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    iget p2, p1, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p1, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a:I

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->h(I)V

    return-object v1

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/h;

    const-string p2, "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit."

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/h;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final Q(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->i()Lcom/google/android/gms/internal/firebase-auth-api/h;

    move-result-object p1

    throw p1
.end method

.method private final R(I)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 v0, v0, 0x7

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1
.end method

.method private static final S(I)V
    .locals 0

    and-int/lit8 p0, p0, 0x3

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->g()Lcom/google/android/gms/internal/firebase-auth-api/h;

    move-result-object p0

    throw p0
.end method

.method private static final T(I)V
    .locals 0

    and-int/lit8 p0, p0, 0x7

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->g()Lcom/google/android/gms/internal/firebase-auth-api/h;

    move-result-object p0

    throw p0
.end method

.method public static U(Lcom/google/android/gms/internal/firebase-auth-api/lr;)Lcom/google/android/gms/internal/firebase-auth-api/mr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c:Lcom/google/android/gms/internal/firebase-auth-api/mr;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/mr;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/mr;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/lr;)V

    return-object v0
.end method


# virtual methods
.method public final A(Ljava/util/List;)V
    .locals 4

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/s;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/s;

    iget p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->T(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->r()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/s;->q(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->r()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/s;->q(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v1

    if-eqz v1, :cond_3

    return-void

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->T(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->r()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->r()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v1

    if-eqz v1, :cond_8

    return-void

    :cond_8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    return-void
.end method

.method public final B(Ljava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/q0;Lcom/google/android/gms/internal/firebase-auth-api/yr;)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 v1, v0, 0x7

    const/4 v2, 0x3

    if-ne v1, v2, :cond_3

    :cond_0
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->O(Lcom/google/android/gms/internal/firebase-auth-api/q0;Lcom/google/android/gms/internal/firebase-auth-api/yr;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v2

    if-nez v2, :cond_2

    iget v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result v1

    if-eq v1, v0, :cond_0

    iput v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    :cond_2
    :goto_0
    return-void

    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1
.end method

.method public final C()Z
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v1

    if-nez v1, :cond_1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    iget v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->c:I

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->k(I)Z

    move-result v0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final D(Ljava/util/List;)V
    .locals 4

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/s;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/s;

    iget p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->s()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/s;->q(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->Q(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->s()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/s;->q(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v1

    if-eqz v1, :cond_3

    return-void

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->s()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->Q(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->s()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v1

    if-eqz v1, :cond_8

    return-void

    :cond_8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    return-void
.end method

.method public final E(Ljava/util/List;)V
    .locals 4

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/vr;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/vr;

    iget p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->T(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->r()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/vr;->p(D)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->r()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/vr;->p(D)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v1

    if-eqz v1, :cond_3

    return-void

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->T(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->r()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->r()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v1

    if-eqz v1, :cond_8

    return-void

    :cond_8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    return-void
.end method

.method public final F(Ljava/util/List;)V
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/ls;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/ls;

    iget p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->l(I)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ls;->q(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->Q(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->l(I)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ls;->q(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v1

    if-eqz v1, :cond_3

    return-void

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->l(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->Q(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->l(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v1

    if-eqz v1, :cond_8

    return-void

    :cond_8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    return-void
.end method

.method public final G(Ljava/util/List;)V
    .locals 4

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/ls;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/ls;

    iget p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->p()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ls;->q(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->S(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->p()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ls;->q(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result p1

    if-lt p1, v3, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->p()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v1

    if-eqz v1, :cond_7

    return-void

    :cond_7
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    return-void

    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->S(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->p()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v0

    if-lt v0, v1, :cond_a

    :goto_0
    return-void
.end method

.method public final H()I
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->R(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result v0

    return v0
.end method

.method public final I(Ljava/util/List;)V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->n()Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    if-eq v0, v1, :cond_0

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1
.end method

.method public final J(Ljava/util/List;)V
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/ls;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/ls;

    iget p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ls;->q(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->Q(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ls;->q(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v1

    if-eqz v1, :cond_3

    return-void

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->Q(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v1

    if-eqz v1, :cond_8

    return-void

    :cond_8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    return-void
.end method

.method public final K(Ljava/util/List;)V
    .locals 4

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/fs;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/fs;

    iget p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->p()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/fs;->p(F)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->S(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->p()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/fs;->p(F)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result p1

    if-lt p1, v3, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->p()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v1

    if-eqz v1, :cond_7

    return-void

    :cond_7
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    return-void

    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->S(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->p()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v0

    if-lt v0, v1, :cond_a

    :goto_0
    return-void
.end method

.method public final L(Lcom/google/android/gms/internal/firebase-auth-api/q0;Lcom/google/android/gms/internal/firebase-auth-api/yr;)Ljava/lang/Object;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->R(I)V

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->O(Lcom/google/android/gms/internal/firebase-auth-api/q0;Lcom/google/android/gms/internal/firebase-auth-api/yr;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final M()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->R(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final N(Ljava/util/List;Z)V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_6

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/l;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-nez p2, :cond_3

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/l;

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->n()Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/l;->g(Lcom/google/android/gms/internal/firebase-auth-api/hr;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result p2

    if-eqz p2, :cond_2

    return-void

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result p1

    iget p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    if-eq p1, p2, :cond_1

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    return-void

    :cond_3
    :goto_0
    if-eqz p2, :cond_4

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->y()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->M()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v1

    if-eqz v1, :cond_5

    return-void

    :cond_5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    if-eq v0, v1, :cond_3

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1
.end method

.method public final a()D
    .locals 2

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->R(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->r()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    return-wide v0
.end method

.method public final b()F
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->R(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->p()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    return v0
.end method

.method public final c()I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    if-eqz v0, :cond_0

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    const/4 v1, 0x0

    iput v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    :goto_0
    if-eqz v0, :cond_2

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->c:I

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    ushr-int/lit8 v0, v0, 0x3

    return v0

    :cond_2
    :goto_1
    const v0, 0x7fffffff

    return v0
.end method

.method public final d()I
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->R(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result v0

    return v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    return v0
.end method

.method public final f()I
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->R(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->p()I

    move-result v0

    return v0
.end method

.method public final g()J
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->R(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->s()J

    move-result-wide v0

    return-wide v0
.end method

.method public final h()J
    .locals 2

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->R(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->r()J

    move-result-wide v0

    return-wide v0
.end method

.method public final i()J
    .locals 2

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->R(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->r()J

    move-result-wide v0

    return-wide v0
.end method

.method public final j()I
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->R(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->l(I)I

    move-result v0

    return v0
.end method

.method public final k()Z
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->R(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->j()Z

    move-result v0

    return v0
.end method

.method public final l()J
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->R(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->s()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->m(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final m(Ljava/util/List;)V
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/ls;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/ls;

    iget p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ls;->q(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->Q(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ls;->q(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v1

    if-eqz v1, :cond_3

    return-void

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->Q(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v1

    if-eqz v1, :cond_8

    return-void

    :cond_8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    return-void
.end method

.method public final n()Lcom/google/android/gms/internal/firebase-auth-api/hr;
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->R(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->d()Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object v0

    return-object v0
.end method

.method public final o(Ljava/util/List;)V
    .locals 4

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/s;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/s;

    iget p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->s()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->m(J)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/s;->q(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->Q(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->s()J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->m(J)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/s;->q(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v1

    if-eqz v1, :cond_3

    return-void

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->s()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->m(J)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->Q(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->s()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->m(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v1

    if-eqz v1, :cond_8

    return-void

    :cond_8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    return-void
.end method

.method public final p()I
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->R(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result v0

    return v0
.end method

.method public final q(Ljava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/q0;Lcom/google/android/gms/internal/firebase-auth-api/yr;)V
    .locals 3

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 v1, v0, 0x7

    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    :cond_0
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->P(Lcom/google/android/gms/internal/firebase-auth-api/q0;Lcom/google/android/gms/internal/firebase-auth-api/yr;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v2

    if-nez v2, :cond_2

    iget v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result v1

    if-eq v1, v0, :cond_0

    iput v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    :cond_2
    :goto_0
    return-void

    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1
.end method

.method public final r(Ljava/util/List;)V
    .locals 4

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/s;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/s;

    iget p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->T(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->r()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/s;->q(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->r()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/s;->q(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v1

    if-eqz v1, :cond_3

    return-void

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->T(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->r()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->r()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v1

    if-eqz v1, :cond_8

    return-void

    :cond_8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    return-void
.end method

.method public final s(Ljava/util/List;)V
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/ls;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/ls;

    iget p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ls;->q(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->Q(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ls;->q(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v1

    if-eqz v1, :cond_3

    return-void

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->Q(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v1

    if-eqz v1, :cond_8

    return-void

    :cond_8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    return-void
.end method

.method public final t()J
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->R(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->s()J

    move-result-wide v0

    return-wide v0
.end method

.method public final u(Ljava/util/List;)V
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/wq;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/wq;

    iget p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->j()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/wq;->p(Z)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->Q(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->j()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/wq;->p(Z)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v1

    if-eqz v1, :cond_3

    return-void

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->j()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->Q(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->j()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v1

    if-eqz v1, :cond_8

    return-void

    :cond_8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    return-void
.end method

.method public final v()I
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->R(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->p()I

    move-result v0

    return v0
.end method

.method public final w(Ljava/util/List;)V
    .locals 4

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/ls;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/ls;

    iget p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->p()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ls;->q(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->S(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->p()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ls;->q(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result p1

    if-lt p1, v3, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->p()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v1

    if-eqz v1, :cond_7

    return-void

    :cond_7
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    return-void

    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->S(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->p()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v0

    if-lt v0, v1, :cond_a

    :goto_0
    return-void
.end method

.method public final x(Ljava/util/List;)V
    .locals 4

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/s;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/s;

    iget p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->s()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/s;->q(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->Q(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->s()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/s;->q(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v1

    if-eqz v1, :cond_3

    return-void

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->q()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->s()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->a()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->Q(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h;->a()Lcom/google/android/gms/internal/firebase-auth-api/g;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/jr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jr;->s()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->i()Z

    move-result v1

    if-eqz v1, :cond_8

    return-void

    :cond_8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->c()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->d:I

    return-void
.end method

.method public final y()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->R(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mr;->a:Lcom/google/android/gms/internal/firebase-auth-api/lr;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/lr;->f()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final z(Lcom/google/android/gms/internal/firebase-auth-api/q0;Lcom/google/android/gms/internal/firebase-auth-api/yr;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->R(I)V

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/mr;->P(Lcom/google/android/gms/internal/firebase-auth-api/q0;Lcom/google/android/gms/internal/firebase-auth-api/yr;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
