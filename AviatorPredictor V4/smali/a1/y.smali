.class final La1/y;
.super Landroid/content/BroadcastReceiver;
.source ""


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;

.field private final b:Lo0/i;

.field private final c:Lcom/google/firebase/auth/FirebaseAuth;

.field private final d:Lcom/google/firebase/auth/z;

.field final synthetic e:La1/a0;


# direct methods
.method constructor <init>(La1/a0;Landroid/app/Activity;Lo0/i;Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/z;)V
    .locals 0

    iput-object p1, p0, La1/y;->e:La1/a0;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, La1/y;->a:Ljava/lang/ref/WeakReference;

    iput-object p3, p0, La1/y;->b:Lo0/i;

    iput-object p4, p0, La1/y;->c:Lcom/google/firebase/auth/FirebaseAuth;

    iput-object p5, p0, La1/y;->d:Lcom/google/firebase/auth/z;

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    iget-object v0, p0, La1/y;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-nez v0, :cond_0

    const-string p2, "FederatedAuthReceiver"

    const-string v0, "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation."

    invoke-static {p2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, La1/y;->b:Lo0/i;

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0x445b

    const-string v2, "Activity that started the web operation is no longer alive; see logcat for details"

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/cm;->a(Lcom/google/android/gms/common/api/Status;)Lx0/k;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo0/i;->b(Ljava/lang/Exception;)V

    invoke-static {p1}, La1/a0;->e(Landroid/content/Context;)V

    return-void

    :cond_0
    const-string v0, "com.google.firebase.auth.internal.OPERATION"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, La1/y;->e:La1/a0;

    iget-object v1, p0, La1/y;->b:Lo0/i;

    iget-object v2, p0, La1/y;->c:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-static {v0, p2, v1, v2, p1}, La1/a0;->d(La1/a0;Landroid/content/Intent;Lo0/i;Lcom/google/firebase/auth/FirebaseAuth;Landroid/content/Context;)V

    return-void

    :cond_1
    const-string v1, "com.google.firebase.auth.internal.NONGMSCORE_LINK"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v0, p0, La1/y;->e:La1/a0;

    iget-object v1, p0, La1/y;->b:Lo0/i;

    iget-object v2, p0, La1/y;->d:Lcom/google/firebase/auth/z;

    invoke-static {v0, p2, v1, v2, p1}, La1/a0;->b(La1/a0;Landroid/content/Intent;Lo0/i;Lcom/google/firebase/auth/z;Landroid/content/Context;)V

    return-void

    :cond_2
    const-string v1, "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v0, p0, La1/y;->e:La1/a0;

    iget-object v1, p0, La1/y;->b:Lo0/i;

    iget-object v2, p0, La1/y;->d:Lcom/google/firebase/auth/z;

    invoke-static {v0, p2, v1, v2, p1}, La1/a0;->c(La1/a0;Landroid/content/Intent;Lo0/i;Lcom/google/firebase/auth/z;Landroid/content/Context;)V

    return-void

    :cond_3
    iget-object p1, p0, La1/y;->b:Lo0/i;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WEB_CONTEXT_CANCELED:Unknown operation received ("

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, La1/l;->a(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    move-result-object p2

    invoke-static {p2}, Lcom/google/android/gms/internal/firebase-auth-api/cm;->a(Lcom/google/android/gms/common/api/Status;)Lx0/k;

    move-result-object p2

    invoke-virtual {p1, p2}, Lo0/i;->b(Ljava/lang/Exception;)V

    return-void

    :cond_4
    invoke-static {p2}, La1/p0;->d(Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p2}, La1/p0;->a(Landroid/content/Intent;)Lcom/google/android/gms/common/api/Status;

    move-result-object p2

    iget-object v0, p0, La1/y;->b:Lo0/i;

    invoke-static {p2}, Lcom/google/android/gms/internal/firebase-auth-api/cm;->a(Lcom/google/android/gms/common/api/Status;)Lx0/k;

    move-result-object p2

    invoke-virtual {v0, p2}, Lo0/i;->b(Ljava/lang/Exception;)V

    invoke-static {p1}, La1/a0;->e(Landroid/content/Context;)V

    return-void

    :cond_5
    const-string v0, "com.google.firebase.auth.internal.EXTRA_CANCELED"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_6

    iget-object p2, p0, La1/y;->b:Lo0/i;

    const-string v0, "WEB_CONTEXT_CANCELED"

    invoke-static {v0}, La1/l;->a(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/cm;->a(Lcom/google/android/gms/common/api/Status;)Lx0/k;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo0/i;->b(Ljava/lang/Exception;)V

    invoke-static {p1}, La1/a0;->e(Landroid/content/Context;)V

    :cond_6
    return-void
.end method
