.class public Lu2/s0;
.super Ljava/lang/Exception;
.source ""


# instance fields
.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Exception;Ljava/lang/Throwable;)V
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lu2/s0;->g:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    instance-of v1, p1, Lcom/google/firebase/auth/q;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Lcom/google/firebase/auth/q;

    invoke-virtual {v1}, Lcom/google/firebase/auth/q;->a()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, "UNKNOWN"

    :goto_0
    instance-of v2, p1, Lcom/google/firebase/auth/x;

    if-eqz v2, :cond_1

    move-object p2, p1

    check-cast p2, Lcom/google/firebase/auth/x;

    invoke-virtual {p2}, Lcom/google/firebase/auth/x;->b()Ljava/lang/String;

    move-result-object p2

    :cond_1
    instance-of v2, p1, Lcom/google/firebase/auth/w;

    if-eqz v2, :cond_3

    check-cast p1, Lcom/google/firebase/auth/w;

    invoke-virtual {p1}, Lcom/google/firebase/auth/w;->b()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    const-string v3, "email"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-virtual {p1}, Lcom/google/firebase/auth/w;->c()Lcom/google/firebase/auth/h;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-static {p1}, Lu2/r0;->m1(Lcom/google/firebase/auth/h;)Ljava/util/Map;

    move-result-object p1

    const-string v2, "authCredential"

    invoke-interface {v0, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iput-object v1, p0, Lu2/s0;->e:Ljava/lang/String;

    iput-object p2, p0, Lu2/s0;->f:Ljava/lang/String;

    iput-object v0, p0, Lu2/s0;->g:Ljava/util/Map;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lu2/s0;->g:Ljava/util/Map;

    iput-object p1, p0, Lu2/s0;->e:Ljava/lang/String;

    iput-object p2, p0, Lu2/s0;->f:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lu2/s0;->g:Ljava/util/Map;

    iput-object p1, p0, Lu2/s0;->e:Ljava/lang/String;

    iput-object p2, p0, Lu2/s0;->f:Ljava/lang/String;

    iput-object p3, p0, Lu2/s0;->g:Ljava/util/Map;

    return-void
.end method

.method static a()Lu2/s0;
    .locals 3

    new-instance v0, Lu2/s0;

    const-string v1, "PROVIDER_ALREADY_LINKED"

    const-string v2, "User has already been linked to the given provider."

    invoke-direct {v0, v1, v2}, Lu2/s0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method static d()Lu2/s0;
    .locals 3

    new-instance v0, Lu2/s0;

    const-string v1, "INVALID_CREDENTIAL"

    const-string v2, "The supplied auth credential is malformed, has expired or is not currently supported."

    invoke-direct {v0, v1, v2}, Lu2/s0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method static e()Lu2/s0;
    .locals 3

    new-instance v0, Lu2/s0;

    const-string v1, "NO_SUCH_PROVIDER"

    const-string v2, "User was not linked to an account with the given provider."

    invoke-direct {v0, v1, v2}, Lu2/s0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method static f()Lu2/s0;
    .locals 3

    new-instance v0, Lu2/s0;

    const-string v1, "NO_CURRENT_USER"

    const-string v2, "No user currently signed in."

    invoke-direct {v0, v1, v2}, Lu2/s0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public b()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lu2/s0;->g:Ljava/util/Map;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lu2/s0;->e:Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "error_"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "_"

    const-string v2, "-"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu2/s0;->f:Ljava/lang/String;

    return-object v0
.end method
