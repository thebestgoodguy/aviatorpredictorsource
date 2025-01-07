.class final Lcom/google/firebase/auth/c2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La1/o0;


# instance fields
.field final synthetic a:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/auth/c2;->a:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->k0()I

    move-result v0

    const/16 v1, 0x4273

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->k0()I

    move-result v0

    const/16 v1, 0x427d

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->k0()I

    move-result v0

    const/16 v1, 0x426d

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->k0()I

    move-result p1

    const/16 v0, 0x42c3

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/google/firebase/auth/c2;->a:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseAuth;->C()V

    return-void
.end method

.method public final c(Lcom/google/android/gms/internal/firebase-auth-api/bp;Lcom/google/firebase/auth/z;)V
    .locals 2

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2, p1}, Lcom/google/firebase/auth/z;->J0(Lcom/google/android/gms/internal/firebase-auth-api/bp;)V

    iget-object v0, p0, Lcom/google/firebase/auth/c2;->a:Lcom/google/firebase/auth/FirebaseAuth;

    const/4 v1, 0x1

    invoke-static {v0, p2, p1, v1, v1}, Lcom/google/firebase/auth/FirebaseAuth;->O(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/z;Lcom/google/android/gms/internal/firebase-auth-api/bp;ZZ)V

    return-void
.end method
