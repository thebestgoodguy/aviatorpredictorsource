.class public final La1/f;
.super Lcom/google/firebase/auth/g0;
.source ""


# instance fields
.field private final a:La1/m1;


# direct methods
.method public constructor <init>(La1/m1;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/auth/g0;-><init>()V

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, La1/f;->a:La1/m1;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/firebase/auth/h0;Ljava/lang/String;)Lo0/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/h0;",
            "Ljava/lang/String;",
            ")",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, La1/f;->a:La1/m1;

    invoke-virtual {v0}, Lcom/google/firebase/auth/z;->C0()Lx0/e;

    move-result-object v1

    invoke-static {v1}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Lx0/e;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v1

    invoke-virtual {v1, v0, p1, p2}, Lcom/google/firebase/auth/FirebaseAuth;->V(Lcom/google/firebase/auth/z;Lcom/google/firebase/auth/h0;Ljava/lang/String;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/firebase/auth/i0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, La1/f;->a:La1/m1;

    invoke-virtual {v0}, La1/m1;->O0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lo0/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo0/h<",
            "Lcom/google/firebase/auth/k0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, La1/f;->a:La1/m1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/firebase/auth/z;->k0(Z)Lo0/h;

    move-result-object v0

    new-instance v1, La1/e;

    invoke-direct {v1, p0}, La1/e;-><init>(La1/f;)V

    invoke-virtual {v0, v1}, Lo0/h;->k(Lo0/a;)Lo0/h;

    move-result-object v0

    return-object v0
.end method

.method public final d(Ljava/lang/String;)Lo0/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, La1/f;->a:La1/m1;

    invoke-virtual {v0}, Lcom/google/firebase/auth/z;->C0()Lx0/e;

    move-result-object v1

    invoke-static {v1}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Lx0/e;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Lcom/google/firebase/auth/FirebaseAuth;->c0(Lcom/google/firebase/auth/z;Ljava/lang/String;)Lo0/h;

    move-result-object p1

    return-object p1
.end method
