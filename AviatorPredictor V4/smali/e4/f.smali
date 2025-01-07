.class final Le4/f;
.super Le4/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Le4/a<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lu3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu3/p<",
            "Le4/c<",
            "-TT;>;",
            "Ln3/d<",
            "-",
            "Lk3/s;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lu3/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu3/p<",
            "-",
            "Le4/c<",
            "-TT;>;-",
            "Ln3/d<",
            "-",
            "Lk3/s;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Le4/a;-><init>()V

    iput-object p1, p0, Le4/f;->a:Lu3/p;

    return-void
.end method


# virtual methods
.method public b(Le4/c;Ln3/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le4/c<",
            "-TT;>;",
            "Ln3/d<",
            "-",
            "Lk3/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Le4/f;->a:Lu3/p;

    invoke-interface {v0, p1, p2}, Lu3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lo3/b;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lk3/s;->a:Lk3/s;

    return-object p1
.end method
