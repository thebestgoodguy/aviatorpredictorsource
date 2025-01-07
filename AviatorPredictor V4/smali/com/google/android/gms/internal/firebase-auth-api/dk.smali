.class final Lcom/google/android/gms/internal/firebase-auth-api/dk;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/hn;


# instance fields
.field final synthetic a:Lcom/google/firebase/auth/y0;

.field final synthetic b:Lcom/google/android/gms/internal/firebase-auth-api/am;

.field final synthetic c:Lcom/google/android/gms/internal/firebase-auth-api/ik;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/ik;Lcom/google/firebase/auth/y0;Lcom/google/android/gms/internal/firebase-auth-api/am;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/dk;->c:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/dk;->a:Lcom/google/firebase/auth/y0;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/dk;->b:Lcom/google/android/gms/internal/firebase-auth-api/am;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/bp;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/sp;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/sp;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/bp;->m0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/sp;->e(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/sp;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/dk;->a:Lcom/google/firebase/auth/y0;

    invoke-virtual {v1}, Lcom/google/firebase/auth/y0;->k0()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/dk;->a:Lcom/google/firebase/auth/y0;

    invoke-virtual {v1}, Lcom/google/firebase/auth/y0;->R()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/dk;->a:Lcom/google/firebase/auth/y0;

    invoke-virtual {v1}, Lcom/google/firebase/auth/y0;->R()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/sp;->c(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/sp;

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/dk;->a:Lcom/google/firebase/auth/y0;

    invoke-virtual {v1}, Lcom/google/firebase/auth/y0;->l0()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/dk;->a:Lcom/google/firebase/auth/y0;

    invoke-virtual {v1}, Lcom/google/firebase/auth/y0;->j0()Landroid/net/Uri;

    move-result-object v1

    if-eqz v1, :cond_3

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/dk;->a:Lcom/google/firebase/auth/y0;

    invoke-virtual {v1}, Lcom/google/firebase/auth/y0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/sp;->h(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/sp;

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/dk;->c:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/dk;->b:Lcom/google/android/gms/internal/firebase-auth-api/am;

    invoke-static {v1, v2, p1, v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->u(Lcom/google/android/gms/internal/firebase-auth-api/ik;Lcom/google/android/gms/internal/firebase-auth-api/am;Lcom/google/android/gms/internal/firebase-auth-api/bp;Lcom/google/android/gms/internal/firebase-auth-api/sp;Lcom/google/android/gms/internal/firebase-auth-api/gn;)V

    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, La1/l;->a(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/dk;->b:Lcom/google/android/gms/internal/firebase-auth-api/am;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/am;->h(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method
