.class public final Lb4/q;
.super Lb4/r1;
.source ""


# instance fields
.field public final i:Lb4/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb4/m<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lb4/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb4/m<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lb4/r1;-><init>()V

    iput-object p1, p0, Lb4/q;->i:Lb4/m;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lb4/q;->y(Ljava/lang/Throwable;)V

    sget-object p1, Lk3/s;->a:Lk3/s;

    return-object p1
.end method

.method public y(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lb4/q;->i:Lb4/m;

    invoke-virtual {p0}, Lb4/v1;->z()Lb4/w1;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb4/m;->v(Lb4/p1;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb4/m;->E(Ljava/lang/Throwable;)V

    return-void
.end method
