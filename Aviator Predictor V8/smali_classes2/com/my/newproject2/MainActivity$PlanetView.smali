.class public Lcom/my/newproject2/MainActivity$PlanetView;
.super Landroid/view/View;
.source "MainActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/my/newproject2/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "PlanetView"
.end annotation


# instance fields
.field private angle:D

.field private myPaint:Landroid/graphics/Paint;

.field final synthetic this$0:Lcom/my/newproject2/MainActivity;


# direct methods
.method public constructor <init>(Lcom/my/newproject2/MainActivity;Landroid/content/Context;)V
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    .line 98
    iput-object p1, p0, Lcom/my/newproject2/MainActivity$PlanetView;->this$0:Lcom/my/newproject2/MainActivity;

    .line 99
    invoke-direct {p0, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 96
    iput-wide v2, p0, Lcom/my/newproject2/MainActivity$PlanetView;->angle:D

    .line 100
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/my/newproject2/MainActivity$PlanetView;->myPaint:Landroid/graphics/Paint;

    .line 101
    iput-wide v2, p0, Lcom/my/newproject2/MainActivity$PlanetView;->angle:D

    .line 102
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 18

    .prologue
    .line 106
    invoke-virtual/range {p0 .. p0}, Lcom/my/newproject2/MainActivity$PlanetView;->getMeasuredWidth()I

    move-result v2

    .line 107
    invoke-virtual/range {p0 .. p0}, Lcom/my/newproject2/MainActivity$PlanetView;->getMeasuredHeight()I

    move-result v3

    move-object/from16 v0, p0

    iget-wide v4, v0, Lcom/my/newproject2/MainActivity$PlanetView;->angle:D

    const-wide v6, 0x3f50624dd2f1a9fcL    # 0.001

    add-double/2addr v4, v6

    const-wide v6, 0x4076800000000000L    # 360.0

    rem-double/2addr v4, v6

    move-object/from16 v0, p0

    iput-wide v4, v0, Lcom/my/newproject2/MainActivity$PlanetView;->angle:D

    .line 109
    const-wide v4, 0x4070400000000000L    # 260.0

    move-object/from16 v0, p0

    iget-wide v6, v0, Lcom/my/newproject2/MainActivity$PlanetView;->angle:D

    invoke-static {v6, v7}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    mul-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    move-result-wide v4

    long-to-float v4, v4

    .line 110
    const-wide v6, 0x405b800000000000L    # 110.0

    move-object/from16 v0, p0

    iget-wide v8, v0, Lcom/my/newproject2/MainActivity$PlanetView;->angle:D

    invoke-static {v8, v9}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    move-result-wide v8

    mul-double/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->round(D)J

    move-result-wide v6

    long-to-float v5, v6

    .line 111
    const-wide/high16 v6, 0x405e000000000000L    # 120.0

    const-wide v8, 0x4056800000000000L    # 90.0

    move-object/from16 v0, p0

    iget-wide v10, v0, Lcom/my/newproject2/MainActivity$PlanetView;->angle:D

    invoke-static {v10, v11}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v10

    add-double/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    move-result-wide v8

    mul-double/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->round(D)J

    move-result-wide v6

    long-to-float v6, v6

    .line 112
    const-wide v8, 0x4072200000000000L    # 290.0

    const-wide v10, 0x4056800000000000L    # 90.0

    move-object/from16 v0, p0

    iget-wide v12, v0, Lcom/my/newproject2/MainActivity$PlanetView;->angle:D

    invoke-static {v12, v13}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v12

    add-double/2addr v10, v12

    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    move-result-wide v10

    mul-double/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Math;->round(D)J

    move-result-wide v8

    long-to-float v7, v8

    .line 113
    const-wide v8, 0x4060400000000000L    # 130.0

    const-wide v10, 0x4066800000000000L    # 180.0

    move-object/from16 v0, p0

    iget-wide v12, v0, Lcom/my/newproject2/MainActivity$PlanetView;->angle:D

    invoke-static {v12, v13}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v12

    add-double/2addr v10, v12

    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    move-result-wide v10

    mul-double/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Math;->round(D)J

    move-result-wide v8

    long-to-float v8, v8

    .line 114
    const-wide v10, 0x406cc00000000000L    # 230.0

    const-wide v12, 0x4066800000000000L    # 180.0

    move-object/from16 v0, p0

    iget-wide v14, v0, Lcom/my/newproject2/MainActivity$PlanetView;->angle:D

    invoke-static {v14, v15}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v14

    add-double/2addr v12, v14

    invoke-static {v12, v13}, Ljava/lang/Math;->cos(D)D

    move-result-wide v12

    mul-double/2addr v10, v12

    invoke-static {v10, v11}, Ljava/lang/Math;->round(D)J

    move-result-wide v10

    long-to-float v9, v10

    .line 115
    const-wide/high16 v10, 0x405e000000000000L    # 120.0

    const-wide v12, 0x4070e00000000000L    # 270.0

    move-object/from16 v0, p0

    iget-wide v14, v0, Lcom/my/newproject2/MainActivity$PlanetView;->angle:D

    invoke-static {v14, v15}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v14

    add-double/2addr v12, v14

    invoke-static {v12, v13}, Ljava/lang/Math;->sin(D)D

    move-result-wide v12

    mul-double/2addr v10, v12

    invoke-static {v10, v11}, Ljava/lang/Math;->round(D)J

    move-result-wide v10

    long-to-float v10, v10

    .line 116
    const-wide v12, 0x406f400000000000L    # 250.0

    const-wide v14, 0x4070e00000000000L    # 270.0

    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/my/newproject2/MainActivity$PlanetView;->angle:D

    move-wide/from16 v16, v0

    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v16

    add-double v14, v14, v16

    invoke-static {v14, v15}, Ljava/lang/Math;->cos(D)D

    move-result-wide v14

    mul-double/2addr v12, v14

    invoke-static {v12, v13}, Ljava/lang/Math;->round(D)J

    move-result-wide v12

    long-to-float v11, v12

    .line 119
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/my/newproject2/MainActivity$PlanetView;->myPaint:Landroid/graphics/Paint;

    sget-object v13, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v12, v13}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 121
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/my/newproject2/MainActivity$PlanetView;->myPaint:Landroid/graphics/Paint;

    const-string v13, "#eceff1"

    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v13

    invoke-virtual {v12, v13}, Landroid/graphics/Paint;->setColor(I)V

    .line 122
    div-int/lit8 v12, v2, 0x2

    int-to-float v12, v12

    div-int/lit8 v13, v3, 0x2

    int-to-float v13, v13

    float-to-double v14, v4

    const-wide/high16 v16, 0x3ff8000000000000L    # 1.5

    mul-double v14, v14, v16

    double-to-int v14, v14

    int-to-float v14, v14

    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/my/newproject2/MainActivity$PlanetView;->myPaint:Landroid/graphics/Paint;

    move-object/from16 v0, p1

    invoke-virtual {v0, v12, v13, v14, v15}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 123
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/my/newproject2/MainActivity$PlanetView;->myPaint:Landroid/graphics/Paint;

    const-string v13, "#cfd8dc"

    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v13

    invoke-virtual {v12, v13}, Landroid/graphics/Paint;->setColor(I)V

    .line 124
    div-int/lit8 v12, v2, 0x2

    int-to-float v12, v12

    div-int/lit8 v13, v3, 0x2

    int-to-float v13, v13

    float-to-double v14, v4

    const-wide/high16 v16, 0x3ff8000000000000L    # 1.5

    mul-double v14, v14, v16

    double-to-int v14, v14

    add-int/lit8 v14, v14, -0x19

    int-to-float v14, v14

    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/my/newproject2/MainActivity$PlanetView;->myPaint:Landroid/graphics/Paint;

    move-object/from16 v0, p1

    invoke-virtual {v0, v12, v13, v14, v15}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 126
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/my/newproject2/MainActivity$PlanetView;->myPaint:Landroid/graphics/Paint;

    const-string v13, "#275080"

    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v13

    invoke-virtual {v12, v13}, Landroid/graphics/Paint;->setColor(I)V

    div-int/lit8 v12, v2, 0x2

    int-to-float v12, v12

    add-float/2addr v12, v4

    div-int/lit8 v13, v3, 0x2

    int-to-float v13, v13

    add-float/2addr v5, v13

    const/high16 v13, 0x41700000    # 15.0f

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/my/newproject2/MainActivity$PlanetView;->myPaint:Landroid/graphics/Paint;

    move-object/from16 v0, p1

    invoke-virtual {v0, v12, v5, v13, v14}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 128
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/my/newproject2/MainActivity$PlanetView;->myPaint:Landroid/graphics/Paint;

    const-string v12, "#DA3287"

    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v12

    invoke-virtual {v5, v12}, Landroid/graphics/Paint;->setColor(I)V

    div-int/lit8 v5, v2, 0x2

    int-to-float v5, v5

    add-float/2addr v5, v6

    div-int/lit8 v6, v3, 0x2

    int-to-float v6, v6

    add-float/2addr v6, v7

    const/high16 v7, 0x41a00000    # 20.0f

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/my/newproject2/MainActivity$PlanetView;->myPaint:Landroid/graphics/Paint;

    move-object/from16 v0, p1

    invoke-virtual {v0, v5, v6, v7, v12}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 130
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/my/newproject2/MainActivity$PlanetView;->myPaint:Landroid/graphics/Paint;

    const-string v6, "#008001"

    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setColor(I)V

    div-int/lit8 v5, v2, 0x2

    int-to-float v5, v5

    add-float/2addr v5, v8

    div-int/lit8 v6, v3, 0x2

    int-to-float v6, v6

    add-float/2addr v6, v9

    const/high16 v7, 0x41f00000    # 30.0f

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/my/newproject2/MainActivity$PlanetView;->myPaint:Landroid/graphics/Paint;

    move-object/from16 v0, p1

    invoke-virtual {v0, v5, v6, v7, v8}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 132
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/my/newproject2/MainActivity$PlanetView;->myPaint:Landroid/graphics/Paint;

    const-string v6, "#8B0000"

    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setColor(I)V

    div-int/lit8 v5, v2, 0x2

    int-to-float v5, v5

    add-float/2addr v5, v10

    div-int/lit8 v6, v3, 0x2

    int-to-float v6, v6

    add-float/2addr v6, v11

    const/high16 v7, 0x41200000    # 10.0f

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/my/newproject2/MainActivity$PlanetView;->myPaint:Landroid/graphics/Paint;

    move-object/from16 v0, p1

    invoke-virtual {v0, v5, v6, v7, v8}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 136
    invoke-virtual/range {p0 .. p0}, Lcom/my/newproject2/MainActivity$PlanetView;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f020005

    const/4 v7, 0x0

    invoke-virtual {v5, v6, v7}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 137
    div-int/lit8 v6, v2, 0x2

    add-int/lit8 v6, v6, -0x50

    int-to-float v6, v6

    const/high16 v7, 0x41300000    # 11.0f

    div-float v7, v4, v7

    sub-float/2addr v6, v7

    float-to-int v6, v6

    div-int/lit8 v7, v3, 0x2

    add-int/lit8 v7, v7, -0x50

    int-to-float v7, v7

    const/high16 v8, 0x41300000    # 11.0f

    div-float v8, v4, v8

    sub-float/2addr v7, v8

    float-to-int v7, v7

    div-int/lit8 v2, v2, 0x2

    add-int/lit8 v2, v2, 0x50

    int-to-float v2, v2

    const/high16 v8, 0x41300000    # 11.0f

    div-float v8, v4, v8

    add-float/2addr v2, v8

    float-to-int v2, v2

    div-int/lit8 v3, v3, 0x2

    add-int/lit8 v3, v3, 0x50

    int-to-float v3, v3

    const/high16 v8, 0x41300000    # 11.0f

    div-float/2addr v4, v8

    add-float/2addr v3, v4

    float-to-int v3, v3

    invoke-virtual {v5, v6, v7, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 138
    move-object/from16 v0, p1

    invoke-virtual {v5, v0}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 141
    invoke-virtual/range {p0 .. p0}, Lcom/my/newproject2/MainActivity$PlanetView;->invalidate()V

    .line 143
    return-void
.end method
