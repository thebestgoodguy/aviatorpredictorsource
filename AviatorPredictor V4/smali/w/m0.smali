.class final Lw/m0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt/g$a;


# instance fields
.field final synthetic a:Lt/g;

.field final synthetic b:Lo0/i;

.field final synthetic c:Lw/q$a;

.field final synthetic d:Lw/o0;


# direct methods
.method constructor <init>(Lt/g;Lo0/i;Lw/q$a;Lw/o0;)V
    .locals 0

    iput-object p1, p0, Lw/m0;->a:Lt/g;

    iput-object p2, p0, Lw/m0;->b:Lo0/i;

    iput-object p3, p0, Lw/m0;->c:Lw/q$a;

    iput-object p4, p0, Lw/m0;->d:Lw/o0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->n0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lw/m0;->a:Lt/g;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v1, v2, v0}, Lt/g;->b(JLjava/util/concurrent/TimeUnit;)Lt/k;

    move-result-object p1

    iget-object v0, p0, Lw/m0;->b:Lo0/i;

    iget-object v1, p0, Lw/m0;->c:Lw/q$a;

    invoke-interface {v1, p1}, Lw/q$a;->a(Lt/k;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lo0/i;->c(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lw/m0;->b:Lo0/i;

    invoke-static {p1}, Lw/b;->a(Lcom/google/android/gms/common/api/Status;)Lt/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    return-void
.end method
