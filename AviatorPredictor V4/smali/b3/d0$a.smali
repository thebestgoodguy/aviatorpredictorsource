.class public final Lb3/d0$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lb3/d0$b;

.field private c:Ljava/lang/Long;

.field private d:Lb3/l0;

.field private e:Lb3/l0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lb3/d0;
    .locals 10

    iget-object v0, p0, Lb3/d0$a;->a:Ljava/lang/String;

    const-string v1, "description"

    invoke-static {v0, v1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lb3/d0$a;->b:Lb3/d0$b;

    const-string v1, "severity"

    invoke-static {v0, v1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lb3/d0$a;->c:Ljava/lang/Long;

    const-string v1, "timestampNanos"

    invoke-static {v0, v1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lb3/d0$a;->d:Lb3/l0;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb3/d0$a;->e:Lb3/l0;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    const-string v1, "at least one of channelRef and subchannelRef must be null"

    invoke-static {v0, v1}, Lq0/l;->u(ZLjava/lang/Object;)V

    new-instance v0, Lb3/d0;

    iget-object v3, p0, Lb3/d0$a;->a:Ljava/lang/String;

    iget-object v4, p0, Lb3/d0$a;->b:Lb3/d0$b;

    iget-object v1, p0, Lb3/d0$a;->c:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    iget-object v7, p0, Lb3/d0$a;->d:Lb3/l0;

    iget-object v8, p0, Lb3/d0$a;->e:Lb3/l0;

    const/4 v9, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v9}, Lb3/d0;-><init>(Ljava/lang/String;Lb3/d0$b;JLb3/l0;Lb3/l0;Lb3/c0$a;)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lb3/d0$a;
    .locals 0

    iput-object p1, p0, Lb3/d0$a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public c(Lb3/d0$b;)Lb3/d0$a;
    .locals 0

    iput-object p1, p0, Lb3/d0$a;->b:Lb3/d0$b;

    return-object p0
.end method

.method public d(Lb3/l0;)Lb3/d0$a;
    .locals 0

    iput-object p1, p0, Lb3/d0$a;->e:Lb3/l0;

    return-object p0
.end method

.method public e(J)Lb3/d0$a;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lb3/d0$a;->c:Ljava/lang/Long;

    return-object p0
.end method
