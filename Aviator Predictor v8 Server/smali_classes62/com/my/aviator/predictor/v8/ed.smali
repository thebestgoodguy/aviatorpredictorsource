.class Lcom/my/aviator/predictor/v8/ed;
.super Ljava/lang/Object;

# interfaces
.implements Lokhttp3/Callback;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/ea;

.field private final synthetic b:Lcom/my/aviator/predictor/v8/dy;

.field private final synthetic c:Lcom/my/aviator/predictor/v8/dz;

.field private final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/ea;Lcom/my/aviator/predictor/v8/dy;Lcom/my/aviator/predictor/v8/dz;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/ed;->a:Lcom/my/aviator/predictor/v8/ea;

    iput-object p2, p0, Lcom/my/aviator/predictor/v8/ed;->b:Lcom/my/aviator/predictor/v8/dy;

    iput-object p3, p0, Lcom/my/aviator/predictor/v8/ed;->c:Lcom/my/aviator/predictor/v8/dz;

    iput-object p4, p0, Lcom/my/aviator/predictor/v8/ed;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lokhttp3/Call;Ljava/io/IOException;)V
    .locals 3

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/ed;->b:Lcom/my/aviator/predictor/v8/dy;

    invoke-virtual {p1}, Lcom/my/aviator/predictor/v8/dy;->c()Landroid/app/Activity;

    move-result-object p1

    new-instance v0, Lcom/my/aviator/predictor/v8/ee;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/ed;->c:Lcom/my/aviator/predictor/v8/dz;

    iget-object v2, p0, Lcom/my/aviator/predictor/v8/ed;->d:Ljava/lang/String;

    invoke-direct {v0, p0, v1, v2, p2}, Lcom/my/aviator/predictor/v8/ee;-><init>(Lcom/my/aviator/predictor/v8/ed;Lcom/my/aviator/predictor/v8/dz;Ljava/lang/String;Ljava/io/IOException;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onResponse(Lokhttp3/Call;Lokhttp3/Response;)V
    .locals 7

    invoke-virtual {p2}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object p1

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/ed;->b:Lcom/my/aviator/predictor/v8/dy;

    invoke-virtual {p1}, Lcom/my/aviator/predictor/v8/dy;->c()Landroid/app/Activity;

    move-result-object p1

    new-instance v6, Lcom/my/aviator/predictor/v8/ef;

    iget-object v3, p0, Lcom/my/aviator/predictor/v8/ed;->c:Lcom/my/aviator/predictor/v8/dz;

    iget-object v4, p0, Lcom/my/aviator/predictor/v8/ed;->d:Ljava/lang/String;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/my/aviator/predictor/v8/ef;-><init>(Lcom/my/aviator/predictor/v8/ed;Lokhttp3/Response;Lcom/my/aviator/predictor/v8/dz;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v6}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
