.class final Lcom/google/android/gms/common/api/internal/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic e:I

.field final synthetic f:Lcom/google/android/gms/common/api/internal/o;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/o;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/l;->f:Lcom/google/android/gms/common/api/internal/o;

    iput p2, p0, Lcom/google/android/gms/common/api/internal/l;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/l;->f:Lcom/google/android/gms/common/api/internal/o;

    iget v1, p0, Lcom/google/android/gms/common/api/internal/l;->e:I

    invoke-static {v0, v1}, Lcom/google/android/gms/common/api/internal/o;->A(Lcom/google/android/gms/common/api/internal/o;I)V

    return-void
.end method
