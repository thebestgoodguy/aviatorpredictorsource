.class public final synthetic Lo1/r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo0/d;


# instance fields
.field public final synthetic a:Lo1/u;

.field public final synthetic b:Lo0/i;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lo1/u;Lo0/i;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/r;->a:Lo1/u;

    iput-object p2, p0, Lo1/r;->b:Lo0/i;

    iput-object p3, p0, Lo1/r;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lo0/h;)V
    .locals 3

    iget-object v0, p0, Lo1/r;->a:Lo1/u;

    iget-object v1, p0, Lo1/r;->b:Lo0/i;

    iget-object v2, p0, Lo1/r;->c:Ljava/lang/Object;

    invoke-static {v0, v1, v2, p1}, Lo1/u;->a(Lo1/u;Lo0/i;Ljava/lang/Object;Lo0/h;)V

    return-void
.end method
