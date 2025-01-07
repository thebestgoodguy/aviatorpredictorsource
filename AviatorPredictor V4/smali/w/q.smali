.class public Lw/q;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw/q$a;
    }
.end annotation


# static fields
.field private static final a:Lw/o0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw/l0;

    invoke-direct {v0}, Lw/l0;-><init>()V

    sput-object v0, Lw/q;->a:Lw/o0;

    return-void
.end method

.method public static a(Lt/g;Lt/j;)Lo0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Lt/k;",
            "T:",
            "Lt/j<",
            "TR;>;>(",
            "Lt/g<",
            "TR;>;TT;)",
            "Lo0/h<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lw/n0;

    invoke-direct {v0, p1}, Lw/n0;-><init>(Lt/j;)V

    invoke-static {p0, v0}, Lw/q;->b(Lt/g;Lw/q$a;)Lo0/h;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lt/g;Lw/q$a;)Lo0/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Lt/k;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Lt/g<",
            "TR;>;",
            "Lw/q$a<",
            "TR;TT;>;)",
            "Lo0/h<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lw/q;->a:Lw/o0;

    new-instance v1, Lo0/i;

    invoke-direct {v1}, Lo0/i;-><init>()V

    new-instance v2, Lw/m0;

    invoke-direct {v2, p0, v1, p1, v0}, Lw/m0;-><init>(Lt/g;Lo0/i;Lw/q$a;Lw/o0;)V

    invoke-virtual {p0, v2}, Lt/g;->a(Lt/g$a;)V

    invoke-virtual {v1}, Lo0/i;->a()Lo0/h;

    move-result-object p0

    return-object p0
.end method
