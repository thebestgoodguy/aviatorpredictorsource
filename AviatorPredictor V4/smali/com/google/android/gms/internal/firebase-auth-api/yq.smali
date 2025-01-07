.class final Lcom/google/android/gms/internal/firebase-auth-api/yq;
.super Lcom/google/android/gms/internal/firebase-auth-api/ar;
.source ""


# instance fields
.field private e:I

.field private final f:I

.field final synthetic g:Lcom/google/android/gms/internal/firebase-auth-api/hr;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/hr;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/yq;->g:Lcom/google/android/gms/internal/firebase-auth-api/hr;

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/ar;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/yq;->e:I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->q()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/yq;->f:I

    return-void
.end method


# virtual methods
.method public final a()B
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/yq;->e:I

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/yq;->f:I

    if-ge v0, v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/yq;->e:I

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/yq;->g:Lcom/google/android/gms/internal/firebase-auth-api/hr;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->p(I)B

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final hasNext()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/yq;->e:I

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/yq;->f:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
