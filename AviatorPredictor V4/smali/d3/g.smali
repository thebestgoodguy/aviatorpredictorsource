.class Ld3/g;
.super Lio/grpc/internal/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld3/g$b;,
        Ld3/g$a;
    }
.end annotation


# static fields
.field private static final r:Lh4/c;


# instance fields
.field private final h:Lb3/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/v0<",
            "**>;"
        }
    .end annotation
.end field

.field private final i:Ljava/lang/String;

.field private final j:Lio/grpc/internal/h2;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/Object;

.field private volatile m:I

.field private final n:Ld3/g$b;

.field private final o:Ld3/g$a;

.field private final p:Lb3/a;

.field private q:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lh4/c;

    invoke-direct {v0}, Lh4/c;-><init>()V

    sput-object v0, Ld3/g;->r:Lh4/c;

    return-void
.end method

.method constructor <init>(Lb3/v0;Lb3/u0;Ld3/b;Ld3/h;Ld3/p;Ljava/lang/Object;IILjava/lang/String;Ljava/lang/String;Lio/grpc/internal/h2;Lio/grpc/internal/n2;Lb3/c;Z)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb3/v0<",
            "**>;",
            "Lb3/u0;",
            "Ld3/b;",
            "Ld3/h;",
            "Ld3/p;",
            "Ljava/lang/Object;",
            "II",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/grpc/internal/h2;",
            "Lio/grpc/internal/n2;",
            "Lb3/c;",
            "Z)V"
        }
    .end annotation

    move-object v10, p0

    new-instance v1, Ld3/o;

    invoke-direct {v1}, Ld3/o;-><init>()V

    const/4 v7, 0x0

    if-eqz p14, :cond_0

    invoke-virtual {p1}, Lb3/v0;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    :goto_0
    move-object v0, p0

    move-object/from16 v2, p11

    move-object/from16 v3, p12

    move-object v4, p2

    move-object/from16 v5, p13

    invoke-direct/range {v0 .. v6}, Lio/grpc/internal/a;-><init>(Lio/grpc/internal/p2;Lio/grpc/internal/h2;Lio/grpc/internal/n2;Lb3/u0;Lb3/c;Z)V

    const/4 v0, -0x1

    iput v0, v10, Ld3/g;->m:I

    new-instance v0, Ld3/g$a;

    invoke-direct {v0, p0}, Ld3/g$a;-><init>(Ld3/g;)V

    iput-object v0, v10, Ld3/g;->o:Ld3/g$a;

    iput-boolean v7, v10, Ld3/g;->q:Z

    const-string v0, "statsTraceCtx"

    move-object/from16 v3, p11

    invoke-static {v3, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/grpc/internal/h2;

    iput-object v0, v10, Ld3/g;->j:Lio/grpc/internal/h2;

    move-object v0, p1

    iput-object v0, v10, Ld3/g;->h:Lb3/v0;

    move-object/from16 v1, p9

    iput-object v1, v10, Ld3/g;->k:Ljava/lang/String;

    move-object/from16 v1, p10

    iput-object v1, v10, Ld3/g;->i:Ljava/lang/String;

    invoke-virtual/range {p4 .. p4}, Ld3/h;->W()Lb3/a;

    move-result-object v1

    iput-object v1, v10, Ld3/g;->p:Lb3/a;

    new-instance v11, Ld3/g$b;

    invoke-virtual {p1}, Lb3/v0;->c()Ljava/lang/String;

    move-result-object v9

    move-object v0, v11

    move-object v1, p0

    move/from16 v2, p7

    move-object/from16 v4, p6

    move-object v5, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p4

    move/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Ld3/g$b;-><init>(Ld3/g;ILio/grpc/internal/h2;Ljava/lang/Object;Ld3/b;Ld3/p;Ld3/h;ILjava/lang/String;)V

    iput-object v11, v10, Ld3/g;->n:Ld3/g$b;

    return-void
.end method

.method static synthetic B(Ld3/g;)Lb3/v0;
    .locals 0

    iget-object p0, p0, Ld3/g;->h:Lb3/v0;

    return-object p0
.end method

.method static synthetic C(Ld3/g;)Z
    .locals 0

    iget-boolean p0, p0, Ld3/g;->q:Z

    return p0
.end method

.method static synthetic D(Ld3/g;)Lio/grpc/internal/n2;
    .locals 0

    invoke-virtual {p0}, Lio/grpc/internal/a;->x()Lio/grpc/internal/n2;

    move-result-object p0

    return-object p0
.end method

.method static synthetic E(Ld3/g;Z)Z
    .locals 0

    iput-boolean p1, p0, Ld3/g;->q:Z

    return p1
.end method

.method static synthetic F(Ld3/g;)I
    .locals 0

    iget p0, p0, Ld3/g;->m:I

    return p0
.end method

.method static synthetic G(Ld3/g;I)I
    .locals 0

    iput p1, p0, Ld3/g;->m:I

    return p1
.end method

.method static synthetic H(Ld3/g;)Lio/grpc/internal/h2;
    .locals 0

    iget-object p0, p0, Ld3/g;->j:Lio/grpc/internal/h2;

    return-object p0
.end method

.method static synthetic I(Ld3/g;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ld3/g;->k:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic J(Ld3/g;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ld3/g;->i:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic K(Ld3/g;)Ld3/g$b;
    .locals 0

    iget-object p0, p0, Ld3/g;->n:Ld3/g$b;

    return-object p0
.end method

.method static synthetic L()Lh4/c;
    .locals 1

    sget-object v0, Ld3/g;->r:Lh4/c;

    return-object v0
.end method

.method static synthetic M(Ld3/g;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lio/grpc/internal/d;->t(I)V

    return-void
.end method

.method static synthetic N(Ld3/g;)Lio/grpc/internal/n2;
    .locals 0

    invoke-virtual {p0}, Lio/grpc/internal/a;->x()Lio/grpc/internal/n2;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected A()Ld3/g$a;
    .locals 1

    iget-object v0, p0, Ld3/g;->o:Ld3/g$a;

    return-object v0
.end method

.method O()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ld3/g;->l:Ljava/lang/Object;

    return-object v0
.end method

.method public P()Lb3/v0$d;
    .locals 1

    iget-object v0, p0, Ld3/g;->h:Lb3/v0;

    invoke-virtual {v0}, Lb3/v0;->e()Lb3/v0$d;

    move-result-object v0

    return-object v0
.end method

.method public Q()I
    .locals 1

    iget v0, p0, Ld3/g;->m:I

    return v0
.end method

.method R(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Ld3/g;->l:Ljava/lang/Object;

    return-void
.end method

.method protected S()Ld3/g$b;
    .locals 1

    iget-object v0, p0, Ld3/g;->n:Ld3/g$b;

    return-object v0
.end method

.method T()Z
    .locals 1

    iget-boolean v0, p0, Ld3/g;->q:Z

    return v0
.end method

.method public j(Ljava/lang/String;)V
    .locals 1

    const-string v0, "authority"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Ld3/g;->k:Ljava/lang/String;

    return-void
.end method

.method public p()Lb3/a;
    .locals 1

    iget-object v0, p0, Ld3/g;->p:Lb3/a;

    return-object v0
.end method

.method protected bridge synthetic u()Lio/grpc/internal/d$a;
    .locals 1

    invoke-virtual {p0}, Ld3/g;->S()Ld3/g$b;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic v()Lio/grpc/internal/a$b;
    .locals 1

    invoke-virtual {p0}, Ld3/g;->A()Ld3/g$a;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic z()Lio/grpc/internal/a$c;
    .locals 1

    invoke-virtual {p0}, Ld3/g;->S()Ld3/g$b;

    move-result-object v0

    return-object v0
.end method
