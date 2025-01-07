.class public final synthetic Li1/h1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Li1/k1;


# direct methods
.method public synthetic constructor <init>(Li1/k1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/h1;->e:Li1/k1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Li1/h1;->e:Li1/k1;

    invoke-static {v0}, Li1/k1;->c(Li1/k1;)V

    return-void
.end method
