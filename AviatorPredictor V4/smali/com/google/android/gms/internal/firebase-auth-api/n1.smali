.class public final Lcom/google/android/gms/internal/firebase-auth-api/n1;
.super Ljava/util/AbstractList;
.source ""

# interfaces
.implements Ljava/util/RandomAccess;
.implements Lcom/google/android/gms/internal/firebase-auth-api/l;


# instance fields
.field private final e:Lcom/google/android/gms/internal/firebase-auth-api/l;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/n1;->e:Lcom/google/android/gms/internal/firebase-auth-api/l;

    return-void
.end method

.method static bridge synthetic i(Lcom/google/android/gms/internal/firebase-auth-api/n1;)Lcom/google/android/gms/internal/firebase-auth-api/l;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/firebase-auth-api/n1;->e:Lcom/google/android/gms/internal/firebase-auth-api/l;

    return-object p0
.end method


# virtual methods
.method public final d()Lcom/google/android/gms/internal/firebase-auth-api/l;
    .locals 0

    return-object p0
.end method

.method public final f()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/n1;->e:Lcom/google/android/gms/internal/firebase-auth-api/l;

    invoke-interface {v0}, Lcom/google/android/gms/internal/firebase-auth-api/l;->f()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final g(Lcom/google/android/gms/internal/firebase-auth-api/hr;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/n1;->e:Lcom/google/android/gms/internal/firebase-auth-api/l;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/k;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/k;->p(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/m1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/m1;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/n1;)V

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/l1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/l1;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/n1;I)V

    return-object v0
.end method

.method public final o(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/n1;->e:Lcom/google/android/gms/internal/firebase-auth-api/l;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/l;->o(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/n1;->e:Lcom/google/android/gms/internal/firebase-auth-api/l;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
