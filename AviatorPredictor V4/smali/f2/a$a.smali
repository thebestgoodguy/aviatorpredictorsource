.class Lf2/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lr2/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lf2/a;


# direct methods
.method constructor <init>(Lf2/a;)V
    .locals 0

    iput-object p1, p0, Lf2/a$a;->a:Lf2/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/nio/ByteBuffer;Lr2/b$b;)V
    .locals 1

    iget-object p2, p0, Lf2/a$a;->a:Lf2/a;

    sget-object v0, Lr2/r;->b:Lr2/r;

    invoke-virtual {v0, p1}, Lr2/r;->c(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lf2/a;->f(Lf2/a;Ljava/lang/String;)Ljava/lang/String;

    iget-object p1, p0, Lf2/a$a;->a:Lf2/a;

    invoke-static {p1}, Lf2/a;->g(Lf2/a;)Lf2/a$d;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lf2/a$a;->a:Lf2/a;

    invoke-static {p1}, Lf2/a;->g(Lf2/a;)Lf2/a$d;

    move-result-object p1

    iget-object p2, p0, Lf2/a$a;->a:Lf2/a;

    invoke-static {p2}, Lf2/a;->d(Lf2/a;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lf2/a$d;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
