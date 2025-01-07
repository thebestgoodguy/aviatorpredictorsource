.class final Lcom/google/firebase/auth/r1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La1/q;


# instance fields
.field final synthetic a:Lcom/google/firebase/auth/z;

.field final synthetic b:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/z;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/auth/r1;->b:Lcom/google/firebase/auth/FirebaseAuth;

    iput-object p2, p0, Lcom/google/firebase/auth/r1;->a:Lcom/google/firebase/auth/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/auth/r1;->b:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->j0(Lcom/google/firebase/auth/FirebaseAuth;)Lcom/google/firebase/auth/z;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->j0(Lcom/google/firebase/auth/FirebaseAuth;)Lcom/google/firebase/auth/z;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/auth/z;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/auth/r1;->a:Lcom/google/firebase/auth/z;

    invoke-virtual {v1}, Lcom/google/firebase/auth/z;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/auth/r1;->b:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-virtual {v0}, Lcom/google/firebase/auth/FirebaseAuth;->K()V

    :cond_0
    return-void
.end method

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

    move-result p1

    const/16 v0, 0x426d

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/google/firebase/auth/r1;->b:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-virtual {p1}, Lcom/google/firebase/auth/FirebaseAuth;->C()V

    return-void
.end method
