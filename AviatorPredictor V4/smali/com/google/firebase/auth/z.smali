.class public abstract Lcom/google/firebase/auth/z;
.super Lx/a;
.source ""

# interfaces
.implements Lcom/google/firebase/auth/x0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lx/a;-><init>()V

    return-void
.end method


# virtual methods
.method public A0(Ljava/lang/String;)Lo0/h;
    .locals 1
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

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/firebase/auth/z;->B0(Ljava/lang/String;Lcom/google/firebase/auth/e;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public B0(Ljava/lang/String;Lcom/google/firebase/auth/e;)Lo0/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/firebase/auth/e;",
            ")",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/firebase/auth/z;->C0()Lx0/e;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Lx0/e;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Lcom/google/firebase/auth/FirebaseAuth;->W(Lcom/google/firebase/auth/z;Z)Lo0/h;

    move-result-object v0

    new-instance v1, Lcom/google/firebase/auth/g2;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/firebase/auth/g2;-><init>(Lcom/google/firebase/auth/z;Ljava/lang/String;Lcom/google/firebase/auth/e;)V

    invoke-virtual {v0, v1}, Lo0/h;->k(Lo0/a;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public abstract C0()Lx0/e;
.end method

.method public abstract D0()Lcom/google/firebase/auth/z;
.end method

.method public abstract E0(Ljava/util/List;)Lcom/google/firebase/auth/z;
.end method

.method public abstract F0()Lcom/google/android/gms/internal/firebase-auth-api/bp;
.end method

.method public abstract G0()Ljava/lang/String;
.end method

.method public abstract H0()Ljava/lang/String;
.end method

.method public abstract I0()Ljava/util/List;
.end method

.method public abstract J0(Lcom/google/android/gms/internal/firebase-auth-api/bp;)V
.end method

.method public abstract K0(Ljava/util/List;)V
.end method

.method public abstract R()Ljava/lang/String;
.end method

.method public abstract X()Ljava/lang/String;
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public j0()Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/firebase/auth/z;->C0()Lx0/e;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Lx0/e;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/firebase/auth/FirebaseAuth;->U(Lcom/google/firebase/auth/z;)Lo0/h;

    move-result-object v0

    return-object v0
.end method

.method public k0(Z)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lo0/h<",
            "Lcom/google/firebase/auth/b0;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/firebase/auth/z;->C0()Lx0/e;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Lx0/e;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/google/firebase/auth/FirebaseAuth;->W(Lcom/google/firebase/auth/z;Z)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public abstract l()Landroid/net/Uri;
.end method

.method public abstract l0()Lcom/google/firebase/auth/a0;
.end method

.method public abstract m0()Lcom/google/firebase/auth/g0;
.end method

.method public abstract n()Ljava/lang/String;
.end method

.method public abstract n0()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/google/firebase/auth/x0;",
            ">;"
        }
    .end annotation
.end method

.method public abstract o0()Ljava/lang/String;
.end method

.method public abstract p0()Z
.end method

.method public q0(Lcom/google/firebase/auth/h;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/h;",
            ")",
            "Lo0/h<",
            "Lcom/google/firebase/auth/i;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/firebase/auth/z;->C0()Lx0/e;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Lx0/e;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/google/firebase/auth/FirebaseAuth;->X(Lcom/google/firebase/auth/z;Lcom/google/firebase/auth/h;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public r0(Lcom/google/firebase/auth/h;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/h;",
            ")",
            "Lo0/h<",
            "Lcom/google/firebase/auth/i;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/firebase/auth/z;->C0()Lx0/e;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Lx0/e;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/google/firebase/auth/FirebaseAuth;->Y(Lcom/google/firebase/auth/z;Lcom/google/firebase/auth/h;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public s0()Lo0/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/firebase/auth/z;->C0()Lx0/e;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Lx0/e;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    new-instance v1, Lcom/google/firebase/auth/c2;

    invoke-direct {v1, v0}, Lcom/google/firebase/auth/c2;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {v0, p0, v1}, Lcom/google/firebase/auth/FirebaseAuth;->Z(Lcom/google/firebase/auth/z;La1/o0;)Lo0/h;

    move-result-object v0

    return-object v0
.end method

.method public t0()Lo0/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/firebase/auth/z;->C0()Lx0/e;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Lx0/e;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Lcom/google/firebase/auth/FirebaseAuth;->W(Lcom/google/firebase/auth/z;Z)Lo0/h;

    move-result-object v0

    new-instance v1, Lcom/google/firebase/auth/e2;

    invoke-direct {v1, p0}, Lcom/google/firebase/auth/e2;-><init>(Lcom/google/firebase/auth/z;)V

    invoke-virtual {v0, v1}, Lo0/h;->k(Lo0/a;)Lo0/h;

    move-result-object v0

    return-object v0
.end method

.method public u0(Lcom/google/firebase/auth/e;)Lo0/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/e;",
            ")",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/firebase/auth/z;->C0()Lx0/e;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Lx0/e;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Lcom/google/firebase/auth/FirebaseAuth;->W(Lcom/google/firebase/auth/z;Z)Lo0/h;

    move-result-object v0

    new-instance v1, Lcom/google/firebase/auth/f2;

    invoke-direct {v1, p0, p1}, Lcom/google/firebase/auth/f2;-><init>(Lcom/google/firebase/auth/z;Lcom/google/firebase/auth/e;)V

    invoke-virtual {v0, v1}, Lo0/h;->k(Lo0/a;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public v0(Ljava/lang/String;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo0/h<",
            "Lcom/google/firebase/auth/i;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/firebase/auth/z;->C0()Lx0/e;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Lx0/e;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/google/firebase/auth/FirebaseAuth;->d0(Lcom/google/firebase/auth/z;Ljava/lang/String;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public w0(Ljava/lang/String;)Lo0/h;
    .locals 1
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

    invoke-virtual {p0}, Lcom/google/firebase/auth/z;->C0()Lx0/e;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Lx0/e;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/google/firebase/auth/FirebaseAuth;->e0(Lcom/google/firebase/auth/z;Ljava/lang/String;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public x0(Ljava/lang/String;)Lo0/h;
    .locals 1
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

    invoke-virtual {p0}, Lcom/google/firebase/auth/z;->C0()Lx0/e;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Lx0/e;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/google/firebase/auth/FirebaseAuth;->f0(Lcom/google/firebase/auth/z;Ljava/lang/String;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public y0(Lcom/google/firebase/auth/n0;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/n0;",
            ")",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/firebase/auth/z;->C0()Lx0/e;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Lx0/e;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/google/firebase/auth/FirebaseAuth;->g0(Lcom/google/firebase/auth/z;Lcom/google/firebase/auth/n0;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public z0(Lcom/google/firebase/auth/y0;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/auth/y0;",
            ")",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/firebase/auth/z;->C0()Lx0/e;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Lx0/e;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/google/firebase/auth/FirebaseAuth;->h0(Lcom/google/firebase/auth/z;Lcom/google/firebase/auth/y0;)Lo0/h;

    move-result-object p1

    return-object p1
.end method
