.class Lcom/my/aviator/predictor/v8/cu;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/ct;

.field private final synthetic b:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/ct;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/cu;->a:Lcom/my/aviator/predictor/v8/ct;

    iput-object p2, p0, Lcom/my/aviator/predictor/v8/cu;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/cu;->a:Lcom/my/aviator/predictor/v8/ct;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/ct;->a(Lcom/my/aviator/predictor/v8/ct;)Lcom/my/aviator/predictor/v8/cs;

    move-result-object v0

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/cs;->a(Lcom/my/aviator/predictor/v8/cs;)Lcom/my/aviator/predictor/v8/GoogleActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/my/aviator/predictor/v8/cu;->b:Landroid/view/View;

    const-string v3, "elevation"

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v6, 0x4059000000000000L    # 100.0

    invoke-virtual/range {v1 .. v7}, Lcom/my/aviator/predictor/v8/GoogleActivity;->a(Landroid/view/View;Ljava/lang/String;DD)V

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/cu;->a:Lcom/my/aviator/predictor/v8/ct;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/ct;->a(Lcom/my/aviator/predictor/v8/ct;)Lcom/my/aviator/predictor/v8/cs;

    move-result-object v0

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/cs;->a(Lcom/my/aviator/predictor/v8/cs;)Lcom/my/aviator/predictor/v8/GoogleActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/my/aviator/predictor/v8/cu;->b:Landroid/view/View;

    const-string v3, "scaleX"

    const-wide v4, 0x3fec28f5c28f5c29L    # 0.88

    invoke-virtual/range {v1 .. v7}, Lcom/my/aviator/predictor/v8/GoogleActivity;->a(Landroid/view/View;Ljava/lang/String;DD)V

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/cu;->a:Lcom/my/aviator/predictor/v8/ct;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/ct;->a(Lcom/my/aviator/predictor/v8/ct;)Lcom/my/aviator/predictor/v8/cs;

    move-result-object v0

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/cs;->a(Lcom/my/aviator/predictor/v8/cs;)Lcom/my/aviator/predictor/v8/GoogleActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/my/aviator/predictor/v8/cu;->b:Landroid/view/View;

    const-string v3, "scaleY"

    invoke-virtual/range {v1 .. v7}, Lcom/my/aviator/predictor/v8/GoogleActivity;->a(Landroid/view/View;Ljava/lang/String;DD)V

    return-void
.end method
