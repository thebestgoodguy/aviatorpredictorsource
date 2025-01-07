.class final Lcom/google/android/gms/internal/firebase-auth-api/tn;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo0/e;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/xn;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Exception;)V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/xn;->a()Lz/a;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "SmsRetrieverClient failed to start: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, Lz/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
