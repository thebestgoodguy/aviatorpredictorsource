.class final Lcom/google/android/gms/internal/firebase-auth-api/ij;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/hn;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/firebase-auth-api/hn;

.field final synthetic b:Lcom/google/android/gms/internal/firebase-auth-api/jj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/jj;Lcom/google/android/gms/internal/firebase-auth-api/hn;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/ij;->b:Lcom/google/android/gms/internal/firebase-auth-api/jj;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/ij;->a:Lcom/google/android/gms/internal/firebase-auth-api/hn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/eq;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/ij;->b:Lcom/google/android/gms/internal/firebase-auth-api/jj;

    iget-object v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/jj;->c:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/jj;->b:Lcom/google/android/gms/internal/firebase-auth-api/am;

    invoke-static {v1, p1, v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/ik;->t(Lcom/google/android/gms/internal/firebase-auth-api/ik;Lcom/google/android/gms/internal/firebase-auth-api/eq;Lcom/google/android/gms/internal/firebase-auth-api/am;Lcom/google/android/gms/internal/firebase-auth-api/gn;)V

    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/ij;->a:Lcom/google/android/gms/internal/firebase-auth-api/hn;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/gn;->d(Ljava/lang/String;)V

    return-void
.end method
