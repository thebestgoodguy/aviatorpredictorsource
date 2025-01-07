.class final Lcom/google/android/gms/internal/firebase-auth-api/qm;
.super Lcom/google/android/gms/internal/firebase-auth-api/in;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/ao;


# instance fields
.field private a:Lcom/google/android/gms/internal/firebase-auth-api/km;

.field private b:Lcom/google/android/gms/internal/firebase-auth-api/lm;

.field private c:Lcom/google/android/gms/internal/firebase-auth-api/on;

.field private final d:Lcom/google/android/gms/internal/firebase-auth-api/pm;

.field private final e:Lx0/e;

.field private final f:Ljava/lang/String;

.field g:Lcom/google/android/gms/internal/firebase-auth-api/rm;


# direct methods
.method constructor <init>(Lx0/e;Lcom/google/android/gms/internal/firebase-auth-api/pm;Lcom/google/android/gms/internal/firebase-auth-api/on;Lcom/google/android/gms/internal/firebase-auth-api/km;Lcom/google/android/gms/internal/firebase-auth-api/lm;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/in;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->e:Lx0/e;

    invoke-virtual {p1}, Lx0/e;->r()Lx0/m;

    move-result-object p1

    invoke-virtual {p1}, Lx0/m;->b()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->f:Ljava/lang/String;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/pm;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->d:Lcom/google/android/gms/internal/firebase-auth-api/pm;

    const/4 p2, 0x0

    invoke-direct {p0, p2, p2, p2}, Lcom/google/android/gms/internal/firebase-auth-api/qm;->v(Lcom/google/android/gms/internal/firebase-auth-api/on;Lcom/google/android/gms/internal/firebase-auth-api/km;Lcom/google/android/gms/internal/firebase-auth-api/lm;)V

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/bo;->e(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/ao;)V

    return-void
.end method

.method private final u()Lcom/google/android/gms/internal/firebase-auth-api/rm;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->g:Lcom/google/android/gms/internal/firebase-auth-api/rm;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/rm;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->e:Lx0/e;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->d:Lcom/google/android/gms/internal/firebase-auth-api/pm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/pm;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lx0/e;->m()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v0, v3, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/rm;-><init>(Landroid/content/Context;Lx0/e;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->g:Lcom/google/android/gms/internal/firebase-auth-api/rm;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->g:Lcom/google/android/gms/internal/firebase-auth-api/rm;

    return-object v0
.end method

.method private final v(Lcom/google/android/gms/internal/firebase-auth-api/on;Lcom/google/android/gms/internal/firebase-auth-api/km;Lcom/google/android/gms/internal/firebase-auth-api/lm;)V
    .locals 1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->c:Lcom/google/android/gms/internal/firebase-auth-api/on;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->a:Lcom/google/android/gms/internal/firebase-auth-api/km;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->b:Lcom/google/android/gms/internal/firebase-auth-api/lm;

    const-string p1, "firebear.secureToken"

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/yn;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    const-string p3, "LocalClient"

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->f:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/bo;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "Found hermetic configuration for secureToken URL: "

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p3, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->c:Lcom/google/android/gms/internal/firebase-auth-api/on;

    if-nez p2, :cond_1

    new-instance p2, Lcom/google/android/gms/internal/firebase-auth-api/on;

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/qm;->u()Lcom/google/android/gms/internal/firebase-auth-api/rm;

    move-result-object v0

    invoke-direct {p2, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/on;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/rm;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->c:Lcom/google/android/gms/internal/firebase-auth-api/on;

    :cond_1
    const-string p1, "firebear.identityToolkit"

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/yn;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->f:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/bo;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_2
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "Found hermetic configuration for identityToolkit URL: "

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p3, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->a:Lcom/google/android/gms/internal/firebase-auth-api/km;

    if-nez p2, :cond_3

    new-instance p2, Lcom/google/android/gms/internal/firebase-auth-api/km;

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/qm;->u()Lcom/google/android/gms/internal/firebase-auth-api/rm;

    move-result-object v0

    invoke-direct {p2, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/km;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/rm;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->a:Lcom/google/android/gms/internal/firebase-auth-api/km;

    :cond_3
    const-string p1, "firebear.identityToolkitV2"

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/yn;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_4

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->f:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/bo;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_4
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "Found hermetic configuration for identityToolkitV2 URL: "

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p3, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_2
    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->b:Lcom/google/android/gms/internal/firebase-auth-api/lm;

    if-nez p2, :cond_5

    new-instance p2, Lcom/google/android/gms/internal/firebase-auth-api/lm;

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/qm;->u()Lcom/google/android/gms/internal/firebase-auth-api/rm;

    move-result-object p3

    invoke-direct {p2, p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/lm;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/rm;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->b:Lcom/google/android/gms/internal/firebase-auth-api/lm;

    :cond_5
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/firebase-auth-api/eo;Lcom/google/android/gms/internal/firebase-auth-api/hn;)V
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->a:Lcom/google/android/gms/internal/firebase-auth-api/km;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->f:Ljava/lang/String;

    const-string v2, "/createAuthUri"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/jm;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/fo;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/jm;->b:Lcom/google/android/gms/internal/firebase-auth-api/rm;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ln;->a(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/nm;Lcom/google/android/gms/internal/firebase-auth-api/hn;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/rm;)V

    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/firebase-auth-api/ho;Lcom/google/android/gms/internal/firebase-auth-api/hn;)V
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->a:Lcom/google/android/gms/internal/firebase-auth-api/km;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->f:Ljava/lang/String;

    const-string v2, "/deleteAccount"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/jm;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Ljava/lang/Void;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/jm;->b:Lcom/google/android/gms/internal/firebase-auth-api/rm;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ln;->a(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/nm;Lcom/google/android/gms/internal/firebase-auth-api/hn;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/rm;)V

    return-void
.end method

.method public final c(Lcom/google/android/gms/internal/firebase-auth-api/io;Lcom/google/android/gms/internal/firebase-auth-api/hn;)V
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->a:Lcom/google/android/gms/internal/firebase-auth-api/km;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->f:Ljava/lang/String;

    const-string v2, "/emailLinkSignin"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/jm;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/jo;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/jm;->b:Lcom/google/android/gms/internal/firebase-auth-api/rm;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ln;->a(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/nm;Lcom/google/android/gms/internal/firebase-auth-api/hn;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/rm;)V

    return-void
.end method

.method public final d(Lcom/google/android/gms/internal/firebase-auth-api/lo;Lcom/google/android/gms/internal/firebase-auth-api/hn;)V
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->b:Lcom/google/android/gms/internal/firebase-auth-api/lm;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->f:Ljava/lang/String;

    const-string v2, "/mfaEnrollment:finalize"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/jm;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/mo;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/jm;->b:Lcom/google/android/gms/internal/firebase-auth-api/rm;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ln;->a(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/nm;Lcom/google/android/gms/internal/firebase-auth-api/hn;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/rm;)V

    return-void
.end method

.method public final e(Lcom/google/android/gms/internal/firebase-auth-api/no;Lcom/google/android/gms/internal/firebase-auth-api/hn;)V
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->b:Lcom/google/android/gms/internal/firebase-auth-api/lm;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->f:Ljava/lang/String;

    const-string v2, "/mfaSignIn:finalize"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/jm;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/oo;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/jm;->b:Lcom/google/android/gms/internal/firebase-auth-api/rm;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ln;->a(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/nm;Lcom/google/android/gms/internal/firebase-auth-api/hn;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/rm;)V

    return-void
.end method

.method public final f(Lcom/google/android/gms/internal/firebase-auth-api/qo;Lcom/google/android/gms/internal/firebase-auth-api/hn;)V
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->c:Lcom/google/android/gms/internal/firebase-auth-api/on;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->f:Ljava/lang/String;

    const-string v2, "/token"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/jm;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/bp;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/jm;->b:Lcom/google/android/gms/internal/firebase-auth-api/rm;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ln;->a(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/nm;Lcom/google/android/gms/internal/firebase-auth-api/hn;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/rm;)V

    return-void
.end method

.method public final g(Lcom/google/android/gms/internal/firebase-auth-api/ro;Lcom/google/android/gms/internal/firebase-auth-api/hn;)V
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->a:Lcom/google/android/gms/internal/firebase-auth-api/km;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->f:Ljava/lang/String;

    const-string v2, "/getAccountInfo"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/jm;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/so;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/jm;->b:Lcom/google/android/gms/internal/firebase-auth-api/rm;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ln;->a(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/nm;Lcom/google/android/gms/internal/firebase-auth-api/hn;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/rm;)V

    return-void
.end method

.method public final h(Lcom/google/android/gms/internal/firebase-auth-api/yo;Lcom/google/android/gms/internal/firebase-auth-api/hn;)V
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/yo;->b()Lcom/google/firebase/auth/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/qm;->u()Lcom/google/android/gms/internal/firebase-auth-api/rm;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/yo;->b()Lcom/google/firebase/auth/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/auth/e;->u0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/rm;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->a:Lcom/google/android/gms/internal/firebase-auth-api/km;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->f:Ljava/lang/String;

    const-string v2, "/getOobConfirmationCode"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/jm;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zo;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/jm;->b:Lcom/google/android/gms/internal/firebase-auth-api/rm;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ln;->a(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/nm;Lcom/google/android/gms/internal/firebase-auth-api/hn;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/rm;)V

    return-void
.end method

.method public final i(Lcom/google/android/gms/internal/firebase-auth-api/mp;Lcom/google/android/gms/internal/firebase-auth-api/hn;)V
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->a:Lcom/google/android/gms/internal/firebase-auth-api/km;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->f:Ljava/lang/String;

    const-string v2, "/resetPassword"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/jm;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/np;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/jm;->b:Lcom/google/android/gms/internal/firebase-auth-api/rm;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ln;->a(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/nm;Lcom/google/android/gms/internal/firebase-auth-api/hn;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/rm;)V

    return-void
.end method

.method public final j()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, v0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/qm;->v(Lcom/google/android/gms/internal/firebase-auth-api/on;Lcom/google/android/gms/internal/firebase-auth-api/km;Lcom/google/android/gms/internal/firebase-auth-api/lm;)V

    return-void
.end method

.method public final k(Lcom/google/android/gms/internal/firebase-auth-api/pp;Lcom/google/android/gms/internal/firebase-auth-api/hn;)V
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/pp;->k0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/qm;->u()Lcom/google/android/gms/internal/firebase-auth-api/rm;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/pp;->k0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/rm;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->a:Lcom/google/android/gms/internal/firebase-auth-api/km;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->f:Ljava/lang/String;

    const-string v2, "/sendVerificationCode"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/jm;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/rp;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/jm;->b:Lcom/google/android/gms/internal/firebase-auth-api/rm;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ln;->a(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/nm;Lcom/google/android/gms/internal/firebase-auth-api/hn;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/rm;)V

    return-void
.end method

.method public final l(Lcom/google/android/gms/internal/firebase-auth-api/sp;Lcom/google/android/gms/internal/firebase-auth-api/hn;)V
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->a:Lcom/google/android/gms/internal/firebase-auth-api/km;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->f:Ljava/lang/String;

    const-string v2, "/setAccountInfo"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/jm;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/tp;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/jm;->b:Lcom/google/android/gms/internal/firebase-auth-api/rm;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ln;->a(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/nm;Lcom/google/android/gms/internal/firebase-auth-api/hn;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/rm;)V

    return-void
.end method

.method public final m(Lcom/google/android/gms/internal/firebase-auth-api/up;Lcom/google/android/gms/internal/firebase-auth-api/hn;)V
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->a:Lcom/google/android/gms/internal/firebase-auth-api/km;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->f:Ljava/lang/String;

    const-string v2, "/signupNewUser"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/jm;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/vp;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/jm;->b:Lcom/google/android/gms/internal/firebase-auth-api/rm;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ln;->a(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/nm;Lcom/google/android/gms/internal/firebase-auth-api/hn;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/rm;)V

    return-void
.end method

.method public final n(Lcom/google/android/gms/internal/firebase-auth-api/wp;Lcom/google/android/gms/internal/firebase-auth-api/hn;)V
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/wp;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/qm;->u()Lcom/google/android/gms/internal/firebase-auth-api/rm;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/wp;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/rm;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->b:Lcom/google/android/gms/internal/firebase-auth-api/lm;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->f:Ljava/lang/String;

    const-string v2, "/mfaEnrollment:start"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/jm;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/xp;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/jm;->b:Lcom/google/android/gms/internal/firebase-auth-api/rm;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ln;->a(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/nm;Lcom/google/android/gms/internal/firebase-auth-api/hn;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/rm;)V

    return-void
.end method

.method public final o(Lcom/google/android/gms/internal/firebase-auth-api/yp;Lcom/google/android/gms/internal/firebase-auth-api/hn;)V
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/yp;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/qm;->u()Lcom/google/android/gms/internal/firebase-auth-api/rm;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/yp;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/rm;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->b:Lcom/google/android/gms/internal/firebase-auth-api/lm;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->f:Ljava/lang/String;

    const-string v2, "/mfaSignIn:start"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/jm;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/zp;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/jm;->b:Lcom/google/android/gms/internal/firebase-auth-api/rm;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ln;->a(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/nm;Lcom/google/android/gms/internal/firebase-auth-api/hn;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/rm;)V

    return-void
.end method

.method public final p(Lcom/google/android/gms/internal/firebase-auth-api/cq;Lcom/google/android/gms/internal/firebase-auth-api/hn;)V
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->a:Lcom/google/android/gms/internal/firebase-auth-api/km;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->f:Ljava/lang/String;

    const-string v2, "/verifyAssertion"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/jm;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/eq;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/jm;->b:Lcom/google/android/gms/internal/firebase-auth-api/rm;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ln;->a(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/nm;Lcom/google/android/gms/internal/firebase-auth-api/hn;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/rm;)V

    return-void
.end method

.method public final q(Lcom/google/android/gms/internal/firebase-auth-api/fq;Lcom/google/android/gms/internal/firebase-auth-api/hn;)V
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->a:Lcom/google/android/gms/internal/firebase-auth-api/km;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->f:Ljava/lang/String;

    const-string v2, "/verifyCustomToken"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/jm;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/gq;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/jm;->b:Lcom/google/android/gms/internal/firebase-auth-api/rm;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ln;->a(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/nm;Lcom/google/android/gms/internal/firebase-auth-api/hn;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/rm;)V

    return-void
.end method

.method public final r(Lcom/google/android/gms/internal/firebase-auth-api/iq;Lcom/google/android/gms/internal/firebase-auth-api/hn;)V
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->a:Lcom/google/android/gms/internal/firebase-auth-api/km;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->f:Ljava/lang/String;

    const-string v2, "/verifyPassword"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/jm;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/jq;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/jm;->b:Lcom/google/android/gms/internal/firebase-auth-api/rm;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ln;->a(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/nm;Lcom/google/android/gms/internal/firebase-auth-api/hn;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/rm;)V

    return-void
.end method

.method public final s(Lcom/google/android/gms/internal/firebase-auth-api/kq;Lcom/google/android/gms/internal/firebase-auth-api/hn;)V
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->a:Lcom/google/android/gms/internal/firebase-auth-api/km;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->f:Ljava/lang/String;

    const-string v2, "/verifyPhoneNumber"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/jm;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/lq;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/jm;->b:Lcom/google/android/gms/internal/firebase-auth-api/rm;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ln;->a(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/nm;Lcom/google/android/gms/internal/firebase-auth-api/hn;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/rm;)V

    return-void
.end method

.method public final t(Lcom/google/android/gms/internal/firebase-auth-api/nq;Lcom/google/android/gms/internal/firebase-auth-api/hn;)V
    .locals 3

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->b:Lcom/google/android/gms/internal/firebase-auth-api/lm;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qm;->f:Ljava/lang/String;

    const-string v2, "/mfaEnrollment:withdraw"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/jm;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/oq;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/jm;->b:Lcom/google/android/gms/internal/firebase-auth-api/rm;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ln;->a(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/nm;Lcom/google/android/gms/internal/firebase-auth-api/hn;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/rm;)V

    return-void
.end method
