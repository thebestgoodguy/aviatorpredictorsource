.class public abstract Lb3/r$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lb3/r;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Deprecated. Do not call."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract b()Lb3/r;
.end method

.method public abstract c(Lb3/r;Lb3/r;)V
.end method

.method public d(Lb3/r;)Lb3/r;
    .locals 1

    invoke-virtual {p0}, Lb3/r$c;->b()Lb3/r;

    move-result-object v0

    invoke-virtual {p0, p1}, Lb3/r$c;->a(Lb3/r;)V

    return-object v0
.end method
