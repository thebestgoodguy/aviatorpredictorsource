.class final Lcom/google/android/gms/internal/firebase-auth-api/c1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/b2;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/firebase-auth-api/ki;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/ki;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/c1;->a:Lcom/google/android/gms/internal/firebase-auth-api/ki;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/google/android/gms/internal/firebase-auth-api/c2;Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/c1;->a:Lcom/google/android/gms/internal/firebase-auth-api/ki;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/ki;->a(Ljava/lang/CharSequence;)Lcom/google/android/gms/internal/firebase-auth-api/lh;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/b0;

    invoke-direct {v1, p0, p1, p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/b0;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/c1;Lcom/google/android/gms/internal/firebase-auth-api/c2;Ljava/lang/CharSequence;Lcom/google/android/gms/internal/firebase-auth-api/lh;)V

    return-object v1
.end method
