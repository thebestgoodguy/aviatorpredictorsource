.class Le3/f$d;
.super Le3/f;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le3/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# instance fields
.field private final e:Le3/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le3/e<",
            "Ljava/net/Socket;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Le3/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le3/e<",
            "Ljava/net/Socket;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/lang/reflect/Method;

.field private final h:Ljava/lang/reflect/Method;

.field private final i:Le3/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le3/e<",
            "Ljava/net/Socket;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Le3/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le3/e<",
            "Ljava/net/Socket;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Le3/f$h;


# direct methods
.method public constructor <init>(Le3/e;Le3/e;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Le3/e;Le3/e;Ljava/security/Provider;Le3/f$h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le3/e<",
            "Ljava/net/Socket;",
            ">;",
            "Le3/e<",
            "Ljava/net/Socket;",
            ">;",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/reflect/Method;",
            "Le3/e<",
            "Ljava/net/Socket;",
            ">;",
            "Le3/e<",
            "Ljava/net/Socket;",
            ">;",
            "Ljava/security/Provider;",
            "Le3/f$h;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p7}, Le3/f;-><init>(Ljava/security/Provider;)V

    iput-object p1, p0, Le3/f$d;->e:Le3/e;

    iput-object p2, p0, Le3/f$d;->f:Le3/e;

    iput-object p3, p0, Le3/f$d;->g:Ljava/lang/reflect/Method;

    iput-object p4, p0, Le3/f$d;->h:Ljava/lang/reflect/Method;

    iput-object p5, p0, Le3/f$d;->i:Le3/e;

    iput-object p6, p0, Le3/f$d;->j:Le3/e;

    iput-object p8, p0, Le3/f$d;->k:Le3/f$h;

    return-void
.end method


# virtual methods
.method public c(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/net/ssl/SSLSocket;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Le3/g;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_0

    iget-object v2, p0, Le3/f$d;->e:Le3/e;

    new-array v3, v1, [Ljava/lang/Object;

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    aput-object v4, v3, v0

    invoke-virtual {v2, p1, v3}, Le3/e;->e(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Le3/f$d;->f:Le3/e;

    new-array v3, v1, [Ljava/lang/Object;

    aput-object p2, v3, v0

    invoke-virtual {v2, p1, v3}, Le3/e;->e(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object p2, p0, Le3/f$d;->j:Le3/e;

    invoke-virtual {p2, p1}, Le3/e;->g(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p3}, Le3/f;->b(Ljava/util/List;)[B

    move-result-object p3

    aput-object p3, p2, v0

    iget-object p3, p0, Le3/f$d;->j:Le3/e;

    invoke-virtual {p3, p1, p2}, Le3/e;->f(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public h(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Le3/f$d;->i:Le3/e;

    invoke-virtual {v0, p1}, Le3/e;->g(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, Le3/f$d;->i:Le3/e;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v2}, Le3/e;->f(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    if-eqz p1, :cond_1

    new-instance v1, Ljava/lang/String;

    sget-object v0, Le3/i;->c:Ljava/nio/charset/Charset;

    invoke-direct {v1, p1, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    :cond_1
    return-object v1
.end method

.method public i()Le3/f$h;
    .locals 1

    iget-object v0, p0, Le3/f$d;->k:Le3/f$h;

    return-object v0
.end method
