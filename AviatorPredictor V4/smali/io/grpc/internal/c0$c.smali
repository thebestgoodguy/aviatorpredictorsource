.class public final Lio/grpc/internal/c0$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1c
    name = "c"
.end annotation


# instance fields
.field private a:Lb3/f1;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lb3/x;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lb3/w0$c;

.field public d:Lb3/a;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lio/grpc/internal/c0$a;)V
    .locals 0

    invoke-direct {p0}, Lio/grpc/internal/c0$c;-><init>()V

    return-void
.end method

.method static synthetic a(Lio/grpc/internal/c0$c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/c0$c;->b:Ljava/util/List;

    return-object p0
.end method

.method static synthetic b(Lio/grpc/internal/c0$c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/c0$c;->b:Ljava/util/List;

    return-object p1
.end method

.method static synthetic c(Lio/grpc/internal/c0$c;)Lb3/f1;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/c0$c;->a:Lb3/f1;

    return-object p0
.end method

.method static synthetic d(Lio/grpc/internal/c0$c;Lb3/f1;)Lb3/f1;
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/c0$c;->a:Lb3/f1;

    return-object p1
.end method

.method static synthetic e(Lio/grpc/internal/c0$c;)Lb3/w0$c;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/c0$c;->c:Lb3/w0$c;

    return-object p0
.end method

.method static synthetic f(Lio/grpc/internal/c0$c;Lb3/w0$c;)Lb3/w0$c;
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/c0$c;->c:Lb3/w0$c;

    return-object p1
.end method
