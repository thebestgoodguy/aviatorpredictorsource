.class final Lu/y;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic e:Ln0/l;

.field final synthetic f:Lu/a0;


# direct methods
.method constructor <init>(Lu/a0;Ln0/l;)V
    .locals 0

    iput-object p1, p0, Lu/y;->f:Lu/a0;

    iput-object p2, p0, Lu/y;->e:Ln0/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lu/y;->f:Lu/a0;

    iget-object v1, p0, Lu/y;->e:Ln0/l;

    invoke-static {v0, v1}, Lu/a0;->y(Lu/a0;Ln0/l;)V

    return-void
.end method
