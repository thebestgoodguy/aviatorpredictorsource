.class Lk/g$c;
.super Lk/g$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# direct methods
.method constructor <init>(Landroid/view/Window;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lk/g$b;-><init>(Landroid/view/Window;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 1

    const/16 v0, 0x10

    if-eqz p1, :cond_0

    const/high16 p1, 0x8000000

    invoke-virtual {p0, p1}, Lk/g$a;->f(I)V

    const/high16 p1, -0x80000000

    invoke-virtual {p0, p1}, Lk/g$a;->d(I)V

    invoke-virtual {p0, v0}, Lk/g$a;->c(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lk/g$a;->e(I)V

    :goto_0
    return-void
.end method
