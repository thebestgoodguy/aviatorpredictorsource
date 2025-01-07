.class public final La1/u0;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Ljava/lang/String; = "u0"

.field private static final b:La1/u0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La1/u0;

    invoke-direct {v0}, La1/u0;-><init>()V

    sput-object v0, La1/u0;->b:La1/u0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()La1/u0;
    .locals 1

    sget-object v0, La1/u0;->b:La1/u0;

    return-object v0
.end method

.method static bridge synthetic c()Ljava/lang/String;
    .locals 1

    sget-object v0, La1/u0;->a:Ljava/lang/String;

    return-object v0
.end method

.method static bridge synthetic d(La1/u0;Lcom/google/firebase/auth/FirebaseAuth;La1/q0;Landroid/app/Activity;Lo0/i;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, La1/u0;->e(Lcom/google/firebase/auth/FirebaseAuth;La1/q0;Landroid/app/Activity;Lo0/i;)V

    return-void
.end method

.method private final e(Lcom/google/firebase/auth/FirebaseAuth;La1/q0;Landroid/app/Activity;Lo0/i;)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseAuth;->l()Lx0/e;

    move-result-object v0

    invoke-virtual {v0}, Lx0/e;->m()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p2, v0, p1}, La1/q0;->f(Landroid/content/Context;Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-static {p3}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Lo0/i;

    invoke-direct {p2}, Lo0/i;-><init>()V

    invoke-static {}, La1/a0;->a()La1/a0;

    move-result-object v0

    invoke-virtual {v0, p3, p2}, La1/a0;->g(Landroid/app/Activity;Lo0/i;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Lcom/google/android/gms/common/api/Status;

    const/16 p2, 0x42a1

    const-string p3, "reCAPTCHA flow already in progress"

    invoke-direct {p1, p2, p3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/cm;->a(Lcom/google/android/gms/common/api/Status;)Lx0/k;

    move-result-object p1

    invoke-static {p1}, Lo0/k;->c(Ljava/lang/Exception;)Lo0/h;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-class v1, Lcom/google/firebase/auth/internal/RecaptchaActivity;

    invoke-virtual {v0, p3, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    invoke-virtual {p3}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseAuth;->l()Lx0/e;

    move-result-object v1

    invoke-virtual {v1}, Lx0/e;->r()Lx0/m;

    move-result-object v1

    invoke-virtual {v1}, Lx0/m;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.google.firebase.auth.KEY_API_KEY"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseAuth;->p()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseAuth;->p()Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.google.firebase.auth.KEY_TENANT_ID"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/pm;->a()Lcom/google/android/gms/internal/firebase-auth-api/pm;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/pm;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.google.firebase.auth.internal.CLIENT_VERSION"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseAuth;->l()Lx0/e;

    move-result-object p1

    invoke-virtual {p1}, Lx0/e;->q()Ljava/lang/String;

    move-result-object p1

    const-string v1, "com.google.firebase.auth.internal.FIREBASE_APP_NAME"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p3, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p2}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    :goto_0
    new-instance p2, La1/s0;

    invoke-direct {p2, p0, p4}, La1/s0;-><init>(La1/u0;Lo0/i;)V

    invoke-virtual {p1, p2}, Lo0/h;->g(Lo0/f;)Lo0/h;

    move-result-object p1

    new-instance p2, La1/r0;

    invoke-direct {p2, p0, p4}, La1/r0;-><init>(La1/u0;Lo0/i;)V

    invoke-virtual {p1, p2}, Lo0/h;->e(Lo0/e;)Lo0/h;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Landroid/app/Activity;Z)Lo0/h;
    .locals 10

    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseAuth;->n()Lcom/google/firebase/auth/v;

    move-result-object v0

    check-cast v0, La1/l1;

    const/4 v1, 0x0

    if-eqz p4, :cond_0

    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseAuth;->l()Lx0/e;

    move-result-object p4

    invoke-virtual {p4}, Lx0/e;->m()Landroid/content/Context;

    move-result-object p4

    invoke-static {p4}, Lk0/c;->a(Landroid/content/Context;)Lk0/e;

    move-result-object p4

    goto :goto_0

    :cond_0
    move-object p4, v1

    :goto_0
    invoke-static {}, La1/q0;->b()La1/q0;

    move-result-object v8

    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseAuth;->l()Lx0/e;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/internal/firebase-auth-api/bo;->g(Lx0/e;)Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual {v0}, La1/l1;->h()Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_3

    :cond_1
    new-instance v9, Lo0/i;

    invoke-direct {v9}, Lo0/i;-><init>()V

    invoke-virtual {v8}, La1/q0;->a()Lo0/h;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lo0/h;->p()Z

    move-result v3

    if-eqz v3, :cond_2

    new-instance p1, La1/t0;

    invoke-virtual {v2}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-direct {p1, v1, p2}, La1/t0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_4

    :cond_2
    sget-object v1, La1/u0;->a:Ljava/lang/String;

    invoke-virtual {v2}, Lo0/h;->l()Ljava/lang/Exception;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Error in previous reCAPTCHA flow: "

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v2, "Continuing with application verification as normal"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    if-eqz p4, :cond_5

    invoke-virtual {v0}, La1/l1;->f()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseAuth;->l()Lx0/e;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [B

    if-eqz p2, :cond_4

    :try_start_0
    const-string v2, "UTF-8"

    invoke-virtual {p2, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    sget-object v2, La1/u0;->a:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v3, "Failed to getBytes with exception: "

    invoke-virtual {v3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {v2, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    :goto_1
    invoke-virtual {v0}, Lx0/e;->r()Lx0/m;

    move-result-object p2

    invoke-virtual {p2}, Lx0/m;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, v1, p2}, Lk0/e;->o([BLjava/lang/String;)Lo0/h;

    move-result-object p2

    new-instance p4, La1/d0;

    move-object v2, p4

    move-object v3, p0

    move-object v4, v9

    move-object v5, p1

    move-object v6, v8

    move-object v7, p3

    invoke-direct/range {v2 .. v7}, La1/d0;-><init>(La1/u0;Lo0/i;Lcom/google/firebase/auth/FirebaseAuth;La1/q0;Landroid/app/Activity;)V

    invoke-virtual {p2, p4}, Lo0/h;->g(Lo0/f;)Lo0/h;

    move-result-object p2

    new-instance p4, La1/c;

    move-object v2, p4

    move-object v4, p1

    move-object v5, v8

    move-object v6, p3

    move-object v7, v9

    invoke-direct/range {v2 .. v7}, La1/c;-><init>(La1/u0;Lcom/google/firebase/auth/FirebaseAuth;La1/q0;Landroid/app/Activity;Lo0/i;)V

    invoke-virtual {p2, p4}, Lo0/h;->e(Lo0/e;)Lo0/h;

    goto :goto_2

    :cond_5
    invoke-direct {p0, p1, v8, p3, v9}, La1/u0;->e(Lcom/google/firebase/auth/FirebaseAuth;La1/q0;Landroid/app/Activity;Lo0/i;)V

    :goto_2
    invoke-virtual {v9}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    goto :goto_5

    :cond_6
    :goto_3
    new-instance p1, La1/t0;

    invoke-direct {p1, v1, v1}, La1/t0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :goto_4
    invoke-static {p1}, Lo0/k;->d(Ljava/lang/Object;)Lo0/h;

    move-result-object p1

    :goto_5
    return-object p1
.end method
