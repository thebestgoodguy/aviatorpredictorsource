.class Lcom/my/aviator/predictor/v8/dn;
.super Landroid/graphics/drawable/GradientDrawable;


# instance fields
.field final synthetic a:Lcom/my/aviator/predictor/v8/MainActivity;


# direct methods
.method constructor <init>(Lcom/my/aviator/predictor/v8/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/dn;->a:Lcom/my/aviator/predictor/v8/MainActivity;

    invoke-direct {p0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    return-void
.end method


# virtual methods
.method public a(IIII)Landroid/graphics/drawable/GradientDrawable;
    .locals 0

    int-to-float p1, p1

    invoke-virtual {p0, p1}, Lcom/my/aviator/predictor/v8/dn;->setCornerRadius(F)V

    invoke-virtual {p0, p2, p3}, Lcom/my/aviator/predictor/v8/dn;->setStroke(II)V

    invoke-virtual {p0, p4}, Lcom/my/aviator/predictor/v8/dn;->setColor(I)V

    return-object p0
.end method
