.class public final synthetic Lb1/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lb1/x;

.field public final synthetic f:Lr1/b;


# direct methods
.method public synthetic constructor <init>(Lb1/x;Lr1/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/j;->e:Lb1/x;

    iput-object p2, p0, Lb1/j;->f:Lr1/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lb1/j;->e:Lb1/x;

    iget-object v1, p0, Lb1/j;->f:Lr1/b;

    invoke-static {v0, v1}, Lb1/n;->g(Lb1/x;Lr1/b;)V

    return-void
.end method
