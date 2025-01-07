.class Lcom/my/aviator/predictor/v8/dv;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/du;

.field private final synthetic b:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/du;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/dv;->a:Lcom/my/aviator/predictor/v8/du;

    iput-object p2, p0, Lcom/my/aviator/predictor/v8/dv;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/dv;->a:Lcom/my/aviator/predictor/v8/du;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/du;->a(Lcom/my/aviator/predictor/v8/du;)Lcom/my/aviator/predictor/v8/dr;

    move-result-object v0

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/dr;->a(Lcom/my/aviator/predictor/v8/dr;)Lcom/my/aviator/predictor/v8/MainActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/my/aviator/predictor/v8/dv;->b:Landroid/view/View;

    const-string v3, "elevation"

    const-wide/high16 v4, 0x4039000000000000L    # 25.0

    const-wide/high16 v6, 0x4059000000000000L    # 100.0

    invoke-virtual/range {v1 .. v7}, Lcom/my/aviator/predictor/v8/MainActivity;->a(Landroid/view/View;Ljava/lang/String;DD)V

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/dv;->a:Lcom/my/aviator/predictor/v8/du;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/du;->a(Lcom/my/aviator/predictor/v8/du;)Lcom/my/aviator/predictor/v8/dr;

    move-result-object v0

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/dr;->a(Lcom/my/aviator/predictor/v8/dr;)Lcom/my/aviator/predictor/v8/MainActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/my/aviator/predictor/v8/dv;->b:Landroid/view/View;

    const-string v3, "scaleX"

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    invoke-virtual/range {v1 .. v7}, Lcom/my/aviator/predictor/v8/MainActivity;->a(Landroid/view/View;Ljava/lang/String;DD)V

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/dv;->a:Lcom/my/aviator/predictor/v8/du;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/du;->a(Lcom/my/aviator/predictor/v8/du;)Lcom/my/aviator/predictor/v8/dr;

    move-result-object v0

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/dr;->a(Lcom/my/aviator/predictor/v8/dr;)Lcom/my/aviator/predictor/v8/MainActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/my/aviator/predictor/v8/dv;->b:Landroid/view/View;

    const-string v3, "svaleY"

    invoke-virtual/range {v1 .. v7}, Lcom/my/aviator/predictor/v8/MainActivity;->a(Landroid/view/View;Ljava/lang/String;DD)V

    return-void
.end method
