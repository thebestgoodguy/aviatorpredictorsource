.class final Lb3/m$a;
.super Lb3/b$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Lb3/b$a;

.field private final b:Lb3/u0;


# direct methods
.method public constructor <init>(Lb3/b$a;Lb3/u0;)V
    .locals 0

    invoke-direct {p0}, Lb3/b$a;-><init>()V

    iput-object p1, p0, Lb3/m$a;->a:Lb3/b$a;

    iput-object p2, p0, Lb3/m$a;->b:Lb3/u0;

    return-void
.end method


# virtual methods
.method public a(Lb3/u0;)V
    .locals 2

    const-string v0, "headers"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lb3/u0;

    invoke-direct {v0}, Lb3/u0;-><init>()V

    iget-object v1, p0, Lb3/m$a;->b:Lb3/u0;

    invoke-virtual {v0, v1}, Lb3/u0;->m(Lb3/u0;)V

    invoke-virtual {v0, p1}, Lb3/u0;->m(Lb3/u0;)V

    iget-object p1, p0, Lb3/m$a;->a:Lb3/b$a;

    invoke-virtual {p1, v0}, Lb3/b$a;->a(Lb3/u0;)V

    return-void
.end method

.method public b(Lb3/f1;)V
    .locals 1

    iget-object v0, p0, Lb3/m$a;->a:Lb3/b$a;

    invoke-virtual {v0, p1}, Lb3/b$a;->b(Lb3/f1;)V

    return-void
.end method
