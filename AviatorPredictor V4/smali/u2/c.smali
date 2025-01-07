.class public final synthetic Lu2/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Ljava/util/Map;

.field public final synthetic f:Lo0/i;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/c;->e:Ljava/util/Map;

    iput-object p2, p0, Lu2/c;->f:Lo0/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lu2/c;->e:Ljava/util/Map;

    iget-object v1, p0, Lu2/c;->f:Lo0/i;

    invoke-static {v0, v1}, Lu2/r0;->m(Ljava/util/Map;Lo0/i;)V

    return-void
.end method
