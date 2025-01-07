.class public abstract Lcom/google/protobuf/a0$a;
.super Lcom/google/protobuf/a$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/protobuf/a0<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lcom/google/protobuf/a0$a<",
        "TMessageType;TBuilderType;>;>",
        "Lcom/google/protobuf/a$a<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# instance fields
.field private final e:Lcom/google/protobuf/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TMessageType;"
        }
    .end annotation
.end field

.field protected f:Lcom/google/protobuf/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TMessageType;"
        }
    .end annotation
.end field

.field protected g:Z


# direct methods
.method protected constructor <init>(Lcom/google/protobuf/a0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/protobuf/a$a;-><init>()V

    iput-object p1, p0, Lcom/google/protobuf/a0$a;->e:Lcom/google/protobuf/a0;

    sget-object v0, Lcom/google/protobuf/a0$f;->h:Lcom/google/protobuf/a0$f;

    invoke-virtual {p1, v0}, Lcom/google/protobuf/a0;->w(Lcom/google/protobuf/a0$f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/protobuf/a0;

    iput-object p1, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/protobuf/a0$a;->g:Z

    return-void
.end method

.method private A(Lcom/google/protobuf/a0;Lcom/google/protobuf/a0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;TMessageType;)V"
        }
    .end annotation

    invoke-static {}, Lcom/google/protobuf/i1;->a()Lcom/google/protobuf/i1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/protobuf/i1;->e(Ljava/lang/Object;)Lcom/google/protobuf/n1;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/n1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic K()Lcom/google/protobuf/v0;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->s()Lcom/google/protobuf/a0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->u()Lcom/google/protobuf/a0$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d()Lcom/google/protobuf/v0;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->x()Lcom/google/protobuf/a0;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic o(Lcom/google/protobuf/a;)Lcom/google/protobuf/a$a;
    .locals 0

    check-cast p1, Lcom/google/protobuf/a0;

    invoke-virtual {p0, p1}, Lcom/google/protobuf/a0$a;->y(Lcom/google/protobuf/a0;)Lcom/google/protobuf/a0$a;

    move-result-object p1

    return-object p1
.end method

.method public final r()Lcom/google/protobuf/a0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->s()Lcom/google/protobuf/a0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/a0;->j()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lcom/google/protobuf/a$a;->q(Lcom/google/protobuf/v0;)Lcom/google/protobuf/u1;

    move-result-object v0

    throw v0
.end method

.method public s()Lcom/google/protobuf/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/protobuf/a0$a;->g:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    invoke-virtual {v0}, Lcom/google/protobuf/a0;->G()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/protobuf/a0$a;->g:Z

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    return-object v0
.end method

.method public bridge synthetic t()Lcom/google/protobuf/v0;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object v0

    return-object v0
.end method

.method public u()Lcom/google/protobuf/a0$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TBuilderType;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->x()Lcom/google/protobuf/a0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/a0;->I()Lcom/google/protobuf/a0$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->s()Lcom/google/protobuf/a0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/a0$a;->z(Lcom/google/protobuf/a0;)Lcom/google/protobuf/a0$a;

    return-object v0
.end method

.method protected final v()V
    .locals 1

    iget-boolean v0, p0, Lcom/google/protobuf/a0$a;->g:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->w()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/protobuf/a0$a;->g:Z

    :cond_0
    return-void
.end method

.method protected w()V
    .locals 2

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    sget-object v1, Lcom/google/protobuf/a0$f;->h:Lcom/google/protobuf/a0$f;

    invoke-virtual {v0, v1}, Lcom/google/protobuf/a0;->w(Lcom/google/protobuf/a0$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/a0;

    iget-object v1, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    invoke-direct {p0, v0, v1}, Lcom/google/protobuf/a0$a;->A(Lcom/google/protobuf/a0;Lcom/google/protobuf/a0;)V

    iput-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    return-void
.end method

.method public x()Lcom/google/protobuf/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->e:Lcom/google/protobuf/a0;

    return-object v0
.end method

.method protected y(Lcom/google/protobuf/a0;)Lcom/google/protobuf/a0$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)TBuilderType;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/protobuf/a0$a;->z(Lcom/google/protobuf/a0;)Lcom/google/protobuf/a0$a;

    move-result-object p1

    return-object p1
.end method

.method public z(Lcom/google/protobuf/a0;)Lcom/google/protobuf/a0$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)TBuilderType;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    invoke-direct {p0, v0, p1}, Lcom/google/protobuf/a0$a;->A(Lcom/google/protobuf/a0;Lcom/google/protobuf/a0;)V

    return-object p0
.end method
