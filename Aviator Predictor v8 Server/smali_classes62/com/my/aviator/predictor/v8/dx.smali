.class Lcom/my/aviator/predictor/v8/dx;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/QoidalarActivity;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/QoidalarActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/dx;->a:Lcom/my/aviator/predictor/v8/QoidalarActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/dx;->a:Lcom/my/aviator/predictor/v8/QoidalarActivity;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/QoidalarActivity;->-$$Nest$fgeti(Lcom/my/aviator/predictor/v8/QoidalarActivity;)Landroid/content/Intent;

    move-result-object p1

    const-string v0, "android.intent.action.VIEW"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/dx;->a:Lcom/my/aviator/predictor/v8/QoidalarActivity;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/QoidalarActivity;->-$$Nest$fgeti(Lcom/my/aviator/predictor/v8/QoidalarActivity;)Landroid/content/Intent;

    move-result-object p1

    const-string v0, "https://t.me/samo_tips"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/dx;->a:Lcom/my/aviator/predictor/v8/QoidalarActivity;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/QoidalarActivity;->-$$Nest$fgeti(Lcom/my/aviator/predictor/v8/QoidalarActivity;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/my/aviator/predictor/v8/QoidalarActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
