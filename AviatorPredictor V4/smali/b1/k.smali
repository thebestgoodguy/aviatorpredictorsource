.class public final synthetic Lb1/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lb1/c0;

.field public final synthetic f:Lr1/b;


# direct methods
.method public synthetic constructor <init>(Lb1/c0;Lr1/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/k;->e:Lb1/c0;

    iput-object p2, p0, Lb1/k;->f:Lr1/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lb1/k;->e:Lb1/c0;

    iget-object v1, p0, Lb1/k;->f:Lr1/b;

    invoke-static {v0, v1}, Lb1/n;->h(Lb1/c0;Lr1/b;)V

    return-void
.end method
