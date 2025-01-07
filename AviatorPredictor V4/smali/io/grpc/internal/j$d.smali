.class final Lio/grpc/internal/j$d;
.super Lb3/n0$i;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# instance fields
.field private final a:Lb3/f1;


# direct methods
.method constructor <init>(Lb3/f1;)V
    .locals 0

    invoke-direct {p0}, Lb3/n0$i;-><init>()V

    iput-object p1, p0, Lio/grpc/internal/j$d;->a:Lb3/f1;

    return-void
.end method


# virtual methods
.method public a(Lb3/n0$f;)Lb3/n0$e;
    .locals 0

    iget-object p1, p0, Lio/grpc/internal/j$d;->a:Lb3/f1;

    invoke-static {p1}, Lb3/n0$e;->f(Lb3/f1;)Lb3/n0$e;

    move-result-object p1

    return-object p1
.end method
