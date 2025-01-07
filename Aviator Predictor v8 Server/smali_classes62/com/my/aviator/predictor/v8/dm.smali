.class Lcom/my/aviator/predictor/v8/dm;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/dk;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/dk;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/dm;->a:Lcom/my/aviator/predictor/v8/dk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/dm;->a:Lcom/my/aviator/predictor/v8/dk;

    invoke-static {p1}, Lcom/my/aviator/predictor/v8/dk;->a(Lcom/my/aviator/predictor/v8/dk;)Lcom/my/aviator/predictor/v8/MainActivity;

    move-result-object p1

    invoke-virtual {p1}, Lcom/my/aviator/predictor/v8/MainActivity;->finish()V

    return-void
.end method
