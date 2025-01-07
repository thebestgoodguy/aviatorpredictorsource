.class public Li1/t1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Li1/u1;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li1/q0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Li1/u1;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li1/u1;",
            "Ljava/util/List<",
            "Li1/q0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/t1;->a:Li1/u1;

    iput-object p2, p0, Li1/t1;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Li1/q0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Li1/t1;->b:Ljava/util/List;

    return-object v0
.end method

.method public b()Li1/u1;
    .locals 1

    iget-object v0, p0, Li1/t1;->a:Li1/u1;

    return-object v0
.end method
