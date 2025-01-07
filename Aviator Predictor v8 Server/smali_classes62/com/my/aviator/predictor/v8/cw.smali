.class Lcom/my/aviator/predictor/v8/cw;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/cv;

.field private final synthetic b:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/cv;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/cw;->a:Lcom/my/aviator/predictor/v8/cv;

    iput-object p2, p0, Lcom/my/aviator/predictor/v8/cw;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/cw;->a:Lcom/my/aviator/predictor/v8/cv;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/cv;->a(Lcom/my/aviator/predictor/v8/cv;)Lcom/my/aviator/predictor/v8/cs;

    move-result-object v0

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/cs;->a(Lcom/my/aviator/predictor/v8/cs;)Lcom/my/aviator/predictor/v8/GoogleActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/my/aviator/predictor/v8/cw;->b:Landroid/view/View;

    const-string v3, "elevation"

    const-wide/high16 v4, 0x4039000000000000L    # 25.0

    const-wide/high16 v6, 0x4059000000000000L    # 100.0

    invoke-virtual/range {v1 .. v7}, Lcom/my/aviator/predictor/v8/GoogleActivity;->a(Landroid/view/View;Ljava/lang/String;DD)V

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/cw;->a:Lcom/my/aviator/predictor/v8/cv;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/cv;->a(Lcom/my/aviator/predictor/v8/cv;)Lcom/my/aviator/predictor/v8/cs;

    move-result-object v0

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/cs;->a(Lcom/my/aviator/predictor/v8/cs;)Lcom/my/aviator/predictor/v8/GoogleActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/my/aviator/predictor/v8/cw;->b:Landroid/view/View;

    const-string v3, "scaleX"

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    invoke-virtual/range {v1 .. v7}, Lcom/my/aviator/predictor/v8/GoogleActivity;->a(Landroid/view/View;Ljava/lang/String;DD)V

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/cw;->a:Lcom/my/aviator/predictor/v8/cv;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/cv;->a(Lcom/my/aviator/predictor/v8/cv;)Lcom/my/aviator/predictor/v8/cs;

    move-result-object v0

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/cs;->a(Lcom/my/aviator/predictor/v8/cs;)Lcom/my/aviator/predictor/v8/GoogleActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/my/aviator/predictor/v8/cw;->b:Landroid/view/View;

    const-string v3, "svaleY"

    invoke-virtual/range {v1 .. v7}, Lcom/my/aviator/predictor/v8/GoogleActivity;->a(Landroid/view/View;Ljava/lang/String;DD)V

    return-void
.end method
