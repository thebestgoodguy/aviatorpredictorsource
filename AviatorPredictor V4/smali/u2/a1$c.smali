.class Lu2/a1$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu2/t0$i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu2/a1;->h(Lu2/t0$d;Ljava/lang/Object;Lr2/a$e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lu2/t0$i<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Lr2/a$e;


# direct methods
.method constructor <init>(Ljava/util/Map;Lr2/a$e;)V
    .locals 0

    iput-object p1, p0, Lu2/a1$c;->a:Ljava/util/Map;

    iput-object p2, p0, Lu2/a1$c;->b:Lr2/a$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lu2/a1$c;->c(Ljava/lang/Void;)V

    return-void
.end method

.method public b(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lu2/a1$c;->a:Ljava/util/Map;

    invoke-static {p1}, Lu2/t0;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p1

    const-string v1, "error"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lu2/a1$c;->b:Lr2/a$e;

    iget-object v0, p0, Lu2/a1$c;->a:Ljava/util/Map;

    invoke-interface {p1, v0}, Lr2/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public c(Ljava/lang/Void;)V
    .locals 2

    iget-object p1, p0, Lu2/a1$c;->a:Ljava/util/Map;

    const-string v0, "result"

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lu2/a1$c;->b:Lr2/a$e;

    iget-object v0, p0, Lu2/a1$c;->a:Ljava/util/Map;

    invoke-interface {p1, v0}, Lr2/a$e;->a(Ljava/lang/Object;)V

    return-void
.end method
