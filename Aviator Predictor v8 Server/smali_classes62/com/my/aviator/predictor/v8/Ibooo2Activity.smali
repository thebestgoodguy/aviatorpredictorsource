.class public Lcom/my/aviator/predictor/v8/Ibooo2Activity;
.super Landroidx/appcompat/app/AppCompatActivity;


# instance fields
.field private a:Ljava/util/Timer;

.field private b:Landroid/widget/ScrollView;

.field private c:Landroid/widget/LinearLayout;

.field private d:Landroid/widget/LinearLayout;

.field private e:Landroid/widget/LinearLayout;

.field private f:Landroid/widget/LinearLayout;

.field private g:Landroid/widget/LinearLayout;

.field private h:Landroid/widget/LinearLayout;

.field private i:Landroid/widget/LinearLayout;

.field private j:Landroid/widget/LinearLayout;

.field private k:Landroid/widget/ProgressBar;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/Button;

.field private o:Landroid/widget/Button;

.field private p:Landroid/widget/TextView;

.field private q:Landroid/widget/TextView;

.field private r:Landroid/widget/EditText;

.field private s:Landroid/widget/Button;

.field private t:Landroid/content/Intent;

.field private u:Ljava/util/TimerTask;

.field private v:Landroid/content/Intent;

.field private w:Landroid/content/Intent;

.field private x:Landroid/app/AlertDialog;

.field private y:Landroid/content/SharedPreferences;


# direct methods
.method static bridge synthetic -$$Nest$fgeta(Lcom/my/aviator/predictor/v8/Ibooo2Activity;)Ljava/util/Timer;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->a:Ljava/util/Timer;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetk(Lcom/my/aviator/predictor/v8/Ibooo2Activity;)Landroid/widget/ProgressBar;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->k:Landroid/widget/ProgressBar;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetr(Lcom/my/aviator/predictor/v8/Ibooo2Activity;)Landroid/widget/EditText;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->r:Landroid/widget/EditText;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgett(Lcom/my/aviator/predictor/v8/Ibooo2Activity;)Landroid/content/Intent;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->t:Landroid/content/Intent;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetu(Lcom/my/aviator/predictor/v8/Ibooo2Activity;)Ljava/util/TimerTask;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->u:Ljava/util/TimerTask;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetv(Lcom/my/aviator/predictor/v8/Ibooo2Activity;)Landroid/content/Intent;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->v:Landroid/content/Intent;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetw(Lcom/my/aviator/predictor/v8/Ibooo2Activity;)Landroid/content/Intent;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->w:Landroid/content/Intent;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetx(Lcom/my/aviator/predictor/v8/Ibooo2Activity;)Landroid/app/AlertDialog;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->x:Landroid/app/AlertDialog;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgety(Lcom/my/aviator/predictor/v8/Ibooo2Activity;)Landroid/content/SharedPreferences;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->y:Landroid/content/SharedPreferences;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fputu(Lcom/my/aviator/predictor/v8/Ibooo2Activity;Ljava/util/TimerTask;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->u:Ljava/util/TimerTask;

    return-void
.end method

.method static bridge synthetic -$$Nest$fputx(Lcom/my/aviator/predictor/v8/Ibooo2Activity;Landroid/app/AlertDialog;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->x:Landroid/app/AlertDialog;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->a:Ljava/util/Timer;

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->t:Landroid/content/Intent;

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->v:Landroid/content/Intent;

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->w:Landroid/content/Intent;

    return-void
.end method

.method private a()V
    .locals 2

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->k:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    return-void
.end method

.method private a(Landroid/os/Bundle;)V
    .locals 1

    const p1, 0x7f0801fd

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ScrollView;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->b:Landroid/widget/ScrollView;

    const p1, 0x7f080105

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->c:Landroid/widget/LinearLayout;

    const p1, 0x7f080106

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->d:Landroid/widget/LinearLayout;

    const p1, 0x7f080107

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->e:Landroid/widget/LinearLayout;

    const p1, 0x7f080109

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->f:Landroid/widget/LinearLayout;

    const p1, 0x7f080108

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->g:Landroid/widget/LinearLayout;

    const p1, 0x7f08010a

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->h:Landroid/widget/LinearLayout;

    const p1, 0x7f08010b

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->i:Landroid/widget/LinearLayout;

    const p1, 0x7f08010c

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->j:Landroid/widget/LinearLayout;

    const p1, 0x7f080170

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->k:Landroid/widget/ProgressBar;

    const p1, 0x7f0801da

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->l:Landroid/widget/TextView;

    const p1, 0x7f0801db

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->m:Landroid/widget/TextView;

    const p1, 0x7f080066

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->n:Landroid/widget/Button;

    const p1, 0x7f080067

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->o:Landroid/widget/Button;

    const p1, 0x7f0801dc

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->p:Landroid/widget/TextView;

    const p1, 0x7f0801dd

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->q:Landroid/widget/TextView;

    const p1, 0x7f0800b8

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->r:Landroid/widget/EditText;

    const p1, 0x7f080068

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->s:Landroid/widget/Button;

    const-string p1, "text"

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->y:Landroid/content/SharedPreferences;

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->n:Landroid/widget/Button;

    new-instance v0, Lcom/my/aviator/predictor/v8/cy;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/cy;-><init>(Lcom/my/aviator/predictor/v8/Ibooo2Activity;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->o:Landroid/widget/Button;

    new-instance v0, Lcom/my/aviator/predictor/v8/cz;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/cz;-><init>(Lcom/my/aviator/predictor/v8/Ibooo2Activity;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->s:Landroid/widget/Button;

    new-instance v0, Lcom/my/aviator/predictor/v8/da;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/da;-><init>(Lcom/my/aviator/predictor/v8/Ibooo2Activity;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f0b002f

    invoke-virtual {p0, v0}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->setContentView(I)V

    invoke-direct {p0, p1}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->a(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/my/aviator/predictor/v8/Ibooo2Activity;->a()V

    return-void
.end method
