.class Lcom/my/aviator/predictor/v8/bm;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/AviatorActivity;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/bm;->a:Lcom/my/aviator/predictor/v8/AviatorActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/bm;->a:Lcom/my/aviator/predictor/v8/AviatorActivity;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/AviatorActivity;->-$$Nest$fgetr(Lcom/my/aviator/predictor/v8/AviatorActivity;)Landroid/content/Intent;

    move-result-object p1

    const-string v0, "android.intent.action.VIEW"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/bm;->a:Lcom/my/aviator/predictor/v8/AviatorActivity;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/AviatorActivity;->-$$Nest$fgetr(Lcom/my/aviator/predictor/v8/AviatorActivity;)Landroid/content/Intent;

    move-result-object p1

    const-string v0, "https://1wodfv.top/v3/landing-page/casino"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/bm;->a:Lcom/my/aviator/predictor/v8/AviatorActivity;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/AviatorActivity;->-$$Nest$fgetr(Lcom/my/aviator/predictor/v8/AviatorActivity;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/my/aviator/predictor/v8/AviatorActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
