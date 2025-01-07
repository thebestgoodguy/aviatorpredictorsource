.class public final Lq0/m;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq0/m$b;
    }
.end annotation


# instance fields
.field private final a:Lq0/a;

.field private final b:Z

.field private final c:Lq0/m$b;

.field private final d:I


# direct methods
.method private constructor <init>(Lq0/m$b;)V
    .locals 3

    invoke-static {}, Lq0/a;->c()Lq0/a;

    move-result-object v0

    const/4 v1, 0x0

    const v2, 0x7fffffff

    invoke-direct {p0, p1, v1, v0, v2}, Lq0/m;-><init>(Lq0/m$b;ZLq0/a;I)V

    return-void
.end method

.method private constructor <init>(Lq0/m$b;ZLq0/a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq0/m;->c:Lq0/m$b;

    iput-boolean p2, p0, Lq0/m;->b:Z

    iput-object p3, p0, Lq0/m;->a:Lq0/a;

    iput p4, p0, Lq0/m;->d:I

    return-void
.end method

.method public static a(C)Lq0/m;
    .locals 0

    invoke-static {p0}, Lq0/a;->b(C)Lq0/a;

    move-result-object p0

    invoke-static {p0}, Lq0/m;->b(Lq0/a;)Lq0/m;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lq0/a;)Lq0/m;
    .locals 2

    invoke-static {p0}, Lq0/l;->n(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lq0/m;

    new-instance v1, Lq0/m$a;

    invoke-direct {v1, p0}, Lq0/m$a;-><init>(Lq0/a;)V

    invoke-direct {v0, v1}, Lq0/m;-><init>(Lq0/m$b;)V

    return-object v0
.end method


# virtual methods
.method public c()Lq0/m;
    .locals 1

    invoke-static {}, Lq0/a;->e()Lq0/a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lq0/m;->d(Lq0/a;)Lq0/m;

    move-result-object v0

    return-object v0
.end method

.method public d(Lq0/a;)Lq0/m;
    .locals 4

    invoke-static {p1}, Lq0/l;->n(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lq0/m;

    iget-object v1, p0, Lq0/m;->c:Lq0/m$b;

    iget-boolean v2, p0, Lq0/m;->b:Z

    iget v3, p0, Lq0/m;->d:I

    invoke-direct {v0, v1, v2, p1, v3}, Lq0/m;-><init>(Lq0/m$b;ZLq0/a;I)V

    return-object v0
.end method
