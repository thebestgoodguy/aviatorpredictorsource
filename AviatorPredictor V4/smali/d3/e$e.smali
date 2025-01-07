.class final Ld3/e$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/grpc/internal/g1$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld3/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Ld3/e;


# direct methods
.method private constructor <init>(Ld3/e;)V
    .locals 0

    iput-object p1, p0, Ld3/e$e;->a:Ld3/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Ld3/e;Ld3/e$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ld3/e$e;-><init>(Ld3/e;)V

    return-void
.end method


# virtual methods
.method public a()Lio/grpc/internal/t;
    .locals 1

    iget-object v0, p0, Ld3/e$e;->a:Ld3/e;

    invoke-virtual {v0}, Ld3/e;->g()Lio/grpc/internal/t;

    move-result-object v0

    return-object v0
.end method
