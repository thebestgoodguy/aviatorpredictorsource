.class public final synthetic Lp1/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lp1/m;

.field public final synthetic f:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lp1/m;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/l;->e:Lp1/m;

    iput-object p2, p0, Lp1/l;->f:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lp1/l;->e:Lp1/m;

    iget-object v1, p0, Lp1/l;->f:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lp1/m;->a(Lp1/m;Ljava/lang/Runnable;)V

    return-void
.end method
