.class public final synthetic Lp1/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lo0/i;

.field public final synthetic f:Ljava/util/concurrent/Callable;


# direct methods
.method public synthetic constructor <init>(Lo0/i;Ljava/util/concurrent/Callable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/i;->e:Lo0/i;

    iput-object p2, p0, Lp1/i;->f:Ljava/util/concurrent/Callable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lp1/i;->e:Lo0/i;

    iget-object v1, p0, Lp1/i;->f:Ljava/util/concurrent/Callable;

    invoke-static {v0, v1}, Lp1/g$c;->c(Lo0/i;Ljava/util/concurrent/Callable;)V

    return-void
.end method
