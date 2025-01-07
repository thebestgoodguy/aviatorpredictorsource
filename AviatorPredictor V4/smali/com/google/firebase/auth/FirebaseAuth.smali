.class public abstract Lcom/google/firebase/auth/FirebaseAuth;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La1/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/auth/FirebaseAuth$b;,
        Lcom/google/firebase/auth/FirebaseAuth$a;
    }
.end annotation


# instance fields
.field private a:Lx0/e;

.field private final b:Ljava/util/List;

.field private final c:Ljava/util/List;

.field private d:Ljava/util/List;

.field private e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

.field private f:Lcom/google/firebase/auth/z;

.field private g:La1/l1;

.field private final h:Ljava/lang/Object;

.field private i:Ljava/lang/String;

.field private final j:Ljava/lang/Object;

.field private k:Ljava/lang/String;

.field private final l:La1/k0;

.field private final m:La1/q0;

.field private final n:La1/u0;

.field private final o:Lr1/b;

.field private p:La1/m0;

.field private q:La1/n0;


# direct methods
.method public constructor <init>(Lx0/e;Lr1/b;)V
    .locals 5

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/yl;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/yl;-><init>(Lx0/e;)V

    new-instance v1, La1/k0;

    invoke-virtual {p1}, Lx0/e;->m()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p1}, Lx0/e;->s()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, La1/k0;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {}, La1/q0;->b()La1/q0;

    move-result-object v2

    invoke-static {}, La1/u0;->b()La1/u0;

    move-result-object v3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v4, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v4, p0, Lcom/google/firebase/auth/FirebaseAuth;->b:Ljava/util/List;

    new-instance v4, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v4, p0, Lcom/google/firebase/auth/FirebaseAuth;->c:Ljava/util/List;

    new-instance v4, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v4, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Ljava/util/List;

    new-instance v4, Ljava/lang/Object;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iput-object v4, p0, Lcom/google/firebase/auth/FirebaseAuth;->h:Ljava/lang/Object;

    new-instance v4, Ljava/lang/Object;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iput-object v4, p0, Lcom/google/firebase/auth/FirebaseAuth;->j:Ljava/lang/Object;

    invoke-static {}, La1/n0;->a()La1/n0;

    move-result-object v4

    iput-object v4, p0, Lcom/google/firebase/auth/FirebaseAuth;->q:La1/n0;

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx0/e;

    iput-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    invoke-static {v0}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iput-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    invoke-static {v1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La1/k0;

    iput-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->l:La1/k0;

    new-instance v0, La1/l1;

    invoke-direct {v0}, La1/l1;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->g:La1/l1;

    invoke-static {v2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La1/q0;

    iput-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->m:La1/q0;

    invoke-static {v3}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La1/u0;

    iput-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->n:La1/u0;

    iput-object p2, p0, Lcom/google/firebase/auth/FirebaseAuth;->o:Lr1/b;

    invoke-virtual {p1}, La1/k0;->a()Lcom/google/firebase/auth/z;

    move-result-object p2

    iput-object p2, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lcom/google/firebase/auth/z;

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, La1/k0;->b(Lcom/google/firebase/auth/z;)Lcom/google/android/gms/internal/firebase-auth-api/bp;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lcom/google/firebase/auth/z;

    const/4 v1, 0x0

    invoke-static {p0, p2, p1, v1, v1}, Lcom/google/firebase/auth/FirebaseAuth;->O(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/z;Lcom/google/android/gms/internal/firebase-auth-api/bp;ZZ)V

    :cond_0
    invoke-virtual {v0, p0}, La1/q0;->d(Lcom/google/firebase/auth/FirebaseAuth;)V

    return-void
.end method

.method static bridge synthetic H(Lcom/google/firebase/auth/FirebaseAuth;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Ljava/util/List;

    return-object p0
.end method

.method static bridge synthetic I(Lcom/google/firebase/auth/FirebaseAuth;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/auth/FirebaseAuth;->b:Ljava/util/List;

    return-object p0
.end method

.method static bridge synthetic J(Lcom/google/firebase/auth/FirebaseAuth;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/auth/FirebaseAuth;->c:Ljava/util/List;

    return-object p0
.end method

.method public static M(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/z;)V
    .locals 3

    const-string v0, "FirebaseAuth"

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/google/firebase/auth/z;->e()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Notifying auth state listeners about user ( "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " )."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, "Notifying auth state listeners about a sign-out event."

    :goto_0
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->q:La1/n0;

    new-instance v0, Lcom/google/firebase/auth/v1;

    invoke-direct {v0, p0}, Lcom/google/firebase/auth/v1;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {p1, v0}, La1/n0;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static N(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/z;)V
    .locals 4

    const-string v0, "FirebaseAuth"

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/google/firebase/auth/z;->e()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Notifying id token listeners about user ( "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " )."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, "Notifying id token listeners about a sign-out event."

    :goto_0
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/google/firebase/auth/z;->G0()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    new-instance v0, Ls1/b;

    invoke-direct {v0, p1}, Ls1/b;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->q:La1/n0;

    new-instance v1, Lcom/google/firebase/auth/u1;

    invoke-direct {v1, p0, v0}, Lcom/google/firebase/auth/u1;-><init>(Lcom/google/firebase/auth/FirebaseAuth;Ls1/b;)V

    invoke-virtual {p1, v1}, La1/n0;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method static O(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/z;Lcom/google/android/gms/internal/firebase-auth-api/bp;ZZ)V
    .locals 4

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lcom/google/firebase/auth/z;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/firebase/auth/z;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lcom/google/firebase/auth/z;

    invoke-virtual {v3}, Lcom/google/firebase/auth/z;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    if-nez p4, :cond_1

    goto :goto_1

    :cond_1
    return-void

    :cond_2
    :goto_1
    iget-object p4, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lcom/google/firebase/auth/z;

    if-nez p4, :cond_3

    const/4 p4, 0x1

    goto :goto_3

    :cond_3
    invoke-virtual {p4}, Lcom/google/firebase/auth/z;->F0()Lcom/google/android/gms/internal/firebase-auth-api/bp;

    move-result-object p4

    invoke-virtual {p4}, Lcom/google/android/gms/internal/firebase-auth-api/bp;->m0()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/bp;->m0()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    xor-int/2addr p4, v2

    if-eqz v0, :cond_4

    if-nez p4, :cond_4

    goto :goto_2

    :cond_4
    const/4 v1, 0x1

    :goto_2
    xor-int/2addr v2, v0

    move p4, v2

    move v2, v1

    :goto_3
    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lcom/google/firebase/auth/z;

    if-nez v0, :cond_5

    iput-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lcom/google/firebase/auth/z;

    goto :goto_4

    :cond_5
    invoke-virtual {p1}, Lcom/google/firebase/auth/z;->n0()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/auth/z;->E0(Ljava/util/List;)Lcom/google/firebase/auth/z;

    invoke-virtual {p1}, Lcom/google/firebase/auth/z;->p0()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lcom/google/firebase/auth/z;

    invoke-virtual {v0}, Lcom/google/firebase/auth/z;->D0()Lcom/google/firebase/auth/z;

    :cond_6
    invoke-virtual {p1}, Lcom/google/firebase/auth/z;->m0()Lcom/google/firebase/auth/g0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/auth/g0;->b()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lcom/google/firebase/auth/z;

    invoke-virtual {v1, v0}, Lcom/google/firebase/auth/z;->K0(Ljava/util/List;)V

    :goto_4
    if-eqz p3, :cond_7

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->l:La1/k0;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lcom/google/firebase/auth/z;

    invoke-virtual {v0, v1}, La1/k0;->d(Lcom/google/firebase/auth/z;)V

    :cond_7
    if-eqz v2, :cond_9

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lcom/google/firebase/auth/z;

    if-eqz v0, :cond_8

    invoke-virtual {v0, p2}, Lcom/google/firebase/auth/z;->J0(Lcom/google/android/gms/internal/firebase-auth-api/bp;)V

    :cond_8
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lcom/google/firebase/auth/z;

    invoke-static {p0, v0}, Lcom/google/firebase/auth/FirebaseAuth;->N(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/z;)V

    :cond_9
    if-eqz p4, :cond_a

    iget-object p4, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lcom/google/firebase/auth/z;

    invoke-static {p0, p4}, Lcom/google/firebase/auth/FirebaseAuth;->M(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/z;)V

    :cond_a
    if-eqz p3, :cond_b

    iget-object p3, p0, Lcom/google/firebase/auth/FirebaseAuth;->l:La1/k0;

    invoke-virtual {p3, p1, p2}, La1/k0;->e(Lcom/google/firebase/auth/z;Lcom/google/android/gms/internal/firebase-auth-api/bp;)V

    :cond_b
    iget-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lcom/google/firebase/auth/z;

    if-eqz p1, :cond_c

    invoke-static {p0}, Lcom/google/firebase/auth/FirebaseAuth;->o0(Lcom/google/firebase/auth/FirebaseAuth;)La1/m0;

    move-result-object p0

    invoke-virtual {p1}, Lcom/google/firebase/auth/z;->F0()Lcom/google/android/gms/internal/firebase-auth-api/bp;

    move-result-object p1

    invoke-virtual {p0, p1}, La1/m0;->e(Lcom/google/android/gms/internal/firebase-auth-api/bp;)V

    :cond_c
    return-void
.end method

.method private final S(Ljava/lang/String;Lcom/google/firebase/auth/p0$b;)Lcom/google/firebase/auth/p0$b;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->g:La1/l1;

    invoke-virtual {v0}, La1/l1;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->g:La1/l1;

    invoke-virtual {v0}, La1/l1;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lcom/google/firebase/auth/z1;

    invoke-direct {p1, p0, p2}, Lcom/google/firebase/auth/z1;-><init>(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/p0$b;)V

    return-object p1

    :cond_0
    return-object p2
.end method

.method private final T(Ljava/lang/String;)Z
    .locals 1

    invoke-static {p1}, Lcom/google/firebase/auth/f;->c(Ljava/lang/String;)Lcom/google/firebase/auth/f;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/firebase/auth/f;->d()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static getInstance()Lcom/google/firebase/auth/FirebaseAuth;
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    invoke-static {}, Lx0/e;->o()Lx0/e;

    move-result-object v0

    const-class v1, Lcom/google/firebase/auth/FirebaseAuth;

    invoke-virtual {v0, v1}, Lx0/e;->k(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/FirebaseAuth;

    return-object v0
.end method

.method public static getInstance(Lx0/e;)Lcom/google/firebase/auth/FirebaseAuth;
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-class v0, Lcom/google/firebase/auth/FirebaseAuth;

    invoke-virtual {p0, v0}, Lx0/e;->k(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/auth/FirebaseAuth;

    return-object p0
.end method

.method static bridge synthetic j0(Lcom/google/firebase/auth/FirebaseAuth;)Lcom/google/firebase/auth/z;
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lcom/google/firebase/auth/z;

    return-object p0
.end method

.method static bridge synthetic k0(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Lcom/google/firebase/auth/p0$b;)Lcom/google/firebase/auth/p0$b;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/auth/FirebaseAuth;->S(Ljava/lang/String;Lcom/google/firebase/auth/p0$b;)Lcom/google/firebase/auth/p0$b;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic l0(Lcom/google/firebase/auth/FirebaseAuth;)Lcom/google/android/gms/internal/firebase-auth-api/yl;
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    return-object p0
.end method

.method static bridge synthetic m0(Lcom/google/firebase/auth/FirebaseAuth;)La1/l1;
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/auth/FirebaseAuth;->g:La1/l1;

    return-object p0
.end method

.method public static o0(Lcom/google/firebase/auth/FirebaseAuth;)La1/m0;
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->p:La1/m0;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    invoke-static {v0}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx0/e;

    new-instance v1, La1/m0;

    invoke-direct {v1, v0}, La1/m0;-><init>(Lx0/e;)V

    iput-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->p:La1/m0;

    :cond_0
    iget-object p0, p0, Lcom/google/firebase/auth/FirebaseAuth;->p:La1/m0;

    return-object p0
.end method

.method static bridge synthetic q0(Lcom/google/firebase/auth/FirebaseAuth;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/auth/FirebaseAuth;->i:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public A(Ljava/lang/String;Ljava/lang/String;)Lo0/h;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo0/h<",
            "Lcom/google/firebase/auth/i;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    iget-object v4, p0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    new-instance v5, Lcom/google/firebase/auth/b2;

    invoke-direct {v5, p0}, Lcom/google/firebase/auth/b2;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    move-object v2, p1

    move-object v3, p2

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->b(Lx0/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La1/v0;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public B(Ljava/lang/String;Ljava/lang/String;)Lo0/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo0/h<",
            "Lcom/google/firebase/auth/i;",
            ">;"
        }
    .end annotation

    invoke-static {p1, p2}, Lcom/google/firebase/auth/k;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/auth/h;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/firebase/auth/FirebaseAuth;->y(Lcom/google/firebase/auth/h;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public C()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/auth/FirebaseAuth;->K()V

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->p:La1/m0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, La1/m0;->c()V

    :cond_0
    return-void
.end method

.method public D(Landroid/app/Activity;Lcom/google/firebase/auth/n;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/google/firebase/auth/n;",
            ")",
            "Lo0/h<",
            "Lcom/google/firebase/auth/i;",
            ">;"
        }
    .end annotation

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lo0/i;

    invoke-direct {v0}, Lo0/i;-><init>()V

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->m:La1/q0;

    invoke-virtual {v1, p1, v0, p0}, La1/q0;->g(Landroid/app/Activity;Lo0/i;Lcom/google/firebase/auth/FirebaseAuth;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance p1, Lcom/google/android/gms/common/api/Status;

    const/16 p2, 0x42a1

    invoke-direct {p1, p2}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/cm;->a(Lcom/google/android/gms/common/api/Status;)Lx0/k;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->c(Ljava/lang/Exception;)Lo0/h;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->m:La1/q0;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2, p0}, La1/q0;->f(Landroid/content/Context;Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {p2, p1}, Lcom/google/firebase/auth/n;->a(Landroid/app/Activity;)V

    invoke-virtual {v0}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public E()V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->h:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/sm;->a()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->i:Ljava/lang/String;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public F(Ljava/lang/String;I)V
    .locals 2

    invoke-static {p1}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    const/4 v0, 0x0

    if-ltz p2, :cond_0

    const v1, 0xffff

    if-gt p2, v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    const-string v1, "Port number must be in the range 0-65535"

    invoke-static {v0, v1}, Lw/r;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/bo;->f(Lx0/e;Ljava/lang/String;I)V

    return-void
.end method

.method public G(Ljava/lang/String;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo0/h<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    iget-object v2, p0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->n(Lx0/e;Ljava/lang/String;Ljava/lang/String;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final K()V
    .locals 5

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->l:La1/k0;

    invoke-static {v0}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lcom/google/firebase/auth/z;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/google/firebase/auth/FirebaseAuth;->l:La1/k0;

    invoke-static {v0}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Lcom/google/firebase/auth/z;->e()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    const-string v0, "com.google.firebase.auth.GET_TOKEN_RESPONSE.%s"

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, La1/k0;->c(Ljava/lang/String;)V

    iput-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lcom/google/firebase/auth/z;

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->l:La1/k0;

    const-string v2, "com.google.firebase.auth.FIREBASE_USER"

    invoke-virtual {v0, v2}, La1/k0;->c(Ljava/lang/String;)V

    invoke-static {p0, v1}, Lcom/google/firebase/auth/FirebaseAuth;->N(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/z;)V

    invoke-static {p0, v1}, Lcom/google/firebase/auth/FirebaseAuth;->M(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/z;)V

    return-void
.end method

.method public final L(Lcom/google/firebase/auth/z;Lcom/google/android/gms/internal/firebase-auth-api/bp;Z)V
    .locals 1

    const/4 p3, 0x1

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, p3, v0}, Lcom/google/firebase/auth/FirebaseAuth;->O(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/z;Lcom/google/android/gms/internal/firebase-auth-api/bp;ZZ)V

    return-void
.end method

.method public final P(Lcom/google/firebase/auth/o0;)V
    .locals 13

    invoke-virtual {p1}, Lcom/google/firebase/auth/o0;->k()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/google/firebase/auth/o0;->b()Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/firebase/auth/o0;->c()Lcom/google/firebase/auth/k0;

    move-result-object v1

    invoke-static {v1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La1/j;

    invoke-virtual {v1}, La1/j;->n0()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/google/firebase/auth/o0;->h()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/firebase/auth/o0;->f()Lcom/google/firebase/auth/s0;

    move-result-object v1

    invoke-static {v1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/firebase/auth/s0;

    invoke-virtual {v1}, Lcom/google/firebase/auth/s0;->e()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-static {v1}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/firebase/auth/o0;->d()Lcom/google/firebase/auth/p0$a;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {p1}, Lcom/google/firebase/auth/o0;->e()Lcom/google/firebase/auth/p0$b;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/firebase/auth/o0;->a()Landroid/app/Activity;

    move-result-object v3

    invoke-static {v3}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/Activity;

    invoke-virtual {p1}, Lcom/google/firebase/auth/o0;->i()Ljava/util/concurrent/Executor;

    move-result-object v4

    invoke-static {v1, v2, v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/rn;->d(Ljava/lang/String;Lcom/google/firebase/auth/p0$b;Landroid/app/Activity;Ljava/util/concurrent/Executor;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_2

    :cond_1
    iget-object v1, v0, Lcom/google/firebase/auth/FirebaseAuth;->n:La1/u0;

    invoke-virtual {p1}, Lcom/google/firebase/auth/o0;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/firebase/auth/o0;->a()Landroid/app/Activity;

    move-result-object v3

    invoke-static {v3}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/Activity;

    invoke-virtual {v0}, Lcom/google/firebase/auth/FirebaseAuth;->R()Z

    move-result v4

    invoke-virtual {v1, v0, v2, v3, v4}, La1/u0;->a(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Landroid/app/Activity;Z)Lo0/h;

    move-result-object v1

    new-instance v2, Lcom/google/firebase/auth/y1;

    invoke-direct {v2, v0, p1}, Lcom/google/firebase/auth/y1;-><init>(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/o0;)V

    invoke-virtual {v1, v2}, Lo0/h;->c(Lo0/d;)Lo0/h;

    return-void

    :cond_2
    invoke-virtual {p1}, Lcom/google/firebase/auth/o0;->b()Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v4

    invoke-virtual {p1}, Lcom/google/firebase/auth/o0;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/google/firebase/auth/o0;->g()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    sget-object v8, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1}, Lcom/google/firebase/auth/o0;->e()Lcom/google/firebase/auth/p0$b;

    move-result-object v9

    invoke-virtual {p1}, Lcom/google/firebase/auth/o0;->a()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/app/Activity;

    invoke-virtual {p1}, Lcom/google/firebase/auth/o0;->i()Ljava/util/concurrent/Executor;

    move-result-object v11

    invoke-virtual {p1}, Lcom/google/firebase/auth/o0;->d()Lcom/google/firebase/auth/p0$a;

    move-result-object p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    const/4 v12, 0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    const/4 v12, 0x0

    :goto_1
    if-nez v12, :cond_5

    invoke-static {v5, v9, v10, v11}, Lcom/google/android/gms/internal/firebase-auth-api/rn;->d(Ljava/lang/String;Lcom/google/firebase/auth/p0$b;Landroid/app/Activity;Ljava/util/concurrent/Executor;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_3

    :cond_4
    :goto_2
    return-void

    :cond_5
    :goto_3
    iget-object p1, v4, Lcom/google/firebase/auth/FirebaseAuth;->n:La1/u0;

    invoke-virtual {v4}, Lcom/google/firebase/auth/FirebaseAuth;->R()Z

    move-result v0

    invoke-virtual {p1, v4, v5, v10, v0}, La1/u0;->a(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Landroid/app/Activity;Z)Lo0/h;

    move-result-object p1

    new-instance v0, Lcom/google/firebase/auth/x1;

    move-object v3, v0

    invoke-direct/range {v3 .. v12}, Lcom/google/firebase/auth/x1;-><init>(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;JLjava/util/concurrent/TimeUnit;Lcom/google/firebase/auth/p0$b;Landroid/app/Activity;Ljava/util/concurrent/Executor;Z)V

    invoke-virtual {p1, v0}, Lo0/h;->c(Lo0/d;)Lo0/h;

    return-void
.end method

.method public final Q(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;Lcom/google/firebase/auth/p0$b;Landroid/app/Activity;Ljava/util/concurrent/Executor;ZLjava/lang/String;Ljava/lang/String;)V
    .locals 12

    move-object v0, p0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    move-wide v2, p2

    move-object/from16 v4, p4

    invoke-virtual {v1, p2, p3, v4}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v4

    const-wide/16 v1, 0x0

    cmp-long v3, v4, v1

    if-ltz v3, :cond_0

    const-wide/16 v1, 0x78

    cmp-long v3, v4, v1

    if-gtz v3, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/pp;

    iget-object v7, v0, Lcom/google/firebase/auth/FirebaseAuth;->i:Ljava/lang/String;

    iget-object v8, v0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/firebase/auth/FirebaseAuth;->R()Z

    move-result v10

    move-object v2, v1

    move-object v3, p1

    move/from16 v6, p8

    move-object/from16 v9, p9

    move-object/from16 v11, p10

    invoke-direct/range {v2 .. v11}, Lcom/google/android/gms/internal/firebase-auth-api/pp;-><init>(Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    move-object v2, p1

    move-object/from16 v3, p5

    invoke-direct {p0, p1, v3}, Lcom/google/firebase/auth/FirebaseAuth;->S(Ljava/lang/String;Lcom/google/firebase/auth/p0$b;)Lcom/google/firebase/auth/p0$b;

    move-result-object v9

    iget-object v6, v0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iget-object v7, v0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    move-object v8, v1

    move-object/from16 v10, p6

    move-object/from16 v11, p7

    invoke-virtual/range {v6 .. v11}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->p(Lx0/e;Lcom/google/android/gms/internal/firebase-auth-api/pp;Lcom/google/firebase/auth/p0$b;Landroid/app/Activity;Ljava/util/concurrent/Executor;)V

    return-void

    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "We only support 0-120 seconds for sms-auto-retrieval timeout"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method final R()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/auth/FirebaseAuth;->l()Lx0/e;

    move-result-object v0

    invoke-virtual {v0}, Lx0/e;->m()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hm;->a(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method public final U(Lcom/google/firebase/auth/z;)Lo0/h;
    .locals 2

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    new-instance v1, Lcom/google/firebase/auth/r1;

    invoke-direct {v1, p0, p1}, Lcom/google/firebase/auth/r1;-><init>(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/z;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->u(Lcom/google/firebase/auth/z;La1/q;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final V(Lcom/google/firebase/auth/z;Lcom/google/firebase/auth/h0;Ljava/lang/String;)Lo0/h;
    .locals 7

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v0, p2, Lcom/google/firebase/auth/q0;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iget-object v2, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    move-object v3, p2

    check-cast v3, Lcom/google/firebase/auth/q0;

    new-instance v6, Lcom/google/firebase/auth/b2;

    invoke-direct {v6, p0}, Lcom/google/firebase/auth/b2;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    move-object v4, p1

    move-object v5, p3

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->w(Lx0/e;Lcom/google/firebase/auth/q0;Lcom/google/firebase/auth/z;Ljava/lang/String;La1/v0;)Lo0/h;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    const/16 p2, 0x445b

    invoke-direct {p1, p2}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/cm;->a(Lcom/google/android/gms/common/api/Status;)Lx0/k;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->c(Ljava/lang/Exception;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final W(Lcom/google/firebase/auth/z;Z)Lo0/h;
    .locals 3

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/common/api/Status;

    const/16 p2, 0x4457

    invoke-direct {p1, p2}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/cm;->a(Lcom/google/android/gms/common/api/Status;)Lx0/k;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->c(Ljava/lang/Exception;)Lo0/h;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/google/firebase/auth/z;->F0()Lcom/google/android/gms/internal/firebase-auth-api/bp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/bp;->r0()Z

    move-result v1

    if-eqz v1, :cond_1

    if-nez p2, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/bp;->m0()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, La1/b0;->a(Ljava/lang/String;)Lcom/google/firebase/auth/b0;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->d(Ljava/lang/Object;)Lo0/h;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object p2, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/bp;->n0()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lcom/google/firebase/auth/w1;

    invoke-direct {v2, p0}, Lcom/google/firebase/auth/w1;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {p2, v1, p1, v0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->y(Lx0/e;Lcom/google/firebase/auth/z;Ljava/lang/String;La1/o0;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final X(Lcom/google/firebase/auth/z;Lcom/google/firebase/auth/h;)Lo0/h;
    .locals 3

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    invoke-virtual {p2}, Lcom/google/firebase/auth/h;->l0()Lcom/google/firebase/auth/h;

    move-result-object p2

    new-instance v2, Lcom/google/firebase/auth/c2;

    invoke-direct {v2, p0}, Lcom/google/firebase/auth/c2;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->z(Lx0/e;Lcom/google/firebase/auth/z;Lcom/google/firebase/auth/h;La1/o0;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final Y(Lcom/google/firebase/auth/z;Lcom/google/firebase/auth/h;)Lo0/h;
    .locals 11

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/google/firebase/auth/h;->l0()Lcom/google/firebase/auth/h;

    move-result-object v3

    instance-of p2, v3, Lcom/google/firebase/auth/j;

    if-eqz p2, :cond_2

    check-cast v3, Lcom/google/firebase/auth/j;

    invoke-virtual {v3}, Lcom/google/firebase/auth/j;->k0()Ljava/lang/String;

    move-result-object p2

    const-string v0, "password"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object v4, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iget-object v5, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    invoke-virtual {v3}, Lcom/google/firebase/auth/j;->o0()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3}, Lcom/google/firebase/auth/j;->p0()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1}, Lcom/google/firebase/auth/z;->o0()Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lcom/google/firebase/auth/c2;

    invoke-direct {v10, p0}, Lcom/google/firebase/auth/c2;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    move-object v6, p1

    invoke-virtual/range {v4 .. v10}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->C(Lx0/e;Lcom/google/firebase/auth/z;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La1/o0;)Lo0/h;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {v3}, Lcom/google/firebase/auth/j;->q0()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/google/firebase/auth/FirebaseAuth;->T(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    new-instance p1, Lcom/google/android/gms/common/api/Status;

    const/16 p2, 0x42b0

    invoke-direct {p1, p2}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/cm;->a(Lcom/google/android/gms/common/api/Status;)Lx0/k;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->c(Ljava/lang/Exception;)Lo0/h;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object p2, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    new-instance v1, Lcom/google/firebase/auth/c2;

    invoke-direct {v1, p0}, Lcom/google/firebase/auth/c2;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {p2, v0, p1, v3, v1}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->B(Lx0/e;Lcom/google/firebase/auth/z;Lcom/google/firebase/auth/j;La1/o0;)Lo0/h;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of p2, v3, Lcom/google/firebase/auth/n0;

    if-eqz p2, :cond_3

    iget-object v4, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iget-object v5, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    move-object v7, v3

    check-cast v7, Lcom/google/firebase/auth/n0;

    iget-object v8, p0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    new-instance v9, Lcom/google/firebase/auth/c2;

    invoke-direct {v9, p0}, Lcom/google/firebase/auth/c2;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    move-object v6, p1

    invoke-virtual/range {v4 .. v9}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->D(Lx0/e;Lcom/google/firebase/auth/z;Lcom/google/firebase/auth/n0;Ljava/lang/String;La1/o0;)Lo0/h;

    move-result-object p1

    return-object p1

    :cond_3
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    invoke-virtual {p1}, Lcom/google/firebase/auth/z;->o0()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/google/firebase/auth/c2;

    invoke-direct {v5, p0}, Lcom/google/firebase/auth/c2;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    move-object v2, p1

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->A(Lx0/e;Lcom/google/firebase/auth/z;Lcom/google/firebase/auth/h;Ljava/lang/String;La1/o0;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final Z(Lcom/google/firebase/auth/z;La1/o0;)Lo0/h;
    .locals 2

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    invoke-virtual {v0, v1, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->E(Lx0/e;Lcom/google/firebase/auth/z;La1/o0;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/google/firebase/auth/FirebaseAuth$a;)V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->q:La1/n0;

    new-instance v1, Lcom/google/firebase/auth/t1;

    invoke-direct {v1, p0, p1}, Lcom/google/firebase/auth/t1;-><init>(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/FirebaseAuth$a;)V

    invoke-virtual {v0, v1}, La1/n0;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a0(Lcom/google/firebase/auth/h0;La1/j;Lcom/google/firebase/auth/z;)Lo0/h;
    .locals 6

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    move-object v3, p1

    check-cast v3, Lcom/google/firebase/auth/q0;

    invoke-virtual {p2}, La1/j;->m0()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/google/firebase/auth/b2;

    invoke-direct {v5, p0}, Lcom/google/firebase/auth/b2;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    move-object v2, p3

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->x(Lx0/e;Lcom/google/firebase/auth/z;Lcom/google/firebase/auth/q0;Ljava/lang/String;La1/v0;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/google/firebase/auth/FirebaseAuth$b;)V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->q:La1/n0;

    invoke-static {v0}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La1/n0;

    new-instance v1, Lcom/google/firebase/auth/s1;

    invoke-direct {v1, p0, p1}, Lcom/google/firebase/auth/s1;-><init>(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/FirebaseAuth$b;)V

    invoke-virtual {v0, v1}, La1/n0;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final b0(Lcom/google/firebase/auth/e;Ljava/lang/String;)Lo0/h;
    .locals 2

    invoke-static {p2}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->i:Ljava/lang/String;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    invoke-static {}, Lcom/google/firebase/auth/e;->r0()Lcom/google/firebase/auth/e;

    move-result-object p1

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->i:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/google/firebase/auth/e;->v0(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    invoke-virtual {v0, v1, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->F(Lx0/e;Lcom/google/firebase/auth/e;Ljava/lang/String;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/String;)Lo0/h;
    .locals 3
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

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    iget-object v2, p0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->q(Lx0/e;Ljava/lang/String;Ljava/lang/String;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final c0(Lcom/google/firebase/auth/z;Ljava/lang/String;)Lo0/h;
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    new-instance v2, Lcom/google/firebase/auth/c2;

    invoke-direct {v2, p0}, Lcom/google/firebase/auth/c2;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->g(Lx0/e;Lcom/google/firebase/auth/z;Ljava/lang/String;La1/o0;)Lo0/h;

    move-result-object p1

    new-instance p2, Lcom/google/firebase/auth/a2;

    invoke-direct {p2, p0}, Lcom/google/firebase/auth/a2;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {p1, p2}, Lo0/h;->k(Lo0/a;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/lang/String;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo0/h<",
            "Lcom/google/firebase/auth/d;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    iget-object v2, p0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->r(Lx0/e;Ljava/lang/String;Ljava/lang/String;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final d0(Lcom/google/firebase/auth/z;Ljava/lang/String;)Lo0/h;
    .locals 3

    invoke-static {p2}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    new-instance v2, Lcom/google/firebase/auth/c2;

    invoke-direct {v2, p0}, Lcom/google/firebase/auth/c2;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->h(Lx0/e;Lcom/google/firebase/auth/z;Ljava/lang/String;La1/o0;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lcom/google/firebase/auth/z;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/google/firebase/auth/z;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final e0(Lcom/google/firebase/auth/z;Ljava/lang/String;)Lo0/h;
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    new-instance v2, Lcom/google/firebase/auth/c2;

    invoke-direct {v2, p0}, Lcom/google/firebase/auth/c2;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->i(Lx0/e;Lcom/google/firebase/auth/z;Ljava/lang/String;La1/o0;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public f(La1/a;)V
    .locals 1

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/google/firebase/auth/FirebaseAuth;->n0()La1/m0;

    move-result-object p1

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, La1/m0;->d(I)V

    return-void
.end method

.method public final f0(Lcom/google/firebase/auth/z;Ljava/lang/String;)Lo0/h;
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    new-instance v2, Lcom/google/firebase/auth/c2;

    invoke-direct {v2, p0}, Lcom/google/firebase/auth/c2;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->j(Lx0/e;Lcom/google/firebase/auth/z;Ljava/lang/String;La1/o0;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final g(Z)Lo0/h;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lcom/google/firebase/auth/z;

    invoke-virtual {p0, v0, p1}, Lcom/google/firebase/auth/FirebaseAuth;->W(Lcom/google/firebase/auth/z;Z)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final g0(Lcom/google/firebase/auth/z;Lcom/google/firebase/auth/n0;)Lo0/h;
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    invoke-virtual {p2}, Lcom/google/firebase/auth/n0;->n0()Lcom/google/firebase/auth/n0;

    move-result-object p2

    new-instance v2, Lcom/google/firebase/auth/c2;

    invoke-direct {v2, p0}, Lcom/google/firebase/auth/c2;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->k(Lx0/e;Lcom/google/firebase/auth/z;Lcom/google/firebase/auth/n0;La1/o0;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public h(La1/a;)V
    .locals 1

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/google/firebase/auth/FirebaseAuth;->n0()La1/m0;

    move-result-object p1

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, La1/m0;->d(I)V

    return-void
.end method

.method public final h0(Lcom/google/firebase/auth/z;Lcom/google/firebase/auth/y0;)Lo0/h;
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    new-instance v2, Lcom/google/firebase/auth/c2;

    invoke-direct {v2, p0}, Lcom/google/firebase/auth/c2;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->l(Lx0/e;Lcom/google/firebase/auth/z;Lcom/google/firebase/auth/y0;La1/o0;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public i(Ljava/lang/String;Ljava/lang/String;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    iget-object v2, p0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->s(Lx0/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public final i0(Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/auth/e;)Lo0/h;
    .locals 1

    invoke-static {p1}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    if-nez p3, :cond_0

    invoke-static {}, Lcom/google/firebase/auth/e;->r0()Lcom/google/firebase/auth/e;

    move-result-object p3

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->i:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {p3, v0}, Lcom/google/firebase/auth/e;->v0(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->m(Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/auth/e;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/lang/String;Ljava/lang/String;)Lo0/h;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo0/h<",
            "Lcom/google/firebase/auth/i;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    iget-object v4, p0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    new-instance v5, Lcom/google/firebase/auth/b2;

    invoke-direct {v5, p0}, Lcom/google/firebase/auth/b2;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    move-object v2, p1

    move-object v3, p2

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->t(Lx0/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La1/v0;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public k(Ljava/lang/String;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo0/h<",
            "Lcom/google/firebase/auth/u0;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    iget-object v2, p0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->v(Lx0/e;Ljava/lang/String;Ljava/lang/String;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public l()Lx0/e;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    return-object v0
.end method

.method public m()Lcom/google/firebase/auth/z;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lcom/google/firebase/auth/z;

    return-object v0
.end method

.method public n()Lcom/google/firebase/auth/v;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->g:La1/l1;

    return-object v0
.end method

.method public final declared-synchronized n0()La1/m0;
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-static {p0}, Lcom/google/firebase/auth/FirebaseAuth;->o0(Lcom/google/firebase/auth/FirebaseAuth;)La1/m0;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public o()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->h:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->i:Ljava/lang/String;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public p()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->j:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final p0()Lr1/b;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->o:Lr1/b;

    return-object v0
.end method

.method public q(Lcom/google/firebase/auth/FirebaseAuth$a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public r(Lcom/google/firebase/auth/FirebaseAuth$b;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public s(Ljava/lang/String;)Lo0/h;
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

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/firebase/auth/FirebaseAuth;->t(Ljava/lang/String;Lcom/google/firebase/auth/e;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public t(Ljava/lang/String;Lcom/google/firebase/auth/e;)Lo0/h;
    .locals 3
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

    invoke-static {p1}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    if-nez p2, :cond_0

    invoke-static {}, Lcom/google/firebase/auth/e;->r0()Lcom/google/firebase/auth/e;

    move-result-object p2

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->i:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {p2, v0}, Lcom/google/firebase/auth/e;->v0(Ljava/lang/String;)V

    :cond_1
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lcom/google/firebase/auth/e;->w0(I)V

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    iget-object v2, p0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->G(Lx0/e;Ljava/lang/String;Lcom/google/firebase/auth/e;Ljava/lang/String;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public u(Ljava/lang/String;Lcom/google/firebase/auth/e;)Lo0/h;
    .locals 3
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

    invoke-static {p1}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/google/firebase/auth/e;->j0()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->i:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {p2, v0}, Lcom/google/firebase/auth/e;->v0(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    iget-object v2, p0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->H(Lx0/e;Ljava/lang/String;Lcom/google/firebase/auth/e;Ljava/lang/String;)Lo0/h;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public v(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->h:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->i:Ljava/lang/String;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public w(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->j:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public x()Lo0/h;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo0/h<",
            "Lcom/google/firebase/auth/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lcom/google/firebase/auth/z;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/firebase/auth/z;->p0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->f:Lcom/google/firebase/auth/z;

    check-cast v0, La1/m1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, La1/m1;->R0(Z)V

    new-instance v1, La1/g1;

    invoke-direct {v1, v0}, La1/g1;-><init>(La1/m1;)V

    invoke-static {v1}, Lo0/k;->d(Ljava/lang/Object;)Lo0/h;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    new-instance v2, Lcom/google/firebase/auth/b2;

    invoke-direct {v2, p0}, Lcom/google/firebase/auth/b2;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    iget-object v3, p0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->I(Lx0/e;La1/v0;Ljava/lang/String;)Lo0/h;

    move-result-object v0

    return-object v0
.end method

.method public y(Lcom/google/firebase/auth/h;)Lo0/h;
    .locals 7
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

    invoke-virtual {p1}, Lcom/google/firebase/auth/h;->l0()Lcom/google/firebase/auth/h;

    move-result-object p1

    instance-of v0, p1, Lcom/google/firebase/auth/j;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/google/firebase/auth/j;

    invoke-virtual {p1}, Lcom/google/firebase/auth/j;->r0()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iget-object v2, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    invoke-virtual {p1}, Lcom/google/firebase/auth/j;->o0()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/google/firebase/auth/j;->p0()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    new-instance v6, Lcom/google/firebase/auth/b2;

    invoke-direct {v6, p0}, Lcom/google/firebase/auth/b2;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->b(Lx0/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La1/v0;)Lo0/h;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/google/firebase/auth/j;->q0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/firebase/auth/FirebaseAuth;->T(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p1, Lcom/google/android/gms/common/api/Status;

    const/16 v0, 0x42b0

    invoke-direct {p1, v0}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/cm;->a(Lcom/google/android/gms/common/api/Status;)Lx0/k;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->c(Ljava/lang/Exception;)Lo0/h;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    new-instance v2, Lcom/google/firebase/auth/b2;

    invoke-direct {v2, p0}, Lcom/google/firebase/auth/b2;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->c(Lx0/e;Lcom/google/firebase/auth/j;La1/v0;)Lo0/h;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of v0, p1, Lcom/google/firebase/auth/n0;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/google/firebase/auth/n0;

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    iget-object v2, p0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    new-instance v3, Lcom/google/firebase/auth/b2;

    invoke-direct {v3, p0}, Lcom/google/firebase/auth/b2;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {v0, v1, p1, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->d(Lx0/e;Lcom/google/firebase/auth/n0;Ljava/lang/String;La1/v0;)Lo0/h;

    move-result-object p1

    return-object p1

    :cond_3
    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    iget-object v2, p0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    new-instance v3, Lcom/google/firebase/auth/b2;

    invoke-direct {v3, p0}, Lcom/google/firebase/auth/b2;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {v0, v1, p1, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->J(Lx0/e;Lcom/google/firebase/auth/h;Ljava/lang/String;La1/v0;)Lo0/h;

    move-result-object p1

    return-object p1
.end method

.method public z(Ljava/lang/String;)Lo0/h;
    .locals 4
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

    iget-object v0, p0, Lcom/google/firebase/auth/FirebaseAuth;->e:Lcom/google/android/gms/internal/firebase-auth-api/yl;

    iget-object v1, p0, Lcom/google/firebase/auth/FirebaseAuth;->a:Lx0/e;

    iget-object v2, p0, Lcom/google/firebase/auth/FirebaseAuth;->k:Ljava/lang/String;

    new-instance v3, Lcom/google/firebase/auth/b2;

    invoke-direct {v3, p0}, Lcom/google/firebase/auth/b2;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-virtual {v0, v1, p1, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->K(Lx0/e;Ljava/lang/String;Ljava/lang/String;La1/v0;)Lo0/h;

    move-result-object p1

    return-object p1
.end method
