.class public final synthetic Lo1/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo0/d;


# instance fields
.field public final synthetic a:Lo1/u;

.field public final synthetic b:[Lb3/g;

.field public final synthetic c:Lo1/f0;


# direct methods
.method public synthetic constructor <init>(Lo1/u;[Lb3/g;Lo1/f0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/t;->a:Lo1/u;

    iput-object p2, p0, Lo1/t;->b:[Lb3/g;

    iput-object p3, p0, Lo1/t;->c:Lo1/f0;

    return-void
.end method


# virtual methods
.method public final a(Lo0/h;)V
    .locals 3

    iget-object v0, p0, Lo1/t;->a:Lo1/u;

    iget-object v1, p0, Lo1/t;->b:[Lb3/g;

    iget-object v2, p0, Lo1/t;->c:Lo1/f0;

    invoke-static {v0, v1, v2, p1}, Lo1/u;->b(Lo1/u;[Lb3/g;Lo1/f0;Lo0/h;)V

    return-void
.end method
