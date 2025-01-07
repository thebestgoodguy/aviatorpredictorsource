.class public final synthetic Li1/a0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/u;


# instance fields
.field public final synthetic a:Li1/l0;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic c:Lo0/i;

.field public final synthetic d:Lp1/g;


# direct methods
.method public synthetic constructor <init>(Li1/l0;Ljava/util/concurrent/atomic/AtomicBoolean;Lo0/i;Lp1/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/a0;->a:Li1/l0;

    iput-object p2, p0, Li1/a0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p3, p0, Li1/a0;->c:Lo0/i;

    iput-object p4, p0, Li1/a0;->d:Lp1/g;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Li1/a0;->a:Li1/l0;

    iget-object v1, p0, Li1/a0;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v2, p0, Li1/a0;->c:Lo0/i;

    iget-object v3, p0, Li1/a0;->d:Lp1/g;

    check-cast p1, Lg1/j;

    invoke-static {v0, v1, v2, v3, p1}, Li1/l0;->s(Li1/l0;Ljava/util/concurrent/atomic/AtomicBoolean;Lo0/i;Lp1/g;Lg1/j;)V

    return-void
.end method
