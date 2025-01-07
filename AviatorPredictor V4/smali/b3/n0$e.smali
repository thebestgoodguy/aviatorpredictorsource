.class public final Lb3/n0$e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/n0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field private static final e:Lb3/n0$e;


# instance fields
.field private final a:Lb3/n0$h;

.field private final b:Lb3/k$a;

.field private final c:Lb3/f1;

.field private final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lb3/n0$e;

    sget-object v1, Lb3/f1;->f:Lb3/f1;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v2, v2, v1, v3}, Lb3/n0$e;-><init>(Lb3/n0$h;Lb3/k$a;Lb3/f1;Z)V

    sput-object v0, Lb3/n0$e;->e:Lb3/n0$e;

    return-void
.end method

.method private constructor <init>(Lb3/n0$h;Lb3/k$a;Lb3/f1;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/n0$e;->a:Lb3/n0$h;

    iput-object p2, p0, Lb3/n0$e;->b:Lb3/k$a;

    const-string p1, "status"

    invoke-static {p3, p1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb3/f1;

    iput-object p1, p0, Lb3/n0$e;->c:Lb3/f1;

    iput-boolean p4, p0, Lb3/n0$e;->d:Z

    return-void
.end method

.method public static e(Lb3/f1;)Lb3/n0$e;
    .locals 3

    invoke-virtual {p0}, Lb3/f1;->o()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const-string v2, "drop status shouldn\'t be OK"

    invoke-static {v0, v2}, Lq0/l;->e(ZLjava/lang/Object;)V

    new-instance v0, Lb3/n0$e;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v2, p0, v1}, Lb3/n0$e;-><init>(Lb3/n0$h;Lb3/k$a;Lb3/f1;Z)V

    return-object v0
.end method

.method public static f(Lb3/f1;)Lb3/n0$e;
    .locals 3

    invoke-virtual {p0}, Lb3/f1;->o()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "error status shouldn\'t be OK"

    invoke-static {v0, v1}, Lq0/l;->e(ZLjava/lang/Object;)V

    new-instance v0, Lb3/n0$e;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v2, v2, p0, v1}, Lb3/n0$e;-><init>(Lb3/n0$h;Lb3/k$a;Lb3/f1;Z)V

    return-object v0
.end method

.method public static g()Lb3/n0$e;
    .locals 1

    sget-object v0, Lb3/n0$e;->e:Lb3/n0$e;

    return-object v0
.end method

.method public static h(Lb3/n0$h;)Lb3/n0$e;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lb3/n0$e;->i(Lb3/n0$h;Lb3/k$a;)Lb3/n0$e;

    move-result-object p0

    return-object p0
.end method

.method public static i(Lb3/n0$h;Lb3/k$a;)Lb3/n0$e;
    .locals 3

    new-instance v0, Lb3/n0$e;

    const-string v1, "subchannel"

    invoke-static {p0, v1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lb3/n0$h;

    sget-object v1, Lb3/f1;->f:Lb3/f1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v1, v2}, Lb3/n0$e;-><init>(Lb3/n0$h;Lb3/k$a;Lb3/f1;Z)V

    return-object v0
.end method


# virtual methods
.method public a()Lb3/f1;
    .locals 1

    iget-object v0, p0, Lb3/n0$e;->c:Lb3/f1;

    return-object v0
.end method

.method public b()Lb3/k$a;
    .locals 1

    iget-object v0, p0, Lb3/n0$e;->b:Lb3/k$a;

    return-object v0
.end method

.method public c()Lb3/n0$h;
    .locals 1

    iget-object v0, p0, Lb3/n0$e;->a:Lb3/n0$h;

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lb3/n0$e;->d:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lb3/n0$e;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lb3/n0$e;

    iget-object v0, p0, Lb3/n0$e;->a:Lb3/n0$h;

    iget-object v2, p1, Lb3/n0$e;->a:Lb3/n0$h;

    invoke-static {v0, v2}, Lq0/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb3/n0$e;->c:Lb3/f1;

    iget-object v2, p1, Lb3/n0$e;->c:Lb3/f1;

    invoke-static {v0, v2}, Lq0/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb3/n0$e;->b:Lb3/k$a;

    iget-object v2, p1, Lb3/n0$e;->b:Lb3/k$a;

    invoke-static {v0, v2}, Lq0/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lb3/n0$e;->d:Z

    iget-boolean p1, p1, Lb3/n0$e;->d:Z

    if-ne v0, p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lb3/n0$e;->a:Lb3/n0$h;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lb3/n0$e;->c:Lb3/f1;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lb3/n0$e;->b:Lb3/k$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-boolean v1, p0, Lb3/n0$e;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    invoke-static {v0}, Lq0/i;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lq0/h;->c(Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lb3/n0$e;->a:Lb3/n0$h;

    const-string v2, "subchannel"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lb3/n0$e;->b:Lb3/k$a;

    const-string v2, "streamTracerFactory"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lb3/n0$e;->c:Lb3/f1;

    const-string v2, "status"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-boolean v1, p0, Lb3/n0$e;->d:Z

    const-string v2, "drop"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->e(Ljava/lang/String;Z)Lq0/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lq0/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
