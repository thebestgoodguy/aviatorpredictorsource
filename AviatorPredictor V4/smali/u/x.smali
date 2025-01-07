.class final Lu/x;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic e:Lu/a0;


# direct methods
.method constructor <init>(Lu/a0;)V
    .locals 0

    iput-object p1, p0, Lu/x;->e:Lu/a0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lu/x;->e:Lu/a0;

    invoke-static {v0}, Lu/a0;->x(Lu/a0;)Lu/z;

    move-result-object v0

    new-instance v1, Ls/a;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Ls/a;-><init>(I)V

    invoke-interface {v0, v1}, Lu/z;->a(Ls/a;)V

    return-void
.end method
