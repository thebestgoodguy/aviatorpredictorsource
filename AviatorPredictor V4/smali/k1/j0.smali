.class public final synthetic Lk1/j0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/n;


# instance fields
.field public final synthetic a:Lk1/l0$d;


# direct methods
.method public synthetic constructor <init>(Lk1/l0$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/j0;->a:Lk1/l0$d;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lk1/j0;->a:Lk1/l0$d;

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {v0, p1}, Lk1/l0$d;->b(Ljava/lang/Long;)V

    return-void
.end method
