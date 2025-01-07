.class public interface abstract Lcom/google/android/gms/internal/firebase-auth-api/gm;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final b:Lz/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lz/a;

    const-string v1, "GetAuthDomainTaskResponseHandler"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "FirebaseAuth"

    invoke-direct {v0, v2, v1}, Lz/a;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/gm;->b:Lz/a;

    return-void
.end method


# virtual methods
.method public abstract a()Landroid/content/Context;
.end method

.method public abstract c(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
.end method

.method public abstract d(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract f(Ljava/net/URL;)Ljava/net/HttpURLConnection;
.end method

.method public abstract h(Ljava/lang/String;Lcom/google/android/gms/common/api/Status;)V
.end method

.method public abstract k(Landroid/net/Uri;Ljava/lang/String;)V
.end method
