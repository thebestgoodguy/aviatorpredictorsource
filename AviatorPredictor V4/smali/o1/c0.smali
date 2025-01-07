.class public final synthetic Lo1/c0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo0/a;


# instance fields
.field public final synthetic a:Lo1/d0;

.field public final synthetic b:Lb3/v0;


# direct methods
.method public synthetic constructor <init>(Lo1/d0;Lb3/v0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/c0;->a:Lo1/d0;

    iput-object p2, p0, Lo1/c0;->b:Lb3/v0;

    return-void
.end method


# virtual methods
.method public final a(Lo0/h;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lo1/c0;->a:Lo1/d0;

    iget-object v1, p0, Lo1/c0;->b:Lb3/v0;

    invoke-static {v0, v1, p1}, Lo1/d0;->c(Lo1/d0;Lb3/v0;Lo0/h;)Lo0/h;

    move-result-object p1

    return-object p1
.end method
