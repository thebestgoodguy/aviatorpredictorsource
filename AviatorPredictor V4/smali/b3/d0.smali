.class public final Lb3/d0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb3/d0$a;,
        Lb3/d0$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lb3/d0$b;

.field public final c:J

.field public final d:Lb3/l0;

.field public final e:Lb3/l0;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lb3/d0$b;JLb3/l0;Lb3/l0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/d0;->a:Ljava/lang/String;

    const-string p1, "severity"

    invoke-static {p2, p1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb3/d0$b;

    iput-object p1, p0, Lb3/d0;->b:Lb3/d0$b;

    iput-wide p3, p0, Lb3/d0;->c:J

    iput-object p5, p0, Lb3/d0;->d:Lb3/l0;

    iput-object p6, p0, Lb3/d0;->e:Lb3/l0;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lb3/d0$b;JLb3/l0;Lb3/l0;Lb3/c0$a;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lb3/d0;-><init>(Ljava/lang/String;Lb3/d0$b;JLb3/l0;Lb3/l0;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    instance-of v0, p1, Lb3/d0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lb3/d0;

    iget-object v0, p0, Lb3/d0;->a:Ljava/lang/String;

    iget-object v2, p1, Lb3/d0;->a:Ljava/lang/String;

    invoke-static {v0, v2}, Lq0/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb3/d0;->b:Lb3/d0$b;

    iget-object v2, p1, Lb3/d0;->b:Lb3/d0$b;

    invoke-static {v0, v2}, Lq0/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v2, p0, Lb3/d0;->c:J

    iget-wide v4, p1, Lb3/d0;->c:J

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    iget-object v0, p0, Lb3/d0;->d:Lb3/l0;

    iget-object v2, p1, Lb3/d0;->d:Lb3/l0;

    invoke-static {v0, v2}, Lq0/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb3/d0;->e:Lb3/l0;

    iget-object p1, p1, Lb3/d0;->e:Lb3/l0;

    invoke-static {v0, p1}, Lq0/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lb3/d0;->a:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lb3/d0;->b:Lb3/d0$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-wide v1, p0, Lb3/d0;->c:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lb3/d0;->d:Lb3/l0;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-object v1, p0, Lb3/d0;->e:Lb3/l0;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    invoke-static {v0}, Lq0/i;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Lq0/h;->c(Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lb3/d0;->a:Ljava/lang/String;

    const-string v2, "description"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lb3/d0;->b:Lb3/d0$b;

    const-string v2, "severity"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-wide v1, p0, Lb3/d0;->c:J

    const-string v3, "timestampNanos"

    invoke-virtual {v0, v3, v1, v2}, Lq0/h$b;->c(Ljava/lang/String;J)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lb3/d0;->d:Lb3/l0;

    const-string v2, "channelRef"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lb3/d0;->e:Lb3/l0;

    const-string v2, "subchannelRef"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lq0/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
