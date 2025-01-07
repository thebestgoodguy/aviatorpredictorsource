.class Lcom/my/aviator/predictor/v8/dg;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/MainActivity;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/dg;->a:Lcom/my/aviator/predictor/v8/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/my/aviator/predictor/v8/dg;)Lcom/my/aviator/predictor/v8/MainActivity;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/dg;->a:Lcom/my/aviator/predictor/v8/MainActivity;

    return-object p0
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/dg;->a:Lcom/my/aviator/predictor/v8/MainActivity;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/MainActivity;->-$$Nest$fgetg(Lcom/my/aviator/predictor/v8/MainActivity;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/dg;->a:Lcom/my/aviator/predictor/v8/MainActivity;

    new-instance v0, Lcom/my/aviator/predictor/v8/dh;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/dh;-><init>(Lcom/my/aviator/predictor/v8/dg;)V

    invoke-static {p1, v0}, Lcom/my/aviator/predictor/v8/MainActivity;->-$$Nest$fputB(Lcom/my/aviator/predictor/v8/MainActivity;Ljava/util/TimerTask;)V

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/dg;->a:Lcom/my/aviator/predictor/v8/MainActivity;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/MainActivity;->-$$Nest$fgeta(Lcom/my/aviator/predictor/v8/MainActivity;)Ljava/util/Timer;

    move-result-object p1

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/dg;->a:Lcom/my/aviator/predictor/v8/MainActivity;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/MainActivity;->-$$Nest$fgetB(Lcom/my/aviator/predictor/v8/MainActivity;)Ljava/util/TimerTask;

    move-result-object v0

    const-wide/16 v1, 0x3e8

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    goto/16 :goto_0

    :cond_0
    iget-object p1, p0, Lcom/my/aviator/predictor/v8/dg;->a:Lcom/my/aviator/predictor/v8/MainActivity;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/MainActivity;->-$$Nest$fgetD(Lcom/my/aviator/predictor/v8/MainActivity;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const v0, 0x7f070006

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/dg;->a:Lcom/my/aviator/predictor/v8/MainActivity;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/MainActivity;->-$$Nest$fgetD(Lcom/my/aviator/predictor/v8/MainActivity;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const-string v0, "AVIATOR PREDICTOR V8"

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    new-instance p1, Landroid/widget/LinearLayout;

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/dg;->a:Lcom/my/aviator/predictor/v8/MainActivity;

    invoke-direct {p1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/widget/EditText;

    iget-object v3, p0, Lcom/my/aviator/predictor/v8/dg;->a:Lcom/my/aviator/predictor/v8/MainActivity;

    invoke-direct {v0, v3}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v3, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v3}, Landroid/widget/EditText;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const-string v3, "Enter the Password"

    invoke-virtual {v0, v3}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    new-instance v3, Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v4, p0, Lcom/my/aviator/predictor/v8/dg;->a:Lcom/my/aviator/predictor/v8/MainActivity;

    invoke-direct {v3, v4}, Lcom/google/android/material/textfield/TextInputLayout;-><init>(Landroid/content/Context;)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v4, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v4}, Lcom/google/android/material/textfield/TextInputLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v1, 0x20

    const/16 v2, 0x8

    invoke-virtual {v3, v1, v2, v1, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setPadding(IIII)V

    invoke-virtual {v3, v0}, Lcom/google/android/material/textfield/TextInputLayout;->addView(Landroid/view/View;)V

    invoke-virtual {p1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/dg;->a:Lcom/my/aviator/predictor/v8/MainActivity;

    invoke-static {v1}, Lcom/my/aviator/predictor/v8/MainActivity;->-$$Nest$fgetD(Lcom/my/aviator/predictor/v8/MainActivity;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/dg;->a:Lcom/my/aviator/predictor/v8/MainActivity;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/MainActivity;->-$$Nest$fgetD(Lcom/my/aviator/predictor/v8/MainActivity;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    new-instance v1, Lcom/my/aviator/predictor/v8/dj;

    invoke-direct {v1, p0, v0}, Lcom/my/aviator/predictor/v8/dj;-><init>(Lcom/my/aviator/predictor/v8/dg;Landroid/widget/EditText;)V

    const-string v0, "ok"

    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/dg;->a:Lcom/my/aviator/predictor/v8/MainActivity;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/MainActivity;->-$$Nest$fgetD(Lcom/my/aviator/predictor/v8/MainActivity;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V

    :goto_0
    return-void
.end method
