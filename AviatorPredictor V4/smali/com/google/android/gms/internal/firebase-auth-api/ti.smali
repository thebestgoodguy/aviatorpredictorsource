.class final Lcom/google/android/gms/internal/firebase-auth-api/ti;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/hn;


# instance fields
.field final synthetic a:Lcom/google/firebase/auth/j;

.field final synthetic b:Lcom/google/android/gms/internal/firebase-auth-api/am;

.field final synthetic c:Lcom/google/android/gms/internal/firebase-auth-api/ik;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/ik;Lcom/google/firebase/auth/j;Lcom/google/android/gms/internal/firebase-auth-api/am;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/ti;->c:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/ti;->a:Lcom/google/firebase/auth/j;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/ti;->b:Lcom/google/android/gms/internal/firebase-auth-api/am;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/bp;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/io;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/ti;->a:Lcom/google/firebase/auth/j;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/bp;->m0()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/io;-><init>(Lcom/google/firebase/auth/j;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/ti;->c:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/ti;->b:Lcom/google/android/gms/internal/firebase-auth-api/am;

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->r(Lcom/google/android/gms/internal/firebase-auth-api/ik;Lcom/google/android/gms/internal/firebase-auth-api/io;Lcom/google/android/gms/internal/firebase-auth-api/am;)V

    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, La1/l;->a(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/ti;->b:Lcom/google/android/gms/internal/firebase-auth-api/am;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/am;->h(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method
