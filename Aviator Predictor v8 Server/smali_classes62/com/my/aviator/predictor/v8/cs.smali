.class Lcom/my/aviator/predictor/v8/cs;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/GoogleActivity;

.field private final synthetic b:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/GoogleActivity;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/cs;->a:Lcom/my/aviator/predictor/v8/GoogleActivity;

    iput-object p2, p0, Lcom/my/aviator/predictor/v8/cs;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/my/aviator/predictor/v8/cs;)Lcom/my/aviator/predictor/v8/GoogleActivity;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/cs;->a:Lcom/my/aviator/predictor/v8/GoogleActivity;

    return-object p0
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 19

    move-object/from16 v0, p0

    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v1, v0, Lcom/my/aviator/predictor/v8/cs;->a:Lcom/my/aviator/predictor/v8/GoogleActivity;

    invoke-static {v1}, Lcom/my/aviator/predictor/v8/GoogleActivity;->-$$Nest$fgeti(Lcom/my/aviator/predictor/v8/GoogleActivity;)Ljava/util/TimerTask;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/TimerTask;->cancel()Z

    iget-object v2, v0, Lcom/my/aviator/predictor/v8/cs;->a:Lcom/my/aviator/predictor/v8/GoogleActivity;

    iget-object v3, v0, Lcom/my/aviator/predictor/v8/cs;->b:Landroid/view/View;

    const-wide/high16 v5, 0x4044000000000000L    # 40.0

    const-wide/high16 v7, 0x4059000000000000L    # 100.0

    const-string v4, "elevation"

    invoke-virtual/range {v2 .. v8}, Lcom/my/aviator/predictor/v8/GoogleActivity;->a(Landroid/view/View;Ljava/lang/String;DD)V

    iget-object v9, v0, Lcom/my/aviator/predictor/v8/cs;->a:Lcom/my/aviator/predictor/v8/GoogleActivity;

    iget-object v10, v0, Lcom/my/aviator/predictor/v8/cs;->b:Landroid/view/View;

    const-wide v12, 0x3ff199999999999aL    # 1.1

    const-wide/high16 v14, 0x4059000000000000L    # 100.0

    const-string v11, "scaleX"

    invoke-virtual/range {v9 .. v15}, Lcom/my/aviator/predictor/v8/GoogleActivity;->a(Landroid/view/View;Ljava/lang/String;DD)V

    iget-object v1, v0, Lcom/my/aviator/predictor/v8/cs;->a:Lcom/my/aviator/predictor/v8/GoogleActivity;

    iget-object v2, v0, Lcom/my/aviator/predictor/v8/cs;->b:Landroid/view/View;

    const-wide v4, 0x3ff199999999999aL    # 1.1

    const-wide/high16 v6, 0x4059000000000000L    # 100.0

    const-string v3, "scaleY"

    invoke-virtual/range {v1 .. v7}, Lcom/my/aviator/predictor/v8/GoogleActivity;->a(Landroid/view/View;Ljava/lang/String;DD)V

    iget-object v1, v0, Lcom/my/aviator/predictor/v8/cs;->a:Lcom/my/aviator/predictor/v8/GoogleActivity;

    new-instance v2, Lcom/my/aviator/predictor/v8/cv;

    iget-object v3, v0, Lcom/my/aviator/predictor/v8/cs;->b:Landroid/view/View;

    invoke-direct {v2, v0, v3}, Lcom/my/aviator/predictor/v8/cv;-><init>(Lcom/my/aviator/predictor/v8/cs;Landroid/view/View;)V

    invoke-static {v1, v2}, Lcom/my/aviator/predictor/v8/GoogleActivity;->-$$Nest$fputi(Lcom/my/aviator/predictor/v8/GoogleActivity;Ljava/util/TimerTask;)V

    iget-object v1, v0, Lcom/my/aviator/predictor/v8/cs;->a:Lcom/my/aviator/predictor/v8/GoogleActivity;

    invoke-static {v1}, Lcom/my/aviator/predictor/v8/GoogleActivity;->-$$Nest$fgeta(Lcom/my/aviator/predictor/v8/GoogleActivity;)Ljava/util/Timer;

    move-result-object v1

    iget-object v2, v0, Lcom/my/aviator/predictor/v8/cs;->a:Lcom/my/aviator/predictor/v8/GoogleActivity;

    invoke-static {v2}, Lcom/my/aviator/predictor/v8/GoogleActivity;->-$$Nest$fgeti(Lcom/my/aviator/predictor/v8/GoogleActivity;)Ljava/util/TimerTask;

    move-result-object v2

    const-wide/16 v3, 0x64

    goto :goto_0

    :cond_1
    iget-object v5, v0, Lcom/my/aviator/predictor/v8/cs;->a:Lcom/my/aviator/predictor/v8/GoogleActivity;

    iget-object v6, v0, Lcom/my/aviator/predictor/v8/cs;->b:Landroid/view/View;

    const-wide/high16 v8, 0x4014000000000000L    # 5.0

    const-wide v10, 0x4051800000000000L    # 70.0

    const-string v7, "elevation"

    invoke-virtual/range {v5 .. v11}, Lcom/my/aviator/predictor/v8/GoogleActivity;->a(Landroid/view/View;Ljava/lang/String;DD)V

    iget-object v12, v0, Lcom/my/aviator/predictor/v8/cs;->a:Lcom/my/aviator/predictor/v8/GoogleActivity;

    iget-object v13, v0, Lcom/my/aviator/predictor/v8/cs;->b:Landroid/view/View;

    const-wide v15, 0x3feccccccccccccdL    # 0.9

    const-wide v17, 0x4051800000000000L    # 70.0

    const-string v14, "scaleX"

    invoke-virtual/range {v12 .. v18}, Lcom/my/aviator/predictor/v8/GoogleActivity;->a(Landroid/view/View;Ljava/lang/String;DD)V

    iget-object v1, v0, Lcom/my/aviator/predictor/v8/cs;->a:Lcom/my/aviator/predictor/v8/GoogleActivity;

    iget-object v2, v0, Lcom/my/aviator/predictor/v8/cs;->b:Landroid/view/View;

    const-wide v4, 0x3feccccccccccccdL    # 0.9

    const-wide v6, 0x4051800000000000L    # 70.0

    const-string v3, "scaleY"

    invoke-virtual/range {v1 .. v7}, Lcom/my/aviator/predictor/v8/GoogleActivity;->a(Landroid/view/View;Ljava/lang/String;DD)V

    iget-object v1, v0, Lcom/my/aviator/predictor/v8/cs;->a:Lcom/my/aviator/predictor/v8/GoogleActivity;

    new-instance v2, Lcom/my/aviator/predictor/v8/ct;

    iget-object v3, v0, Lcom/my/aviator/predictor/v8/cs;->b:Landroid/view/View;

    invoke-direct {v2, v0, v3}, Lcom/my/aviator/predictor/v8/ct;-><init>(Lcom/my/aviator/predictor/v8/cs;Landroid/view/View;)V

    invoke-static {v1, v2}, Lcom/my/aviator/predictor/v8/GoogleActivity;->-$$Nest$fputi(Lcom/my/aviator/predictor/v8/GoogleActivity;Ljava/util/TimerTask;)V

    iget-object v1, v0, Lcom/my/aviator/predictor/v8/cs;->a:Lcom/my/aviator/predictor/v8/GoogleActivity;

    invoke-static {v1}, Lcom/my/aviator/predictor/v8/GoogleActivity;->-$$Nest$fgeta(Lcom/my/aviator/predictor/v8/GoogleActivity;)Ljava/util/Timer;

    move-result-object v1

    iget-object v2, v0, Lcom/my/aviator/predictor/v8/cs;->a:Lcom/my/aviator/predictor/v8/GoogleActivity;

    invoke-static {v2}, Lcom/my/aviator/predictor/v8/GoogleActivity;->-$$Nest$fgeti(Lcom/my/aviator/predictor/v8/GoogleActivity;)Ljava/util/TimerTask;

    move-result-object v2

    const-wide/16 v3, 0x46

    :goto_0
    invoke-virtual {v1, v2, v3, v4}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :goto_1
    const/4 v1, 0x0

    return v1
.end method
