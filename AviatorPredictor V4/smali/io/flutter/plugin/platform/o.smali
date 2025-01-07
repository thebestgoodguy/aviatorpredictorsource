.class Lio/flutter/plugin/platform/o;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugin/platform/o$b;
    }
.end annotation


# instance fields
.field a:Lio/flutter/plugin/platform/SingleViewPresentation;

.field private final b:Landroid/content/Context;

.field private final c:Lio/flutter/plugin/platform/a;

.field private final d:I

.field private final e:Lio/flutter/view/d$c;

.field private final f:Landroid/view/View$OnFocusChangeListener;

.field private final g:Landroid/view/Surface;

.field private h:Landroid/hardware/display/VirtualDisplay;

.field private i:I

.field private j:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lio/flutter/plugin/platform/a;Landroid/hardware/display/VirtualDisplay;Lio/flutter/plugin/platform/c;Landroid/view/Surface;Lio/flutter/view/d$c;Landroid/view/View$OnFocusChangeListener;ILjava/lang/Object;)V
    .locals 10

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v2, p1

    iput-object v2, v0, Lio/flutter/plugin/platform/o;->b:Landroid/content/Context;

    move-object v5, p2

    iput-object v5, v0, Lio/flutter/plugin/platform/o;->c:Lio/flutter/plugin/platform/a;

    move-object/from16 v1, p6

    iput-object v1, v0, Lio/flutter/plugin/platform/o;->e:Lio/flutter/view/d$c;

    move-object/from16 v8, p7

    iput-object v8, v0, Lio/flutter/plugin/platform/o;->f:Landroid/view/View$OnFocusChangeListener;

    move-object v1, p5

    iput-object v1, v0, Lio/flutter/plugin/platform/o;->g:Landroid/view/Surface;

    move-object v1, p3

    iput-object v1, v0, Lio/flutter/plugin/platform/o;->h:Landroid/hardware/display/VirtualDisplay;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->densityDpi:I

    iput v1, v0, Lio/flutter/plugin/platform/o;->d:I

    new-instance v9, Lio/flutter/plugin/platform/SingleViewPresentation;

    iget-object v1, v0, Lio/flutter/plugin/platform/o;->h:Landroid/hardware/display/VirtualDisplay;

    invoke-virtual {v1}, Landroid/hardware/display/VirtualDisplay;->getDisplay()Landroid/view/Display;

    move-result-object v3

    move-object v1, v9

    move-object v4, p4

    move/from16 v6, p8

    move-object/from16 v7, p9

    invoke-direct/range {v1 .. v8}, Lio/flutter/plugin/platform/SingleViewPresentation;-><init>(Landroid/content/Context;Landroid/view/Display;Lio/flutter/plugin/platform/c;Lio/flutter/plugin/platform/a;ILjava/lang/Object;Landroid/view/View$OnFocusChangeListener;)V

    iput-object v9, v0, Lio/flutter/plugin/platform/o;->a:Lio/flutter/plugin/platform/SingleViewPresentation;

    invoke-virtual {v9}, Landroid/app/Presentation;->show()V

    return-void
.end method

.method public static a(Landroid/content/Context;Lio/flutter/plugin/platform/a;Lio/flutter/plugin/platform/c;Lio/flutter/view/d$c;IIILjava/lang/Object;Landroid/view/View$OnFocusChangeListener;)Lio/flutter/plugin/platform/o;
    .locals 20

    move/from16 v7, p4

    move/from16 v8, p5

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    const/4 v9, 0x0

    if-eqz v7, :cond_2

    if-nez v8, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p3 .. p3}, Lio/flutter/view/d$c;->d()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    invoke-virtual {v0, v7, v8}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    new-instance v15, Landroid/view/Surface;

    invoke-interface/range {p3 .. p3}, Lio/flutter/view/d$c;->d()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    invoke-direct {v15, v0}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    const-string v0, "display"

    move-object/from16 v11, p0

    invoke-virtual {v11, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/display/DisplayManager;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v4, v1, Landroid/util/DisplayMetrics;->densityDpi:I

    const/4 v6, 0x0

    const-string v1, "flutter-vd"

    move/from16 v2, p4

    move/from16 v3, p5

    move-object v5, v15

    invoke-virtual/range {v0 .. v6}, Landroid/hardware/display/DisplayManager;->createVirtualDisplay(Ljava/lang/String;IIILandroid/view/Surface;I)Landroid/hardware/display/VirtualDisplay;

    move-result-object v13

    if-nez v13, :cond_1

    return-object v9

    :cond_1
    new-instance v0, Lio/flutter/plugin/platform/o;

    move-object v10, v0

    move-object/from16 v11, p0

    move-object/from16 v12, p1

    move-object/from16 v14, p2

    move-object/from16 v16, p3

    move-object/from16 v17, p8

    move/from16 v18, p6

    move-object/from16 v19, p7

    invoke-direct/range {v10 .. v19}, Lio/flutter/plugin/platform/o;-><init>(Landroid/content/Context;Lio/flutter/plugin/platform/a;Landroid/hardware/display/VirtualDisplay;Lio/flutter/plugin/platform/c;Landroid/view/Surface;Lio/flutter/view/d$c;Landroid/view/View$OnFocusChangeListener;ILjava/lang/Object;)V

    iput v7, v0, Lio/flutter/plugin/platform/o;->i:I

    iput v8, v0, Lio/flutter/plugin/platform/o;->j:I

    return-object v0

    :cond_2
    :goto_0
    return-object v9
.end method


# virtual methods
.method public b(Landroid/view/MotionEvent;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugin/platform/o;->a:Lio/flutter/plugin/platform/SingleViewPresentation;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Landroid/app/Presentation;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    return-void
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lio/flutter/plugin/platform/o;->j:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lio/flutter/plugin/platform/o;->i:I

    return v0
.end method

.method public e()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugin/platform/o;->a:Lio/flutter/plugin/platform/SingleViewPresentation;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lio/flutter/plugin/platform/SingleViewPresentation;->getView()Lio/flutter/plugin/platform/c;

    move-result-object v0

    invoke-interface {v0}, Lio/flutter/plugin/platform/c;->f()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method f(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugin/platform/o;->a:Lio/flutter/plugin/platform/SingleViewPresentation;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/flutter/plugin/platform/SingleViewPresentation;->getView()Lio/flutter/plugin/platform/c;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/flutter/plugin/platform/o;->a:Lio/flutter/plugin/platform/SingleViewPresentation;

    invoke-virtual {v0}, Lio/flutter/plugin/platform/SingleViewPresentation;->getView()Lio/flutter/plugin/platform/c;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/flutter/plugin/platform/c;->a(Landroid/view/View;)V

    :cond_1
    :goto_0
    return-void
.end method

.method g()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugin/platform/o;->a:Lio/flutter/plugin/platform/SingleViewPresentation;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/flutter/plugin/platform/SingleViewPresentation;->getView()Lio/flutter/plugin/platform/c;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/flutter/plugin/platform/o;->a:Lio/flutter/plugin/platform/SingleViewPresentation;

    invoke-virtual {v0}, Lio/flutter/plugin/platform/SingleViewPresentation;->getView()Lio/flutter/plugin/platform/c;

    move-result-object v0

    invoke-interface {v0}, Lio/flutter/plugin/platform/c;->e()V

    :cond_1
    :goto_0
    return-void
.end method

.method h()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugin/platform/o;->a:Lio/flutter/plugin/platform/SingleViewPresentation;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/flutter/plugin/platform/SingleViewPresentation;->getView()Lio/flutter/plugin/platform/c;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/flutter/plugin/platform/o;->a:Lio/flutter/plugin/platform/SingleViewPresentation;

    invoke-virtual {v0}, Lio/flutter/plugin/platform/SingleViewPresentation;->getView()Lio/flutter/plugin/platform/c;

    move-result-object v0

    invoke-interface {v0}, Lio/flutter/plugin/platform/c;->c()V

    :cond_1
    :goto_0
    return-void
.end method

.method public i(IILjava/lang/Runnable;)V
    .locals 9

    invoke-virtual {p0}, Lio/flutter/plugin/platform/o;->e()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    move-result v7

    iget-object v0, p0, Lio/flutter/plugin/platform/o;->a:Lio/flutter/plugin/platform/SingleViewPresentation;

    invoke-virtual {v0}, Lio/flutter/plugin/platform/SingleViewPresentation;->detachState()Lio/flutter/plugin/platform/SingleViewPresentation$e;

    move-result-object v8

    iget-object v0, p0, Lio/flutter/plugin/platform/o;->h:Landroid/hardware/display/VirtualDisplay;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/hardware/display/VirtualDisplay;->setSurface(Landroid/view/Surface;)V

    iget-object v0, p0, Lio/flutter/plugin/platform/o;->h:Landroid/hardware/display/VirtualDisplay;

    invoke-virtual {v0}, Landroid/hardware/display/VirtualDisplay;->release()V

    iput p1, p0, Lio/flutter/plugin/platform/o;->i:I

    iput p2, p0, Lio/flutter/plugin/platform/o;->j:I

    iget-object v0, p0, Lio/flutter/plugin/platform/o;->e:Lio/flutter/view/d$c;

    invoke-interface {v0}, Lio/flutter/view/d$c;->d()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    iget-object v0, p0, Lio/flutter/plugin/platform/o;->b:Landroid/content/Context;

    const-string v1, "display"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/display/DisplayManager;

    iget v4, p0, Lio/flutter/plugin/platform/o;->d:I

    iget-object v5, p0, Lio/flutter/plugin/platform/o;->g:Landroid/view/Surface;

    const-string v1, "flutter-vd"

    const/4 v6, 0x0

    move v2, p1

    move v3, p2

    invoke-virtual/range {v0 .. v6}, Landroid/hardware/display/DisplayManager;->createVirtualDisplay(Ljava/lang/String;IIILandroid/view/Surface;I)Landroid/hardware/display/VirtualDisplay;

    move-result-object v0

    iput-object v0, p0, Lio/flutter/plugin/platform/o;->h:Landroid/hardware/display/VirtualDisplay;

    invoke-virtual {p0}, Lio/flutter/plugin/platform/o;->e()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lio/flutter/plugin/platform/o$a;

    invoke-direct {v1, p0, v0, p3}, Lio/flutter/plugin/platform/o$a;-><init>(Lio/flutter/plugin/platform/o;Landroid/view/View;Ljava/lang/Runnable;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    new-instance v0, Lio/flutter/plugin/platform/SingleViewPresentation;

    iget-object v2, p0, Lio/flutter/plugin/platform/o;->b:Landroid/content/Context;

    iget-object v1, p0, Lio/flutter/plugin/platform/o;->h:Landroid/hardware/display/VirtualDisplay;

    invoke-virtual {v1}, Landroid/hardware/display/VirtualDisplay;->getDisplay()Landroid/view/Display;

    move-result-object v3

    iget-object v4, p0, Lio/flutter/plugin/platform/o;->c:Lio/flutter/plugin/platform/a;

    iget-object v6, p0, Lio/flutter/plugin/platform/o;->f:Landroid/view/View$OnFocusChangeListener;

    move-object v1, v0

    move-object v5, v8

    invoke-direct/range {v1 .. v7}, Lio/flutter/plugin/platform/SingleViewPresentation;-><init>(Landroid/content/Context;Landroid/view/Display;Lio/flutter/plugin/platform/a;Lio/flutter/plugin/platform/SingleViewPresentation$e;Landroid/view/View$OnFocusChangeListener;Z)V

    invoke-virtual {v0}, Landroid/app/Presentation;->show()V

    iget-object v1, p0, Lio/flutter/plugin/platform/o;->a:Lio/flutter/plugin/platform/SingleViewPresentation;

    invoke-virtual {v1}, Landroid/app/Presentation;->cancel()V

    iput-object v0, p0, Lio/flutter/plugin/platform/o;->a:Lio/flutter/plugin/platform/SingleViewPresentation;

    return-void
.end method
