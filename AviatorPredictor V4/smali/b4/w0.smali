.class final Lb4/w0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final e:Lb4/g0;


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 2

    iget-object v0, p0, Lb4/w0;->e:Lb4/g0;

    sget-object v1, Ln3/h;->e:Ln3/h;

    invoke-virtual {v0, v1, p1}, Lb4/g0;->F(Ln3/g;Ljava/lang/Runnable;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lb4/w0;->e:Lb4/g0;

    invoke-virtual {v0}, Lb4/g0;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
