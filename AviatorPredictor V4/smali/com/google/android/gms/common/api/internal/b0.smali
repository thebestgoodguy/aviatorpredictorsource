.class final Lcom/google/android/gms/common/api/internal/b0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:I

.field private final b:Ls/a;


# direct methods
.method constructor <init>(Ls/a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/b0;->b:Ls/a;

    iput p2, p0, Lcom/google/android/gms/common/api/internal/b0;->a:I

    return-void
.end method


# virtual methods
.method final a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/common/api/internal/b0;->a:I

    return v0
.end method

.method final b()Ls/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/b0;->b:Ls/a;

    return-object v0
.end method
