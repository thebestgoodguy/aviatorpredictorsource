.class public abstract Lb3/w0$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb3/w0$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "e"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Lb3/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lb3/x;",
            ">;",
            "Lb3/a;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {}, Lb3/w0$g;->d()Lb3/w0$g$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lb3/w0$g$a;->b(Ljava/util/List;)Lb3/w0$g$a;

    move-result-object p1

    invoke-virtual {p1, p2}, Lb3/w0$g$a;->c(Lb3/a;)Lb3/w0$g$a;

    move-result-object p1

    invoke-virtual {p1}, Lb3/w0$g$a;->a()Lb3/w0$g;

    move-result-object p1

    invoke-virtual {p0, p1}, Lb3/w0$e;->c(Lb3/w0$g;)V

    return-void
.end method

.method public abstract b(Lb3/f1;)V
.end method

.method public abstract c(Lb3/w0$g;)V
.end method
