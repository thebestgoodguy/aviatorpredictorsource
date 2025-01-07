.class final La1/n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo0/e;


# instance fields
.field final synthetic a:La1/o;


# direct methods
.method constructor <init>(La1/o;)V
    .locals 0

    iput-object p1, p0, La1/n;->a:La1/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Exception;)V
    .locals 2

    instance-of p1, p1, Lx0/l;

    if-eqz p1, :cond_0

    invoke-static {}, La1/p;->a()Lz/a;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Failure to refresh token; scheduling refresh after failure"

    invoke-virtual {p1, v1, v0}, Lz/a;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, La1/n;->a:La1/o;

    iget-object p1, p1, La1/o;->f:La1/p;

    invoke-virtual {p1}, La1/p;->d()V

    :cond_0
    return-void
.end method
