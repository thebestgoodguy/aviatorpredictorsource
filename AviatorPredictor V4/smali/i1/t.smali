.class public final synthetic Li1/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Li1/l0;

.field public final synthetic f:Ljava/util/List;

.field public final synthetic g:Lo0/i;


# direct methods
.method public synthetic constructor <init>(Li1/l0;Ljava/util/List;Lo0/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/t;->e:Li1/l0;

    iput-object p2, p0, Li1/t;->f:Ljava/util/List;

    iput-object p3, p0, Li1/t;->g:Lo0/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Li1/t;->e:Li1/l0;

    iget-object v1, p0, Li1/t;->f:Ljava/util/List;

    iget-object v2, p0, Li1/t;->g:Lo0/i;

    invoke-static {v0, v1, v2}, Li1/l0;->g(Li1/l0;Ljava/util/List;Lo0/i;)V

    return-void
.end method
