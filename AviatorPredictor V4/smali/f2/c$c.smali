.class Lf2/c$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf2/c$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field a:Ljava/util/concurrent/ExecutorService;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Le2/a;->e()Le2/a;

    move-result-object v0

    invoke-virtual {v0}, Le2/a;->b()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lf2/c$c;->a:Ljava/util/concurrent/ExecutorService;

    return-void
.end method
