.class final Li0/j$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk0/d$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li0/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private final e:Lcom/google/android/gms/common/api/Status;

.field private final f:Lk0/f;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;Lk0/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li0/j$a;->e:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Li0/j$a;->f:Lk0/f;

    return-void
.end method


# virtual methods
.method public final i0()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Li0/j$a;->e:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public final v()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li0/j$a;->f:Lk0/f;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lk0/f;->v()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
