.class Ld3/a$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld3/a;->close()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Ld3/a;


# direct methods
.method constructor <init>(Ld3/a;)V
    .locals 0

    iput-object p1, p0, Ld3/a$c;->e:Ld3/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Ld3/a$c;->e:Ld3/a;

    invoke-static {v0}, Ld3/a;->d(Ld3/a;)Lh4/c;

    move-result-object v0

    invoke-virtual {v0}, Lh4/c;->close()V

    :try_start_0
    iget-object v0, p0, Ld3/a$c;->e:Ld3/a;

    invoke-static {v0}, Ld3/a;->h(Ld3/a;)Lh4/m;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ld3/a$c;->e:Ld3/a;

    invoke-static {v0}, Ld3/a;->h(Ld3/a;)Lh4/m;

    move-result-object v0

    invoke-interface {v0}, Lh4/m;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Ld3/a$c;->e:Ld3/a;

    invoke-static {v1}, Ld3/a;->k(Ld3/a;)Ld3/b$a;

    move-result-object v1

    invoke-interface {v1, v0}, Ld3/b$a;->b(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    :try_start_1
    iget-object v0, p0, Ld3/a$c;->e:Ld3/a;

    invoke-static {v0}, Ld3/a;->l(Ld3/a;)Ljava/net/Socket;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ld3/a$c;->e:Ld3/a;

    invoke-static {v0}, Ld3/a;->l(Ld3/a;)Ljava/net/Socket;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    iget-object v1, p0, Ld3/a$c;->e:Ld3/a;

    invoke-static {v1}, Ld3/a;->k(Ld3/a;)Ld3/b$a;

    move-result-object v1

    invoke-interface {v1, v0}, Ld3/b$a;->b(Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    return-void
.end method
