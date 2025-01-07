.class Lcom/google/firebase/auth/b2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La1/v0;


# instance fields
.field final synthetic a:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/auth/b2;->a:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Lcom/google/android/gms/internal/firebase-auth-api/bp;Lcom/google/firebase/auth/z;)V
    .locals 2

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2, p1}, Lcom/google/firebase/auth/z;->J0(Lcom/google/android/gms/internal/firebase-auth-api/bp;)V

    iget-object v0, p0, Lcom/google/firebase/auth/b2;->a:Lcom/google/firebase/auth/FirebaseAuth;

    const/4 v1, 0x1

    invoke-virtual {v0, p2, p1, v1}, Lcom/google/firebase/auth/FirebaseAuth;->L(Lcom/google/firebase/auth/z;Lcom/google/android/gms/internal/firebase-auth-api/bp;Z)V

    return-void
.end method
