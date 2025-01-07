.class final Landroidx/fragment/app/o$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/o;->l(Landroidx/fragment/app/q;Landroid/view/ViewGroup;Landroid/view/View;Le/a;Landroidx/fragment/app/o$e;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic e:Landroidx/fragment/app/q;

.field final synthetic f:Le/a;

.field final synthetic g:Ljava/lang/Object;

.field final synthetic h:Landroidx/fragment/app/o$e;

.field final synthetic i:Ljava/util/ArrayList;

.field final synthetic j:Landroid/view/View;

.field final synthetic k:Landroidx/fragment/app/Fragment;

.field final synthetic l:Landroidx/fragment/app/Fragment;

.field final synthetic m:Z

.field final synthetic n:Ljava/util/ArrayList;

.field final synthetic o:Ljava/lang/Object;

.field final synthetic p:Landroid/graphics/Rect;


# direct methods
.method constructor <init>(Landroidx/fragment/app/q;Le/a;Ljava/lang/Object;Landroidx/fragment/app/o$e;Ljava/util/ArrayList;Landroid/view/View;Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLjava/util/ArrayList;Ljava/lang/Object;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/o$d;->e:Landroidx/fragment/app/q;

    iput-object p2, p0, Landroidx/fragment/app/o$d;->f:Le/a;

    iput-object p3, p0, Landroidx/fragment/app/o$d;->g:Ljava/lang/Object;

    iput-object p4, p0, Landroidx/fragment/app/o$d;->h:Landroidx/fragment/app/o$e;

    iput-object p5, p0, Landroidx/fragment/app/o$d;->i:Ljava/util/ArrayList;

    iput-object p6, p0, Landroidx/fragment/app/o$d;->j:Landroid/view/View;

    iput-object p7, p0, Landroidx/fragment/app/o$d;->k:Landroidx/fragment/app/Fragment;

    iput-object p8, p0, Landroidx/fragment/app/o$d;->l:Landroidx/fragment/app/Fragment;

    iput-boolean p9, p0, Landroidx/fragment/app/o$d;->m:Z

    iput-object p10, p0, Landroidx/fragment/app/o$d;->n:Ljava/util/ArrayList;

    iput-object p11, p0, Landroidx/fragment/app/o$d;->o:Ljava/lang/Object;

    iput-object p12, p0, Landroidx/fragment/app/o$d;->p:Landroid/graphics/Rect;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Landroidx/fragment/app/o$d;->e:Landroidx/fragment/app/q;

    iget-object v1, p0, Landroidx/fragment/app/o$d;->f:Le/a;

    iget-object v2, p0, Landroidx/fragment/app/o$d;->g:Ljava/lang/Object;

    iget-object v3, p0, Landroidx/fragment/app/o$d;->h:Landroidx/fragment/app/o$e;

    invoke-static {v0, v1, v2, v3}, Landroidx/fragment/app/o;->h(Landroidx/fragment/app/q;Le/a;Ljava/lang/Object;Landroidx/fragment/app/o$e;)Le/a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/fragment/app/o$d;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Le/a;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Landroidx/fragment/app/o$d;->i:Ljava/util/ArrayList;

    iget-object v2, p0, Landroidx/fragment/app/o$d;->j:Landroid/view/View;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/o$d;->k:Landroidx/fragment/app/Fragment;

    iget-object v2, p0, Landroidx/fragment/app/o$d;->l:Landroidx/fragment/app/Fragment;

    iget-boolean v3, p0, Landroidx/fragment/app/o$d;->m:Z

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v0, v4}, Landroidx/fragment/app/o;->f(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLe/a;Z)V

    iget-object v1, p0, Landroidx/fragment/app/o$d;->g:Ljava/lang/Object;

    if-eqz v1, :cond_1

    iget-object v2, p0, Landroidx/fragment/app/o$d;->e:Landroidx/fragment/app/q;

    iget-object v3, p0, Landroidx/fragment/app/o$d;->n:Ljava/util/ArrayList;

    iget-object v4, p0, Landroidx/fragment/app/o$d;->i:Ljava/util/ArrayList;

    invoke-virtual {v2, v1, v3, v4}, Landroidx/fragment/app/q;->z(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    iget-object v1, p0, Landroidx/fragment/app/o$d;->h:Landroidx/fragment/app/o$e;

    iget-object v2, p0, Landroidx/fragment/app/o$d;->o:Ljava/lang/Object;

    iget-boolean v3, p0, Landroidx/fragment/app/o$d;->m:Z

    invoke-static {v0, v1, v2, v3}, Landroidx/fragment/app/o;->s(Le/a;Landroidx/fragment/app/o$e;Ljava/lang/Object;Z)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Landroidx/fragment/app/o$d;->e:Landroidx/fragment/app/q;

    iget-object v2, p0, Landroidx/fragment/app/o$d;->p:Landroid/graphics/Rect;

    invoke-virtual {v1, v0, v2}, Landroidx/fragment/app/q;->k(Landroid/view/View;Landroid/graphics/Rect;)V

    :cond_1
    return-void
.end method
