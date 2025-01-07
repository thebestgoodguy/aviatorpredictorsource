.class final Lcom/google/android/gms/internal/firebase-auth-api/g2;
.super Lcom/google/android/gms/internal/firebase-auth-api/e2;
.source ""


# instance fields
.field private final g:Lcom/google/android/gms/internal/firebase-auth-api/i2;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/i2;I)V
    .locals 1

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/e2;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/g2;->g:Lcom/google/android/gms/internal/firebase-auth-api/i2;

    return-void
.end method


# virtual methods
.method protected final c(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/g2;->g:Lcom/google/android/gms/internal/firebase-auth-api/i2;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
