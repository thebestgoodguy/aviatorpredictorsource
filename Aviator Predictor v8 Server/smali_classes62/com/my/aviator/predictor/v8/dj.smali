.class Lcom/my/aviator/predictor/v8/dj;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/dg;

.field private final synthetic b:Landroid/widget/EditText;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/dg;Landroid/widget/EditText;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/dj;->a:Lcom/my/aviator/predictor/v8/dg;

    iput-object p2, p0, Lcom/my/aviator/predictor/v8/dj;->b:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/dj;->a:Lcom/my/aviator/predictor/v8/dg;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/dg;->a(Lcom/my/aviator/predictor/v8/dg;)Lcom/my/aviator/predictor/v8/MainActivity;

    move-result-object p1

    iget-object p2, p0, Lcom/my/aviator/predictor/v8/dj;->b:Landroid/widget/EditText;

    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/my/aviator/predictor/v8/MainActivity;->-$$Nest$fputi(Lcom/my/aviator/predictor/v8/MainActivity;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/dj;->a:Lcom/my/aviator/predictor/v8/dg;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/dg;->a(Lcom/my/aviator/predictor/v8/dg;)Lcom/my/aviator/predictor/v8/MainActivity;

    move-result-object p1

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/MainActivity;->-$$Nest$fgeti(Lcom/my/aviator/predictor/v8/MainActivity;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/my/aviator/predictor/v8/dj;->a:Lcom/my/aviator/predictor/v8/dg;

    invoke-static {p2}, Lcom/my/aviator/predictor/v8/dg;->a(Lcom/my/aviator/predictor/v8/dg;)Lcom/my/aviator/predictor/v8/MainActivity;

    move-result-object p2

    invoke-static {p2}, Lcom/my/aviator/predictor/v8/MainActivity;->-$$Nest$fgeth(Lcom/my/aviator/predictor/v8/MainActivity;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/dj;->a:Lcom/my/aviator/predictor/v8/dg;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/dg;->a(Lcom/my/aviator/predictor/v8/dg;)Lcom/my/aviator/predictor/v8/MainActivity;

    move-result-object p1

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/MainActivity;->-$$Nest$fgeto(Lcom/my/aviator/predictor/v8/MainActivity;)Landroid/widget/Button;

    move-result-object p1

    const-string p2, "ACTIVE AVIATOR V8"

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/dj;->a:Lcom/my/aviator/predictor/v8/dg;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/dg;->a(Lcom/my/aviator/predictor/v8/dg;)Lcom/my/aviator/predictor/v8/MainActivity;

    move-result-object p1

    invoke-virtual {p1}, Lcom/my/aviator/predictor/v8/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "CLICK THE BUTTON AGAIN"

    invoke-static {p1, p2}, Lcom/my/aviator/predictor/v8/ej;->a(Landroid/content/Context;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/dj;->a:Lcom/my/aviator/predictor/v8/dg;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/dg;->a(Lcom/my/aviator/predictor/v8/dg;)Lcom/my/aviator/predictor/v8/MainActivity;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/my/aviator/predictor/v8/MainActivity;->-$$Nest$fputg(Lcom/my/aviator/predictor/v8/MainActivity;Z)V

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/dj;->a:Lcom/my/aviator/predictor/v8/dg;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/dg;->a(Lcom/my/aviator/predictor/v8/dg;)Lcom/my/aviator/predictor/v8/MainActivity;

    move-result-object p1

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/MainActivity;->-$$Nest$fgetn(Lcom/my/aviator/predictor/v8/MainActivity;)Landroid/widget/LinearLayout;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/my/aviator/predictor/v8/dj;->a:Lcom/my/aviator/predictor/v8/dg;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/dg;->a(Lcom/my/aviator/predictor/v8/dg;)Lcom/my/aviator/predictor/v8/MainActivity;

    move-result-object p1

    invoke-virtual {p1}, Lcom/my/aviator/predictor/v8/MainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "WRONG PASSWORD"

    invoke-static {p1, p2}, Lcom/my/aviator/predictor/v8/ej;->a(Landroid/content/Context;Ljava/lang/String;)V

    :goto_0
    return-void
.end method
