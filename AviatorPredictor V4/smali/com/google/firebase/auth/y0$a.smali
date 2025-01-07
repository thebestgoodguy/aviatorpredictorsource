.class public Lcom/google/firebase/auth/y0$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/auth/y0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Landroid/net/Uri;

.field private c:Z

.field private d:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/firebase/auth/y0;
    .locals 5

    new-instance v0, Lcom/google/firebase/auth/y0;

    iget-object v1, p0, Lcom/google/firebase/auth/y0$a;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/firebase/auth/y0$a;->b:Landroid/net/Uri;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_0
    iget-boolean v3, p0, Lcom/google/firebase/auth/y0$a;->c:Z

    iget-boolean v4, p0, Lcom/google/firebase/auth/y0$a;->d:Z

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/firebase/auth/y0;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/google/firebase/auth/y0$a;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/firebase/auth/y0$a;->c:Z

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lcom/google/firebase/auth/y0$a;->a:Ljava/lang/String;

    :goto_0
    return-object p0
.end method

.method public c(Landroid/net/Uri;)Lcom/google/firebase/auth/y0$a;
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/firebase/auth/y0$a;->d:Z

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lcom/google/firebase/auth/y0$a;->b:Landroid/net/Uri;

    :goto_0
    return-object p0
.end method
