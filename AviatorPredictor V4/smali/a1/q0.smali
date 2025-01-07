.class public final La1/q0;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final c:La1/q0;


# instance fields
.field private final a:La1/h0;

.field private final b:La1/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La1/q0;

    invoke-direct {v0}, La1/q0;-><init>()V

    sput-object v0, La1/q0;->c:La1/q0;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-static {}, La1/h0;->b()La1/h0;

    move-result-object v0

    invoke-static {}, La1/a0;->a()La1/a0;

    move-result-object v1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La1/q0;->a:La1/h0;

    iput-object v1, p0, La1/q0;->b:La1/a0;

    return-void
.end method

.method public static b()La1/q0;
    .locals 1

    sget-object v0, La1/q0;->c:La1/q0;

    return-object v0
.end method


# virtual methods
.method public final a()Lo0/h;
    .locals 1

    iget-object v0, p0, La1/q0;->a:La1/h0;

    invoke-virtual {v0}, La1/h0;->a()Lo0/h;

    move-result-object v0

    return-object v0
.end method

.method public final c(Landroid/content/Context;)V
    .locals 1

    iget-object v0, p0, La1/q0;->a:La1/h0;

    invoke-virtual {v0, p1}, La1/h0;->c(Landroid/content/Context;)V

    return-void
.end method

.method public final d(Lcom/google/firebase/auth/FirebaseAuth;)V
    .locals 1

    iget-object v0, p0, La1/q0;->a:La1/h0;

    invoke-virtual {v0, p1}, La1/h0;->d(Lcom/google/firebase/auth/FirebaseAuth;)V

    return-void
.end method

.method public final e(Landroid/content/Context;Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    const-string v0, "com.google.firebase.auth.internal.ProcessDeathHelper"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-virtual {p2}, Lcom/google/android/gms/common/api/Status;->k0()I

    move-result v0

    const-string v1, "statusCode"

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-virtual {p2}, Lcom/google/android/gms/common/api/Status;->l0()Ljava/lang/String;

    move-result-object p2

    const-string v0, "statusMessage"

    invoke-interface {p1, v0, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-static {}, Lb0/f;->b()Lb0/d;

    move-result-object p2

    invoke-interface {p2}, Lb0/d;->a()J

    move-result-wide v0

    const-string p2, "timestamp"

    invoke-interface {p1, p2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method public final f(Landroid/content/Context;Lcom/google/firebase/auth/FirebaseAuth;)V
    .locals 2

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "com.google.firebase.auth.internal.ProcessDeathHelper"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-virtual {p2}, Lcom/google/firebase/auth/FirebaseAuth;->l()Lx0/e;

    move-result-object p2

    invoke-virtual {p2}, Lx0/e;->q()Ljava/lang/String;

    move-result-object p2

    const-string v0, "firebaseAppName"

    invoke-interface {p1, v0, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method public final g(Landroid/app/Activity;Lo0/i;Lcom/google/firebase/auth/FirebaseAuth;)Z
    .locals 2

    iget-object v0, p0, La1/q0;->b:La1/a0;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, p3, v1}, La1/a0;->f(Landroid/app/Activity;Lo0/i;Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/z;)Z

    move-result p1

    return p1
.end method
