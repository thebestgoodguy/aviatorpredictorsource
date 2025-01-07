.class Lio/flutter/plugins/firebase/core/t$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugins/firebase/core/l$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugins/firebase/core/t;->g(Lio/flutter/plugins/firebase/core/l$d;Ljava/lang/Object;Lr2/a$e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/flutter/plugins/firebase/core/l$h<",
        "Lio/flutter/plugins/firebase/core/l$f;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Lr2/a$e;


# direct methods
.method constructor <init>(Ljava/util/Map;Lr2/a$e;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/firebase/core/t$c;->a:Ljava/util/Map;

    iput-object p2, p0, Lio/flutter/plugins/firebase/core/t$c;->b:Lr2/a$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lio/flutter/plugins/firebase/core/l$f;

    invoke-virtual {p0, p1}, Lio/flutter/plugins/firebase/core/t$c;->c(Lio/flutter/plugins/firebase/core/l$f;)V

    return-void
.end method

.method public b(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/core/t$c;->a:Ljava/util/Map;

    invoke-static {p1}, Lio/flutter/plugins/firebase/core/l;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p1

    const-string v1, "error"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/flutter/plugins/firebase/core/t$c;->b:Lr2/a$e;

    iget-object v0, p0, Lio/flutter/plugins/firebase/core/t$c;->a:Ljava/util/Map;

    invoke-interface {p1, v0}, Lr2/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public c(Lio/flutter/plugins/firebase/core/l$f;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/core/t$c;->a:Ljava/util/Map;

    const-string v1, "result"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/flutter/plugins/firebase/core/t$c;->b:Lr2/a$e;

    iget-object v0, p0, Lio/flutter/plugins/firebase/core/t$c;->a:Ljava/util/Map;

    invoke-interface {p1, v0}, Lr2/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method
