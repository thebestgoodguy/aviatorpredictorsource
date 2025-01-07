.class public final synthetic Lk1/a0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lk1/f0;

.field public final synthetic f:Lh1/j;

.field public final synthetic g:Lk1/b4;

.field public final synthetic h:I

.field public final synthetic i:Lc1/e;


# direct methods
.method public synthetic constructor <init>(Lk1/f0;Lh1/j;Lk1/b4;ILc1/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/a0;->e:Lk1/f0;

    iput-object p2, p0, Lk1/a0;->f:Lh1/j;

    iput-object p3, p0, Lk1/a0;->g:Lk1/b4;

    iput p4, p0, Lk1/a0;->h:I

    iput-object p5, p0, Lk1/a0;->i:Lc1/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lk1/a0;->e:Lk1/f0;

    iget-object v1, p0, Lk1/a0;->f:Lh1/j;

    iget-object v2, p0, Lk1/a0;->g:Lk1/b4;

    iget v3, p0, Lk1/a0;->h:I

    iget-object v4, p0, Lk1/a0;->i:Lc1/e;

    invoke-static {v0, v1, v2, v3, v4}, Lk1/f0;->g(Lk1/f0;Lh1/j;Lk1/b4;ILc1/e;)V

    return-void
.end method
