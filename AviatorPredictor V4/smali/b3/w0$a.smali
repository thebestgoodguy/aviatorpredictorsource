.class Lb3/w0$a;
.super Lb3/w0$e;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb3/w0;->e(Lb3/w0$f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb3/w0$f;

.field final synthetic b:Lb3/w0;


# direct methods
.method constructor <init>(Lb3/w0;Lb3/w0$f;)V
    .locals 0

    iput-object p1, p0, Lb3/w0$a;->b:Lb3/w0;

    iput-object p2, p0, Lb3/w0$a;->a:Lb3/w0$f;

    invoke-direct {p0}, Lb3/w0$e;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lb3/f1;)V
    .locals 1

    iget-object v0, p0, Lb3/w0$a;->a:Lb3/w0$f;

    invoke-interface {v0, p1}, Lb3/w0$f;->b(Lb3/f1;)V

    return-void
.end method

.method public c(Lb3/w0$g;)V
    .locals 2

    iget-object v0, p0, Lb3/w0$a;->a:Lb3/w0$f;

    invoke-virtual {p1}, Lb3/w0$g;->a()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lb3/w0$g;->b()Lb3/a;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lb3/w0$f;->a(Ljava/util/List;Lb3/a;)V

    return-void
.end method
