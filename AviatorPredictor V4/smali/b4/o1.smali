.class final Lb4/o1;
.super Lb4/v1;
.source ""


# instance fields
.field private final i:Lu3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu3/l<",
            "Ljava/lang/Throwable;",
            "Lk3/s;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lu3/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu3/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lk3/s;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lb4/v1;-><init>()V

    iput-object p1, p0, Lb4/o1;->i:Lu3/l;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lb4/o1;->y(Ljava/lang/Throwable;)V

    sget-object p1, Lk3/s;->a:Lk3/s;

    return-object p1
.end method

.method public y(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lb4/o1;->i:Lu3/l;

    invoke-interface {v0, p1}, Lu3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
