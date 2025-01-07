.class Lcom/my/aviator/predictor/v8/da;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/Ibooo2Activity;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/Ibooo2Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/da;->a:Lcom/my/aviator/predictor/v8/Ibooo2Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/my/aviator/predictor/v8/da;)Lcom/my/aviator/predictor/v8/Ibooo2Activity;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/da;->a:Lcom/my/aviator/predictor/v8/Ibooo2Activity;

    return-object p0
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/da;->a:Lcom/my/aviator/predictor/v8/Ibooo2Activity;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->-$$Nest$fgetr(Lcom/my/aviator/predictor/v8/Ibooo2Activity;)Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/da;->a:Lcom/my/aviator/predictor/v8/Ibooo2Activity;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->-$$Nest$fgetr(Lcom/my/aviator/predictor/v8/Ibooo2Activity;)Landroid/widget/EditText;

    move-result-object p1

    const-string v0, "you didn\'t follow the rules"

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setError(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    :cond_0
    iget-object p1, p0, Lcom/my/aviator/predictor/v8/da;->a:Lcom/my/aviator/predictor/v8/Ibooo2Activity;

    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/da;->a:Lcom/my/aviator/predictor/v8/Ibooo2Activity;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->-$$Nest$fputx(Lcom/my/aviator/predictor/v8/Ibooo2Activity;Landroid/app/AlertDialog;)V

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/da;->a:Lcom/my/aviator/predictor/v8/Ibooo2Activity;

    invoke-virtual {p1}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0b006b

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/da;->a:Lcom/my/aviator/predictor/v8/Ibooo2Activity;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->-$$Nest$fgetx(Lcom/my/aviator/predictor/v8/Ibooo2Activity;)Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog;->setView(Landroid/view/View;)V

    const v0, 0x7f0800fb

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    const v0, 0x7f0800fc

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    const v0, 0x7f0800ed

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const v0, 0x7f0801ee

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v0, 0x7f0801ef

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v0, 0x7f080060

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/da;->a:Lcom/my/aviator/predictor/v8/Ibooo2Activity;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->-$$Nest$fgetx(Lcom/my/aviator/predictor/v8/Ibooo2Activity;)Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/da;->a:Lcom/my/aviator/predictor/v8/Ibooo2Activity;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->-$$Nest$fgetx(Lcom/my/aviator/predictor/v8/Ibooo2Activity;)Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog;->setCancelable(Z)V

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/da;->a:Lcom/my/aviator/predictor/v8/Ibooo2Activity;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->-$$Nest$fgetx(Lcom/my/aviator/predictor/v8/Ibooo2Activity;)Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    new-instance v0, Lcom/my/aviator/predictor/v8/db;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/db;-><init>(Lcom/my/aviator/predictor/v8/da;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method
