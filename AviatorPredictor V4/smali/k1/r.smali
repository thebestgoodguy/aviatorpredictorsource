.class public final synthetic Lk1/r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/y;


# instance fields
.field public final synthetic a:Lk1/f0;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lk1/f0;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/r;->a:Lk1/f0;

    iput-object p2, p0, Lk1/r;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lk1/r;->a:Lk1/f0;

    iget-object v1, p0, Lk1/r;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lk1/f0;->o(Lk1/f0;Ljava/lang/String;)Lh1/j;

    move-result-object v0

    return-object v0
.end method
