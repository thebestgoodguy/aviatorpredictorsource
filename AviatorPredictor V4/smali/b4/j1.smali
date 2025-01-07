.class public final Lb4/j1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb4/k1;


# instance fields
.field private final e:Lb4/a2;


# direct methods
.method public constructor <init>(Lb4/a2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb4/j1;->e:Lb4/a2;

    return-void
.end method


# virtual methods
.method public e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public f()Lb4/a2;
    .locals 1

    iget-object v0, p0, Lb4/j1;->e:Lb4/a2;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    invoke-static {}, Lb4/q0;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lb4/j1;->f()Lb4/a2;

    move-result-object v0

    const-string v1, "New"

    invoke-virtual {v0, v1}, Lb4/a2;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method
