.class public Lcom/my/aviator/predictor/v8/AviatorActivity;
.super Landroidx/appcompat/app/AppCompatActivity;


# instance fields
.field private a:Ljava/util/Timer;

.field private b:Landroidx/appcompat/widget/Toolbar;

.field private c:Lcom/google/android/material/appbar/AppBarLayout;

.field private d:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

.field private e:D

.field private f:Ljava/lang/String;

.field private g:Landroid/widget/LinearLayout;

.field private h:Landroid/widget/LinearLayout;

.field private i:Landroid/widget/FrameLayout;

.field private j:Landroid/widget/Button;

.field private k:Landroid/widget/Button;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/Button;

.field private n:Landroid/widget/ImageView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/ProgressBar;

.field private q:Ljava/util/TimerTask;

.field private r:Landroid/content/Intent;

.field private s:Landroid/content/SharedPreferences;

.field private t:Landroid/content/Intent;


# direct methods
.method static bridge synthetic -$$Nest$fgeta(Lcom/my/aviator/predictor/v8/AviatorActivity;)Ljava/util/Timer;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgete(Lcom/my/aviator/predictor/v8/AviatorActivity;)D
    .locals 2

    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    return-wide v0
.end method

.method static bridge synthetic -$$Nest$fgeto(Lcom/my/aviator/predictor/v8/AviatorActivity;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->o:Landroid/widget/TextView;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetp(Lcom/my/aviator/predictor/v8/AviatorActivity;)Landroid/widget/ProgressBar;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->p:Landroid/widget/ProgressBar;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetq(Lcom/my/aviator/predictor/v8/AviatorActivity;)Ljava/util/TimerTask;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetr(Lcom/my/aviator/predictor/v8/AviatorActivity;)Landroid/content/Intent;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->r:Landroid/content/Intent;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgett(Lcom/my/aviator/predictor/v8/AviatorActivity;)Landroid/content/Intent;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->t:Landroid/content/Intent;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fputq(Lcom/my/aviator/predictor/v8/AviatorActivity;Ljava/util/TimerTask;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-string v0, ""

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->f:Ljava/lang/String;

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->r:Landroid/content/Intent;

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->t:Landroid/content/Intent;

    return-void
.end method

.method private a(Landroid/os/Bundle;)V
    .locals 1

    const p1, 0x7f08000e

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/AviatorActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/appbar/AppBarLayout;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->c:Lcom/google/android/material/appbar/AppBarLayout;

    const p1, 0x7f08000f

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/AviatorActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->d:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    const p1, 0x7f080010

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/AviatorActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->b:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/AviatorActivity;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    invoke-virtual {p0}, Lcom/my/aviator/predictor/v8/AviatorActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    invoke-virtual {p0}, Lcom/my/aviator/predictor/v8/AviatorActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/ActionBar;->setHomeButtonEnabled(Z)V

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->b:Landroidx/appcompat/widget/Toolbar;

    new-instance v0, Lcom/my/aviator/predictor/v8/a;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/a;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f080107

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/AviatorActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->g:Landroid/widget/LinearLayout;

    const p1, 0x7f080109

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/AviatorActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->h:Landroid/widget/LinearLayout;

    const p1, 0x7f080108

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/AviatorActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->i:Landroid/widget/FrameLayout;

    const p1, 0x7f080068

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/AviatorActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->j:Landroid/widget/Button;

    const p1, 0x7f080067

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/AviatorActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->k:Landroid/widget/Button;

    const p1, 0x7f0801db

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/AviatorActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->l:Landroid/widget/TextView;

    const p1, 0x7f080069

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/AviatorActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->m:Landroid/widget/Button;

    const p1, 0x7f0800ea

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/AviatorActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->n:Landroid/widget/ImageView;

    const p1, 0x7f0801da

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/AviatorActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->o:Landroid/widget/TextView;

    const p1, 0x7f080170

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/AviatorActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->p:Landroid/widget/ProgressBar;

    const-string p1, "text"

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/my/aviator/predictor/v8/AviatorActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->s:Landroid/content/SharedPreferences;

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->h:Landroid/widget/LinearLayout;

    new-instance v0, Lcom/my/aviator/predictor/v8/w;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/w;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->j:Landroid/widget/Button;

    new-instance v0, Lcom/my/aviator/predictor/v8/ar;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/ar;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->k:Landroid/widget/Button;

    new-instance v0, Lcom/my/aviator/predictor/v8/bm;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/bm;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->m:Landroid/widget/Button;

    new-instance v0, Lcom/my/aviator/predictor/v8/cg;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/cg;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private b()V
    .locals 4

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->p:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->o:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/my/aviator/predictor/v8/AviatorActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const-string v2, "fonts/nnn.ttf"

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "android.resource://"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/my/aviator/predictor/v8/AviatorActivity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/raw/iii"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->f:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/my/aviator/predictor/v8/AviatorActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v0

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->f:Ljava/lang/String;

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/RequestManager;->load(Landroid/net/Uri;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->n:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->l:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->s:Landroid/content/SharedPreferences;

    const-string v2, "text"

    const-string v3, ""

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public _Klik(Landroid/view/View;)V
    .locals 1

    new-instance v0, Lcom/my/aviator/predictor/v8/cb;

    invoke-direct {v0, p0, p1}, Lcom/my/aviator/predictor/v8/cb;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;Landroid/view/View;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method public a()V
    .locals 7

    const/4 v0, 0x0

    const/16 v1, 0x29

    invoke-static {v0, v1}, Lcom/my/aviator/predictor/v8/ej;->a(II)I

    move-result v1

    int-to-double v1, v1

    iput-wide v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    iget-object v3, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->p:Landroid/widget/ProgressBar;

    double-to-int v1, v1

    invoke-virtual {v3, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->p:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/16 v2, 0xfa0

    const-wide/16 v4, 0x0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_0

    new-instance v0, Lcom/my/aviator/predictor/v8/ch;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/ch;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_0
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_1

    new-instance v0, Lcom/my/aviator/predictor/v8/cj;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/cj;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_1
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_2

    new-instance v0, Lcom/my/aviator/predictor/v8/cl;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/cl;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_2
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x4008000000000000L    # 3.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_3

    new-instance v0, Lcom/my/aviator/predictor/v8/cn;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/cn;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_3
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x4010000000000000L    # 4.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_4

    new-instance v0, Lcom/my/aviator/predictor/v8/b;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/b;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_4
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x4014000000000000L    # 5.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_5

    new-instance v0, Lcom/my/aviator/predictor/v8/d;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/d;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_5
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x4018000000000000L    # 6.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_6

    new-instance v0, Lcom/my/aviator/predictor/v8/f;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/f;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_6
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x401c000000000000L    # 7.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_7

    new-instance v0, Lcom/my/aviator/predictor/v8/h;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/h;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_7
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x4020000000000000L    # 8.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_8

    new-instance v0, Lcom/my/aviator/predictor/v8/j;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/j;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_8
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x4022000000000000L    # 9.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_9

    new-instance v0, Lcom/my/aviator/predictor/v8/l;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/l;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_9
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_a

    new-instance v0, Lcom/my/aviator/predictor/v8/n;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/n;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_a
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x4026000000000000L    # 11.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_b

    new-instance v0, Lcom/my/aviator/predictor/v8/p;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/p;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_b
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x4028000000000000L    # 12.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_c

    new-instance v0, Lcom/my/aviator/predictor/v8/s;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/s;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_c
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x402a000000000000L    # 13.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_d

    new-instance v0, Lcom/my/aviator/predictor/v8/u;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/u;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_d
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x402c000000000000L    # 14.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_e

    new-instance v0, Lcom/my/aviator/predictor/v8/x;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/x;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_e
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x402e000000000000L    # 15.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_f

    new-instance v0, Lcom/my/aviator/predictor/v8/z;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/z;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_f
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x4030000000000000L    # 16.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_10

    new-instance v0, Lcom/my/aviator/predictor/v8/ab;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/ab;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_10
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x4031000000000000L    # 17.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_11

    new-instance v0, Lcom/my/aviator/predictor/v8/ad;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/ad;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_11
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x4032000000000000L    # 18.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_12

    new-instance v0, Lcom/my/aviator/predictor/v8/af;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/af;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_12
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x4033000000000000L    # 19.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_13

    new-instance v0, Lcom/my/aviator/predictor/v8/ah;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/ah;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_13
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x4034000000000000L    # 20.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_14

    new-instance v0, Lcom/my/aviator/predictor/v8/aj;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/aj;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_14
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x4035000000000000L    # 21.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_15

    new-instance v0, Lcom/my/aviator/predictor/v8/al;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/al;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_15
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x4036000000000000L    # 22.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_16

    new-instance v0, Lcom/my/aviator/predictor/v8/an;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/an;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_16
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x4037000000000000L    # 23.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_17

    new-instance v0, Lcom/my/aviator/predictor/v8/ap;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/ap;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_17
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x4038000000000000L    # 24.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_18

    new-instance v0, Lcom/my/aviator/predictor/v8/as;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/as;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_18
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x4039000000000000L    # 25.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_19

    new-instance v0, Lcom/my/aviator/predictor/v8/au;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/au;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_19
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x403a000000000000L    # 26.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_1a

    new-instance v0, Lcom/my/aviator/predictor/v8/aw;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/aw;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_1a
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x403b000000000000L    # 27.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_1b

    new-instance v0, Lcom/my/aviator/predictor/v8/ay;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/ay;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_1b
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x403c000000000000L    # 28.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_1c

    new-instance v0, Lcom/my/aviator/predictor/v8/ba;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/ba;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_1c
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x403d000000000000L    # 29.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_1d

    new-instance v0, Lcom/my/aviator/predictor/v8/bc;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/bc;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_1d
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x403e000000000000L    # 30.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_1e

    new-instance v0, Lcom/my/aviator/predictor/v8/be;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/be;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_1e
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x403f000000000000L    # 31.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_1f

    new-instance v0, Lcom/my/aviator/predictor/v8/bg;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/bg;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_1f
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x4040000000000000L    # 32.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_20

    new-instance v0, Lcom/my/aviator/predictor/v8/bi;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/bi;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_20
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide v4, 0x4040800000000000L    # 33.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_21

    new-instance v0, Lcom/my/aviator/predictor/v8/bk;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/bk;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_21
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x4041000000000000L    # 34.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_22

    new-instance v0, Lcom/my/aviator/predictor/v8/bn;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/bn;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_22
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide v4, 0x4041800000000000L    # 35.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_23

    new-instance v0, Lcom/my/aviator/predictor/v8/bp;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/bp;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_23
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x4042000000000000L    # 36.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_24

    new-instance v0, Lcom/my/aviator/predictor/v8/br;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/br;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_24
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide v4, 0x4042800000000000L    # 37.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_25

    new-instance v0, Lcom/my/aviator/predictor/v8/bt;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/bt;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_25
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x4043000000000000L    # 38.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_26

    new-instance v0, Lcom/my/aviator/predictor/v8/bv;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/bv;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_26
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide v4, 0x4043800000000000L    # 39.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_27

    new-instance v0, Lcom/my/aviator/predictor/v8/bx;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/bx;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_27
    iget-wide v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->e:D

    const-wide/high16 v4, 0x4044000000000000L    # 40.0

    cmpl-double v6, v0, v4

    if-nez v6, :cond_28

    new-instance v0, Lcom/my/aviator/predictor/v8/bz;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/bz;-><init>(Lcom/my/aviator/predictor/v8/AviatorActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->q:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/AviatorActivity;->a:Ljava/util/Timer;

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_28
    return-void
.end method

.method public a(Landroid/view/View;Ljava/lang/String;DD)V
    .locals 1

    new-instance v0, Landroid/animation/ObjectAnimator;

    invoke-direct {v0}, Landroid/animation/ObjectAnimator;-><init>()V

    invoke-virtual {v0, p1}, Landroid/animation/ObjectAnimator;->setTarget(Ljava/lang/Object;)V

    invoke-virtual {v0, p2}, Landroid/animation/ObjectAnimator;->setPropertyName(Ljava/lang/String;)V

    const/4 p1, 0x1

    new-array p1, p1, [F

    double-to-float p2, p3

    const/4 p3, 0x0

    aput p2, p1, p3

    invoke-virtual {v0, p1}, Landroid/animation/ObjectAnimator;->setFloatValues([F)V

    double-to-long p1, p5

    invoke-virtual {v0, p1, p2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    new-instance p1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {p1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, p1}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f0b001c

    invoke-virtual {p0, v0}, Lcom/my/aviator/predictor/v8/AviatorActivity;->setContentView(I)V

    invoke-direct {p0, p1}, Lcom/my/aviator/predictor/v8/AviatorActivity;->a(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/my/aviator/predictor/v8/AviatorActivity;->b()V

    return-void
.end method
