.class final La1/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo0/a;


# instance fields
.field final synthetic a:La1/h;


# direct methods
.method constructor <init>(La1/h;)V
    .locals 0

    iput-object p1, p0, La1/g;->a:La1/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lo0/h;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, La1/g;->a:La1/h;

    invoke-static {v0}, La1/h;->m0(La1/h;)Lcom/google/firebase/auth/n1;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lo0/h;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/auth/i;

    new-instance v0, La1/g1;

    invoke-interface {p1}, Lcom/google/firebase/auth/i;->k()Lcom/google/firebase/auth/z;

    move-result-object v1

    check-cast v1, La1/m1;

    invoke-interface {p1}, Lcom/google/firebase/auth/i;->f0()Lcom/google/firebase/auth/g;

    move-result-object p1

    check-cast p1, La1/e1;

    iget-object v2, p0, La1/g;->a:La1/h;

    invoke-static {v2}, La1/h;->m0(La1/h;)Lcom/google/firebase/auth/n1;

    move-result-object v2

    invoke-direct {v0, v1, p1, v2}, La1/g1;-><init>(La1/m1;La1/e1;Lcom/google/firebase/auth/n1;)V

    invoke-static {v0}, Lo0/k;->d(Ljava/lang/Object;)Lo0/h;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lo0/h;->l()Ljava/lang/Exception;

    move-result-object p1

    instance-of v0, p1, Lcom/google/firebase/auth/w;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lcom/google/firebase/auth/w;

    iget-object v1, p0, La1/g;->a:La1/h;

    invoke-static {v1}, La1/h;->m0(La1/h;)Lcom/google/firebase/auth/n1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/auth/w;->d(Lcom/google/firebase/auth/h;)Lcom/google/firebase/auth/w;

    :cond_2
    invoke-static {p1}, Lo0/k;->c(Ljava/lang/Exception;)Lo0/h;

    move-result-object p1

    :goto_0
    return-object p1
.end method
