.class Lc3/a$b$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc3/a$b;->r()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lc3/a$b$d;

.field final synthetic f:Lc3/a$b;


# direct methods
.method constructor <init>(Lc3/a$b;Lc3/a$b$d;)V
    .locals 0

    iput-object p1, p0, Lc3/a$b$b;->f:Lc3/a$b;

    iput-object p2, p0, Lc3/a$b$b;->e:Lc3/a$b$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lc3/a$b$b;->f:Lc3/a$b;

    invoke-static {v0}, Lc3/a$b;->p(Lc3/a$b;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lc3/a$b$b;->e:Lc3/a$b$d;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method
