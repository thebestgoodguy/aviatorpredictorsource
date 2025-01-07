.class public final synthetic Li1/s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Li1/l0;


# direct methods
.method public synthetic constructor <init>(Li1/l0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/s;->e:Li1/l0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Li1/s;->e:Li1/l0;

    invoke-static {v0}, Li1/l0;->c(Li1/l0;)V

    return-void
.end method
