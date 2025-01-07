.class final La1/u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo0/e;


# instance fields
.field final synthetic a:Lo0/i;

.field final synthetic b:Landroid/content/Context;


# direct methods
.method constructor <init>(La1/a0;Lo0/i;Landroid/content/Context;)V
    .locals 0

    iput-object p2, p0, La1/u;->a:Lo0/i;

    iput-object p3, p0, La1/u;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, La1/u;->a:Lo0/i;

    invoke-virtual {v0, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    iget-object p1, p0, La1/u;->b:Landroid/content/Context;

    invoke-static {p1}, La1/a0;->e(Landroid/content/Context;)V

    return-void
.end method
