.class Lo1/c$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo1/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic e:Lo1/c;


# direct methods
.method constructor <init>(Lo1/c;)V
    .locals 0

    iput-object p1, p0, Lo1/c$b;->e:Lo1/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lo1/c$b;->e:Lo1/c;

    invoke-static {v0}, Lo1/c;->f(Lo1/c;)V

    return-void
.end method
