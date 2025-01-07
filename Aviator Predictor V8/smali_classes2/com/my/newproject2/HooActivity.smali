.class public Lcom/my/newproject2/HooActivity;
.super Landroid/app/Activity;
.source "HooActivity.java"


# instance fields
.field private _timer:Ljava/util/Timer;

.field private a:Ljava/util/TimerTask;

.field private button1:Landroid/widget/Button;

.field private digitalclock1:Landroid/widget/DigitalClock;

.field private i:Landroid/content/Intent;

.field private imageview1:Landroid/widget/ImageView;

.field private linear1:Landroid/widget/LinearLayout;

.field private linear3:Landroid/widget/LinearLayout;

.field private linear4:Landroid/widget/LinearLayout;

.field private linear5:Landroid/widget/LinearLayout;

.field private linear6:Landroid/widget/LinearLayout;

.field private progressbar1:Landroid/widget/ProgressBar;

.field private textview1:Landroid/widget/TextView;

.field private textview2:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 40
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 42
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/my/newproject2/HooActivity;->_timer:Ljava/util/Timer;

    .line 56
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iput-object v0, p0, Lcom/my/newproject2/HooActivity;->i:Landroid/content/Intent;

    .line 40
    return-void
.end method

.method static synthetic access$0(Lcom/my/newproject2/HooActivity;)Landroid/content/Intent;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/my/newproject2/HooActivity;->i:Landroid/content/Intent;

    return-object v0
.end method

.method static synthetic access$1(Lcom/my/newproject2/HooActivity;Ljava/util/TimerTask;)V
    .locals 0

    .prologue
    .line 57
    iput-object p1, p0, Lcom/my/newproject2/HooActivity;->a:Ljava/util/TimerTask;

    return-void
.end method

.method static synthetic access$2(Lcom/my/newproject2/HooActivity;)Ljava/util/Timer;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/my/newproject2/HooActivity;->_timer:Ljava/util/Timer;

    return-object v0
.end method

.method static synthetic access$3(Lcom/my/newproject2/HooActivity;)Ljava/util/TimerTask;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/my/newproject2/HooActivity;->a:Ljava/util/TimerTask;

    return-object v0
.end method

.method private initialize(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 68
    const v0, 0x7f030005

    invoke-virtual {p0, v0}, Lcom/my/newproject2/HooActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/my/newproject2/HooActivity;->linear1:Landroid/widget/LinearLayout;

    .line 69
    const v0, 0x7f030001

    invoke-virtual {p0, v0}, Lcom/my/newproject2/HooActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/DigitalClock;

    iput-object v0, p0, Lcom/my/newproject2/HooActivity;->digitalclock1:Landroid/widget/DigitalClock;

    .line 70
    const v0, 0x7f030007

    invoke-virtual {p0, v0}, Lcom/my/newproject2/HooActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/my/newproject2/HooActivity;->linear3:Landroid/widget/LinearLayout;

    .line 71
    const v0, 0x7f030008

    invoke-virtual {p0, v0}, Lcom/my/newproject2/HooActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/my/newproject2/HooActivity;->linear4:Landroid/widget/LinearLayout;

    .line 72
    const v0, 0x7f03000a

    invoke-virtual {p0, v0}, Lcom/my/newproject2/HooActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/my/newproject2/HooActivity;->linear6:Landroid/widget/LinearLayout;

    .line 73
    const v0, 0x7f030009

    invoke-virtual {p0, v0}, Lcom/my/newproject2/HooActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/my/newproject2/HooActivity;->linear5:Landroid/widget/LinearLayout;

    .line 74
    const v0, 0x7f03000d

    invoke-virtual {p0, v0}, Lcom/my/newproject2/HooActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/my/newproject2/HooActivity;->progressbar1:Landroid/widget/ProgressBar;

    .line 75
    const/high16 v0, 0x7f030000

    invoke-virtual {p0, v0}, Lcom/my/newproject2/HooActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/my/newproject2/HooActivity;->button1:Landroid/widget/Button;

    .line 76
    const v0, 0x7f030011

    invoke-virtual {p0, v0}, Lcom/my/newproject2/HooActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/my/newproject2/HooActivity;->textview1:Landroid/widget/TextView;

    .line 77
    const v0, 0x7f030003

    invoke-virtual {p0, v0}, Lcom/my/newproject2/HooActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/my/newproject2/HooActivity;->imageview1:Landroid/widget/ImageView;

    .line 78
    const v0, 0x7f030012

    invoke-virtual {p0, v0}, Lcom/my/newproject2/HooActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/my/newproject2/HooActivity;->textview2:Landroid/widget/TextView;

    .line 80
    iget-object v0, p0, Lcom/my/newproject2/HooActivity;->button1:Landroid/widget/Button;

    new-instance v1, Lcom/my/newproject2/HooActivity$1;

    invoke-direct {v1, p0}, Lcom/my/newproject2/HooActivity$1;-><init>(Lcom/my/newproject2/HooActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 99
    return-void
.end method

.method private initializeLogic()V
    .locals 7

    .prologue
    const-wide v4, 0x4051800000000000L    # 70.0

    const-wide/high16 v2, 0x402e000000000000L    # 15.0

    .line 102
    iget-object v1, p0, Lcom/my/newproject2/HooActivity;->button1:Landroid/widget/Button;

    const-string v6, "#FFFFFF"

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/my/newproject2/HooActivity;->_radius(Landroid/view/View;DDLjava/lang/String;)V

    .line 103
    iget-object v1, p0, Lcom/my/newproject2/HooActivity;->linear3:Landroid/widget/LinearLayout;

    const-string v6, "#d40606"

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/my/newproject2/HooActivity;->_radius(Landroid/view/View;DDLjava/lang/String;)V

    .line 104
    iget-object v1, p0, Lcom/my/newproject2/HooActivity;->textview1:Landroid/widget/TextView;

    const-string v6, "#d40606"

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/my/newproject2/HooActivity;->_radius(Landroid/view/View;DDLjava/lang/String;)V

    .line 105
    return-void
.end method


# virtual methods
.method public _radius(Landroid/view/View;DDLjava/lang/String;)V
    .locals 2

    .prologue
    .line 110
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 114
    invoke-static {p6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 116
    double-to-float v1, p2

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 118
    double-to-float v1, p4

    invoke-virtual {p1, v1}, Landroid/view/View;->setElevation(F)V

    .line 120
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 121
    return-void
.end method

.method public getCheckedItemPositionsToArray(Landroid/widget/ListView;)Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/ListView;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 151
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 152
    invoke-virtual {p1}, Landroid/widget/ListView;->getCheckedItemPositions()Landroid/util/SparseBooleanArray;

    move-result-object v2

    .line 153
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v2}, Landroid/util/SparseBooleanArray;->size()I

    move-result v3

    if-lt v0, v3, :cond_0

    .line 157
    return-object v1

    .line 154
    :cond_0
    invoke-virtual {v2, v0}, Landroid/util/SparseBooleanArray;->valueAt(I)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 155
    invoke-virtual {v2, v0}, Landroid/util/SparseBooleanArray;->keyAt(I)I

    move-result v3

    int-to-double v4, v3

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public getDip(I)F
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 162
    const/4 v0, 0x1

    int-to-float v1, p1

    invoke-virtual {p0}, Lcom/my/newproject2/HooActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    invoke-static {v0, v1, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    return v0
.end method

.method public getDisplayHeightPixels()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 172
    invoke-virtual {p0}, Lcom/my/newproject2/HooActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    return v0
.end method

.method public getDisplayWidthPixels()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 167
    invoke-virtual {p0}, Lcom/my/newproject2/HooActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    return v0
.end method

.method public getLocationX(Landroid/view/View;)I
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 131
    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 132
    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 133
    const/4 v1, 0x0

    aget v0, v0, v1

    return v0
.end method

.method public getLocationY(Landroid/view/View;)I
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 138
    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 139
    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 140
    const/4 v1, 0x1

    aget v0, v0, v1

    return v0
.end method

.method public getRandom(II)I
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 145
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 146
    sub-int v1, p2, p1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    add-int/2addr v0, p1

    return v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 61
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 62
    const v0, 0x7f040001

    invoke-virtual {p0, v0}, Lcom/my/newproject2/HooActivity;->setContentView(I)V

    .line 63
    invoke-direct {p0, p1}, Lcom/my/newproject2/HooActivity;->initialize(Landroid/os/Bundle;)V

    .line 64
    invoke-direct {p0}, Lcom/my/newproject2/HooActivity;->initializeLogic()V

    .line 65
    return-void
.end method

.method public showMessage(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 126
    invoke-virtual {p0}, Lcom/my/newproject2/HooActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 127
    return-void
.end method
