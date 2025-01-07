.class final Le;
.super Lah;


# instance fields
.field private final transient a:Lag;

.field private final transient b:Lad;


# direct methods
.method constructor <init>(Lag;Lad;)V
    .locals 0

    invoke-direct {p0}, Lah;-><init>()V

    iput-object p1, p0, Le;->a:Lag;

    iput-object p2, p0, Le;->b:Lad;

    return-void
.end method


# virtual methods
.method final a([Ljava/lang/Object;I)I
    .locals 1

    iget-object p2, p0, Le;->b:Lad;

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Laa;->a([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param

    iget-object v0, p0, Le;->a:Lag;

    invoke-virtual {v0, p1}, Lag;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final e()Li;
    .locals 2

    iget-object v0, p0, Le;->b:Lad;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lad;->a(I)Lj;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lad;
    .locals 1

    iget-object v0, p0, Le;->b:Lad;

    return-object v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    iget-object v0, p0, Le;->b:Lad;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lad;->a(I)Lj;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Le;->a:Lag;

    invoke-virtual {v0}, Lag;->size()I

    move-result v0

    return v0
.end method
