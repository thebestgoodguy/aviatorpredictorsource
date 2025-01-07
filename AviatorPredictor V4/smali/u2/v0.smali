.class public final synthetic Lu2/v0;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static synthetic a(Lu2/t0$b;Ljava/lang/Object;Lr2/a$e;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lu2/v0;->c(Lu2/t0$b;Ljava/lang/Object;Lr2/a$e;)V

    return-void
.end method

.method public static b()Lr2/h;
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
    sget-object v0, Lu2/t0$c;->d:Lu2/t0$c;

    return-object v0
.end method

.method public static synthetic c(Lu2/t0$b;Ljava/lang/Object;Lr2/a$e;)V
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

    check-cast p1, Lu2/t0$h;

    if-eqz p1, :cond_0

    new-instance v2, Lu2/v0$a;

    invoke-direct {v2, v0, p2}, Lu2/v0$a;-><init>(Ljava/util/Map;Lr2/a$e;)V

    invoke-interface {p0, v1, p1, v2}, Lu2/t0$b;->h(Ljava/lang/String;Lu2/t0$h;Lu2/t0$i;)V

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "assertionArg unexpectedly null."

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "resolverIdArg unexpectedly null."

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

.method public static d(Lr2/b;Lu2/t0$b;)V
    .locals 3

    .line 1
    new-instance v0, Lr2/a;

    invoke-static {}, Lu2/v0;->b()Lr2/h;

    move-result-object v1

    const-string v2, "dev.flutter.pigeon.MultiFactoResolverHostApi.resolveSignIn"

    invoke-direct {v0, p0, v2, v1}, Lr2/a;-><init>(Lr2/b;Ljava/lang/String;Lr2/h;)V

    if-eqz p1, :cond_0

    new-instance p0, Lu2/u0;

    invoke-direct {p0, p1}, Lu2/u0;-><init>(Lu2/t0$b;)V

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-virtual {v0, p0}, Lr2/a;->e(Lr2/a$d;)V

    return-void
.end method
