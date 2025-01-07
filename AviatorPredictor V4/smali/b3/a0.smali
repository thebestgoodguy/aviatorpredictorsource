.class public final Lb3/a0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lb3/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/a$c<",
            "Ljava/net/SocketAddress;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lb3/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/a$c<",
            "Ljava/net/SocketAddress;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lb3/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/a$c<",
            "Ljavax/net/ssl/SSLSession;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "remote-addr"

    invoke-static {v0}, Lb3/a$c;->a(Ljava/lang/String;)Lb3/a$c;

    move-result-object v0

    sput-object v0, Lb3/a0;->a:Lb3/a$c;

    const-string v0, "local-addr"

    invoke-static {v0}, Lb3/a$c;->a(Ljava/lang/String;)Lb3/a$c;

    move-result-object v0

    sput-object v0, Lb3/a0;->b:Lb3/a$c;

    const-string v0, "ssl-session"

    invoke-static {v0}, Lb3/a$c;->a(Ljava/lang/String;)Lb3/a$c;

    move-result-object v0

    sput-object v0, Lb3/a0;->c:Lb3/a$c;

    return-void
.end method
