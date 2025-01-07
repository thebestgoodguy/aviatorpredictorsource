.class Lio/grpc/internal/k1$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/grpc/internal/j2$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/k1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field private e:Ljava/io/InputStream;


# direct methods
.method private constructor <init>(Ljava/io/InputStream;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/grpc/internal/k1$c;->e:Ljava/io/InputStream;

    return-void
.end method

.method synthetic constructor <init>(Ljava/io/InputStream;Lio/grpc/internal/k1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/grpc/internal/k1$c;-><init>(Ljava/io/InputStream;)V

    return-void
.end method


# virtual methods
.method public next()Ljava/io/InputStream;
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/k1$c;->e:Ljava/io/InputStream;

    const/4 v1, 0x0

    iput-object v1, p0, Lio/grpc/internal/k1$c;->e:Ljava/io/InputStream;

    return-object v0
.end method
