.class Lk/g$d;
.super Lk/g$e;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# instance fields
.field final a:Lk/g;

.field final b:Landroid/view/WindowInsetsController;

.field private final c:Le/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/e<",
            "Ljava/lang/Object;",
            "Landroid/view/WindowInsetsController$OnControllableInsetsChangedListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/view/Window;Lk/g;)V
    .locals 0

    invoke-virtual {p1}, Landroid/view/Window;->getInsetsController()Landroid/view/WindowInsetsController;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lk/g$d;-><init>(Landroid/view/WindowInsetsController;Lk/g;)V

    return-void
.end method

.method constructor <init>(Landroid/view/WindowInsetsController;Lk/g;)V
    .locals 1

    invoke-direct {p0}, Lk/g$e;-><init>()V

    new-instance v0, Le/e;

    invoke-direct {v0}, Le/e;-><init>()V

    iput-object v0, p0, Lk/g$d;->c:Le/e;

    iput-object p1, p0, Lk/g$d;->b:Landroid/view/WindowInsetsController;

    iput-object p2, p0, Lk/g$d;->a:Lk/g;

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    const/16 v0, 0x10

    if-eqz p1, :cond_0

    iget-object p1, p0, Lk/g$d;->b:Landroid/view/WindowInsetsController;

    invoke-interface {p1, v0, v0}, Landroid/view/WindowInsetsController;->setSystemBarsAppearance(II)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lk/g$d;->b:Landroid/view/WindowInsetsController;

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Landroid/view/WindowInsetsController;->setSystemBarsAppearance(II)V

    :goto_0
    return-void
.end method

.method public b(Z)V
    .locals 2

    const/16 v0, 0x8

    if-eqz p1, :cond_0

    iget-object p1, p0, Lk/g$d;->b:Landroid/view/WindowInsetsController;

    invoke-interface {p1, v0, v0}, Landroid/view/WindowInsetsController;->setSystemBarsAppearance(II)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lk/g$d;->b:Landroid/view/WindowInsetsController;

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Landroid/view/WindowInsetsController;->setSystemBarsAppearance(II)V

    :goto_0
    return-void
.end method
