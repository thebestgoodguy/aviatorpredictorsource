.class Lcom/my/aviator/predictor/v8/dl;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/dk;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/dk;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/dl;->a:Lcom/my/aviator/predictor/v8/dk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/dl;->a:Lcom/my/aviator/predictor/v8/dk;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/dk;->a(Lcom/my/aviator/predictor/v8/dk;)Lcom/my/aviator/predictor/v8/MainActivity;

    move-result-object p1

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/MainActivity;->-$$Nest$fgetv(Lcom/my/aviator/predictor/v8/MainActivity;)Lcom/my/aviator/predictor/v8/dy;

    move-result-object p1

    iget-object p2, p0, Lcom/my/aviator/predictor/v8/dl;->a:Lcom/my/aviator/predictor/v8/dk;

    invoke-static {p2}, Lcom/my/aviator/predictor/v8/dk;->a(Lcom/my/aviator/predictor/v8/dk;)Lcom/my/aviator/predictor/v8/MainActivity;

    move-result-object p2

    invoke-static {p2}, Lcom/my/aviator/predictor/v8/MainActivity;->-$$Nest$fgetw(Lcom/my/aviator/predictor/v8/MainActivity;)Lcom/my/aviator/predictor/v8/dz;

    move-result-object p2

    const-string v0, "GET"

    const-string v1, "https://www.google.com"

    const-string v2, "A"

    invoke-virtual {p1, v0, v1, v2, p2}, Lcom/my/aviator/predictor/v8/dy;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/my/aviator/predictor/v8/dz;)V

    return-void
.end method
