.class Lcom/my/aviator/predictor/v8/cp;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/DebugActivity;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/DebugActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/cp;->a:Lcom/my/aviator/predictor/v8/DebugActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/cp;->a:Lcom/my/aviator/predictor/v8/DebugActivity;

    invoke-virtual {p1}, Lcom/my/aviator/predictor/v8/DebugActivity;->finish()V

    return-void
.end method
