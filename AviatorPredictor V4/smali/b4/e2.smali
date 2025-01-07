.class Lb4/e2;
.super Lb4/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lb4/a<",
        "Lk3/s;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ln3/g;Z)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p2}, Lb4/a;-><init>(Ln3/g;ZZ)V

    return-void
.end method


# virtual methods
.method protected Q(Ljava/lang/Throwable;)Z
    .locals 1

    invoke-virtual {p0}, Lb4/a;->getContext()Ln3/g;

    move-result-object v0

    invoke-static {v0, p1}, Lb4/i0;->a(Ln3/g;Ljava/lang/Throwable;)V

    const/4 p1, 0x1

    return p1
.end method
