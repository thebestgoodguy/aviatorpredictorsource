.class final Lcom/google/android/gms/internal/firebase-auth-api/yj;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/hn;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/firebase-auth-api/hn;

.field final synthetic b:Lcom/google/android/gms/internal/firebase-auth-api/zj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zj;Lcom/google/android/gms/internal/firebase-auth-api/hn;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/yj;->b:Lcom/google/android/gms/internal/firebase-auth-api/zj;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/yj;->a:Lcom/google/android/gms/internal/firebase-auth-api/hn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/yj;->b:Lcom/google/android/gms/internal/firebase-auth-api/zj;

    iget-object p1, p1, Lcom/google/android/gms/internal/firebase-auth-api/zj;->a:Lcom/google/android/gms/internal/firebase-auth-api/am;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/am;->d()V

    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/yj;->a:Lcom/google/android/gms/internal/firebase-auth-api/hn;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/gn;->d(Ljava/lang/String;)V

    return-void
.end method
