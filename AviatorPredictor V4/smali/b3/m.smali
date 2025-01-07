.class public final Lb3/m;
.super Lb3/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb3/m$a;,
        Lb3/m$b;
    }
.end annotation


# instance fields
.field private final a:Lb3/b;

.field private final b:Lb3/b;


# direct methods
.method public constructor <init>(Lb3/b;Lb3/b;)V
    .locals 1

    invoke-direct {p0}, Lb3/b;-><init>()V

    const-string v0, "creds1"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb3/b;

    iput-object p1, p0, Lb3/m;->a:Lb3/b;

    const-string p1, "creds2"

    invoke-static {p2, p1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb3/b;

    iput-object p1, p0, Lb3/m;->b:Lb3/b;

    return-void
.end method

.method static synthetic b(Lb3/m;)Lb3/b;
    .locals 0

    iget-object p0, p0, Lb3/m;->b:Lb3/b;

    return-object p0
.end method


# virtual methods
.method public a(Lb3/b$b;Ljava/util/concurrent/Executor;Lb3/b$a;)V
    .locals 8

    iget-object v0, p0, Lb3/m;->a:Lb3/b;

    new-instance v7, Lb3/m$b;

    invoke-static {}, Lb3/r;->e()Lb3/r;

    move-result-object v6

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lb3/m$b;-><init>(Lb3/m;Lb3/b$b;Ljava/util/concurrent/Executor;Lb3/b$a;Lb3/r;)V

    invoke-virtual {v0, p1, p2, v7}, Lb3/b;->a(Lb3/b$b;Ljava/util/concurrent/Executor;Lb3/b$a;)V

    return-void
.end method
