.class public final synthetic Lo1/s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo0/d;


# instance fields
.field public final synthetic a:Lo1/u;

.field public final synthetic b:Lo1/u$e;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lo1/u;Lo1/u$e;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/s;->a:Lo1/u;

    iput-object p2, p0, Lo1/s;->b:Lo1/u$e;

    iput-object p3, p0, Lo1/s;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lo0/h;)V
    .locals 3

    iget-object v0, p0, Lo1/s;->a:Lo1/u;

    iget-object v1, p0, Lo1/s;->b:Lo1/u$e;

    iget-object v2, p0, Lo1/s;->c:Ljava/lang/Object;

    invoke-static {v0, v1, v2, p1}, Lo1/u;->c(Lo1/u;Lo1/u$e;Ljava/lang/Object;Lo0/h;)V

    return-void
.end method
