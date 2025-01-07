.class public Lcom/my/newproject2/StartgameActivity;
.super Landroid/app/Activity;
.source "StartgameActivity.java"


# instance fields
.field private button1:Landroid/widget/Button;

.field private edittext1:Landroid/widget/EditText;

.field private i:Landroid/content/Intent;

.field private imageview1:Landroid/widget/ImageView;

.field private imageview2:Landroid/widget/ImageView;

.field private linear1:Landroid/widget/LinearLayout;

.field private linear2:Landroid/widget/LinearLayout;

.field private textview1:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 38
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 48
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iput-object v0, p0, Lcom/my/newproject2/StartgameActivity;->i:Landroid/content/Intent;

    .line 38
    return-void
.end method

.method static synthetic access$0(Lcom/my/newproject2/StartgameActivity;)Landroid/widget/EditText;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/my/newproject2/StartgameActivity;->edittext1:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic access$1(Lcom/my/newproject2/StartgameActivity;)Landroid/content/Intent;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/my/newproject2/StartgameActivity;->i:Landroid/content/Intent;

    return-object v0
.end method

.method private initialize(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 59
    const v0, 0x7f030005

    invoke-virtual {p0, v0}, Lcom/my/newproject2/StartgameActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/my/newproject2/StartgameActivity;->linear1:Landroid/widget/LinearLayout;

    .line 60
    const v0, 0x7f030003

    invoke-virtual {p0, v0}, Lcom/my/newproject2/StartgameActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/my/newproject2/StartgameActivity;->imageview1:Landroid/widget/ImageView;

    .line 61
    const v0, 0x7f030011

    invoke-virtual {p0, v0}, Lcom/my/newproject2/StartgameActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/my/newproject2/StartgameActivity;->textview1:Landroid/widget/TextView;

    .line 62
    const v0, 0x7f030006

    invoke-virtual {p0, v0}, Lcom/my/newproject2/StartgameActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/my/newproject2/StartgameActivity;->linear2:Landroid/widget/LinearLayout;

    .line 63
    const/high16 v0, 0x7f030000

    invoke-virtual {p0, v0}, Lcom/my/newproject2/StartgameActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/my/newproject2/StartgameActivity;->button1:Landroid/widget/Button;

    .line 64
    const v0, 0x7f030004

    invoke-virtual {p0, v0}, Lcom/my/newproject2/StartgameActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/my/newproject2/StartgameActivity;->imageview2:Landroid/widget/ImageView;

    .line 65
    const v0, 0x7f030002

    invoke-virtual {p0, v0}, Lcom/my/newproject2/StartgameActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/my/newproject2/StartgameActivity;->edittext1:Landroid/widget/EditText;

    .line 67
    iget-object v0, p0, Lcom/my/newproject2/StartgameActivity;->button1:Landroid/widget/Button;

    new-instance v1, Lcom/my/newproject2/StartgameActivity$1;

    invoke-direct {v1, p0}, Lcom/my/newproject2/StartgameActivity$1;-><init>(Lcom/my/newproject2/StartgameActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 80
    return-void
.end method

.method private initializeLogic()V
    .locals 7

    .prologue
    .line 83
    iget-object v1, p0, Lcom/my/newproject2/StartgameActivity;->edittext1:Landroid/widget/EditText;

    const-wide/high16 v2, 0x4039000000000000L    # 25.0

    const-wide/high16 v4, 0x403e000000000000L    # 30.0

    const-string v6, "#FFFFFF"

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/my/newproject2/StartgameActivity;->_radius(Landroid/view/View;DDLjava/lang/String;)V

    .line 84
    iget-object v1, p0, Lcom/my/newproject2/StartgameActivity;->button1:Landroid/widget/Button;

    const-wide/high16 v2, 0x4034000000000000L    # 20.0

    const-wide v4, 0x4051800000000000L    # 70.0

    const-string v6, "#ffffff"

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/my/newproject2/StartgameActivity;->_radius(Landroid/view/View;DDLjava/lang/String;)V

    .line 85
    iget-object v1, p0, Lcom/my/newproject2/StartgameActivity;->linear2:Landroid/widget/LinearLayout;

    const-wide/high16 v2, 0x403a000000000000L    # 26.0

    const-wide/high16 v4, 0x4044000000000000L    # 40.0

    const-string v6, "#ff0808"

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lcom/my/newproject2/StartgameActivity;->_radius(Landroid/view/View;DDLjava/lang/String;)V

    .line 86
    return-void
.end method


# virtual methods
.method public _radius(Landroid/view/View;DDLjava/lang/String;)V
    .locals 2

    .prologue
    .line 91
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 95
    invoke-static {p6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 97
    double-to-float v1, p2

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 99
    double-to-float v1, p4

    invoke-virtual {p1, v1}, Landroid/view/View;->setElevation(F)V

    .line 101
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 102
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
    .line 132
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 133
    invoke-virtual {p1}, Landroid/widget/ListView;->getCheckedItemPositions()Landroid/util/SparseBooleanArray;

    move-result-object v2

    .line 134
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v2}, Landroid/util/SparseBooleanArray;->size()I

    move-result v3

    if-lt v0, v3, :cond_0

    .line 138
    return-object v1

    .line 135
    :cond_0
    invoke-virtual {v2, v0}, Landroid/util/SparseBooleanArray;->valueAt(I)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 136
    invoke-virtual {v2, v0}, Landroid/util/SparseBooleanArray;->keyAt(I)I

    move-result v3

    int-to-double v4, v3

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public getDip(I)F
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 143
    const/4 v0, 0x1

    int-to-float v1, p1

    invoke-virtual {p0}, Lcom/my/newproject2/StartgameActivity;->getResources()Landroid/content/res/Resources;

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
    .line 153
    invoke-virtual {p0}, Lcom/my/newproject2/StartgameActivity;->getResources()Landroid/content/res/Resources;

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
    .line 148
    invoke-virtual {p0}, Lcom/my/newproject2/StartgameActivity;->getResources()Landroid/content/res/Resources;

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
    .line 112
    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 113
    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 114
    const/4 v1, 0x0

    aget v0, v0, v1

    return v0
.end method

.method public getLocationY(Landroid/view/View;)I
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 119
    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 120
    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 121
    const/4 v1, 0x1

    aget v0, v0, v1

    return v0
.end method

.method public getRandom(II)I
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 126
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 127
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
    .line 52
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 53
    const v0, 0x7f04000a

    invoke-virtual {p0, v0}, Lcom/my/newproject2/StartgameActivity;->setContentView(I)V

    .line 54
    invoke-direct {p0, p1}, Lcom/my/newproject2/StartgameActivity;->initialize(Landroid/os/Bundle;)V

    .line 55
    invoke-direct {p0}, Lcom/my/newproject2/StartgameActivity;->initializeLogic()V

    .line 56
    return-void
.end method

.method public showMessage(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 107
    invoke-virtual {p0}, Lcom/my/newproject2/StartgameActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 108
    return-void
.end method
