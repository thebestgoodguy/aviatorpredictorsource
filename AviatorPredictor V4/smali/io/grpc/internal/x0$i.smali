.class final Lio/grpc/internal/x0$i;
.super Lio/grpc/internal/j0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/x0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "i"
.end annotation


# instance fields
.field private final a:Lio/grpc/internal/v;

.field private final b:Lio/grpc/internal/m;


# direct methods
.method private constructor <init>(Lio/grpc/internal/v;Lio/grpc/internal/m;)V
    .locals 0

    invoke-direct {p0}, Lio/grpc/internal/j0;-><init>()V

    iput-object p1, p0, Lio/grpc/internal/x0$i;->a:Lio/grpc/internal/v;

    iput-object p2, p0, Lio/grpc/internal/x0$i;->b:Lio/grpc/internal/m;

    return-void
.end method

.method synthetic constructor <init>(Lio/grpc/internal/v;Lio/grpc/internal/m;Lio/grpc/internal/x0$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/grpc/internal/x0$i;-><init>(Lio/grpc/internal/v;Lio/grpc/internal/m;)V

    return-void
.end method

.method static synthetic h(Lio/grpc/internal/x0$i;)Lio/grpc/internal/m;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/x0$i;->b:Lio/grpc/internal/m;

    return-object p0
.end method


# virtual methods
.method protected b()Lio/grpc/internal/v;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/x0$i;->a:Lio/grpc/internal/v;

    return-object v0
.end method

.method public c(Lb3/v0;Lb3/u0;Lb3/c;[Lb3/k;)Lio/grpc/internal/q;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb3/v0<",
            "**>;",
            "Lb3/u0;",
            "Lb3/c;",
            "[",
            "Lb3/k;",
            ")",
            "Lio/grpc/internal/q;"
        }
    .end annotation

    invoke-super {p0, p1, p2, p3, p4}, Lio/grpc/internal/j0;->c(Lb3/v0;Lb3/u0;Lb3/c;[Lb3/k;)Lio/grpc/internal/q;

    move-result-object p1

    new-instance p2, Lio/grpc/internal/x0$i$a;

    invoke-direct {p2, p0, p1}, Lio/grpc/internal/x0$i$a;-><init>(Lio/grpc/internal/x0$i;Lio/grpc/internal/q;)V

    return-object p2
.end method
