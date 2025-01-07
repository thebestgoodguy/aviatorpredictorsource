.class public final synthetic Lk1/v;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/y;


# instance fields
.field public final synthetic a:Lk1/f0;

.field public final synthetic b:Lo1/i0;

.field public final synthetic c:Ll1/w;


# direct methods
.method public synthetic constructor <init>(Lk1/f0;Lo1/i0;Ll1/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/v;->a:Lk1/f0;

    iput-object p2, p0, Lk1/v;->b:Lo1/i0;

    iput-object p3, p0, Lk1/v;->c:Ll1/w;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lk1/v;->a:Lk1/f0;

    iget-object v1, p0, Lk1/v;->b:Lo1/i0;

    iget-object v2, p0, Lk1/v;->c:Ll1/w;

    invoke-static {v0, v1, v2}, Lk1/f0;->q(Lk1/f0;Lo1/i0;Ll1/w;)Lc1/c;

    move-result-object v0

    return-object v0
.end method
