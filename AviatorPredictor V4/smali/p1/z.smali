.class public final synthetic Lp1/z;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lp1/a0;

.field public final synthetic f:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lp1/a0;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/z;->e:Lp1/a0;

    iput-object p2, p0, Lp1/z;->f:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lp1/z;->e:Lp1/a0;

    iget-object v1, p0, Lp1/z;->f:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lp1/a0;->a(Lp1/a0;Ljava/lang/Runnable;)V

    return-void
.end method
