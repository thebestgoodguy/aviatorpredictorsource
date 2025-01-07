.class public abstract Lh3/a;
.super Lh3/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Lh3/a<",
        "TS;>;>",
        "Lh3/b<",
        "TS;>;"
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method protected constructor <init>(Lb3/d;Lb3/c;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lh3/b;-><init>(Lb3/d;Lb3/c;)V

    return-void
.end method

.method public static e(Lh3/b$a;Lb3/d;)Lh3/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lh3/b<",
            "TT;>;>(",
            "Lh3/b$a<",
            "TT;>;",
            "Lb3/d;",
            ")TT;"
        }
    .end annotation

    sget-object v0, Lb3/c;->k:Lb3/c;

    invoke-static {p0, p1, v0}, Lh3/a;->f(Lh3/b$a;Lb3/d;Lb3/c;)Lh3/b;

    move-result-object p0

    return-object p0
.end method

.method public static f(Lh3/b$a;Lb3/d;Lb3/c;)Lh3/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lh3/b<",
            "TT;>;>(",
            "Lh3/b$a<",
            "TT;>;",
            "Lb3/d;",
            "Lb3/c;",
            ")TT;"
        }
    .end annotation

    sget-object v0, Lh3/c;->b:Lb3/c$a;

    sget-object v1, Lh3/c$a;->g:Lh3/c$a;

    invoke-virtual {p2, v0, v1}, Lb3/c;->p(Lb3/c$a;Ljava/lang/Object;)Lb3/c;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lh3/b$a;->a(Lb3/d;Lb3/c;)Lh3/b;

    move-result-object p0

    return-object p0
.end method
