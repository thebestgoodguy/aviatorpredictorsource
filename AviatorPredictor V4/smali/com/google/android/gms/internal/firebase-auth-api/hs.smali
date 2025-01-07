.class public Lcom/google/android/gms/internal/firebase-auth-api/hs;
.super Lcom/google/android/gms/internal/firebase-auth-api/qq;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/android/gms/internal/firebase-auth-api/ks<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lcom/google/android/gms/internal/firebase-auth-api/hs<",
        "TMessageType;TBuilderType;>;>",
        "Lcom/google/android/gms/internal/firebase-auth-api/qq<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# instance fields
.field private final e:Lcom/google/android/gms/internal/firebase-auth-api/ks;

.field protected f:Lcom/google/android/gms/internal/firebase-auth-api/ks;

.field protected g:Z


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/ks;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/qq;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->e:Lcom/google/android/gms/internal/firebase-auth-api/ks;

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->r(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/ks;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f:Lcom/google/android/gms/internal/firebase-auth-api/ks;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->g:Z

    return-void
.end method

.method private static final c(Lcom/google/android/gms/internal/firebase-auth-api/ks;Lcom/google/android/gms/internal/firebase-auth-api/ks;)V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/m0;->a()Lcom/google/android/gms/internal/firebase-auth-api/m0;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/m0;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/q0;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/q0;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final synthetic a()Lcom/google/android/gms/internal/firebase-auth-api/e0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->e:Lcom/google/android/gms/internal/firebase-auth-api/ks;

    return-object v0
.end method

.method protected final synthetic b(Lcom/google/android/gms/internal/firebase-auth-api/rq;)Lcom/google/android/gms/internal/firebase-auth-api/qq;
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/ks;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->e(Lcom/google/android/gms/internal/firebase-auth-api/ks;)Lcom/google/android/gms/internal/firebase-auth-api/hs;

    return-object p0
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->d()Lcom/google/android/gms/internal/firebase-auth-api/hs;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lcom/google/android/gms/internal/firebase-auth-api/hs;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->e:Lcom/google/android/gms/internal/firebase-auth-api/ks;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->r(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/hs;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->n()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->e(Lcom/google/android/gms/internal/firebase-auth-api/ks;)Lcom/google/android/gms/internal/firebase-auth-api/hs;

    return-object v0
.end method

.method public final e(Lcom/google/android/gms/internal/firebase-auth-api/ks;)Lcom/google/android/gms/internal/firebase-auth-api/hs;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->g:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->g:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f:Lcom/google/android/gms/internal/firebase-auth-api/ks;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->c(Lcom/google/android/gms/internal/firebase-auth-api/ks;Lcom/google/android/gms/internal/firebase-auth-api/ks;)V

    return-object p0
.end method

.method public final f()Lcom/google/android/gms/internal/firebase-auth-api/ks;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->n()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->o()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/h1;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/h1;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/e0;)V

    throw v1
.end method

.method public bridge synthetic i()Lcom/google/android/gms/internal/firebase-auth-api/e0;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->n()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object v0

    return-object v0
.end method

.method public n()Lcom/google/android/gms/internal/firebase-auth-api/ks;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->g:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f:Lcom/google/android/gms/internal/firebase-auth-api/ks;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f:Lcom/google/android/gms/internal/firebase-auth-api/ks;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/m0;->a()Lcom/google/android/gms/internal/firebase-auth-api/m0;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/m0;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/firebase-auth-api/q0;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/q0;->b(Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->g:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f:Lcom/google/android/gms/internal/firebase-auth-api/ks;

    return-object v0
.end method

.method protected o()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f:Lcom/google/android/gms/internal/firebase-auth-api/ks;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->r(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/ks;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f:Lcom/google/android/gms/internal/firebase-auth-api/ks;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->c(Lcom/google/android/gms/internal/firebase-auth-api/ks;Lcom/google/android/gms/internal/firebase-auth-api/ks;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f:Lcom/google/android/gms/internal/firebase-auth-api/ks;

    return-void
.end method
