.class public final synthetic Lk1/z;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lk1/f0;

.field public final synthetic f:Lh1/e;


# direct methods
.method public synthetic constructor <init>(Lk1/f0;Lh1/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/z;->e:Lk1/f0;

    iput-object p2, p0, Lk1/z;->f:Lh1/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lk1/z;->e:Lk1/f0;

    iget-object v1, p0, Lk1/z;->f:Lh1/e;

    invoke-static {v0, v1}, Lk1/f0;->e(Lk1/f0;Lh1/e;)V

    return-void
.end method
