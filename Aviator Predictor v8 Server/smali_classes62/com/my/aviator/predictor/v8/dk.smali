.class Lcom/my/aviator/predictor/v8/dk;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/my/aviator/predictor/v8/dz;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/MainActivity;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/dk;->a:Lcom/my/aviator/predictor/v8/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/my/aviator/predictor/v8/dk;)Lcom/my/aviator/predictor/v8/MainActivity;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/dk;->a:Lcom/my/aviator/predictor/v8/MainActivity;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/dk;->a:Lcom/my/aviator/predictor/v8/MainActivity;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/MainActivity;->-$$Nest$fgetx(Lcom/my/aviator/predictor/v8/MainActivity;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const p2, 0x7f070076

    invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/dk;->a:Lcom/my/aviator/predictor/v8/MainActivity;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/MainActivity;->-$$Nest$fgetx(Lcom/my/aviator/predictor/v8/MainActivity;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const-string p2, "system notice"

    invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/dk;->a:Lcom/my/aviator/predictor/v8/MainActivity;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/MainActivity;->-$$Nest$fgetx(Lcom/my/aviator/predictor/v8/MainActivity;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const-string p2, "No internet connection"

    invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/dk;->a:Lcom/my/aviator/predictor/v8/MainActivity;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/MainActivity;->-$$Nest$fgetx(Lcom/my/aviator/predictor/v8/MainActivity;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    new-instance p2, Lcom/my/aviator/predictor/v8/dl;

    invoke-direct {p2, p0}, Lcom/my/aviator/predictor/v8/dl;-><init>(Lcom/my/aviator/predictor/v8/dk;)V

    const-string v0, "Retry"

    invoke-virtual {p1, v0, p2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/dk;->a:Lcom/my/aviator/predictor/v8/MainActivity;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/MainActivity;->-$$Nest$fgetx(Lcom/my/aviator/predictor/v8/MainActivity;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    new-instance p2, Lcom/my/aviator/predictor/v8/dm;

    invoke-direct {p2, p0}, Lcom/my/aviator/predictor/v8/dm;-><init>(Lcom/my/aviator/predictor/v8/dk;)V

    const-string v0, "Exit"

    invoke-virtual {p1, v0, p2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/dk;->a:Lcom/my/aviator/predictor/v8/MainActivity;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/MainActivity;->-$$Nest$fgetx(Lcom/my/aviator/predictor/v8/MainActivity;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/dk;->a:Lcom/my/aviator/predictor/v8/MainActivity;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/MainActivity;->-$$Nest$fgetx(Lcom/my/aviator/predictor/v8/MainActivity;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    return-void
.end method
