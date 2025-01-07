.class public final Lb3/f1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb3/f1$d;,
        Lb3/f1$c;,
        Lb3/f1$b;
    }
.end annotation


# static fields
.field private static final d:Z

.field private static final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lb3/f1;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Lb3/f1;

.field public static final g:Lb3/f1;

.field public static final h:Lb3/f1;

.field public static final i:Lb3/f1;

.field public static final j:Lb3/f1;

.field public static final k:Lb3/f1;

.field public static final l:Lb3/f1;

.field public static final m:Lb3/f1;

.field public static final n:Lb3/f1;

.field public static final o:Lb3/f1;

.field public static final p:Lb3/f1;

.field public static final q:Lb3/f1;

.field public static final r:Lb3/f1;

.field public static final s:Lb3/f1;

.field public static final t:Lb3/f1;

.field public static final u:Lb3/f1;

.field public static final v:Lb3/f1;

.field static final w:Lb3/u0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/u0$g<",
            "Lb3/f1;",
            ">;"
        }
    .end annotation
.end field

.field private static final x:Lb3/u0$j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/u0$j<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field static final y:Lb3/u0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/u0$g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lb3/f1$b;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "io.grpc.Status.failOnEqualsForTest"

    const-string v1, "false"

    invoke-static {v0, v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    sput-boolean v0, Lb3/f1;->d:Z

    invoke-static {}, Lb3/f1;->f()Ljava/util/List;

    move-result-object v0

    sput-object v0, Lb3/f1;->e:Ljava/util/List;

    sget-object v0, Lb3/f1$b;->g:Lb3/f1$b;

    invoke-virtual {v0}, Lb3/f1$b;->g()Lb3/f1;

    move-result-object v0

    sput-object v0, Lb3/f1;->f:Lb3/f1;

    sget-object v0, Lb3/f1$b;->h:Lb3/f1$b;

    invoke-virtual {v0}, Lb3/f1$b;->g()Lb3/f1;

    move-result-object v0

    sput-object v0, Lb3/f1;->g:Lb3/f1;

    sget-object v0, Lb3/f1$b;->i:Lb3/f1$b;

    invoke-virtual {v0}, Lb3/f1$b;->g()Lb3/f1;

    move-result-object v0

    sput-object v0, Lb3/f1;->h:Lb3/f1;

    sget-object v0, Lb3/f1$b;->j:Lb3/f1$b;

    invoke-virtual {v0}, Lb3/f1$b;->g()Lb3/f1;

    move-result-object v0

    sput-object v0, Lb3/f1;->i:Lb3/f1;

    sget-object v0, Lb3/f1$b;->k:Lb3/f1$b;

    invoke-virtual {v0}, Lb3/f1$b;->g()Lb3/f1;

    move-result-object v0

    sput-object v0, Lb3/f1;->j:Lb3/f1;

    sget-object v0, Lb3/f1$b;->l:Lb3/f1$b;

    invoke-virtual {v0}, Lb3/f1$b;->g()Lb3/f1;

    move-result-object v0

    sput-object v0, Lb3/f1;->k:Lb3/f1;

    sget-object v0, Lb3/f1$b;->m:Lb3/f1$b;

    invoke-virtual {v0}, Lb3/f1$b;->g()Lb3/f1;

    move-result-object v0

    sput-object v0, Lb3/f1;->l:Lb3/f1;

    sget-object v0, Lb3/f1$b;->n:Lb3/f1$b;

    invoke-virtual {v0}, Lb3/f1$b;->g()Lb3/f1;

    move-result-object v0

    sput-object v0, Lb3/f1;->m:Lb3/f1;

    sget-object v0, Lb3/f1$b;->w:Lb3/f1$b;

    invoke-virtual {v0}, Lb3/f1$b;->g()Lb3/f1;

    move-result-object v0

    sput-object v0, Lb3/f1;->n:Lb3/f1;

    sget-object v0, Lb3/f1$b;->o:Lb3/f1$b;

    invoke-virtual {v0}, Lb3/f1$b;->g()Lb3/f1;

    move-result-object v0

    sput-object v0, Lb3/f1;->o:Lb3/f1;

    sget-object v0, Lb3/f1$b;->p:Lb3/f1$b;

    invoke-virtual {v0}, Lb3/f1$b;->g()Lb3/f1;

    move-result-object v0

    sput-object v0, Lb3/f1;->p:Lb3/f1;

    sget-object v0, Lb3/f1$b;->q:Lb3/f1$b;

    invoke-virtual {v0}, Lb3/f1$b;->g()Lb3/f1;

    move-result-object v0

    sput-object v0, Lb3/f1;->q:Lb3/f1;

    sget-object v0, Lb3/f1$b;->r:Lb3/f1$b;

    invoke-virtual {v0}, Lb3/f1$b;->g()Lb3/f1;

    move-result-object v0

    sput-object v0, Lb3/f1;->r:Lb3/f1;

    sget-object v0, Lb3/f1$b;->s:Lb3/f1$b;

    invoke-virtual {v0}, Lb3/f1$b;->g()Lb3/f1;

    move-result-object v0

    sput-object v0, Lb3/f1;->s:Lb3/f1;

    sget-object v0, Lb3/f1$b;->t:Lb3/f1$b;

    invoke-virtual {v0}, Lb3/f1$b;->g()Lb3/f1;

    move-result-object v0

    sput-object v0, Lb3/f1;->t:Lb3/f1;

    sget-object v0, Lb3/f1$b;->u:Lb3/f1$b;

    invoke-virtual {v0}, Lb3/f1$b;->g()Lb3/f1;

    move-result-object v0

    sput-object v0, Lb3/f1;->u:Lb3/f1;

    sget-object v0, Lb3/f1$b;->v:Lb3/f1$b;

    invoke-virtual {v0}, Lb3/f1$b;->g()Lb3/f1;

    move-result-object v0

    sput-object v0, Lb3/f1;->v:Lb3/f1;

    new-instance v0, Lb3/f1$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb3/f1$c;-><init>(Lb3/f1$a;)V

    const-string v2, "grpc-status"

    const/4 v3, 0x0

    invoke-static {v2, v3, v0}, Lb3/u0$g;->g(Ljava/lang/String;ZLb3/u0$j;)Lb3/u0$g;

    move-result-object v0

    sput-object v0, Lb3/f1;->w:Lb3/u0$g;

    new-instance v0, Lb3/f1$d;

    invoke-direct {v0, v1}, Lb3/f1$d;-><init>(Lb3/f1$a;)V

    sput-object v0, Lb3/f1;->x:Lb3/u0$j;

    const-string v1, "grpc-message"

    invoke-static {v1, v3, v0}, Lb3/u0$g;->g(Ljava/lang/String;ZLb3/u0$j;)Lb3/u0$g;

    move-result-object v0

    sput-object v0, Lb3/f1;->y:Lb3/u0$g;

    return-void
.end method

.method private constructor <init>(Lb3/f1$b;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, v0}, Lb3/f1;-><init>(Lb3/f1$b;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method private constructor <init>(Lb3/f1$b;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "code"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb3/f1$b;

    iput-object p1, p0, Lb3/f1;->a:Lb3/f1$b;

    iput-object p2, p0, Lb3/f1;->b:Ljava/lang/String;

    iput-object p3, p0, Lb3/f1;->c:Ljava/lang/Throwable;

    return-void
.end method

.method static synthetic a()Ljava/util/List;
    .locals 1

    sget-object v0, Lb3/f1;->e:Ljava/util/List;

    return-object v0
.end method

.method static synthetic b([B)Lb3/f1;
    .locals 0

    invoke-static {p0}, Lb3/f1;->i([B)Lb3/f1;

    move-result-object p0

    return-object p0
.end method

.method private static f()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lb3/f1;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    invoke-static {}, Lb3/f1$b;->values()[Lb3/f1$b;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Lb3/f1$b;->h()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    new-instance v6, Lb3/f1;

    invoke-direct {v6, v4}, Lb3/f1;-><init>(Lb3/f1$b;)V

    invoke-virtual {v0, v5, v6}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lb3/f1;

    if-nez v5, :cond_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Code value duplication between "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Lb3/f1;->m()Lb3/f1$b;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " & "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static g(Lb3/f1;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lb3/f1;->b:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object p0, p0, Lb3/f1;->a:Lb3/f1$b;

    invoke-virtual {p0}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lb3/f1;->a:Lb3/f1$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lb3/f1;->b:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static h(I)Lb3/f1;
    .locals 3

    if-ltz p0, :cond_1

    sget-object v0, Lb3/f1;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-le p0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lb3/f1;

    return-object p0

    :cond_1
    :goto_0
    sget-object v0, Lb3/f1;->h:Lb3/f1;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown code "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object p0

    return-object p0
.end method

.method private static i([B)Lb3/f1;
    .locals 2

    array-length v0, p0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    aget-byte v0, p0, v0

    const/16 v1, 0x30

    if-ne v0, v1, :cond_0

    sget-object p0, Lb3/f1;->f:Lb3/f1;

    return-object p0

    :cond_0
    invoke-static {p0}, Lb3/f1;->j([B)Lb3/f1;

    move-result-object p0

    return-object p0
.end method

.method private static j([B)Lb3/f1;
    .locals 6

    array-length v0, p0

    const/16 v1, 0x39

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/16 v4, 0x30

    if-eq v0, v2, :cond_2

    const/4 v5, 0x2

    if-eq v0, v5, :cond_0

    goto :goto_1

    :cond_0
    aget-byte v0, p0, v3

    if-lt v0, v4, :cond_4

    aget-byte v0, p0, v3

    if-le v0, v1, :cond_1

    goto :goto_1

    :cond_1
    aget-byte v0, p0, v3

    sub-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0xa

    add-int/2addr v3, v0

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    aget-byte v0, p0, v2

    if-lt v0, v4, :cond_4

    aget-byte v0, p0, v2

    if-le v0, v1, :cond_3

    goto :goto_1

    :cond_3
    aget-byte v0, p0, v2

    sub-int/2addr v0, v4

    add-int/2addr v3, v0

    sget-object v0, Lb3/f1;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-ge v3, v1, :cond_4

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lb3/f1;

    return-object p0

    :cond_4
    :goto_1
    sget-object v0, Lb3/f1;->h:Lb3/f1;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown code "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/lang/String;

    sget-object v3, Lq0/b;->a:Ljava/nio/charset/Charset;

    invoke-direct {v2, p0, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object p0

    return-object p0
.end method

.method public static k(Ljava/lang/Throwable;)Lb3/f1;
    .locals 2

    const-string v0, "t"

    invoke-static {p0, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    :goto_0
    if-eqz v0, :cond_2

    instance-of v1, v0, Lb3/g1;

    if-eqz v1, :cond_0

    check-cast v0, Lb3/g1;

    invoke-virtual {v0}, Lb3/g1;->a()Lb3/f1;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v1, v0, Lb3/h1;

    if-eqz v1, :cond_1

    check-cast v0, Lb3/h1;

    invoke-virtual {v0}, Lb3/h1;->a()Lb3/f1;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_0

    :cond_2
    sget-object v0, Lb3/f1;->h:Lb3/f1;

    invoke-virtual {v0, p0}, Lb3/f1;->p(Ljava/lang/Throwable;)Lb3/f1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public c()Lb3/g1;
    .locals 1

    new-instance v0, Lb3/g1;

    invoke-direct {v0, p0}, Lb3/g1;-><init>(Lb3/f1;)V

    return-object v0
.end method

.method public d()Lb3/h1;
    .locals 1

    new-instance v0, Lb3/h1;

    invoke-direct {v0, p0}, Lb3/h1;-><init>(Lb3/f1;)V

    return-object v0
.end method

.method public e(Ljava/lang/String;)Lb3/f1;
    .locals 4

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Lb3/f1;->b:Ljava/lang/String;

    if-nez v0, :cond_1

    new-instance v0, Lb3/f1;

    iget-object v1, p0, Lb3/f1;->a:Lb3/f1$b;

    iget-object v2, p0, Lb3/f1;->c:Ljava/lang/Throwable;

    invoke-direct {v0, v1, p1, v2}, Lb3/f1;-><init>(Lb3/f1$b;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0

    :cond_1
    new-instance v0, Lb3/f1;

    iget-object v1, p0, Lb3/f1;->a:Lb3/f1$b;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lb3/f1;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Lb3/f1;->c:Ljava/lang/Throwable;

    invoke-direct {v0, v1, p1, v2}, Lb3/f1;-><init>(Lb3/f1$b;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public l()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lb3/f1;->c:Ljava/lang/Throwable;

    return-object v0
.end method

.method public m()Lb3/f1$b;
    .locals 1

    iget-object v0, p0, Lb3/f1;->a:Lb3/f1$b;

    return-object v0
.end method

.method public n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lb3/f1;->b:Ljava/lang/String;

    return-object v0
.end method

.method public o()Z
    .locals 2

    sget-object v0, Lb3/f1$b;->g:Lb3/f1$b;

    iget-object v1, p0, Lb3/f1;->a:Lb3/f1$b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public p(Ljava/lang/Throwable;)Lb3/f1;
    .locals 3

    iget-object v0, p0, Lb3/f1;->c:Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lq0/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lb3/f1;

    iget-object v1, p0, Lb3/f1;->a:Lb3/f1$b;

    iget-object v2, p0, Lb3/f1;->b:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p1}, Lb3/f1;-><init>(Lb3/f1$b;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public q(Ljava/lang/String;)Lb3/f1;
    .locals 3

    iget-object v0, p0, Lb3/f1;->b:Ljava/lang/String;

    invoke-static {v0, p1}, Lq0/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lb3/f1;

    iget-object v1, p0, Lb3/f1;->a:Lb3/f1$b;

    iget-object v2, p0, Lb3/f1;->c:Ljava/lang/Throwable;

    invoke-direct {v0, v1, p1, v2}, Lb3/f1;-><init>(Lb3/f1$b;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lq0/h;->c(Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lb3/f1;->a:Lb3/f1$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    const-string v2, "code"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lb3/f1;->b:Ljava/lang/String;

    const-string v2, "description"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lb3/f1;->c:Ljava/lang/Throwable;

    if-eqz v1, :cond_0

    invoke-static {v1}, Lq0/q;->e(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    :cond_0
    const-string v2, "cause"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lq0/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
