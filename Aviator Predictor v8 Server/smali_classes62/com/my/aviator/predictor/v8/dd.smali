.class Lcom/my/aviator/predictor/v8/dd;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/dc;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/dc;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/dd;->a:Lcom/my/aviator/predictor/v8/dc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/dd;->a:Lcom/my/aviator/predictor/v8/dc;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/dc;->a(Lcom/my/aviator/predictor/v8/dc;)Lcom/my/aviator/predictor/v8/db;

    move-result-object v0

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/db;->a(Lcom/my/aviator/predictor/v8/db;)Lcom/my/aviator/predictor/v8/da;

    move-result-object v0

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/da;->a(Lcom/my/aviator/predictor/v8/da;)Lcom/my/aviator/predictor/v8/Ibooo2Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->-$$Nest$fgetw(Lcom/my/aviator/predictor/v8/Ibooo2Activity;)Landroid/content/Intent;

    move-result-object v0

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/dd;->a:Lcom/my/aviator/predictor/v8/dc;

    invoke-static {v1}, Lcom/my/aviator/predictor/v8/dc;->a(Lcom/my/aviator/predictor/v8/dc;)Lcom/my/aviator/predictor/v8/db;

    move-result-object v1

    invoke-static {v1}, Lcom/my/aviator/predictor/v8/db;->a(Lcom/my/aviator/predictor/v8/db;)Lcom/my/aviator/predictor/v8/da;

    move-result-object v1

    invoke-static {v1}, Lcom/my/aviator/predictor/v8/da;->a(Lcom/my/aviator/predictor/v8/da;)Lcom/my/aviator/predictor/v8/Ibooo2Activity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/my/aviator/predictor/v8/AviatorActivity;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/dd;->a:Lcom/my/aviator/predictor/v8/dc;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/dc;->a(Lcom/my/aviator/predictor/v8/dc;)Lcom/my/aviator/predictor/v8/db;

    move-result-object v0

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/db;->a(Lcom/my/aviator/predictor/v8/db;)Lcom/my/aviator/predictor/v8/da;

    move-result-object v0

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/da;->a(Lcom/my/aviator/predictor/v8/da;)Lcom/my/aviator/predictor/v8/Ibooo2Activity;

    move-result-object v0

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/dd;->a:Lcom/my/aviator/predictor/v8/dc;

    invoke-static {v1}, Lcom/my/aviator/predictor/v8/dc;->a(Lcom/my/aviator/predictor/v8/dc;)Lcom/my/aviator/predictor/v8/db;

    move-result-object v1

    invoke-static {v1}, Lcom/my/aviator/predictor/v8/db;->a(Lcom/my/aviator/predictor/v8/db;)Lcom/my/aviator/predictor/v8/da;

    move-result-object v1

    invoke-static {v1}, Lcom/my/aviator/predictor/v8/da;->a(Lcom/my/aviator/predictor/v8/da;)Lcom/my/aviator/predictor/v8/Ibooo2Activity;

    move-result-object v1

    invoke-static {v1}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->-$$Nest$fgetw(Lcom/my/aviator/predictor/v8/Ibooo2Activity;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->startActivity(Landroid/content/Intent;)V

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/dd;->a:Lcom/my/aviator/predictor/v8/dc;

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/dc;->a(Lcom/my/aviator/predictor/v8/dc;)Lcom/my/aviator/predictor/v8/db;

    move-result-object v0

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/db;->a(Lcom/my/aviator/predictor/v8/db;)Lcom/my/aviator/predictor/v8/da;

    move-result-object v0

    invoke-static {v0}, Lcom/my/aviator/predictor/v8/da;->a(Lcom/my/aviator/predictor/v8/da;)Lcom/my/aviator/predictor/v8/Ibooo2Activity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->finish()V

    return-void
.end method
