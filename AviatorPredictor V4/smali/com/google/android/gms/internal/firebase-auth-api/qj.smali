.class final Lcom/google/android/gms/internal/firebase-auth-api/qj;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/hn;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/firebase-auth-api/am;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/ik;Lcom/google/android/gms/internal/firebase-auth-api/am;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/qj;->a:Lcom/google/android/gms/internal/firebase-auth-api/am;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/xp;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qj;->a:Lcom/google/android/gms/internal/firebase-auth-api/am;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/xp;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/am;->b(Ljava/lang/String;)V

    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, La1/l;->a(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qj;->a:Lcom/google/android/gms/internal/firebase-auth-api/am;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/am;->h(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method
