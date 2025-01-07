.class public final synthetic Lio/flutter/plugins/firebase/core/t;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static synthetic a(Lio/flutter/plugins/firebase/core/l$d;Ljava/lang/Object;Lr2/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/firebase/core/t;->f(Lio/flutter/plugins/firebase/core/l$d;Ljava/lang/Object;Lr2/a$e;)V

    return-void
.end method

.method public static synthetic b(Lio/flutter/plugins/firebase/core/l$d;Ljava/lang/Object;Lr2/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/firebase/core/t;->g(Lio/flutter/plugins/firebase/core/l$d;Ljava/lang/Object;Lr2/a$e;)V

    return-void
.end method

.method public static synthetic c(Lio/flutter/plugins/firebase/core/l$d;Ljava/lang/Object;Lr2/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lio/flutter/plugins/firebase/core/t;->e(Lio/flutter/plugins/firebase/core/l$d;Ljava/lang/Object;Lr2/a$e;)V

    return-void
.end method

.method public static d()Lr2/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lr2/h<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lio/flutter/plugins/firebase/core/l$e;->d:Lio/flutter/plugins/firebase/core/l$e;

    return-object v0
.end method

.method public static synthetic e(Lio/flutter/plugins/firebase/core/l$d;Ljava/lang/Object;Lr2/a$e;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/flutter/plugins/firebase/core/l$f;

    if-eqz p1, :cond_0

    new-instance v2, Lio/flutter/plugins/firebase/core/t$a;

    invoke-direct {v2, v0, p2}, Lio/flutter/plugins/firebase/core/t$a;-><init>(Ljava/util/Map;Lr2/a$e;)V

    invoke-interface {p0, v1, p1, v2}, Lio/flutter/plugins/firebase/core/l$d;->b(Ljava/lang/String;Lio/flutter/plugins/firebase/core/l$f;Lio/flutter/plugins/firebase/core/l$h;)V

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "initializeAppRequestArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "appNameArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    :goto_0
    invoke-static {p0}, Lio/flutter/plugins/firebase/core/l;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2, v0}, Lr2/a$e;->a(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public static synthetic f(Lio/flutter/plugins/firebase/core/l$d;Ljava/lang/Object;Lr2/a$e;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    new-instance v0, Lio/flutter/plugins/firebase/core/t$b;

    invoke-direct {v0, p1, p2}, Lio/flutter/plugins/firebase/core/t$b;-><init>(Ljava/util/Map;Lr2/a$e;)V

    invoke-interface {p0, v0}, Lio/flutter/plugins/firebase/core/l$d;->e(Lio/flutter/plugins/firebase/core/l$h;)V
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    :goto_0
    invoke-static {p0}, Lio/flutter/plugins/firebase/core/l;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string v0, "error"

    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2, p1}, Lr2/a$e;->a(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public static synthetic g(Lio/flutter/plugins/firebase/core/l$d;Ljava/lang/Object;Lr2/a$e;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    new-instance v0, Lio/flutter/plugins/firebase/core/t$c;

    invoke-direct {v0, p1, p2}, Lio/flutter/plugins/firebase/core/t$c;-><init>(Ljava/util/Map;Lr2/a$e;)V

    invoke-interface {p0, v0}, Lio/flutter/plugins/firebase/core/l$d;->f(Lio/flutter/plugins/firebase/core/l$h;)V
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    :goto_0
    invoke-static {p0}, Lio/flutter/plugins/firebase/core/l;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string v0, "error"

    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2, p1}, Lr2/a$e;->a(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public static h(Lr2/b;Lio/flutter/plugins/firebase/core/l$d;)V
    .locals 4

    .line 1
    new-instance v0, Lr2/a;

    invoke-static {}, Lio/flutter/plugins/firebase/core/t;->d()Lr2/h;

    move-result-object v1

    const-string v2, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeApp"

    invoke-direct {v0, p0, v2, v1}, Lr2/a;-><init>(Lr2/b;Ljava/lang/String;Lr2/h;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    new-instance v2, Lio/flutter/plugins/firebase/core/s;

    invoke-direct {v2, p1}, Lio/flutter/plugins/firebase/core/s;-><init>(Lio/flutter/plugins/firebase/core/l$d;)V

    invoke-virtual {v0, v2}, Lr2/a;->e(Lr2/a$d;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lr2/a;->e(Lr2/a$d;)V

    :goto_0
    new-instance v0, Lr2/a;

    invoke-static {}, Lio/flutter/plugins/firebase/core/t;->d()Lr2/h;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeCore"

    invoke-direct {v0, p0, v3, v2}, Lr2/a;-><init>(Lr2/b;Ljava/lang/String;Lr2/h;)V

    if-eqz p1, :cond_1

    new-instance v2, Lio/flutter/plugins/firebase/core/q;

    invoke-direct {v2, p1}, Lio/flutter/plugins/firebase/core/q;-><init>(Lio/flutter/plugins/firebase/core/l$d;)V

    invoke-virtual {v0, v2}, Lr2/a;->e(Lr2/a$d;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1}, Lr2/a;->e(Lr2/a$d;)V

    :goto_1
    new-instance v0, Lr2/a;

    invoke-static {}, Lio/flutter/plugins/firebase/core/t;->d()Lr2/h;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.FirebaseCoreHostApi.optionsFromResource"

    invoke-direct {v0, p0, v3, v2}, Lr2/a;-><init>(Lr2/b;Ljava/lang/String;Lr2/h;)V

    if-eqz p1, :cond_2

    new-instance p0, Lio/flutter/plugins/firebase/core/r;

    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/core/r;-><init>(Lio/flutter/plugins/firebase/core/l$d;)V

    invoke-virtual {v0, p0}, Lr2/a;->e(Lr2/a$d;)V

    goto :goto_2

    :cond_2
    invoke-virtual {v0, v1}, Lr2/a;->e(Lr2/a$d;)V

    :goto_2
    return-void
.end method
