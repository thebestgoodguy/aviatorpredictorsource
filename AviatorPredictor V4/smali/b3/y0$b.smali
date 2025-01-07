.class final Lb3/y0$b;
.super Lb3/w0$d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/y0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lb3/y0;


# direct methods
.method private constructor <init>(Lb3/y0;)V
    .locals 0

    iput-object p1, p0, Lb3/y0$b;->a:Lb3/y0;

    invoke-direct {p0}, Lb3/w0$d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lb3/y0;Lb3/y0$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lb3/y0$b;-><init>(Lb3/y0;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lb3/y0$b;->a:Lb3/y0;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lb3/y0$b;->a:Lb3/y0;

    invoke-static {v1}, Lb3/y0;->a(Lb3/y0;)Ljava/lang/String;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public b(Ljava/net/URI;Lb3/w0$b;)Lb3/w0;
    .locals 2

    iget-object v0, p0, Lb3/y0$b;->a:Lb3/y0;

    invoke-virtual {v0}, Lb3/y0;->f()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb3/x0;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1, p2}, Lb3/w0$d;->b(Ljava/net/URI;Lb3/w0$b;)Lb3/w0;

    move-result-object p1

    :goto_0
    return-object p1
.end method
