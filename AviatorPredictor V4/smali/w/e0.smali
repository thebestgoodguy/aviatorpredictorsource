.class final Lw/e0;
.super Lw/g0;
.source ""


# instance fields
.field final synthetic a:Landroid/content/Intent;

.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:I


# direct methods
.method constructor <init>(Landroid/content/Intent;Landroid/app/Activity;I)V
    .locals 0

    iput-object p1, p0, Lw/e0;->a:Landroid/content/Intent;

    iput-object p2, p0, Lw/e0;->b:Landroid/app/Activity;

    iput p3, p0, Lw/e0;->c:I

    invoke-direct {p0}, Lw/g0;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lw/e0;->a:Landroid/content/Intent;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lw/e0;->b:Landroid/app/Activity;

    iget v2, p0, Lw/e0;->c:I

    invoke-virtual {v1, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_0
    return-void
.end method
