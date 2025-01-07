.class final synthetic Lf0/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu/j;


# instance fields
.field private final a:Lf0/i;


# direct methods
.method constructor <init>(Lf0/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/k;->a:Lf0/i;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lf0/k;->a:Lf0/i;

    check-cast p1, Lf0/j;

    check-cast p2, Lo0/i;

    invoke-virtual {p1}, Lw/c;->C()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lf0/f;

    new-instance v1, Lf0/l;

    invoke-direct {v1, v0, p2}, Lf0/l;-><init>(Lf0/i;Lo0/i;)V

    invoke-interface {p1, v1}, Lf0/f;->l(Lf0/h;)V

    return-void
.end method
