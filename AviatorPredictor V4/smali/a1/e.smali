.class final La1/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo0/a;


# direct methods
.method constructor <init>(La1/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lo0/h;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p1}, Lo0/h;->p()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lo0/h;->l()Ljava/lang/Exception;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->c(Ljava/lang/Exception;)Lo0/h;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/auth/b0;

    invoke-virtual {p1}, Lcom/google/firebase/auth/b0;->g()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, La1/j;->j0(Ljava/lang/String;)La1/j;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->d(Ljava/lang/Object;)Lo0/h;

    move-result-object p1

    :goto_0
    return-object p1
.end method
