.class Lt2/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lq2/g$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt2/a;-><init>(Lt2/a$c;Lq2/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lt2/a;


# direct methods
.method constructor <init>(Lt2/a;)V
    .locals 0

    iput-object p1, p0, Lt2/a$a;->a:Lt2/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lt2/a$a;->a:Lt2/a;

    invoke-static {v0}, Lt2/a;->b(Lt2/a;)Lt2/a$c;

    move-result-object v0

    iget-object v1, p0, Lt2/a$a;->a:Lt2/a;

    invoke-static {v1, p1}, Lt2/a;->a(Lt2/a;Ljava/lang/String;)Landroid/view/PointerIcon;

    move-result-object p1

    invoke-interface {v0, p1}, Lt2/a$c;->setPointerIcon(Landroid/view/PointerIcon;)V

    return-void
.end method
