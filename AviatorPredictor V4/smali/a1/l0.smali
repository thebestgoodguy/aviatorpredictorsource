.class final La1/l0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/common/api/internal/a$a;


# instance fields
.field final synthetic a:La1/m0;


# direct methods
.method constructor <init>(La1/m0;)V
    .locals 0

    iput-object p1, p0, La1/l0;->a:La1/m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p0, La1/l0;->a:La1/m0;

    const/4 v0, 0x1

    invoke-static {p1, v0}, La1/m0;->b(La1/m0;Z)V

    iget-object p1, p0, La1/l0;->a:La1/m0;

    invoke-virtual {p1}, La1/m0;->c()V

    return-void

    :cond_0
    iget-object p1, p0, La1/l0;->a:La1/m0;

    const/4 v0, 0x0

    invoke-static {p1, v0}, La1/m0;->b(La1/m0;Z)V

    iget-object p1, p0, La1/l0;->a:La1/m0;

    invoke-static {p1}, La1/m0;->f(La1/m0;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, La1/l0;->a:La1/m0;

    invoke-static {p1}, La1/m0;->a(La1/m0;)La1/p;

    move-result-object p1

    invoke-virtual {p1}, La1/p;->c()V

    :cond_1
    return-void
.end method
