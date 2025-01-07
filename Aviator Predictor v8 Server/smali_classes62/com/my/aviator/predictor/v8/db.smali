.class Lcom/my/aviator/predictor/v8/db;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/da;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/da;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/db;->a:Lcom/my/aviator/predictor/v8/da;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/my/aviator/predictor/v8/db;)Lcom/my/aviator/predictor/v8/da;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/db;->a:Lcom/my/aviator/predictor/v8/da;

    return-object p0
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/db;->a:Lcom/my/aviator/predictor/v8/da;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/da;->a(Lcom/my/aviator/predictor/v8/da;)Lcom/my/aviator/predictor/v8/Ibooo2Activity;

    move-result-object p1

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->-$$Nest$fgetk(Lcom/my/aviator/predictor/v8/Ibooo2Activity;)Landroid/widget/ProgressBar;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/db;->a:Lcom/my/aviator/predictor/v8/da;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/da;->a(Lcom/my/aviator/predictor/v8/da;)Lcom/my/aviator/predictor/v8/Ibooo2Activity;

    move-result-object p1

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->-$$Nest$fgety(Lcom/my/aviator/predictor/v8/Ibooo2Activity;)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/db;->a:Lcom/my/aviator/predictor/v8/da;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/da;->a(Lcom/my/aviator/predictor/v8/da;)Lcom/my/aviator/predictor/v8/Ibooo2Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->-$$Nest$fgetr(Lcom/my/aviator/predictor/v8/Ibooo2Activity;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "text"

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/db;->a:Lcom/my/aviator/predictor/v8/da;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/da;->a(Lcom/my/aviator/predictor/v8/da;)Lcom/my/aviator/predictor/v8/Ibooo2Activity;

    move-result-object p1

    new-instance v0, Lcom/my/aviator/predictor/v8/dc;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/dc;-><init>(Lcom/my/aviator/predictor/v8/db;)V

    invoke-static {p1, v0}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->-$$Nest$fputu(Lcom/my/aviator/predictor/v8/Ibooo2Activity;Ljava/util/TimerTask;)V

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/db;->a:Lcom/my/aviator/predictor/v8/da;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/da;->a(Lcom/my/aviator/predictor/v8/da;)Lcom/my/aviator/predictor/v8/Ibooo2Activity;

    move-result-object p1

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->-$$Nest$fgeta(Lcom/my/aviator/predictor/v8/Ibooo2Activity;)Ljava/util/Timer;

    move-result-object p1

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/db;->a:Lcom/my/aviator/predictor/v8/da;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/da;->a(Lcom/my/aviator/predictor/v8/da;)Lcom/my/aviator/predictor/v8/Ibooo2Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->-$$Nest$fgetu(Lcom/my/aviator/predictor/v8/Ibooo2Activity;)Ljava/util/TimerTask;

    move-result-object v0

    const-wide/16 v1, 0x7d0

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/db;->a:Lcom/my/aviator/predictor/v8/da;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/da;->a(Lcom/my/aviator/predictor/v8/da;)Lcom/my/aviator/predictor/v8/Ibooo2Activity;

    move-result-object p1

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->-$$Nest$fgetx(Lcom/my/aviator/predictor/v8/Ibooo2Activity;)Landroid/app/AlertDialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog;->dismiss()V

    return-void
.end method
