.class public abstract Lb4/v1;
.super Lb4/b0;
.source ""

# interfaces
.implements Lb4/y0;
.implements Lb4/k1;


# instance fields
.field public h:Lb4/w1;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb4/b0;-><init>()V

    return-void
.end method


# virtual methods
.method public final A(Lb4/w1;)V
    .locals 0

    iput-object p1, p0, Lb4/v1;->h:Lb4/w1;

    return-void
.end method

.method public d()V
    .locals 1

    invoke-virtual {p0}, Lb4/v1;->z()Lb4/w1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lb4/w1;->h0(Lb4/v1;)V

    return-void
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public f()Lb4/a2;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lb4/r0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lb4/r0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[job@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lb4/v1;->z()Lb4/w1;

    move-result-object v1

    invoke-static {v1}, Lb4/r0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final z()Lb4/w1;
    .locals 1

    iget-object v0, p0, Lb4/v1;->h:Lb4/w1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "job"

    invoke-static {v0}, Lkotlin/jvm/internal/i;->m(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method
