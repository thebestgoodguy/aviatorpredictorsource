.class public final Lu/v;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/google/android/gms/common/api/internal/a0;

.field public final b:I

.field public final c:Lt/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt/e<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/a0;ILt/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/internal/a0;",
            "I",
            "Lt/e<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu/v;->a:Lcom/google/android/gms/common/api/internal/a0;

    iput p2, p0, Lu/v;->b:I

    iput-object p3, p0, Lu/v;->c:Lt/e;

    return-void
.end method
