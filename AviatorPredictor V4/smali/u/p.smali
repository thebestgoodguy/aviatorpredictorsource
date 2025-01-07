.class public final Lu/p;
.super Lu/m;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O::",
        "Lt/a$d;",
        ">",
        "Lu/m;"
    }
.end annotation


# instance fields
.field private final c:Lt/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt/e<",
            "TO;>;"
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/checker/initialization/qual/NotOnlyInitialized;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lt/e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt/e<",
            "TO;>;)V"
        }
    .end annotation

    const-string v0, "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method."

    invoke-direct {p0, v0}, Lu/m;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lu/p;->c:Lt/e;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/internal/b;)Lcom/google/android/gms/common/api/internal/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lt/a$b;",
            "R::",
            "Lt/k;",
            "T:",
            "Lcom/google/android/gms/common/api/internal/b<",
            "TR;TA;>;>(TT;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lu/p;->c:Lt/e;

    invoke-virtual {v0, p1}, Lt/e;->e(Lcom/google/android/gms/common/api/internal/b;)Lcom/google/android/gms/common/api/internal/b;

    move-result-object p1

    return-object p1
.end method

.method public final b()Landroid/os/Looper;
    .locals 1

    iget-object v0, p0, Lu/p;->c:Lt/e;

    invoke-virtual {v0}, Lt/e;->i()Landroid/os/Looper;

    move-result-object v0

    return-object v0
.end method
