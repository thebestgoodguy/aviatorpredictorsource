.class public final synthetic Lcom/google/android/gms/internal/firebase-auth-api/sn;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lcom/google/android/gms/internal/firebase-auth-api/xn;

.field public final synthetic f:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/xn;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/sn;->e:Lcom/google/android/gms/internal/firebase-auth-api/xn;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/sn;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/sn;->e:Lcom/google/android/gms/internal/firebase-auth-api/xn;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/sn;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/xn;->h(Ljava/lang/String;)V

    return-void
.end method
