.class public final synthetic Lp1/q;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lp1/r;

.field public final synthetic f:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lp1/r;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/q;->e:Lp1/r;

    iput-object p2, p0, Lp1/q;->f:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lp1/q;->e:Lp1/r;

    iget-object v1, p0, Lp1/q;->f:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lp1/r;->a(Lp1/r;Ljava/lang/Runnable;)V

    return-void
.end method
