.class final Lw/f0;
.super Lw/g0;
.source ""


# instance fields
.field final synthetic a:Landroid/content/Intent;

.field final synthetic b:Lu/e;


# direct methods
.method constructor <init>(Landroid/content/Intent;Lu/e;I)V
    .locals 0

    iput-object p1, p0, Lw/f0;->a:Landroid/content/Intent;

    iput-object p2, p0, Lw/f0;->b:Lu/e;

    invoke-direct {p0}, Lw/g0;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lw/f0;->a:Landroid/content/Intent;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lw/f0;->b:Lu/e;

    const/4 v2, 0x2

    invoke-interface {v1, v0, v2}, Lu/e;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_0
    return-void
.end method
