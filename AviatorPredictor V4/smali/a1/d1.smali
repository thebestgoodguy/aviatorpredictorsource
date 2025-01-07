.class public final La1/d1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/auth/d;


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Lcom/google/firebase/auth/b;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/np;)V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/np;->p0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/np;->l0()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/np;->k0()Ljava/lang/String;

    move-result-object v0

    :goto_0
    iput-object v0, p0, La1/d1;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/np;->k0()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, La1/d1;->c:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/np;->q0()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x3

    if-nez v0, :cond_1

    iput v2, p0, La1/d1;->a:I

    iput-object v1, p0, La1/d1;->d:Lcom/google/firebase/auth/b;

    return-void

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/np;->m0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x5

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x4

    sparse-switch v3, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v3, "RECOVER_EMAIL"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x4

    goto :goto_2

    :sswitch_1
    const-string v3, "EMAIL_SIGNIN"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x2

    goto :goto_2

    :sswitch_2
    const-string v3, "VERIFY_AND_CHANGE_EMAIL"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    goto :goto_2

    :sswitch_3
    const-string v3, "VERIFY_EMAIL"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :sswitch_4
    const-string v3, "PASSWORD_RESET"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    goto :goto_2

    :sswitch_5
    const-string v3, "REVERT_SECOND_FACTOR_ADDITION"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x5

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v0, -0x1

    :goto_2
    if-eqz v0, :cond_8

    if-eq v0, v7, :cond_7

    if-eq v0, v6, :cond_6

    if-eq v0, v2, :cond_5

    if-eq v0, v8, :cond_4

    if-eq v0, v5, :cond_3

    const/4 v4, 0x3

    goto :goto_3

    :cond_3
    const/4 v4, 0x6

    goto :goto_3

    :cond_4
    const/4 v4, 0x2

    goto :goto_3

    :cond_5
    const/4 v4, 0x5

    goto :goto_3

    :cond_6
    const/4 v4, 0x4

    goto :goto_3

    :cond_7
    const/4 v4, 0x1

    :cond_8
    :goto_3
    iput v4, p0, La1/d1;->a:I

    if-eq v4, v8, :cond_d

    if-ne v4, v2, :cond_9

    goto :goto_5

    :cond_9
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/np;->o0()Z

    move-result v0

    if-eqz v0, :cond_a

    new-instance v1, La1/c1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/np;->k0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/np;->j0()Lcom/google/android/gms/internal/firebase-auth-api/fp;

    move-result-object p1

    invoke-static {p1}, La1/e0;->a(Lcom/google/android/gms/internal/firebase-auth-api/fp;)Lcom/google/firebase/auth/i0;

    move-result-object p1

    invoke-direct {v1, v0, p1}, La1/c1;-><init>(Ljava/lang/String;Lcom/google/firebase/auth/i0;)V

    goto :goto_4

    :cond_a
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/np;->p0()Z

    move-result v0

    if-eqz v0, :cond_b

    new-instance v1, La1/a1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/np;->l0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/np;->k0()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v0, p1}, La1/a1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    :cond_b
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/np;->n0()Z

    move-result v0

    if-eqz v0, :cond_c

    new-instance v1, La1/b1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/np;->k0()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, La1/b1;-><init>(Ljava/lang/String;)V

    :cond_c
    :goto_4
    iput-object v1, p0, La1/d1;->d:Lcom/google/firebase/auth/b;

    return-void

    :cond_d
    :goto_5
    iput-object v1, p0, La1/d1;->d:Lcom/google/firebase/auth/b;

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x6fbac124 -> :sswitch_5
        -0x56916d75 -> :sswitch_4
        -0x4ffacbca -> :sswitch_3
        -0x4183d145 -> :sswitch_2
        0x33e669c5 -> :sswitch_1
        0x39d86cc1 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, La1/d1;->a:I

    return v0
.end method

.method public final b()Lcom/google/firebase/auth/b;
    .locals 1

    iget-object v0, p0, La1/d1;->d:Lcom/google/firebase/auth/b;

    return-object v0
.end method
