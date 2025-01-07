.class final La1/s0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo0/f;


# instance fields
.field final synthetic a:Lo0/i;


# direct methods
.method constructor <init>(La1/u0;Lo0/i;)V
    .locals 0

    iput-object p2, p0, La1/s0;->a:Lo0/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic d(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, La1/s0;->a:Lo0/i;

    new-instance v1, La1/t0;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p1}, La1/t0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lo0/i;->c(Ljava/lang/Object;)V

    return-void
.end method
