.class final Lio/grpc/internal/i1$c;
.super Lb3/e0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/i1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# instance fields
.field final b:Lio/grpc/internal/i1;


# direct methods
.method private constructor <init>(Lio/grpc/internal/i1;)V
    .locals 0

    invoke-direct {p0}, Lb3/e0;-><init>()V

    iput-object p1, p0, Lio/grpc/internal/i1$c;->b:Lio/grpc/internal/i1;

    return-void
.end method

.method synthetic constructor <init>(Lio/grpc/internal/i1;Lio/grpc/internal/i1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/grpc/internal/i1$c;-><init>(Lio/grpc/internal/i1;)V

    return-void
.end method


# virtual methods
.method public a(Lb3/n0$f;)Lb3/e0$b;
    .locals 1

    invoke-static {}, Lb3/e0$b;->d()Lb3/e0$b$a;

    move-result-object p1

    iget-object v0, p0, Lio/grpc/internal/i1$c;->b:Lio/grpc/internal/i1;

    invoke-virtual {p1, v0}, Lb3/e0$b$a;->b(Ljava/lang/Object;)Lb3/e0$b$a;

    move-result-object p1

    invoke-virtual {p1}, Lb3/e0$b$a;->a()Lb3/e0$b;

    move-result-object p1

    return-object p1
.end method
