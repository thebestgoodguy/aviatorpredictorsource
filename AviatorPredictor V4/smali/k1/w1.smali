.class public final synthetic Lk1/w1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/n;


# instance fields
.field public final synthetic a:Lk1/y1;

.field public final synthetic b:Ll1/i;


# direct methods
.method public synthetic constructor <init>(Lk1/y1;Ll1/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/w1;->a:Lk1/y1;

    iput-object p2, p0, Lk1/w1;->b:Ll1/i;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lk1/w1;->a:Lk1/y1;

    iget-object v1, p0, Lk1/w1;->b:Ll1/i;

    check-cast p1, Lj1/e;

    invoke-static {v0, v1, p1}, Lk1/y1;->k(Lk1/y1;Ll1/i;Lj1/e;)V

    return-void
.end method
