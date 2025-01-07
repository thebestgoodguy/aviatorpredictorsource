.class public Lcom/my/newproject2/LoadingActivity;
.super Landroid/app/Activity;
.source "LoadingActivity.java"


# instance fields
.field private _timer:Ljava/util/Timer;

.field private imageview1:Landroid/widget/ImageView;

.field private linear2:Landroid/widget/LinearLayout;

.field private linear3:Landroid/widget/LinearLayout;

.field private linear4:Landroid/widget/LinearLayout;

.field private progressbar1:Landroid/widget/ProgressBar;

.field private q:Landroid/content/Intent;

.field private ratingbar1:Landroid/widget/RatingBar;

.field private ratingbar2:Landroid/widget/RatingBar;

.field private t:Ljava/util/TimerTask;

.field private textview1:Landroid/widget/TextView;

.field private textview2:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 38
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 40
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/my/newproject2/LoadingActivity;->_timer:Ljava/util/Timer;

    .line 52
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iput-object v0, p0, Lcom/my/newproject2/LoadingActivity;->q:Landroid/content/Intent;

    .line 38
    return-void
.end method

.method static synthetic access$0(Lcom/my/newproject2/LoadingActivity;)Landroid/content/Intent;
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/my/newproject2/LoadingActivity;->q:Landroid/content/Intent;

    return-object v0
.end method

.method private initialize(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 64
    const v0, 0x7f030006

    invoke-virtual {p0, v0}, Lcom/my/newproject2/LoadingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/my/newproject2/LoadingActivity;->linear2:Landroid/widget/LinearLayout;

    .line 65
    const v0, 0x7f030010

    invoke-virtual {p0, v0}, Lcom/my/newproject2/LoadingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RatingBar;

    iput-object v0, p0, Lcom/my/newproject2/LoadingActivity;->ratingbar2:Landroid/widget/RatingBar;

    .line 66
    const v0, 0x7f030012

    invoke-virtual {p0, v0}, Lcom/my/newproject2/LoadingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/my/newproject2/LoadingActivity;->textview2:Landroid/widget/TextView;

    .line 67
    const v0, 0x7f030007

    invoke-virtual {p0, v0}, Lcom/my/newproject2/LoadingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/my/newproject2/LoadingActivity;->linear3:Landroid/widget/LinearLayout;

    .line 68
    const v0, 0x7f030008

    invoke-virtual {p0, v0}, Lcom/my/newproject2/LoadingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/my/newproject2/LoadingActivity;->linear4:Landroid/widget/LinearLayout;

    .line 69
    const v0, 0x7f03000d

    invoke-virtual {p0, v0}, Lcom/my/newproject2/LoadingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/my/newproject2/LoadingActivity;->progressbar1:Landroid/widget/ProgressBar;

    .line 70
    const v0, 0x7f03000f

    invoke-virtual {p0, v0}, Lcom/my/newproject2/LoadingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RatingBar;

    iput-object v0, p0, Lcom/my/newproject2/LoadingActivity;->ratingbar1:Landroid/widget/RatingBar;

    .line 71
    const v0, 0x7f030003

    invoke-virtual {p0, v0}, Lcom/my/newproject2/LoadingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/my/newproject2/LoadingActivity;->imageview1:Landroid/widget/ImageView;

    .line 72
    const v0, 0x7f030011

    invoke-virtual {p0, v0}, Lcom/my/newproject2/LoadingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/my/newproject2/LoadingActivity;->textview1:Landroid/widget/TextView;

    .line 73
    return-void
.end method

.method private initializeLogic()V
    .locals 4

    .prologue
    .line 76
    new-instance v0, Lcom/my/newproject2/LoadingActivity$1;

    invoke-direct {v0, p0}, Lcom/my/newproject2/LoadingActivity$1;-><init>(Lcom/my/newproject2/LoadingActivity;)V

    iput-object v0, p0, Lcom/my/newproject2/LoadingActivity;->t:Ljava/util/TimerTask;

    .line 88
    iget-object v0, p0, Lcom/my/newproject2/LoadingActivity;->_timer:Ljava/util/Timer;

    iget-object v1, p0, Lcom/my/newproject2/LoadingActivity;->t:Ljava/util/TimerTask;

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 89
    return-void
.end method


# virtual methods
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
    .line 119
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 120
    invoke-virtual {p1}, Landroid/widget/ListView;->getCheckedItemPositions()Landroid/util/SparseBooleanArray;

    move-result-object v2

    .line 121
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v2}, Landroid/util/SparseBooleanArray;->size()I

    move-result v3

    if-lt v0, v3, :cond_0

    .line 125
    return-object v1

    .line 122
    :cond_0
    invoke-virtual {v2, v0}, Landroid/util/SparseBooleanArray;->valueAt(I)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 123
    invoke-virtual {v2, v0}, Landroid/util/SparseBooleanArray;->keyAt(I)I

    move-result v3

    int-to-double v4, v3

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public getDip(I)F
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 130
    const/4 v0, 0x1

    int-to-float v1, p1

    invoke-virtual {p0}, Lcom/my/newproject2/LoadingActivity;->getResources()Landroid/content/res/Resources;

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
    .line 140
    invoke-virtual {p0}, Lcom/my/newproject2/LoadingActivity;->getResources()Landroid/content/res/Resources;

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
    .line 135
    invoke-virtual {p0}, Lcom/my/newproject2/LoadingActivity;->getResources()Landroid/content/res/Resources;

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
    .line 99
    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 100
    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 101
    const/4 v1, 0x0

    aget v0, v0, v1

    return v0
.end method

.method public getLocationY(Landroid/view/View;)I
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 106
    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 107
    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 108
    const/4 v1, 0x1

    aget v0, v0, v1

    return v0
.end method

.method public getRandom(II)I
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 113
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 114
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
    .line 57
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 58
    const v0, 0x7f040005

    invoke-virtual {p0, v0}, Lcom/my/newproject2/LoadingActivity;->setContentView(I)V

    .line 59
    invoke-direct {p0, p1}, Lcom/my/newproject2/LoadingActivity;->initialize(Landroid/os/Bundle;)V

    .line 60
    invoke-direct {p0}, Lcom/my/newproject2/LoadingActivity;->initializeLogic()V

    .line 61
    return-void
.end method

.method public showMessage(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 94
    invoke-virtual {p0}, Lcom/my/newproject2/LoadingActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 95
    return-void
.end method
