.class public final synthetic Lu2/a1;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static synthetic a(Lu2/t0$d;Ljava/lang/Object;Lr2/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lu2/a1;->i(Lu2/t0$d;Ljava/lang/Object;Lr2/a$e;)V

    return-void
.end method

.method public static synthetic b(Lu2/t0$d;Ljava/lang/Object;Lr2/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lu2/a1;->g(Lu2/t0$d;Ljava/lang/Object;Lr2/a$e;)V

    return-void
.end method

.method public static synthetic c(Lu2/t0$d;Ljava/lang/Object;Lr2/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lu2/a1;->h(Lu2/t0$d;Ljava/lang/Object;Lr2/a$e;)V

    return-void
.end method

.method public static synthetic d(Lu2/t0$d;Ljava/lang/Object;Lr2/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lu2/a1;->f(Lu2/t0$d;Ljava/lang/Object;Lr2/a$e;)V

    return-void
.end method

.method public static e()Lr2/h;
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
    sget-object v0, Lu2/t0$e;->d:Lu2/t0$e;

    return-object v0
.end method

.method public static synthetic f(Lu2/t0$d;Ljava/lang/Object;Lr2/a$e;)V
    .locals 4

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

    move-result-object v2

    check-cast v2, Lu2/t0$h;

    if-eqz v2, :cond_0

    const/4 v3, 0x2

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    new-instance v3, Lu2/a1$a;

    invoke-direct {v3, v0, p2}, Lu2/a1$a;-><init>(Ljava/util/Map;Lr2/a$e;)V

    invoke-interface {p0, v1, v2, p1, v3}, Lu2/t0$d;->j(Ljava/lang/String;Lu2/t0$h;Ljava/lang/String;Lu2/t0$i;)V

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "assertionArg unexpectedly null."

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
    invoke-static {p0}, Lu2/t0;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2, v0}, Lr2/a$e;->a(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public static synthetic g(Lu2/t0$d;Ljava/lang/Object;Lr2/a$e;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_0

    new-instance v1, Lu2/a1$b;

    invoke-direct {v1, v0, p2}, Lu2/a1$b;-><init>(Ljava/util/Map;Lr2/a$e;)V

    invoke-interface {p0, p1, v1}, Lu2/t0$d;->b(Ljava/lang/String;Lu2/t0$i;)V

    goto :goto_1

    :cond_0
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
    invoke-static {p0}, Lu2/t0;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2, v0}, Lr2/a$e;->a(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public static synthetic h(Lu2/t0$d;Ljava/lang/Object;Lr2/a$e;)V
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

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    new-instance v2, Lu2/a1$c;

    invoke-direct {v2, v0, p2}, Lu2/a1$c;-><init>(Ljava/util/Map;Lr2/a$e;)V

    invoke-interface {p0, v1, p1, v2}, Lu2/t0$d;->l(Ljava/lang/String;Ljava/lang/String;Lu2/t0$i;)V

    goto :goto_1

    :cond_0
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
    invoke-static {p0}, Lu2/t0;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2, v0}, Lr2/a$e;->a(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public static synthetic i(Lu2/t0$d;Ljava/lang/Object;Lr2/a$e;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    check-cast p1, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_0

    new-instance v1, Lu2/a1$d;

    invoke-direct {v1, v0, p2}, Lu2/a1$d;-><init>(Ljava/util/Map;Lr2/a$e;)V

    invoke-interface {p0, p1, v1}, Lu2/t0$d;->e(Ljava/lang/String;Lu2/t0$i;)V

    goto :goto_1

    :cond_0
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
    invoke-static {p0}, Lu2/t0;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p0

    const-string p1, "error"

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2, v0}, Lr2/a$e;->a(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public static j(Lr2/b;Lu2/t0$d;)V
    .locals 4

    .line 1
    new-instance v0, Lr2/a;

    invoke-static {}, Lu2/a1;->e()Lr2/h;

    move-result-object v1

    const-string v2, "dev.flutter.pigeon.MultiFactorUserHostApi.enrollPhone"

    invoke-direct {v0, p0, v2, v1}, Lr2/a;-><init>(Lr2/b;Ljava/lang/String;Lr2/h;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    new-instance v2, Lu2/z0;

    invoke-direct {v2, p1}, Lu2/z0;-><init>(Lu2/t0$d;)V

    invoke-virtual {v0, v2}, Lr2/a;->e(Lr2/a$d;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lr2/a;->e(Lr2/a$d;)V

    :goto_0
    new-instance v0, Lr2/a;

    invoke-static {}, Lu2/a1;->e()Lr2/h;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.MultiFactorUserHostApi.getSession"

    invoke-direct {v0, p0, v3, v2}, Lr2/a;-><init>(Lr2/b;Ljava/lang/String;Lr2/h;)V

    if-eqz p1, :cond_1

    new-instance v2, Lu2/x0;

    invoke-direct {v2, p1}, Lu2/x0;-><init>(Lu2/t0$d;)V

    invoke-virtual {v0, v2}, Lr2/a;->e(Lr2/a$d;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1}, Lr2/a;->e(Lr2/a$d;)V

    :goto_1
    new-instance v0, Lr2/a;

    invoke-static {}, Lu2/a1;->e()Lr2/h;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.MultiFactorUserHostApi.unenroll"

    invoke-direct {v0, p0, v3, v2}, Lr2/a;-><init>(Lr2/b;Ljava/lang/String;Lr2/h;)V

    if-eqz p1, :cond_2

    new-instance v2, Lu2/y0;

    invoke-direct {v2, p1}, Lu2/y0;-><init>(Lu2/t0$d;)V

    invoke-virtual {v0, v2}, Lr2/a;->e(Lr2/a$d;)V

    goto :goto_2

    :cond_2
    invoke-virtual {v0, v1}, Lr2/a;->e(Lr2/a$d;)V

    :goto_2
    new-instance v0, Lr2/a;

    invoke-static {}, Lu2/a1;->e()Lr2/h;

    move-result-object v2

    const-string v3, "dev.flutter.pigeon.MultiFactorUserHostApi.getEnrolledFactors"

    invoke-direct {v0, p0, v3, v2}, Lr2/a;-><init>(Lr2/b;Ljava/lang/String;Lr2/h;)V

    if-eqz p1, :cond_3

    new-instance p0, Lu2/w0;

    invoke-direct {p0, p1}, Lu2/w0;-><init>(Lu2/t0$d;)V

    invoke-virtual {v0, p0}, Lr2/a;->e(Lr2/a$d;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v0, v1}, Lr2/a;->e(Lr2/a$d;)V

    :goto_3
    return-void
.end method
