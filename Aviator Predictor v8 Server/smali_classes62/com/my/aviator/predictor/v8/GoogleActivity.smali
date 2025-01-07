.class public Lcom/my/aviator/predictor/v8/GoogleActivity;
.super Landroidx/appcompat/app/AppCompatActivity;


# instance fields
.field private a:Ljava/util/Timer;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Landroid/widget/LinearLayout;

.field private f:Landroid/widget/ImageView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/content/Intent;

.field private i:Ljava/util/TimerTask;


# direct methods
.method static bridge synthetic -$$Nest$fgeta(Lcom/my/aviator/predictor/v8/GoogleActivity;)Ljava/util/Timer;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/GoogleActivity;->a:Ljava/util/Timer;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgeth(Lcom/my/aviator/predictor/v8/GoogleActivity;)Landroid/content/Intent;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/GoogleActivity;->h:Landroid/content/Intent;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgeti(Lcom/my/aviator/predictor/v8/GoogleActivity;)Ljava/util/TimerTask;
    .locals 0

    iget-object p0, p0, Lcom/my/aviator/predictor/v8/GoogleActivity;->i:Ljava/util/TimerTask;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fputi(Lcom/my/aviator/predictor/v8/GoogleActivity;Ljava/util/TimerTask;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/GoogleActivity;->i:Ljava/util/TimerTask;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/GoogleActivity;->a:Ljava/util/Timer;

    const-string v0, ""

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/GoogleActivity;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/GoogleActivity;->c:Ljava/lang/String;

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/GoogleActivity;->d:Ljava/lang/String;

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/GoogleActivity;->h:Landroid/content/Intent;

    return-void
.end method

.method private a()V
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "android.resource://"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/my/aviator/predictor/v8/GoogleActivity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/raw/ggg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/GoogleActivity;->d:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/my/aviator/predictor/v8/GoogleActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v0

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/GoogleActivity;->d:Ljava/lang/String;

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/RequestManager;->load(Landroid/net/Uri;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/GoogleActivity;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    new-instance v0, Lcom/my/aviator/predictor/v8/cq;

    invoke-direct {v0, p0}, Lcom/my/aviator/predictor/v8/cq;-><init>(Lcom/my/aviator/predictor/v8/GoogleActivity;)V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/GoogleActivity;->i:Ljava/util/TimerTask;

    iget-object v1, p0, Lcom/my/aviator/predictor/v8/GoogleActivity;->a:Ljava/util/Timer;

    const-wide/16 v2, 0x7d0

    invoke-virtual {v1, v0, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    return-void
.end method

.method private a(Landroid/os/Bundle;)V
    .locals 0

    const p1, 0x7f080105

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/GoogleActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/GoogleActivity;->e:Landroid/widget/LinearLayout;

    const p1, 0x7f0800eb

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/GoogleActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/GoogleActivity;->f:Landroid/widget/ImageView;

    const p1, 0x7f0801da

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/GoogleActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/GoogleActivity;->g:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public _Klik(Landroid/view/View;)V
    .locals 1

    new-instance v0, Lcom/my/aviator/predictor/v8/cs;

    invoke-direct {v0, p0, p1}, Lcom/my/aviator/predictor/v8/cs;-><init>(Lcom/my/aviator/predictor/v8/GoogleActivity;Landroid/view/View;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

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

    const v0, 0x7f0b002d

    invoke-virtual {p0, v0}, Lcom/my/aviator/predictor/v8/GoogleActivity;->setContentView(I)V

    invoke-direct {p0, p1}, Lcom/my/aviator/predictor/v8/GoogleActivity;->a(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/my/aviator/predictor/v8/GoogleActivity;->a()V

    return-void
.end method
