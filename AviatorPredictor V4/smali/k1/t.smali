.class public final synthetic Lk1/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/y;


# instance fields
.field public final synthetic a:Lk1/f0;

.field public final synthetic b:Lk1/l0;


# direct methods
.method public synthetic constructor <init>(Lk1/f0;Lk1/l0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/t;->a:Lk1/f0;

    iput-object p2, p0, Lk1/t;->b:Lk1/l0;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lk1/t;->a:Lk1/f0;

    iget-object v1, p0, Lk1/t;->b:Lk1/l0;

    invoke-static {v0, v1}, Lk1/f0;->i(Lk1/f0;Lk1/l0;)Lk1/l0$c;

    move-result-object v0

    return-object v0
.end method
