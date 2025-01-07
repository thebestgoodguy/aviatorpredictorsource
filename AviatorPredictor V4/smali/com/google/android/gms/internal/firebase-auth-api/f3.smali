.class public final Lcom/google/android/gms/internal/firebase-auth-api/f3;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lcom/google/android/gms/internal/firebase-auth-api/cd;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/cd;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/f3;->a:Lcom/google/android/gms/internal/firebase-auth-api/cd;

    return-void
.end method

.method public static e()Lcom/google/android/gms/internal/firebase-auth-api/f3;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/f3;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/fd;->B()Lcom/google/android/gms/internal/firebase-auth-api/cd;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/f3;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/cd;)V

    return-object v0
.end method

.method public static f(Lcom/google/android/gms/internal/firebase-auth-api/e3;)Lcom/google/android/gms/internal/firebase-auth-api/f3;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/f3;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/e3;->c()Lcom/google/android/gms/internal/firebase-auth-api/fd;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->t()Lcom/google/android/gms/internal/firebase-auth-api/hs;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/cd;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/f3;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/cd;)V

    return-object v0
.end method

.method private final declared-synchronized g()I
    .locals 2

    monitor-enter p0

    :goto_0
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/t7;->a()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/f3;->i(I)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private final declared-synchronized h(Lcom/google/android/gms/internal/firebase-auth-api/xc;)Lcom/google/android/gms/internal/firebase-auth-api/ed;
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/x3;->c(Lcom/google/android/gms/internal/firebase-auth-api/xc;)Lcom/google/android/gms/internal/firebase-auth-api/sc;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/xc;->G()I

    move-result p1

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/f3;->j(Lcom/google/android/gms/internal/firebase-auth-api/sc;I)Lcom/google/android/gms/internal/firebase-auth-api/ed;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private final declared-synchronized i(I)Z
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/f3;->a:Lcom/google/android/gms/internal/firebase-auth-api/cd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/cd;->u()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/firebase-auth-api/ed;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/ed;->z()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v1, p1, :cond_0

    const/4 p1, 0x1

    :goto_0
    monitor-exit p0

    return p1

    :cond_1
    const/4 p1, 0x0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private final declared-synchronized j(Lcom/google/android/gms/internal/firebase-auth-api/sc;I)Lcom/google/android/gms/internal/firebase-auth-api/ed;
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/f3;->g()I

    move-result v0

    const/4 v1, 0x2

    if-eq p2, v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ed;->B()Lcom/google/android/gms/internal/firebase-auth-api/dd;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/dd;->p(Lcom/google/android/gms/internal/firebase-auth-api/sc;)Lcom/google/android/gms/internal/firebase-auth-api/dd;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/dd;->q(I)Lcom/google/android/gms/internal/firebase-auth-api/dd;

    const/4 p1, 0x3

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/dd;->s(I)Lcom/google/android/gms/internal/firebase-auth-api/dd;

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/dd;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/dd;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/ed;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_0
    :try_start_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "unknown output prefix type"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public final declared-synchronized a(Lcom/google/android/gms/internal/firebase-auth-api/xc;Z)I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/f3;->h(Lcom/google/android/gms/internal/firebase-auth-api/xc;)Lcom/google/android/gms/internal/firebase-auth-api/ed;

    move-result-object p1

    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/f3;->a:Lcom/google/android/gms/internal/firebase-auth-api/cd;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cd;->q(Lcom/google/android/gms/internal/firebase-auth-api/ed;)Lcom/google/android/gms/internal/firebase-auth-api/cd;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ed;->z()I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized b()Lcom/google/android/gms/internal/firebase-auth-api/e3;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/f3;->a:Lcom/google/android/gms/internal/firebase-auth-api/cd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/fd;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/e3;->a(Lcom/google/android/gms/internal/firebase-auth-api/fd;)Lcom/google/android/gms/internal/firebase-auth-api/e3;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized c(Lcom/google/android/gms/internal/firebase-auth-api/c3;)Lcom/google/android/gms/internal/firebase-auth-api/f3;
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/c3;->a()Lcom/google/android/gms/internal/firebase-auth-api/xc;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/f3;->a(Lcom/google/android/gms/internal/firebase-auth-api/xc;Z)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized d(I)Lcom/google/android/gms/internal/firebase-auth-api/f3;
    .locals 3

    monitor-enter p0

    const/4 v0, 0x0

    :goto_0
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/f3;->a:Lcom/google/android/gms/internal/firebase-auth-api/cd;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/cd;->p()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/f3;->a:Lcom/google/android/gms/internal/firebase-auth-api/cd;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/cd;->s(I)Lcom/google/android/gms/internal/firebase-auth-api/ed;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/ed;->z()I

    move-result v2

    if-ne v2, p1, :cond_1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/ed;->G()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/f3;->a:Lcom/google/android/gms/internal/firebase-auth-api/cd;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cd;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/cd;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p0

    :cond_0
    :try_start_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "cannot set key as primary because it\'s not enabled: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "key not found: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
