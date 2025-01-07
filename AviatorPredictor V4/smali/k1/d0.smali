.class public final synthetic Lk1/d0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/y;


# instance fields
.field public final synthetic a:Lk1/f0;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lk1/f0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/d0;->a:Lk1/f0;

    iput p2, p0, Lk1/d0;->b:I

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lk1/d0;->a:Lk1/f0;

    iget v1, p0, Lk1/d0;->b:I

    invoke-static {v0, v1}, Lk1/f0;->r(Lk1/f0;I)Lc1/c;

    move-result-object v0

    return-object v0
.end method
