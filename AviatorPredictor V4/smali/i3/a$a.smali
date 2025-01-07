.class Li3/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb3/n0$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li3/a;->c(Lb3/n0$g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb3/n0$h;

.field final synthetic b:Li3/a;


# direct methods
.method constructor <init>(Li3/a;Lb3/n0$h;)V
    .locals 0

    iput-object p1, p0, Li3/a$a;->b:Li3/a;

    iput-object p2, p0, Li3/a$a;->a:Lb3/n0$h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lb3/q;)V
    .locals 2

    iget-object v0, p0, Li3/a$a;->b:Li3/a;

    iget-object v1, p0, Li3/a$a;->a:Lb3/n0$h;

    invoke-static {v0, v1, p1}, Li3/a;->f(Li3/a;Lb3/n0$h;Lb3/q;)V

    return-void
.end method
