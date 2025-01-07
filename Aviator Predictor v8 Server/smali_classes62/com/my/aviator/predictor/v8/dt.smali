.class Lcom/my/aviator/predictor/v8/dt;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/ds;

.field private final synthetic b:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/ds;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/dt;->a:Lcom/my/aviator/predictor/v8/ds;

    iput-object p2, p0, Lcom/my/aviator/predictor/v8/dt;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/dt;->a:Lcom/my/aviator/predictor/v8/ds;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/ds;->a(Lcom/my/aviator/predictor/v8/ds;)Lcom/my/aviator/predictor/v8/dr;

    move-result-object v0

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/dr;->a(Lcom/my/aviator/predictor/v8/dr;)Lcom/my/aviator/predictor/v8/MainActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/my/aviator/predictor/v8/dt;->b:Landroid/view/View;

    const-string v3, "elevation"

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v6, 0x4059000000000000L    # 100.0

    invoke-virtual/range {v1 .. v7}, Lcom/my/aviator/predictor/v8/MainActivity;->a(Landroid/view/View;Ljava/lang/String;DD)V

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/dt;->a:Lcom/my/aviator/predictor/v8/ds;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/ds;->a(Lcom/my/aviator/predictor/v8/ds;)Lcom/my/aviator/predictor/v8/dr;

    move-result-object v0

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/dr;->a(Lcom/my/aviator/predictor/v8/dr;)Lcom/my/aviator/predictor/v8/MainActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/my/aviator/predictor/v8/dt;->b:Landroid/view/View;

    const-string v3, "scaleX"

    const-wide v4, 0x3fec28f5c28f5c29L    # 0.88

    invoke-virtual/range {v1 .. v7}, Lcom/my/aviator/predictor/v8/MainActivity;->a(Landroid/view/View;Ljava/lang/String;DD)V

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/dt;->a:Lcom/my/aviator/predictor/v8/ds;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/ds;->a(Lcom/my/aviator/predictor/v8/ds;)Lcom/my/aviator/predictor/v8/dr;

    move-result-object v0

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/dr;->a(Lcom/my/aviator/predictor/v8/dr;)Lcom/my/aviator/predictor/v8/MainActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/my/aviator/predictor/v8/dt;->b:Landroid/view/View;

    const-string v3, "scaleY"

    invoke-virtual/range {v1 .. v7}, Lcom/my/aviator/predictor/v8/MainActivity;->a(Landroid/view/View;Ljava/lang/String;DD)V

    return-void
.end method
