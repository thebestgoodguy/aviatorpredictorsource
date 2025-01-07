.class final La1/x;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo0/f;


# instance fields
.field final synthetic a:Lo0/i;

.field final synthetic b:Landroid/content/Context;


# direct methods
.method constructor <init>(La1/a0;Lo0/i;Landroid/content/Context;)V
    .locals 0

    iput-object p2, p0, La1/x;->a:Lo0/i;

    iput-object p3, p0, La1/x;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic d(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lcom/google/firebase/auth/i;

    iget-object v0, p0, La1/x;->a:Lo0/i;

    invoke-virtual {v0, p1}, Lo0/i;->c(Ljava/lang/Object;)V

    iget-object p1, p0, La1/x;->b:Landroid/content/Context;

    invoke-static {p1}, La1/a0;->e(Landroid/content/Context;)V

    return-void
.end method
