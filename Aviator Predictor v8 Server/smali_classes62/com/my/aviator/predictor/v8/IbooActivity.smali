.class public Lcom/my/aviator/predictor/v8/IbooActivity;
.super Landroidx/appcompat/app/AppCompatActivity;


# instance fields
.field private a:Landroid/widget/ScrollView;

.field private b:Landroid/widget/LinearLayout;

.field private c:Landroid/widget/LinearLayout;

.field private d:Landroid/widget/LinearLayout;

.field private e:Landroid/widget/LinearLayout;

.field private f:Landroid/widget/Button;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private j:Landroid/content/Intent;


# direct methods
.method static bridge synthetic -$$Nest$fgetj(Lcom/my/aviator/predictor/v8/IbooActivity;)Landroid/content/Intent;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/IbooActivity;->j:Landroid/content/Intent;

    return-object p0
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/IbooActivity;->j:Landroid/content/Intent;

    return-void
.end method

.method private a()V
    .locals 0

    return-void
.end method

.method private a(Landroid/os/Bundle;)V
    .locals 1

    const p1, 0x7f0801fd

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/IbooActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ScrollView;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/IbooActivity;->a:Landroid/widget/ScrollView;

    const p1, 0x7f080105

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/IbooActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/IbooActivity;->b:Landroid/widget/LinearLayout;

    const p1, 0x7f080106

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/IbooActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/IbooActivity;->c:Landroid/widget/LinearLayout;

    const p1, 0x7f080108

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/IbooActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/IbooActivity;->d:Landroid/widget/LinearLayout;

    const p1, 0x7f080109

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/IbooActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/IbooActivity;->e:Landroid/widget/LinearLayout;

    const p1, 0x7f080066

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/IbooActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/IbooActivity;->f:Landroid/widget/Button;

    const p1, 0x7f0801da

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/IbooActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/IbooActivity;->g:Landroid/widget/TextView;

    const p1, 0x7f0801db

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/IbooActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/IbooActivity;->h:Landroid/widget/TextView;

    const p1, 0x7f0801dc

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/IbooActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/IbooActivity;->i:Landroid/widget/TextView;

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/IbooActivity;->f:Landroid/widget/Button;

    new-instance v0, Lcom/my/aviator/predictor/v8/cx;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/cx;-><init>(Lcom/my/aviator/predictor/v8/IbooActivity;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f0b002e

    invoke-virtual {p0, v0}, Lcom/my/aviator/predictor/v8/IbooActivity;->setContentView(I)V

    invoke-direct {p0, p1}, Lcom/my/aviator/predictor/v8/IbooActivity;->a(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/my/aviator/predictor/v8/IbooActivity;->a()V

    return-void
.end method
