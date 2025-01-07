.class Lcom/my/aviator/predictor/v8/df;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/MainActivity;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/df;->a:Lcom/my/aviator/predictor/v8/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/df;->a:Lcom/my/aviator/predictor/v8/MainActivity;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/MainActivity;->-$$Nest$fgetu(Lcom/my/aviator/predictor/v8/MainActivity;)Landroid/content/Intent;

    move-result-object p1

    const-string v0, "android.intent.action.VIEW"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/df;->a:Lcom/my/aviator/predictor/v8/MainActivity;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/MainActivity;->-$$Nest$fgetu(Lcom/my/aviator/predictor/v8/MainActivity;)Landroid/content/Intent;

    move-result-object p1

    const-string v0, "https://1wodfv.top/v3/landing-page/casino"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/df;->a:Lcom/my/aviator/predictor/v8/MainActivity;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/MainActivity;->-$$Nest$fgetu(Lcom/my/aviator/predictor/v8/MainActivity;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/my/aviator/predictor/v8/MainActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
