.class public final Lx1/o;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx1/o$b;
    }
.end annotation


# static fields
.field private static volatile a:Lb3/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/v0<",
            "Lx1/c;",
            "Lx1/d;",
            ">;"
        }
    .end annotation
.end field

.field private static volatile b:Lb3/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/v0<",
            "Lx1/e;",
            "Lx1/f;",
            ">;"
        }
    .end annotation
.end field

.field private static volatile c:Lb3/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/v0<",
            "Lx1/z;",
            "Lx1/a0;",
            ">;"
        }
    .end annotation
.end field

.field private static volatile d:Lb3/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/v0<",
            "Lx1/p;",
            "Lx1/q;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lb3/v0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb3/v0<",
            "Lx1/c;",
            "Lx1/d;",
            ">;"
        }
    .end annotation

    sget-object v0, Lx1/o;->a:Lb3/v0;

    if-nez v0, :cond_1

    const-class v1, Lx1/o;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lx1/o;->a:Lb3/v0;

    if-nez v0, :cond_0

    invoke-static {}, Lb3/v0;->g()Lb3/v0$b;

    move-result-object v0

    sget-object v2, Lb3/v0$d;->g:Lb3/v0$d;

    invoke-virtual {v0, v2}, Lb3/v0$b;->f(Lb3/v0$d;)Lb3/v0$b;

    move-result-object v0

    const-string v2, "google.firestore.v1.Firestore"

    const-string v3, "BatchGetDocuments"

    invoke-static {v2, v3}, Lb3/v0;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb3/v0$b;->b(Ljava/lang/String;)Lb3/v0$b;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lb3/v0$b;->e(Z)Lb3/v0$b;

    move-result-object v0

    invoke-static {}, Lx1/c;->Y()Lx1/c;

    move-result-object v2

    invoke-static {v2}, Lg3/b;->b(Lcom/google/protobuf/v0;)Lb3/v0$c;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb3/v0$b;->c(Lb3/v0$c;)Lb3/v0$b;

    move-result-object v0

    invoke-static {}, Lx1/d;->U()Lx1/d;

    move-result-object v2

    invoke-static {v2}, Lg3/b;->b(Lcom/google/protobuf/v0;)Lb3/v0$c;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb3/v0$b;->d(Lb3/v0$c;)Lb3/v0$b;

    move-result-object v0

    invoke-virtual {v0}, Lb3/v0$b;->a()Lb3/v0;

    move-result-object v0

    sput-object v0, Lx1/o;->a:Lb3/v0;

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static b()Lb3/v0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb3/v0<",
            "Lx1/e;",
            "Lx1/f;",
            ">;"
        }
    .end annotation

    sget-object v0, Lx1/o;->b:Lb3/v0;

    if-nez v0, :cond_1

    const-class v1, Lx1/o;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lx1/o;->b:Lb3/v0;

    if-nez v0, :cond_0

    invoke-static {}, Lb3/v0;->g()Lb3/v0$b;

    move-result-object v0

    sget-object v2, Lb3/v0$d;->e:Lb3/v0$d;

    invoke-virtual {v0, v2}, Lb3/v0$b;->f(Lb3/v0$d;)Lb3/v0$b;

    move-result-object v0

    const-string v2, "google.firestore.v1.Firestore"

    const-string v3, "Commit"

    invoke-static {v2, v3}, Lb3/v0;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb3/v0$b;->b(Ljava/lang/String;)Lb3/v0$b;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lb3/v0$b;->e(Z)Lb3/v0$b;

    move-result-object v0

    invoke-static {}, Lx1/e;->Y()Lx1/e;

    move-result-object v2

    invoke-static {v2}, Lg3/b;->b(Lcom/google/protobuf/v0;)Lb3/v0$c;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb3/v0$b;->c(Lb3/v0$c;)Lb3/v0$b;

    move-result-object v0

    invoke-static {}, Lx1/f;->V()Lx1/f;

    move-result-object v2

    invoke-static {v2}, Lg3/b;->b(Lcom/google/protobuf/v0;)Lb3/v0$c;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb3/v0$b;->d(Lb3/v0$c;)Lb3/v0$b;

    move-result-object v0

    invoke-virtual {v0}, Lb3/v0$b;->a()Lb3/v0;

    move-result-object v0

    sput-object v0, Lx1/o;->b:Lb3/v0;

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static c()Lb3/v0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb3/v0<",
            "Lx1/p;",
            "Lx1/q;",
            ">;"
        }
    .end annotation

    sget-object v0, Lx1/o;->d:Lb3/v0;

    if-nez v0, :cond_1

    const-class v1, Lx1/o;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lx1/o;->d:Lb3/v0;

    if-nez v0, :cond_0

    invoke-static {}, Lb3/v0;->g()Lb3/v0$b;

    move-result-object v0

    sget-object v2, Lb3/v0$d;->h:Lb3/v0$d;

    invoke-virtual {v0, v2}, Lb3/v0$b;->f(Lb3/v0$d;)Lb3/v0$b;

    move-result-object v0

    const-string v2, "google.firestore.v1.Firestore"

    const-string v3, "Listen"

    invoke-static {v2, v3}, Lb3/v0;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb3/v0$b;->b(Ljava/lang/String;)Lb3/v0$b;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lb3/v0$b;->e(Z)Lb3/v0$b;

    move-result-object v0

    invoke-static {}, Lx1/p;->Y()Lx1/p;

    move-result-object v2

    invoke-static {v2}, Lg3/b;->b(Lcom/google/protobuf/v0;)Lb3/v0$c;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb3/v0$b;->c(Lb3/v0$c;)Lb3/v0$b;

    move-result-object v0

    invoke-static {}, Lx1/q;->U()Lx1/q;

    move-result-object v2

    invoke-static {v2}, Lg3/b;->b(Lcom/google/protobuf/v0;)Lb3/v0$c;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb3/v0$b;->d(Lb3/v0$c;)Lb3/v0$b;

    move-result-object v0

    invoke-virtual {v0}, Lb3/v0$b;->a()Lb3/v0;

    move-result-object v0

    sput-object v0, Lx1/o;->d:Lb3/v0;

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static d()Lb3/v0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb3/v0<",
            "Lx1/z;",
            "Lx1/a0;",
            ">;"
        }
    .end annotation

    sget-object v0, Lx1/o;->c:Lb3/v0;

    if-nez v0, :cond_1

    const-class v1, Lx1/o;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lx1/o;->c:Lb3/v0;

    if-nez v0, :cond_0

    invoke-static {}, Lb3/v0;->g()Lb3/v0$b;

    move-result-object v0

    sget-object v2, Lb3/v0$d;->h:Lb3/v0$d;

    invoke-virtual {v0, v2}, Lb3/v0$b;->f(Lb3/v0$d;)Lb3/v0$b;

    move-result-object v0

    const-string v2, "google.firestore.v1.Firestore"

    const-string v3, "Write"

    invoke-static {v2, v3}, Lb3/v0;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb3/v0$b;->b(Ljava/lang/String;)Lb3/v0$b;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lb3/v0$b;->e(Z)Lb3/v0$b;

    move-result-object v0

    invoke-static {}, Lx1/z;->Z()Lx1/z;

    move-result-object v2

    invoke-static {v2}, Lg3/b;->b(Lcom/google/protobuf/v0;)Lb3/v0$c;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb3/v0$b;->c(Lb3/v0$c;)Lb3/v0$b;

    move-result-object v0

    invoke-static {}, Lx1/a0;->V()Lx1/a0;

    move-result-object v2

    invoke-static {v2}, Lg3/b;->b(Lcom/google/protobuf/v0;)Lb3/v0$c;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb3/v0$b;->d(Lb3/v0$c;)Lb3/v0$b;

    move-result-object v0

    invoke-virtual {v0}, Lb3/v0$b;->a()Lb3/v0;

    move-result-object v0

    sput-object v0, Lx1/o;->c:Lb3/v0;

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static e(Lb3/d;)Lx1/o$b;
    .locals 1

    new-instance v0, Lx1/o$a;

    invoke-direct {v0}, Lx1/o$a;-><init>()V

    invoke-static {v0, p0}, Lh3/a;->e(Lh3/b$a;Lb3/d;)Lh3/b;

    move-result-object p0

    check-cast p0, Lx1/o$b;

    return-object p0
.end method
