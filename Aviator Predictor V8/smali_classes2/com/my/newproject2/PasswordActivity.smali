.class public Lcom/my/newproject2/PasswordActivity;
.super Landroid/app/Activity;
.source "PasswordActivity.java"


# instance fields
.field private _timer:Ljava/util/Timer;

.field private i:Landroid/content/Intent;

.field private linear1:Landroid/widget/LinearLayout;

.field private progressbar1:Landroid/widget/ProgressBar;

.field private progressbar2:Landroid/widget/ProgressBar;

.field private q:Ljava/util/TimerTask;

.field private ratingbar1:Landroid/widget/RatingBar;

.field private ratingbar2:Landroid/widget/RatingBar;

.field private textview1:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 39
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/my/newproject2/PasswordActivity;->_timer:Ljava/util/Timer;

    .line 49
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iput-object v0, p0, Lcom/my/newproject2/PasswordActivity;->i:Landroid/content/Intent;

    .line 37
    return-void
.end method

.method static synthetic access$0(Lcom/my/newproject2/PasswordActivity;)Landroid/content/Intent;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/my/newproject2/PasswordActivity;->i:Landroid/content/Intent;

    return-object v0
.end method

.method private initialize(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 60
    const v0, 0x7f030005

    invoke-virtual {p0, v0}, Lcom/my/newproject2/PasswordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/my/newproject2/PasswordActivity;->linear1:Landroid/widget/LinearLayout;

    .line 61
    const v0, 0x7f030010

    invoke-virtual {p0, v0}, Lcom/my/newproject2/PasswordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RatingBar;

    iput-object v0, p0, Lcom/my/newproject2/PasswordActivity;->ratingbar2:Landroid/widget/RatingBar;

    .line 62
    const v0, 0x7f030011

    invoke-virtual {p0, v0}, Lcom/my/newproject2/PasswordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/my/newproject2/PasswordActivity;->textview1:Landroid/widget/TextView;

    .line 63
    const v0, 0x7f03000d

    invoke-virtual {p0, v0}, Lcom/my/newproject2/PasswordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/my/newproject2/PasswordActivity;->progressbar1:Landroid/widget/ProgressBar;

    .line 64
    const v0, 0x7f03000f

    invoke-virtual {p0, v0}, Lcom/my/newproject2/PasswordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RatingBar;

    iput-object v0, p0, Lcom/my/newproject2/PasswordActivity;->ratingbar1:Landroid/widget/RatingBar;

    .line 65
    const v0, 0x7f03000e

    invoke-virtual {p0, v0}, Lcom/my/newproject2/PasswordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/my/newproject2/PasswordActivity;->progressbar2:Landroid/widget/ProgressBar;

    .line 66
    return-void
.end method

.method private initializeLogic()V
    .locals 4

    .prologue
    .line 69
    new-instance v0, Lcom/my/newproject2/PasswordActivity$1;

    invoke-direct {v0, p0}, Lcom/my/newproject2/PasswordActivity$1;-><init>(Lcom/my/newproject2/PasswordActivity;)V

    iput-object v0, p0, Lcom/my/newproject2/PasswordActivity;->q:Ljava/util/TimerTask;

    .line 81
    iget-object v0, p0, Lcom/my/newproject2/PasswordActivity;->_timer:Ljava/util/Timer;

    iget-object v1, p0, Lcom/my/newproject2/PasswordActivity;->q:Ljava/util/TimerTask;

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 82
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
    .line 112
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 113
    invoke-virtual {p1}, Landroid/widget/ListView;->getCheckedItemPositions()Landroid/util/SparseBooleanArray;

    move-result-object v2

    .line 114
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v2}, Landroid/util/SparseBooleanArray;->size()I

    move-result v3

    if-lt v0, v3, :cond_0

    .line 118
    return-object v1

    .line 115
    :cond_0
    invoke-virtual {v2, v0}, Landroid/util/SparseBooleanArray;->valueAt(I)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 116
    invoke-virtual {v2, v0}, Landroid/util/SparseBooleanArray;->keyAt(I)I

    move-result v3

    int-to-double v4, v3

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public getDip(I)F
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 123
    const/4 v0, 0x1

    int-to-float v1, p1

    invoke-virtual {p0}, Lcom/my/newproject2/PasswordActivity;->getResources()Landroid/content/res/Resources;

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
    .line 133
    invoke-virtual {p0}, Lcom/my/newproject2/PasswordActivity;->getResources()Landroid/content/res/Resources;

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
    .line 128
    invoke-virtual {p0}, Lcom/my/newproject2/PasswordActivity;->getResources()Landroid/content/res/Resources;

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
    .line 92
    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 93
    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 94
    const/4 v1, 0x0

    aget v0, v0, v1

    return v0
.end method

.method public getLocationY(Landroid/view/View;)I
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
    const/4 v1, 0x1

    aget v0, v0, v1

    return v0
.end method

.method public getRandom(II)I
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 106
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 107
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
    .line 53
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 54
    const v0, 0x7f040008

    invoke-virtual {p0, v0}, Lcom/my/newproject2/PasswordActivity;->setContentView(I)V

    .line 55
    invoke-direct {p0, p1}, Lcom/my/newproject2/PasswordActivity;->initialize(Landroid/os/Bundle;)V

    .line 56
    invoke-direct {p0}, Lcom/my/newproject2/PasswordActivity;->initializeLogic()V

    .line 57
    return-void
.end method

.method public showMessage(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 87
    invoke-virtual {p0}, Lcom/my/newproject2/PasswordActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 88
    return-void
.end method
