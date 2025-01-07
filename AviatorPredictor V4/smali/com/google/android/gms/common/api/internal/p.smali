.class final Lcom/google/android/gms/common/api/internal/p;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lu/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu/b<",
            "*>;"
        }
    .end annotation
.end field

.field private final b:Ls/c;


# direct methods
.method synthetic constructor <init>(Lu/b;Ls/c;Lu/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/p;->a:Lu/b;

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/p;->b:Ls/c;

    return-void
.end method

.method static bridge synthetic a(Lcom/google/android/gms/common/api/internal/p;)Ls/c;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/common/api/internal/p;->b:Ls/c;

    return-object p0
.end method

.method static bridge synthetic b(Lcom/google/android/gms/common/api/internal/p;)Lu/b;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/common/api/internal/p;->a:Lu/b;

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    instance-of v1, p1, Lcom/google/android/gms/common/api/internal/p;

    if-eqz v1, :cond_0

    check-cast p1, Lcom/google/android/gms/common/api/internal/p;

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/p;->a:Lu/b;

    iget-object v2, p1, Lcom/google/android/gms/common/api/internal/p;->a:Lu/b;

    invoke-static {v1, v2}, Lw/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/p;->b:Ls/c;

    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/p;->b:Ls/c;

    invoke-static {v1, p1}, Lw/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/p;->a:Lu/b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/p;->b:Ls/c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Lw/p;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lw/p;->c(Ljava/lang/Object;)Lw/p$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/p;->a:Lu/b;

    const-string v2, "key"

    invoke-virtual {v0, v2, v1}, Lw/p$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lw/p$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/p;->b:Ls/c;

    const-string v2, "feature"

    invoke-virtual {v0, v2, v1}, Lw/p$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lw/p$a;

    move-result-object v0

    invoke-virtual {v0}, Lw/p$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
