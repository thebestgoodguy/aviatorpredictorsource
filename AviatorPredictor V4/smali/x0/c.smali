.class public final synthetic Lx0/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lr1/b;


# instance fields
.field public final synthetic a:Lx0/e;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lx0/e;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx0/c;->a:Lx0/e;

    iput-object p2, p0, Lx0/c;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lx0/c;->a:Lx0/e;

    iget-object v1, p0, Lx0/c;->b:Landroid/content/Context;

    invoke-static {v0, v1}, Lx0/e;->b(Lx0/e;Landroid/content/Context;)Ls1/a;

    move-result-object v0

    return-object v0
.end method
