.class public final synthetic Lw2/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lr2/c$b;

.field public final synthetic f:Ljava/util/HashMap;


# direct methods
.method public synthetic constructor <init>(Lr2/c$b;Ljava/util/HashMap;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw2/l;->e:Lr2/c$b;

    iput-object p2, p0, Lw2/l;->f:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lw2/l;->e:Lr2/c$b;

    iget-object v1, p0, Lw2/l;->f:Ljava/util/HashMap;

    invoke-static {v0, v1}, Lw2/o;->g(Lr2/c$b;Ljava/util/HashMap;)V

    return-void
.end method
