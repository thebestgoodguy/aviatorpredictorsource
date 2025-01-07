.class public final synthetic Lw2/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lr2/c$b;

.field public final synthetic f:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lr2/c$b;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw2/m;->e:Lr2/c$b;

    iput-object p2, p0, Lw2/m;->f:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lw2/m;->e:Lr2/c$b;

    iget-object v1, p0, Lw2/m;->f:Ljava/util/Map;

    invoke-static {v0, v1}, Lw2/o;->d(Lr2/c$b;Ljava/util/Map;)V

    return-void
.end method
