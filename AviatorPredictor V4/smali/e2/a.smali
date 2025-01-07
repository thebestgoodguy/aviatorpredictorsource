.class public final Le2/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le2/a$b;
    }
.end annotation


# static fields
.field private static e:Le2/a;

.field private static f:Z


# instance fields
.field private a:Lh2/d;

.field private b:Lg2/a;

.field private c:Lio/flutter/embedding/engine/FlutterJNI$c;

.field private d:Ljava/util/concurrent/ExecutorService;


# direct methods
.method private constructor <init>(Lh2/d;Lg2/a;Lio/flutter/embedding/engine/FlutterJNI$c;Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le2/a;->a:Lh2/d;

    iput-object p2, p0, Le2/a;->b:Lg2/a;

    iput-object p3, p0, Le2/a;->c:Lio/flutter/embedding/engine/FlutterJNI$c;

    iput-object p4, p0, Le2/a;->d:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method synthetic constructor <init>(Lh2/d;Lg2/a;Lio/flutter/embedding/engine/FlutterJNI$c;Ljava/util/concurrent/ExecutorService;Le2/a$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Le2/a;-><init>(Lh2/d;Lg2/a;Lio/flutter/embedding/engine/FlutterJNI$c;Ljava/util/concurrent/ExecutorService;)V

    return-void
.end method

.method public static e()Le2/a;
    .locals 1

    const/4 v0, 0x1

    sput-boolean v0, Le2/a;->f:Z

    sget-object v0, Le2/a;->e:Le2/a;

    if-nez v0, :cond_0

    new-instance v0, Le2/a$b;

    invoke-direct {v0}, Le2/a$b;-><init>()V

    invoke-virtual {v0}, Le2/a$b;->a()Le2/a;

    move-result-object v0

    sput-object v0, Le2/a;->e:Le2/a;

    :cond_0
    sget-object v0, Le2/a;->e:Le2/a;

    return-object v0
.end method


# virtual methods
.method public a()Lg2/a;
    .locals 1

    iget-object v0, p0, Le2/a;->b:Lg2/a;

    return-object v0
.end method

.method public b()Ljava/util/concurrent/ExecutorService;
    .locals 1

    iget-object v0, p0, Le2/a;->d:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public c()Lh2/d;
    .locals 1

    iget-object v0, p0, Le2/a;->a:Lh2/d;

    return-object v0
.end method

.method public d()Lio/flutter/embedding/engine/FlutterJNI$c;
    .locals 1

    iget-object v0, p0, Le2/a;->c:Lio/flutter/embedding/engine/FlutterJNI$c;

    return-object v0
.end method
