.class public final synthetic Lo1/m0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/n;


# instance fields
.field public final synthetic a:Lo1/n0;

.field public final synthetic b:Lp1/g;


# direct methods
.method public synthetic constructor <init>(Lo1/n0;Lp1/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/m0;->a:Lo1/n0;

    iput-object p2, p0, Lo1/m0;->b:Lp1/g;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lo1/m0;->a:Lo1/n0;

    iget-object v1, p0, Lo1/m0;->b:Lp1/g;

    check-cast p1, Lo1/k$a;

    invoke-static {v0, v1, p1}, Lo1/n0;->c(Lo1/n0;Lp1/g;Lo1/k$a;)V

    return-void
.end method
