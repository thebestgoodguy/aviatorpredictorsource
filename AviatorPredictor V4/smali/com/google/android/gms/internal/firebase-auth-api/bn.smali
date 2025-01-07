.class public final Lcom/google/android/gms/internal/firebase-auth-api/bn;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

.field private final b:Lo0/i;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/cn;Lo0/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/bn;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/bn;->b:Lo0/i;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lcom/google/android/gms/common/api/Status;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bn;->b:Lo0/i;

    const-string v1, "completion source cannot be null"

    invoke-static {v0, v1}, Lw/r;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_4

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/bn;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    iget-object v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/cn;->r:Lcom/google/android/gms/internal/firebase-auth-api/pi;

    if-eqz v0, :cond_2

    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/bn;->b:Lo0/i;

    iget-object p1, p1, Lcom/google/android/gms/internal/firebase-auth-api/cn;->c:Lx0/e;

    invoke-static {p1}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Lx0/e;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bn;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    iget-object v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->r:Lcom/google/android/gms/internal/firebase-auth-api/pi;

    invoke-interface {v0}, Lcom/google/android/gms/internal/firebase-auth-api/en;->a()Ljava/lang/String;

    move-result-object v0

    const-string v2, "reauthenticateWithCredential"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bn;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    invoke-interface {v0}, Lcom/google/android/gms/internal/firebase-auth-api/en;->a()Ljava/lang/String;

    move-result-object v0

    const-string v2, "reauthenticateWithCredentialWithData"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/bn;->a:Lcom/google/android/gms/internal/firebase-auth-api/cn;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->d:Lcom/google/firebase/auth/z;

    :goto_1
    invoke-static {p1, v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/cm;->c(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/android/gms/internal/firebase-auth-api/pi;Lcom/google/firebase/auth/z;)Lcom/google/firebase/auth/t;

    move-result-object p1

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    return-void

    :cond_2
    iget-object v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/cn;->o:Lcom/google/firebase/auth/h;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/bn;->b:Lo0/i;

    iget-object v2, p1, Lcom/google/android/gms/internal/firebase-auth-api/cn;->p:Ljava/lang/String;

    iget-object p1, p1, Lcom/google/android/gms/internal/firebase-auth-api/cn;->q:Ljava/lang/String;

    invoke-static {p2, v0, v2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cm;->b(Lcom/google/android/gms/common/api/Status;Lcom/google/firebase/auth/h;Ljava/lang/String;Ljava/lang/String;)Lx0/k;

    move-result-object p1

    invoke-virtual {v1, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/bn;->b:Lo0/i;

    invoke-static {p2}, Lcom/google/android/gms/internal/firebase-auth-api/cm;->a(Lcom/google/android/gms/common/api/Status;)Lx0/k;

    move-result-object p2

    invoke-virtual {p1, p2}, Lo0/i;->b(Ljava/lang/Exception;)V

    return-void

    :cond_4
    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/bn;->b:Lo0/i;

    invoke-virtual {p2, p1}, Lo0/i;->c(Ljava/lang/Object;)V

    return-void
.end method
