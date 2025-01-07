.class public final synthetic Lcom/google/android/gms/internal/firebase-auth-api/dn;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lcom/google/android/gms/internal/firebase-auth-api/fn;

.field public final synthetic f:Lcom/google/android/gms/internal/firebase-auth-api/en;

.field public final synthetic g:Lo0/i;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/fn;Lcom/google/android/gms/internal/firebase-auth-api/en;Lo0/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/dn;->e:Lcom/google/android/gms/internal/firebase-auth-api/fn;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/dn;->f:Lcom/google/android/gms/internal/firebase-auth-api/en;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/dn;->g:Lo0/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/dn;->e:Lcom/google/android/gms/internal/firebase-auth-api/fn;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/dn;->f:Lcom/google/android/gms/internal/firebase-auth-api/en;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/dn;->g:Lo0/i;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/fn;->a:Lcom/google/android/gms/internal/firebase-auth-api/bm;

    invoke-interface {v1, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/en;->b(Lo0/i;Lcom/google/android/gms/internal/firebase-auth-api/bm;)V

    return-void
.end method
