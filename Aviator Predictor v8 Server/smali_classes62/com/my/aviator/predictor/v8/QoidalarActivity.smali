.class public Lcom/my/aviator/predictor/v8/QoidalarActivity;
.super Landroidx/appcompat/app/AppCompatActivity;


# instance fields
.field private a:Landroid/widget/LinearLayout;

.field private b:Landroid/widget/LinearLayout;

.field private c:Landroid/widget/LinearLayout;

.field private d:Landroid/widget/Button;

.field private e:Landroid/widget/Button;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/content/Intent;

.field private i:Landroid/content/Intent;


# direct methods
.method static bridge synthetic -$$Nest$fgeth(Lcom/my/aviator/predictor/v8/QoidalarActivity;)Landroid/content/Intent;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/QoidalarActivity;->h:Landroid/content/Intent;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgeti(Lcom/my/aviator/predictor/v8/QoidalarActivity;)Landroid/content/Intent;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/QoidalarActivity;->i:Landroid/content/Intent;

    return-object p0
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/QoidalarActivity;->h:Landroid/content/Intent;

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/QoidalarActivity;->i:Landroid/content/Intent;

    return-void
.end method

.method private a()V
    .locals 0

    return-void
.end method

.method private a(Landroid/os/Bundle;)V
    .locals 1

    const p1, 0x7f080105

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/QoidalarActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/QoidalarActivity;->a:Landroid/widget/LinearLayout;

    const p1, 0x7f080107

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/QoidalarActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/QoidalarActivity;->b:Landroid/widget/LinearLayout;

    const p1, 0x7f080108

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/QoidalarActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/QoidalarActivity;->c:Landroid/widget/LinearLayout;

    const p1, 0x7f080066

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/QoidalarActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/QoidalarActivity;->d:Landroid/widget/Button;

    const p1, 0x7f080067

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/QoidalarActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/QoidalarActivity;->e:Landroid/widget/Button;

    const p1, 0x7f0801da

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/QoidalarActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/QoidalarActivity;->f:Landroid/widget/TextView;

    const p1, 0x7f0801db

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/QoidalarActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/QoidalarActivity;->g:Landroid/widget/TextView;

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/QoidalarActivity;->d:Landroid/widget/Button;

    new-instance v0, Lcom/my/aviator/predictor/v8/dw;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/dw;-><init>(Lcom/my/aviator/predictor/v8/QoidalarActivity;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/QoidalarActivity;->e:Landroid/widget/Button;

    new-instance v0, Lcom/my/aviator/predictor/v8/dx;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/dx;-><init>(Lcom/my/aviator/predictor/v8/QoidalarActivity;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f0b0067

    invoke-virtual {p0, v0}, Lcom/my/aviator/predictor/v8/QoidalarActivity;->setContentView(I)V

    invoke-direct {p0, p1}, Lcom/my/aviator/predictor/v8/QoidalarActivity;->a(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/my/aviator/predictor/v8/QoidalarActivity;->a()V

    return-void
.end method
