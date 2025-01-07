.class public final La1/a0;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static c:La1/a0;


# instance fields
.field private a:Z

.field private b:Landroid/content/BroadcastReceiver;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, La1/a0;->a:Z

    return-void
.end method

.method public static a()La1/a0;
    .locals 1

    sget-object v0, La1/a0;->c:La1/a0;

    if-nez v0, :cond_0

    new-instance v0, La1/a0;

    invoke-direct {v0}, La1/a0;-><init>()V

    sput-object v0, La1/a0;->c:La1/a0;

    :cond_0
    sget-object v0, La1/a0;->c:La1/a0;

    return-object v0
.end method

.method static bridge synthetic b(La1/a0;Landroid/content/Intent;Lo0/i;Lcom/google/firebase/auth/z;Landroid/content/Context;)V
    .locals 0

    invoke-static {p1}, La1/a0;->i(Landroid/content/Intent;)Lcom/google/firebase/auth/h;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/google/firebase/auth/z;->q0(Lcom/google/firebase/auth/h;)Lo0/h;

    move-result-object p1

    new-instance p3, La1/v;

    invoke-direct {p3, p0, p2, p4}, La1/v;-><init>(La1/a0;Lo0/i;Landroid/content/Context;)V

    invoke-virtual {p1, p3}, Lo0/h;->g(Lo0/f;)Lo0/h;

    move-result-object p1

    new-instance p3, La1/u;

    invoke-direct {p3, p0, p2, p4}, La1/u;-><init>(La1/a0;Lo0/i;Landroid/content/Context;)V

    invoke-virtual {p1, p3}, Lo0/h;->e(Lo0/e;)Lo0/h;

    return-void
.end method

.method static bridge synthetic c(La1/a0;Landroid/content/Intent;Lo0/i;Lcom/google/firebase/auth/z;Landroid/content/Context;)V
    .locals 0

    invoke-static {p1}, La1/a0;->i(Landroid/content/Intent;)Lcom/google/firebase/auth/h;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/google/firebase/auth/z;->r0(Lcom/google/firebase/auth/h;)Lo0/h;

    move-result-object p1

    new-instance p3, La1/x;

    invoke-direct {p3, p0, p2, p4}, La1/x;-><init>(La1/a0;Lo0/i;Landroid/content/Context;)V

    invoke-virtual {p1, p3}, Lo0/h;->g(Lo0/f;)Lo0/h;

    move-result-object p1

    new-instance p3, La1/w;

    invoke-direct {p3, p0, p2, p4}, La1/w;-><init>(La1/a0;Lo0/i;Landroid/content/Context;)V

    invoke-virtual {p1, p3}, Lo0/h;->e(Lo0/e;)Lo0/h;

    return-void
.end method

.method static bridge synthetic d(La1/a0;Landroid/content/Intent;Lo0/i;Lcom/google/firebase/auth/FirebaseAuth;Landroid/content/Context;)V
    .locals 0

    invoke-static {p1}, La1/a0;->i(Landroid/content/Intent;)Lcom/google/firebase/auth/h;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/google/firebase/auth/FirebaseAuth;->y(Lcom/google/firebase/auth/h;)Lo0/h;

    move-result-object p1

    new-instance p3, La1/t;

    invoke-direct {p3, p0, p2, p4}, La1/t;-><init>(La1/a0;Lo0/i;Landroid/content/Context;)V

    invoke-virtual {p1, p3}, Lo0/h;->g(Lo0/f;)Lo0/h;

    move-result-object p1

    new-instance p3, La1/s;

    invoke-direct {p3, p0, p2, p4}, La1/s;-><init>(La1/a0;Lo0/i;Landroid/content/Context;)V

    invoke-virtual {p1, p3}, Lo0/h;->e(Lo0/e;)Lo0/h;

    return-void
.end method

.method static e(Landroid/content/Context;)V
    .locals 2

    sget-object v0, La1/a0;->c:La1/a0;

    const/4 v1, 0x0

    iput-boolean v1, v0, La1/a0;->a:Z

    iget-object v0, v0, La1/a0;->b:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    invoke-static {p0}, Lm/a;->b(Landroid/content/Context;)Lm/a;

    move-result-object p0

    sget-object v0, La1/a0;->c:La1/a0;

    iget-object v0, v0, La1/a0;->b:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lm/a;->e(Landroid/content/BroadcastReceiver;)V

    :cond_0
    sget-object p0, La1/a0;->c:La1/a0;

    const/4 v0, 0x0

    iput-object v0, p0, La1/a0;->b:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method private final h(Landroid/app/Activity;Landroid/content/BroadcastReceiver;)V
    .locals 2

    iput-object p2, p0, La1/a0;->b:Landroid/content/BroadcastReceiver;

    invoke-static {p1}, Lm/a;->b(Landroid/content/Context;)Lm/a;

    move-result-object p1

    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2, v0}, Lm/a;->c(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    return-void
.end method

.method private static final i(Landroid/content/Intent;)Lcom/google/firebase/auth/h;
    .locals 2

    invoke-static {p0}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/cq;->CREATOR:Landroid/os/Parcelable$Creator;

    const-string v1, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST"

    invoke-static {p0, v1, v0}, Lx/e;->b(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Lx/d;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/cq;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/cq;->m0(Z)Lcom/google/android/gms/internal/firebase-auth-api/cq;

    invoke-static {p0}, Lcom/google/firebase/auth/n1;->m0(Lcom/google/android/gms/internal/firebase-auth-api/cq;)Lcom/google/firebase/auth/n1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final f(Landroid/app/Activity;Lo0/i;Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/z;)Z
    .locals 7

    iget-boolean v0, p0, La1/a0;->a:Z

    if-nez v0, :cond_0

    new-instance v0, La1/y;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, La1/y;-><init>(La1/a0;Landroid/app/Activity;Lo0/i;Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/z;)V

    invoke-direct {p0, p1, v0}, La1/a0;->h(Landroid/app/Activity;Landroid/content/BroadcastReceiver;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, La1/a0;->a:Z

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final g(Landroid/app/Activity;Lo0/i;)Z
    .locals 1

    iget-boolean v0, p0, La1/a0;->a:Z

    if-nez v0, :cond_0

    new-instance v0, La1/z;

    invoke-direct {v0, p0, p1, p2}, La1/z;-><init>(La1/a0;Landroid/app/Activity;Lo0/i;)V

    invoke-direct {p0, p1, v0}, La1/a0;->h(Landroid/app/Activity;Landroid/content/BroadcastReceiver;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, La1/a0;->a:Z

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
