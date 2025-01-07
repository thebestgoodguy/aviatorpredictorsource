.class Lcom/my/aviator/predictor/v8/bd;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/bc;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/bc;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/bd;->a:Lcom/my/aviator/predictor/v8/bc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/bd;->a:Lcom/my/aviator/predictor/v8/bc;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/bc;->a(Lcom/my/aviator/predictor/v8/bc;)Lcom/my/aviator/predictor/v8/AviatorActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/AviatorActivity;->-$$Nest$fgeto(Lcom/my/aviator/predictor/v8/AviatorActivity;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "1.39x"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/bd;->a:Lcom/my/aviator/predictor/v8/bc;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/bc;->a(Lcom/my/aviator/predictor/v8/bc;)Lcom/my/aviator/predictor/v8/AviatorActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/AviatorActivity;->-$$Nest$fgetp(Lcom/my/aviator/predictor/v8/AviatorActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/bd;->a:Lcom/my/aviator/predictor/v8/bc;

    invoke-static {v1}, Lcom/my/aviator/predictor/v8/bc;->a(Lcom/my/aviator/predictor/v8/bc;)Lcom/my/aviator/predictor/v8/AviatorActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/my/aviator/predictor/v8/AviatorActivity;->-$$Nest$fgete(Lcom/my/aviator/predictor/v8/AviatorActivity;)D

    move-result-wide v1

    double-to-int v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/bd;->a:Lcom/my/aviator/predictor/v8/bc;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/bc;->a(Lcom/my/aviator/predictor/v8/bc;)Lcom/my/aviator/predictor/v8/AviatorActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/AviatorActivity;->-$$Nest$fgetp(Lcom/my/aviator/predictor/v8/AviatorActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    return-void
.end method
