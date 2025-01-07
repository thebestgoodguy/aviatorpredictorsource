.class Lj1/d$a;
.super Lj1/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lj1/d;


# direct methods
.method constructor <init>(Lj1/d;)V
    .locals 0

    iput-object p1, p0, Lj1/d$a;->a:Lj1/d;

    invoke-direct {p0}, Lj1/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/protobuf/j;)V
    .locals 1

    iget-object v0, p0, Lj1/d$a;->a:Lj1/d;

    invoke-static {v0}, Lj1/d;->a(Lj1/d;)Lj1/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lj1/g;->h(Lcom/google/protobuf/j;)V

    return-void
.end method

.method public b(D)V
    .locals 1

    iget-object v0, p0, Lj1/d$a;->a:Lj1/d;

    invoke-static {v0}, Lj1/d;->a(Lj1/d;)Lj1/g;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lj1/g;->j(D)V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lj1/d$a;->a:Lj1/d;

    invoke-static {v0}, Lj1/d;->a(Lj1/d;)Lj1/g;

    move-result-object v0

    invoke-virtual {v0}, Lj1/g;->n()V

    return-void
.end method

.method public d(J)V
    .locals 1

    iget-object v0, p0, Lj1/d$a;->a:Lj1/d;

    invoke-static {v0}, Lj1/d;->a(Lj1/d;)Lj1/g;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lj1/g;->r(J)V

    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lj1/d$a;->a:Lj1/d;

    invoke-static {v0}, Lj1/d;->a(Lj1/d;)Lj1/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lj1/g;->v(Ljava/lang/CharSequence;)V

    return-void
.end method
