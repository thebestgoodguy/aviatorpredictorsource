.class final Lb4/y1;
.super Lb4/e2;
.source ""


# instance fields
.field private final g:Ln3/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln3/d<",
            "Lk3/s;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ln3/g;Lu3/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln3/g;",
            "Lu3/p<",
            "-",
            "Lb4/m0;",
            "-",
            "Ln3/d<",
            "-",
            "Lk3/s;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lb4/e2;-><init>(Ln3/g;Z)V

    invoke-static {p2, p0, p0}, Lo3/b;->a(Lu3/p;Ljava/lang/Object;Ln3/d;)Ln3/d;

    move-result-object p1

    iput-object p1, p0, Lb4/y1;->g:Ln3/d;

    return-void
.end method


# virtual methods
.method protected e0()V
    .locals 1

    iget-object v0, p0, Lb4/y1;->g:Ln3/d;

    invoke-static {v0, p0}, Lg4/a;->c(Ln3/d;Ln3/d;)V

    return-void
.end method
