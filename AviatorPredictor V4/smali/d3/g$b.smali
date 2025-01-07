.class Ld3/g$b;
.super Lio/grpc/internal/t0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld3/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field private A:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lf3/d;",
            ">;"
        }
    .end annotation
.end field

.field private B:Lh4/c;

.field private C:Z

.field private D:Z

.field private E:Z

.field private F:I

.field private G:I

.field private final H:Ld3/b;

.field private final I:Ld3/p;

.field private final J:Ld3/h;

.field private K:Z

.field private final L:Lj3/d;

.field final synthetic M:Ld3/g;

.field private final y:I

.field private final z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ld3/g;ILio/grpc/internal/h2;Ljava/lang/Object;Ld3/b;Ld3/p;Ld3/h;ILjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ld3/g$b;->M:Ld3/g;

    invoke-static {p1}, Ld3/g;->D(Ld3/g;)Lio/grpc/internal/n2;

    move-result-object p1

    invoke-direct {p0, p2, p3, p1}, Lio/grpc/internal/t0;-><init>(ILio/grpc/internal/h2;Lio/grpc/internal/n2;)V

    new-instance p1, Lh4/c;

    invoke-direct {p1}, Lh4/c;-><init>()V

    iput-object p1, p0, Ld3/g$b;->B:Lh4/c;

    const/4 p1, 0x0

    iput-boolean p1, p0, Ld3/g$b;->C:Z

    iput-boolean p1, p0, Ld3/g$b;->D:Z

    iput-boolean p1, p0, Ld3/g$b;->E:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Ld3/g$b;->K:Z

    const-string p1, "lock"

    invoke-static {p4, p1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Ld3/g$b;->z:Ljava/lang/Object;

    iput-object p5, p0, Ld3/g$b;->H:Ld3/b;

    iput-object p6, p0, Ld3/g$b;->I:Ld3/p;

    iput-object p7, p0, Ld3/g$b;->J:Ld3/h;

    iput p8, p0, Ld3/g$b;->F:I

    iput p8, p0, Ld3/g$b;->G:I

    iput p8, p0, Ld3/g$b;->y:I

    invoke-static {p9}, Lj3/c;->a(Ljava/lang/String;)Lj3/d;

    move-result-object p1

    iput-object p1, p0, Ld3/g$b;->L:Lj3/d;

    return-void
.end method

.method static synthetic W(Ld3/g$b;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Ld3/g$b;->z:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic X(Ld3/g$b;Lb3/u0;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ld3/g$b;->e0(Lb3/u0;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic Y(Ld3/g$b;Lh4/c;ZZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ld3/g$b;->c0(Lh4/c;ZZ)V

    return-void
.end method

.method static synthetic Z(Ld3/g$b;Lb3/f1;ZLb3/u0;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ld3/g$b;->a0(Lb3/f1;ZLb3/u0;)V

    return-void
.end method

.method private a0(Lb3/f1;ZLb3/u0;)V
    .locals 8

    iget-boolean v0, p0, Ld3/g$b;->E:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Ld3/g$b;->E:Z

    iget-boolean v1, p0, Ld3/g$b;->K:Z

    if-eqz v1, :cond_2

    iget-object p2, p0, Ld3/g$b;->J:Ld3/h;

    iget-object v1, p0, Ld3/g$b;->M:Ld3/g;

    invoke-virtual {p2, v1}, Ld3/h;->j0(Ld3/g;)V

    const/4 p2, 0x0

    iput-object p2, p0, Ld3/g$b;->A:Ljava/util/List;

    iget-object p2, p0, Ld3/g$b;->B:Lh4/c;

    invoke-virtual {p2}, Lh4/c;->d()V

    const/4 p2, 0x0

    iput-boolean p2, p0, Ld3/g$b;->K:Z

    if-eqz p3, :cond_1

    goto :goto_0

    :cond_1
    new-instance p3, Lb3/u0;

    invoke-direct {p3}, Lb3/u0;-><init>()V

    :goto_0
    invoke-virtual {p0, p1, v0, p3}, Lio/grpc/internal/a$c;->N(Lb3/f1;ZLb3/u0;)V

    goto :goto_1

    :cond_2
    iget-object v1, p0, Ld3/g$b;->J:Ld3/h;

    iget-object v0, p0, Ld3/g$b;->M:Ld3/g;

    invoke-virtual {v0}, Ld3/g;->Q()I

    move-result v2

    sget-object v4, Lio/grpc/internal/r$a;->e:Lio/grpc/internal/r$a;

    sget-object v6, Lf3/a;->s:Lf3/a;

    move-object v3, p1

    move v5, p2

    move-object v7, p3

    invoke-virtual/range {v1 .. v7}, Ld3/h;->U(ILb3/f1;Lio/grpc/internal/r$a;ZLf3/a;Lb3/u0;)V

    :goto_1
    return-void
.end method

.method private b0()V
    .locals 15

    invoke-virtual {p0}, Lio/grpc/internal/a$c;->G()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v1, p0, Ld3/g$b;->J:Ld3/h;

    iget-object v0, p0, Ld3/g$b;->M:Ld3/g;

    invoke-virtual {v0}, Ld3/g;->Q()I

    move-result v2

    const/4 v3, 0x0

    sget-object v4, Lio/grpc/internal/r$a;->e:Lio/grpc/internal/r$a;

    const/4 v5, 0x0

    sget-object v6, Lf3/a;->s:Lf3/a;

    const/4 v7, 0x0

    invoke-virtual/range {v1 .. v7}, Ld3/h;->U(ILb3/f1;Lio/grpc/internal/r$a;ZLf3/a;Lb3/u0;)V

    goto :goto_0

    :cond_0
    iget-object v8, p0, Ld3/g$b;->J:Ld3/h;

    iget-object v0, p0, Ld3/g$b;->M:Ld3/g;

    invoke-virtual {v0}, Ld3/g;->Q()I

    move-result v9

    const/4 v10, 0x0

    sget-object v11, Lio/grpc/internal/r$a;->e:Lio/grpc/internal/r$a;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-virtual/range {v8 .. v14}, Ld3/h;->U(ILb3/f1;Lio/grpc/internal/r$a;ZLf3/a;Lb3/u0;)V

    :goto_0
    return-void
.end method

.method private c0(Lh4/c;ZZ)V
    .locals 3

    iget-boolean v0, p0, Ld3/g$b;->E:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Ld3/g$b;->K:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lh4/c;->i0()J

    move-result-wide v0

    long-to-int v1, v0

    iget-object v0, p0, Ld3/g$b;->B:Lh4/c;

    int-to-long v1, v1

    invoke-virtual {v0, p1, v1, v2}, Lh4/c;->w(Lh4/c;J)V

    iget-boolean p1, p0, Ld3/g$b;->C:Z

    or-int/2addr p1, p2

    iput-boolean p1, p0, Ld3/g$b;->C:Z

    iget-boolean p1, p0, Ld3/g$b;->D:Z

    or-int/2addr p1, p3

    iput-boolean p1, p0, Ld3/g$b;->D:Z

    goto :goto_1

    :cond_1
    iget-object v0, p0, Ld3/g$b;->M:Ld3/g;

    invoke-virtual {v0}, Ld3/g;->Q()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    const-string v1, "streamId should be set"

    invoke-static {v0, v1}, Lq0/l;->u(ZLjava/lang/Object;)V

    iget-object v0, p0, Ld3/g$b;->I:Ld3/p;

    iget-object v1, p0, Ld3/g$b;->M:Ld3/g;

    invoke-virtual {v1}, Ld3/g;->Q()I

    move-result v1

    invoke-virtual {v0, p2, v1, p1, p3}, Ld3/p;->c(ZILh4/c;Z)V

    :goto_1
    return-void
.end method

.method private e0(Lb3/u0;Ljava/lang/String;)V
    .locals 7

    iget-object v0, p0, Ld3/g$b;->M:Ld3/g;

    invoke-static {v0}, Ld3/g;->I(Ld3/g;)Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Ld3/g$b;->M:Ld3/g;

    invoke-static {v0}, Ld3/g;->J(Ld3/g;)Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Ld3/g$b;->M:Ld3/g;

    invoke-static {v0}, Ld3/g;->C(Ld3/g;)Z

    move-result v5

    iget-object v0, p0, Ld3/g$b;->J:Ld3/h;

    invoke-virtual {v0}, Ld3/h;->d0()Z

    move-result v6

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v1 .. v6}, Ld3/c;->a(Lb3/u0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ld3/g$b;->A:Ljava/util/List;

    iget-object p1, p0, Ld3/g$b;->J:Ld3/h;

    iget-object p2, p0, Ld3/g$b;->M:Ld3/g;

    invoke-virtual {p1, p2}, Ld3/h;->q0(Ld3/g;)V

    return-void
.end method


# virtual methods
.method protected P(Lb3/f1;ZLb3/u0;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ld3/g$b;->a0(Lb3/f1;ZLb3/u0;)V

    return-void
.end method

.method public b(Ljava/lang/Throwable;)V
    .locals 2

    invoke-static {p1}, Lb3/f1;->k(Ljava/lang/Throwable;)Lb3/f1;

    move-result-object p1

    new-instance v0, Lb3/u0;

    invoke-direct {v0}, Lb3/u0;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v1, v0}, Ld3/g$b;->P(Lb3/f1;ZLb3/u0;)V

    return-void
.end method

.method public c(Z)V
    .locals 0

    invoke-direct {p0}, Ld3/g$b;->b0()V

    invoke-super {p0, p1}, Lio/grpc/internal/t0;->c(Z)V

    return-void
.end method

.method public d(I)V
    .locals 4

    iget v0, p0, Ld3/g$b;->G:I

    sub-int/2addr v0, p1

    iput v0, p0, Ld3/g$b;->G:I

    int-to-float p1, v0

    iget v1, p0, Ld3/g$b;->y:I

    int-to-float v2, v1

    const/high16 v3, 0x3f000000    # 0.5f

    mul-float v2, v2, v3

    cmpg-float p1, p1, v2

    if-gtz p1, :cond_0

    sub-int/2addr v1, v0

    iget p1, p0, Ld3/g$b;->F:I

    add-int/2addr p1, v1

    iput p1, p0, Ld3/g$b;->F:I

    add-int/2addr v0, v1

    iput v0, p0, Ld3/g$b;->G:I

    iget-object p1, p0, Ld3/g$b;->H:Ld3/b;

    iget-object v0, p0, Ld3/g$b;->M:Ld3/g;

    invoke-virtual {v0}, Ld3/g;->Q()I

    move-result v0

    int-to-long v1, v1

    invoke-virtual {p1, v0, v1, v2}, Ld3/b;->f(IJ)V

    :cond_0
    return-void
.end method

.method public d0(I)V
    .locals 8

    iget-object v0, p0, Ld3/g$b;->M:Ld3/g;

    invoke-static {v0}, Ld3/g;->F(Ld3/g;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v2, "the stream has been started with id %s"

    invoke-static {v0, v2, p1}, Lq0/l;->v(ZLjava/lang/String;I)V

    iget-object v0, p0, Ld3/g$b;->M:Ld3/g;

    invoke-static {v0, p1}, Ld3/g;->G(Ld3/g;I)I

    iget-object p1, p0, Ld3/g$b;->M:Ld3/g;

    invoke-static {p1}, Ld3/g;->K(Ld3/g;)Ld3/g$b;

    move-result-object p1

    invoke-virtual {p1}, Ld3/g$b;->r()V

    iget-boolean p1, p0, Ld3/g$b;->K:Z

    if-eqz p1, :cond_2

    iget-object v2, p0, Ld3/g$b;->H:Ld3/b;

    iget-object p1, p0, Ld3/g$b;->M:Ld3/g;

    invoke-static {p1}, Ld3/g;->C(Ld3/g;)Z

    move-result v3

    const/4 v4, 0x0

    iget-object p1, p0, Ld3/g$b;->M:Ld3/g;

    invoke-static {p1}, Ld3/g;->F(Ld3/g;)I

    move-result v5

    const/4 v6, 0x0

    iget-object v7, p0, Ld3/g$b;->A:Ljava/util/List;

    invoke-virtual/range {v2 .. v7}, Ld3/b;->O(ZZIILjava/util/List;)V

    iget-object p1, p0, Ld3/g$b;->M:Ld3/g;

    invoke-static {p1}, Ld3/g;->H(Ld3/g;)Lio/grpc/internal/h2;

    move-result-object p1

    invoke-virtual {p1}, Lio/grpc/internal/h2;->c()V

    const/4 p1, 0x0

    iput-object p1, p0, Ld3/g$b;->A:Ljava/util/List;

    iget-object p1, p0, Ld3/g$b;->B:Lh4/c;

    invoke-virtual {p1}, Lh4/c;->i0()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long p1, v2, v4

    if-lez p1, :cond_1

    iget-object p1, p0, Ld3/g$b;->I:Ld3/p;

    iget-boolean v0, p0, Ld3/g$b;->C:Z

    iget-object v2, p0, Ld3/g$b;->M:Ld3/g;

    invoke-static {v2}, Ld3/g;->F(Ld3/g;)I

    move-result v2

    iget-object v3, p0, Ld3/g$b;->B:Lh4/c;

    iget-boolean v4, p0, Ld3/g$b;->D:Z

    invoke-virtual {p1, v0, v2, v3, v4}, Ld3/p;->c(ZILh4/c;Z)V

    :cond_1
    iput-boolean v1, p0, Ld3/g$b;->K:Z

    :cond_2
    return-void
.end method

.method public e(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Ld3/g$b;->z:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method f0()Lj3/d;
    .locals 1

    iget-object v0, p0, Ld3/g$b;->L:Lj3/d;

    return-object v0
.end method

.method public g0(Lh4/c;Z)V
    .locals 8

    invoke-virtual {p1}, Lh4/c;->i0()J

    move-result-wide v0

    long-to-int v1, v0

    iget v0, p0, Ld3/g$b;->F:I

    sub-int/2addr v0, v1

    iput v0, p0, Ld3/g$b;->F:I

    if-gez v0, :cond_0

    iget-object p1, p0, Ld3/g$b;->H:Ld3/b;

    iget-object p2, p0, Ld3/g$b;->M:Ld3/g;

    invoke-virtual {p2}, Ld3/g;->Q()I

    move-result p2

    sget-object v0, Lf3/a;->o:Lf3/a;

    invoke-virtual {p1, p2, v0}, Ld3/b;->c(ILf3/a;)V

    iget-object v1, p0, Ld3/g$b;->J:Ld3/h;

    iget-object p1, p0, Ld3/g$b;->M:Ld3/g;

    invoke-virtual {p1}, Ld3/g;->Q()I

    move-result v2

    sget-object p1, Lb3/f1;->t:Lb3/f1;

    const-string p2, "Received data size exceeded our receiving window size"

    invoke-virtual {p1, p2}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object v3

    sget-object v4, Lio/grpc/internal/r$a;->e:Lio/grpc/internal/r$a;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v1 .. v7}, Ld3/h;->U(ILb3/f1;Lio/grpc/internal/r$a;ZLf3/a;Lb3/u0;)V

    return-void

    :cond_0
    new-instance v0, Ld3/k;

    invoke-direct {v0, p1}, Ld3/k;-><init>(Lh4/c;)V

    invoke-super {p0, v0, p2}, Lio/grpc/internal/t0;->S(Lio/grpc/internal/u1;Z)V

    return-void
.end method

.method public h0(Ljava/util/List;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lf3/d;",
            ">;Z)V"
        }
    .end annotation

    if-eqz p2, :cond_0

    invoke-static {p1}, Ld3/q;->c(Ljava/util/List;)Lb3/u0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/grpc/internal/t0;->U(Lb3/u0;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ld3/q;->a(Ljava/util/List;)Lb3/u0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/grpc/internal/t0;->T(Lb3/u0;)V

    :goto_0
    return-void
.end method

.method protected r()V
    .locals 1

    invoke-super {p0}, Lio/grpc/internal/d$a;->r()V

    invoke-virtual {p0}, Lio/grpc/internal/d$a;->l()Lio/grpc/internal/n2;

    move-result-object v0

    invoke-virtual {v0}, Lio/grpc/internal/n2;->c()V

    return-void
.end method
