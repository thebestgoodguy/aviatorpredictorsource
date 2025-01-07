.class public final synthetic Lk1/u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/y;


# instance fields
.field public final synthetic a:Lk1/f0;

.field public final synthetic b:Lm1/h;


# direct methods
.method public synthetic constructor <init>(Lk1/f0;Lm1/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/u;->a:Lk1/f0;

    iput-object p2, p0, Lk1/u;->b:Lm1/h;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lk1/u;->a:Lk1/f0;

    iget-object v1, p0, Lk1/u;->b:Lm1/h;

    invoke-static {v0, v1}, Lk1/f0;->p(Lk1/f0;Lm1/h;)Lc1/c;

    move-result-object v0

    return-object v0
.end method
