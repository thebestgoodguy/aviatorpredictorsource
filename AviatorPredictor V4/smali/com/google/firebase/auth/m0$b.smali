.class public Lcom/google/firebase/auth/m0$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/auth/m0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;


# direct methods
.method synthetic constructor <init>(Ljava/lang/String;Lcom/google/firebase/auth/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/auth/m0$b;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/firebase/auth/h;
    .locals 9

    iget-object v1, p0, Lcom/google/firebase/auth/m0$b;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/firebase/auth/m0$b;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/firebase/auth/m0$b;->c:Ljava/lang/String;

    iget-object v7, p0, Lcom/google/firebase/auth/m0$b;->d:Ljava/lang/String;

    sget-object v0, Lcom/google/firebase/auth/n1;->CREATOR:Landroid/os/Parcelable$Creator;

    const-string v0, "Must specify a non-empty providerId"

    invoke-static {v1, v0}, Lw/r;->f(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Must specify an idToken or an accessToken."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    new-instance v8, Lcom/google/firebase/auth/n1;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/google/firebase/auth/n1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/cq;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v8
.end method

.method public b(Ljava/lang/String;)Lcom/google/firebase/auth/m0$b;
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/auth/m0$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/google/firebase/auth/m0$b;
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/auth/m0$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/auth/m0$b;
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/auth/m0$b;->b:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/firebase/auth/m0$b;->d:Ljava/lang/String;

    return-object p0
.end method
