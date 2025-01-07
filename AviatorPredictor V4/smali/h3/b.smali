.class public abstract Lh3/b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh3/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Lh3/b<",
        "TS;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lb3/d;

.field private final b:Lb3/c;


# direct methods
.method protected constructor <init>(Lb3/d;Lb3/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "channel"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb3/d;

    iput-object p1, p0, Lh3/b;->a:Lb3/d;

    const-string p1, "callOptions"

    invoke-static {p2, p1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb3/c;

    iput-object p1, p0, Lh3/b;->b:Lb3/c;

    return-void
.end method


# virtual methods
.method protected abstract a(Lb3/d;Lb3/c;)Lh3/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb3/d;",
            "Lb3/c;",
            ")TS;"
        }
    .end annotation
.end method

.method public final b()Lb3/c;
    .locals 1

    iget-object v0, p0, Lh3/b;->b:Lb3/c;

    return-object v0
.end method

.method public final c(Lb3/b;)Lh3/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb3/b;",
            ")TS;"
        }
    .end annotation

    iget-object v0, p0, Lh3/b;->a:Lb3/d;

    iget-object v1, p0, Lh3/b;->b:Lb3/c;

    invoke-virtual {v1, p1}, Lb3/c;->k(Lb3/b;)Lb3/c;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lh3/b;->a(Lb3/d;Lb3/c;)Lh3/b;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/util/concurrent/Executor;)Lh3/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            ")TS;"
        }
    .end annotation

    iget-object v0, p0, Lh3/b;->a:Lb3/d;

    iget-object v1, p0, Lh3/b;->b:Lb3/c;

    invoke-virtual {v1, p1}, Lb3/c;->m(Ljava/util/concurrent/Executor;)Lb3/c;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lh3/b;->a(Lb3/d;Lb3/c;)Lh3/b;

    move-result-object p1

    return-object p1
.end method
