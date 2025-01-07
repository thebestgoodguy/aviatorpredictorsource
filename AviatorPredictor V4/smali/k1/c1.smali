.class public Lk1/c1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lc1/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/i;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lc1/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc1/e<",
            "Ll1/l;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc1/c;Lc1/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/i;",
            ">;",
            "Lc1/e<",
            "Ll1/l;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/c1;->a:Lc1/c;

    iput-object p2, p0, Lk1/c1;->b:Lc1/e;

    return-void
.end method


# virtual methods
.method public a()Lc1/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lk1/c1;->a:Lc1/c;

    return-object v0
.end method

.method public b()Lc1/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc1/e<",
            "Ll1/l;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lk1/c1;->b:Lc1/e;

    return-object v0
.end method
