.class public final synthetic Lo1/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo0/d;


# instance fields
.field public final synthetic a:Lo0/h;

.field public final synthetic b:Lb3/b$a;

.field public final synthetic c:Lo0/h;


# direct methods
.method public synthetic constructor <init>(Lo0/h;Lb3/b$a;Lo0/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/p;->a:Lo0/h;

    iput-object p2, p0, Lo1/p;->b:Lb3/b$a;

    iput-object p3, p0, Lo1/p;->c:Lo0/h;

    return-void
.end method


# virtual methods
.method public final a(Lo0/h;)V
    .locals 3

    iget-object v0, p0, Lo1/p;->a:Lo0/h;

    iget-object v1, p0, Lo1/p;->b:Lb3/b$a;

    iget-object v2, p0, Lo1/p;->c:Lo0/h;

    invoke-static {v0, v1, v2, p1}, Lo1/q;->b(Lo0/h;Lb3/b$a;Lo0/h;Lo0/h;)V

    return-void
.end method
