.class Lcom/my/aviator/predictor/v8/do;
.super Landroid/graphics/drawable/GradientDrawable;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/MainActivity;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/do;->a:Lcom/my/aviator/predictor/v8/MainActivity;

    invoke-direct {p0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    return-void
.end method


# virtual methods
.method public a(IIII)Landroid/graphics/drawable/GradientDrawable;
    .locals 0

    int-to-float p1, p1

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/do;->setCornerRadius(F)V

    invoke-virtual {p0, p2, p3}, Lcom/my/aviator/predictor/v8/do;->setStroke(II)V

    invoke-virtual {p0, p4}, Lcom/my/aviator/predictor/v8/do;->setColor(I)V

    return-object p0
.end method
