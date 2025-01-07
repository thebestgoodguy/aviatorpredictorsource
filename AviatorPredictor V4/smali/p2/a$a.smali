.class Lp2/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp2/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lp2/a;


# direct methods
.method constructor <init>(Lp2/a;)V
    .locals 0

    iput-object p1, p0, Lp2/a$a;->a:Lp2/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    iget-object v0, p0, Lp2/a$a;->a:Lp2/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lp2/a;->b(Lp2/a;Z)Z

    return-void
.end method

.method public f()V
    .locals 2

    iget-object v0, p0, Lp2/a$a;->a:Lp2/a;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lp2/a;->b(Lp2/a;Z)Z

    return-void
.end method
