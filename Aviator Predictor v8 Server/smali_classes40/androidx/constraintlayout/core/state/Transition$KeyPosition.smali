.class Landroidx/constraintlayout/core/state/Transition$KeyPosition;
.super Ljava/lang/Object;
.source "Transition.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/core/state/Transition;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "KeyPosition"
.end annotation


# instance fields
.field frame:I

.field target:Ljava/lang/String;

.field type:I

.field x:F

.field y:F


# direct methods
.method public constructor <init>(Ljava/lang/String;IIFF)V
    .locals 0
    .param p1, "target"    # Ljava/lang/String;
    .param p2, "frame"    # I
    .param p3, "type"    # I
    .param p4, "x"    # F
    .param p5, "y"    # F

    .line 216
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 217
    iput-object p1, p0, Landroidx/constraintlayout/core/state/Transition$KeyPosition;->target:Ljava/lang/String;

    .line 218
    iput p2, p0, Landroidx/constraintlayout/core/state/Transition$KeyPosition;->frame:I

    .line 219
    iput p3, p0, Landroidx/constraintlayout/core/state/Transition$KeyPosition;->type:I

    .line 220
    iput p4, p0, Landroidx/constraintlayout/core/state/Transition$KeyPosition;->x:F

    .line 221
    iput p5, p0, Landroidx/constraintlayout/core/state/Transition$KeyPosition;->y:F

    .line 222
    return-void
.end method
