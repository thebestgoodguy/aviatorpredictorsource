.class public final Le3/b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le3/b$b;
    }
.end annotation


# static fields
.field private static final e:[Le3/a;

.field public static final f:Le3/b;

.field public static final g:Le3/b;

.field public static final h:Le3/b;


# instance fields
.field final a:Z

.field private final b:[Ljava/lang/String;

.field private final c:[Ljava/lang/String;

.field final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 9

    const/16 v0, 0x10

    new-array v0, v0, [Le3/a;

    sget-object v1, Le3/a;->b1:Le3/a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Le3/a;->c1:Le3/a;

    const/4 v3, 0x1

    aput-object v1, v0, v3

    sget-object v1, Le3/a;->d1:Le3/a;

    const/4 v4, 0x2

    aput-object v1, v0, v4

    sget-object v1, Le3/a;->P0:Le3/a;

    const/4 v5, 0x3

    aput-object v1, v0, v5

    sget-object v1, Le3/a;->T0:Le3/a;

    const/4 v6, 0x4

    aput-object v1, v0, v6

    sget-object v1, Le3/a;->Q0:Le3/a;

    const/4 v7, 0x5

    aput-object v1, v0, v7

    sget-object v1, Le3/a;->U0:Le3/a;

    const/4 v7, 0x6

    aput-object v1, v0, v7

    sget-object v1, Le3/a;->Y0:Le3/a;

    const/4 v7, 0x7

    aput-object v1, v0, v7

    sget-object v1, Le3/a;->X0:Le3/a;

    const/16 v7, 0x8

    aput-object v1, v0, v7

    sget-object v1, Le3/a;->A0:Le3/a;

    const/16 v7, 0x9

    aput-object v1, v0, v7

    sget-object v1, Le3/a;->B0:Le3/a;

    const/16 v7, 0xa

    aput-object v1, v0, v7

    sget-object v1, Le3/a;->Z:Le3/a;

    const/16 v7, 0xb

    aput-object v1, v0, v7

    sget-object v1, Le3/a;->a0:Le3/a;

    const/16 v7, 0xc

    aput-object v1, v0, v7

    sget-object v1, Le3/a;->I:Le3/a;

    const/16 v7, 0xd

    aput-object v1, v0, v7

    sget-object v1, Le3/a;->M:Le3/a;

    const/16 v7, 0xe

    aput-object v1, v0, v7

    sget-object v1, Le3/a;->m:Le3/a;

    const/16 v7, 0xf

    aput-object v1, v0, v7

    sput-object v0, Le3/b;->e:[Le3/a;

    new-instance v1, Le3/b$b;

    invoke-direct {v1, v3}, Le3/b$b;-><init>(Z)V

    invoke-virtual {v1, v0}, Le3/b$b;->f([Le3/a;)Le3/b$b;

    move-result-object v0

    new-array v1, v4, [Le3/h;

    sget-object v7, Le3/h;->f:Le3/h;

    aput-object v7, v1, v2

    sget-object v8, Le3/h;->g:Le3/h;

    aput-object v8, v1, v3

    invoke-virtual {v0, v1}, Le3/b$b;->i([Le3/h;)Le3/b$b;

    move-result-object v0

    invoke-virtual {v0, v3}, Le3/b$b;->h(Z)Le3/b$b;

    move-result-object v0

    invoke-virtual {v0}, Le3/b$b;->e()Le3/b;

    move-result-object v0

    sput-object v0, Le3/b;->f:Le3/b;

    new-instance v1, Le3/b$b;

    invoke-direct {v1, v0}, Le3/b$b;-><init>(Le3/b;)V

    new-array v0, v6, [Le3/h;

    aput-object v7, v0, v2

    aput-object v8, v0, v3

    sget-object v6, Le3/h;->h:Le3/h;

    aput-object v6, v0, v4

    sget-object v4, Le3/h;->i:Le3/h;

    aput-object v4, v0, v5

    invoke-virtual {v1, v0}, Le3/b$b;->i([Le3/h;)Le3/b$b;

    move-result-object v0

    invoke-virtual {v0, v3}, Le3/b$b;->h(Z)Le3/b$b;

    move-result-object v0

    invoke-virtual {v0}, Le3/b$b;->e()Le3/b;

    move-result-object v0

    sput-object v0, Le3/b;->g:Le3/b;

    new-instance v0, Le3/b$b;

    invoke-direct {v0, v2}, Le3/b$b;-><init>(Z)V

    invoke-virtual {v0}, Le3/b$b;->e()Le3/b;

    move-result-object v0

    sput-object v0, Le3/b;->h:Le3/b;

    return-void
.end method

.method private constructor <init>(Le3/b$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Le3/b$b;->a(Le3/b$b;)Z

    move-result v0

    iput-boolean v0, p0, Le3/b;->a:Z

    invoke-static {p1}, Le3/b$b;->b(Le3/b$b;)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le3/b;->b:[Ljava/lang/String;

    invoke-static {p1}, Le3/b$b;->c(Le3/b$b;)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le3/b;->c:[Ljava/lang/String;

    invoke-static {p1}, Le3/b$b;->d(Le3/b$b;)Z

    move-result p1

    iput-boolean p1, p0, Le3/b;->d:Z

    return-void
.end method

.method synthetic constructor <init>(Le3/b$b;Le3/b$a;)V
    .locals 0

    invoke-direct {p0, p1}, Le3/b;-><init>(Le3/b$b;)V

    return-void
.end method

.method static synthetic a(Le3/b;)[Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Le3/b;->b:[Ljava/lang/String;

    return-object p0
.end method

.method static synthetic b(Le3/b;)[Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Le3/b;->c:[Ljava/lang/String;

    return-object p0
.end method

.method private e(Ljavax/net/ssl/SSLSocket;Z)Le3/b;
    .locals 6

    const-class v0, Ljava/lang/String;

    iget-object v1, p0, Le3/b;->b:[Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Le3/b;->b:[Ljava/lang/String;

    invoke-static {v0, v2, v1}, Le3/i;->c(Ljava/lang/Class;[Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz p2, :cond_2

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getSupportedCipherSuites()[Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    const-string v2, "TLS_FALLBACK_SCSV"

    invoke-interface {p2, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object v1

    :goto_1
    array-length p2, v1

    add-int/lit8 p2, p2, 0x1

    new-array v3, p2, [Ljava/lang/String;

    array-length v4, v1

    const/4 v5, 0x0

    invoke-static {v1, v5, v3, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 p2, p2, -0x1

    aput-object v2, v3, p2

    move-object v1, v3

    :cond_2
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Le3/b;->c:[Ljava/lang/String;

    invoke-static {v0, p2, p1}, Le3/i;->c(Ljava/lang/Class;[Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    new-instance p2, Le3/b$b;

    invoke-direct {p2, p0}, Le3/b$b;-><init>(Le3/b;)V

    invoke-virtual {p2, v1}, Le3/b$b;->g([Ljava/lang/String;)Le3/b$b;

    move-result-object p2

    invoke-virtual {p2, p1}, Le3/b$b;->j([Ljava/lang/String;)Le3/b$b;

    move-result-object p1

    invoke-virtual {p1}, Le3/b$b;->e()Le3/b;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public c(Ljavax/net/ssl/SSLSocket;Z)V
    .locals 1

    invoke-direct {p0, p1, p2}, Le3/b;->e(Ljavax/net/ssl/SSLSocket;Z)Le3/b;

    move-result-object p2

    iget-object v0, p2, Le3/b;->c:[Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljavax/net/ssl/SSLSocket;->setEnabledProtocols([Ljava/lang/String;)V

    iget-object p2, p2, Le3/b;->b:[Ljava/lang/String;

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, Ljavax/net/ssl/SSLSocket;->setEnabledCipherSuites([Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public d()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Le3/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Le3/b;->b:[Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    array-length v0, v0

    new-array v0, v0, [Le3/a;

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Le3/b;->b:[Ljava/lang/String;

    array-length v3, v2

    if-ge v1, v3, :cond_1

    aget-object v2, v2, v1

    invoke-static {v2}, Le3/a;->d(Ljava/lang/String;)Le3/a;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v0}, Le3/i;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    instance-of v0, p1, Le3/b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, p0, :cond_1

    return v0

    :cond_1
    check-cast p1, Le3/b;

    iget-boolean v2, p0, Le3/b;->a:Z

    iget-boolean v3, p1, Le3/b;->a:Z

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    if-eqz v2, :cond_5

    iget-object v2, p0, Le3/b;->b:[Ljava/lang/String;

    iget-object v3, p1, Le3/b;->b:[Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Le3/b;->c:[Ljava/lang/String;

    iget-object v3, p1, Le3/b;->c:[Ljava/lang/String;

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-boolean v2, p0, Le3/b;->d:Z

    iget-boolean p1, p1, Le3/b;->d:Z

    if-eq v2, p1, :cond_5

    return v1

    :cond_5
    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Le3/b;->d:Z

    return v0
.end method

.method public g()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Le3/h;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Le3/b;->c:[Ljava/lang/String;

    array-length v0, v0

    new-array v0, v0, [Le3/h;

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Le3/b;->c:[Ljava/lang/String;

    array-length v3, v2

    if-ge v1, v3, :cond_0

    aget-object v2, v2, v1

    invoke-static {v2}, Le3/h;->d(Ljava/lang/String;)Le3/h;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v0}, Le3/i;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Le3/b;->a:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x20f

    iget-object v1, p0, Le3/b;->b:[Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Le3/b;->c:[Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Le3/b;->d:Z

    xor-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    goto :goto_0

    :cond_0
    const/16 v0, 0x11

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-boolean v0, p0, Le3/b;->a:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Le3/b;->d()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "[use default]"

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ConnectionSpec(cipherSuites="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", tlsVersions="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le3/b;->g()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", supportsTlsExtensions="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Le3/b;->d:Z

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v0, "ConnectionSpec()"

    return-object v0
.end method
