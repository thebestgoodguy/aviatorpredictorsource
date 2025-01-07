.class Lo1/u$c;
.super Lb3/g$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo1/u;->k(Lo1/u$e;Ljava/lang/Object;Lo0/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo1/u$e;

.field final synthetic b:Lb3/g;

.field final synthetic c:Lo1/u;


# direct methods
.method constructor <init>(Lo1/u;Lo1/u$e;Lb3/g;)V
    .locals 0

    iput-object p1, p0, Lo1/u$c;->c:Lo1/u;

    iput-object p2, p0, Lo1/u$c;->a:Lo1/u$e;

    iput-object p3, p0, Lo1/u$c;->b:Lb3/g;

    invoke-direct {p0}, Lb3/g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lb3/f1;Lb3/u0;)V
    .locals 0

    iget-object p2, p0, Lo1/u$c;->a:Lo1/u$e;

    invoke-virtual {p2, p1}, Lo1/u$e;->a(Lb3/f1;)V

    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lo1/u$c;->a:Lo1/u$e;

    invoke-virtual {v0, p1}, Lo1/u$e;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lo1/u$c;->b:Lb3/g;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lb3/g;->c(I)V

    return-void
.end method
