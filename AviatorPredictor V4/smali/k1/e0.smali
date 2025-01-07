.class public final synthetic Lk1/e0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/y;


# instance fields
.field public final synthetic a:Lk1/f0;

.field public final synthetic b:Lc1/c;

.field public final synthetic c:Lk1/b4;


# direct methods
.method public synthetic constructor <init>(Lk1/f0;Lc1/c;Lk1/b4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/e0;->a:Lk1/f0;

    iput-object p2, p0, Lk1/e0;->b:Lc1/c;

    iput-object p3, p0, Lk1/e0;->c:Lk1/b4;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lk1/e0;->a:Lk1/f0;

    iget-object v1, p0, Lk1/e0;->b:Lc1/c;

    iget-object v2, p0, Lk1/e0;->c:Lk1/b4;

    invoke-static {v0, v1, v2}, Lk1/f0;->k(Lk1/f0;Lc1/c;Lk1/b4;)Lc1/c;

    move-result-object v0

    return-object v0
.end method
