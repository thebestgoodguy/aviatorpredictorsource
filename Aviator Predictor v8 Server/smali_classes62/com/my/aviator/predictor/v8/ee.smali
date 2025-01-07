.class Lcom/my/aviator/predictor/v8/ee;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/ed;

.field private final synthetic b:Lcom/my/aviator/predictor/v8/dz;

.field private final synthetic c:Ljava/lang/String;

.field private final synthetic d:Ljava/io/IOException;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/ed;Lcom/my/aviator/predictor/v8/dz;Ljava/lang/String;Ljava/io/IOException;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/ee;->a:Lcom/my/aviator/predictor/v8/ed;

    iput-object p2, p0, Lcom/my/aviator/predictor/v8/ee;->b:Lcom/my/aviator/predictor/v8/dz;

    iput-object p3, p0, Lcom/my/aviator/predictor/v8/ee;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/my/aviator/predictor/v8/ee;->d:Ljava/io/IOException;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/ee;->b:Lcom/my/aviator/predictor/v8/dz;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/ee;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/my/aviator/predictor/v8/ee;->d:Ljava/io/IOException;

    invoke-virtual {v2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/my/aviator/predictor/v8/dz;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
