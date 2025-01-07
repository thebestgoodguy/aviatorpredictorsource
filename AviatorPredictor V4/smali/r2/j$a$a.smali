.class Lr2/j$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lr2/j$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr2/j$a;->a(Ljava/nio/ByteBuffer;Lr2/b$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr2/b$b;

.field final synthetic b:Lr2/j$a;


# direct methods
.method constructor <init>(Lr2/j$a;Lr2/b$b;)V
    .locals 0

    iput-object p1, p0, Lr2/j$a$a;->b:Lr2/j$a;

    iput-object p2, p0, Lr2/j$a$a;->a:Lr2/b$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lr2/j$a$a;->a:Lr2/b$b;

    iget-object v1, p0, Lr2/j$a$a;->b:Lr2/j$a;

    iget-object v1, v1, Lr2/j$a;->b:Lr2/j;

    invoke-static {v1}, Lr2/j;->a(Lr2/j;)Lr2/k;

    move-result-object v1

    invoke-interface {v1, p1}, Lr2/k;->a(Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-interface {v0, p1}, Lr2/b$b;->a(Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lr2/j$a$a;->a:Lr2/b$b;

    iget-object v1, p0, Lr2/j$a$a;->b:Lr2/j$a;

    iget-object v1, v1, Lr2/j$a;->b:Lr2/j;

    invoke-static {v1}, Lr2/j;->a(Lr2/j;)Lr2/k;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3}, Lr2/k;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-interface {v0, p1}, Lr2/b$b;->a(Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lr2/j$a$a;->a:Lr2/b$b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lr2/b$b;->a(Ljava/nio/ByteBuffer;)V

    return-void
.end method
