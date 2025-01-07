.class final Lcom/google/firebase/auth/a2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo0/a;


# direct methods
.method constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lo0/h;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p1}, Lo0/h;->p()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lo0/h;->l()Ljava/lang/Exception;

    move-result-object v0

    instance-of v0, v0, Lcom/google/firebase/auth/q;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lo0/h;->l()Ljava/lang/Exception;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/q;

    invoke-virtual {v0}, Lcom/google/firebase/auth/q;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ERROR_INTERNAL_SUCCESS_SIGN_OUT"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    invoke-static {p1}, Lo0/k;->d(Ljava/lang/Object;)Lo0/h;

    move-result-object p1

    :cond_0
    return-object p1
.end method
