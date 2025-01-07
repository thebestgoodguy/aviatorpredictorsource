.class Lcom/my/aviator/predictor/v8/ef;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/ed;

.field private final synthetic b:Lokhttp3/Response;

.field private final synthetic c:Lcom/my/aviator/predictor/v8/dz;

.field private final synthetic d:Ljava/lang/String;

.field private final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/ed;Lokhttp3/Response;Lcom/my/aviator/predictor/v8/dz;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/ef;->a:Lcom/my/aviator/predictor/v8/ed;

    iput-object p2, p0, Lcom/my/aviator/predictor/v8/ef;->b:Lokhttp3/Response;

    iput-object p3, p0, Lcom/my/aviator/predictor/v8/ef;->c:Lcom/my/aviator/predictor/v8/dz;

    iput-object p4, p0, Lcom/my/aviator/predictor/v8/ef;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/my/aviator/predictor/v8/ef;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/ef;->b:Lokhttp3/Response;

    invoke-virtual {v0}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v0}, Lokhttp3/Headers;->names()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_0

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/ef;->c:Lcom/my/aviator/predictor/v8/dz;

    iget-object v2, p0, Lcom/my/aviator/predictor/v8/ef;->d:Ljava/lang/String;

    iget-object v3, p0, Lcom/my/aviator/predictor/v8/ef;->e:Ljava/lang/String;

    invoke-interface {v0, v2, v3, v1}, Lcom/my/aviator/predictor/v8/dz;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V

    return-void

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v3}, Lokhttp3/Headers;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v0, v3}, Lokhttp3/Headers;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_1
    const-string v4, "null"

    :goto_1
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method
