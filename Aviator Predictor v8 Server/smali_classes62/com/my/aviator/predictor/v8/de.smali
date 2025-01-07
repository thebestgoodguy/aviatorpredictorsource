.class Lcom/my/aviator/predictor/v8/de;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/MainActivity;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/de;->a:Lcom/my/aviator/predictor/v8/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/de;->a:Lcom/my/aviator/predictor/v8/MainActivity;

    invoke-virtual {p1}, Lcom/my/aviator/predictor/v8/MainActivity;->onBackPressed()V

    return-void
.end method
