.class public final synthetic Lo1/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo0/a;


# instance fields
.field public final synthetic a:Lo1/m;


# direct methods
.method public synthetic constructor <init>(Lo1/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/l;->a:Lo1/m;

    return-void
.end method


# virtual methods
.method public final a(Lo0/h;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lo1/l;->a:Lo1/m;

    invoke-static {v0, p1}, Lo1/m;->a(Lo1/m;Lo0/h;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
