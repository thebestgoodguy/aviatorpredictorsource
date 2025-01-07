.class final Lw/n0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lw/q$a;


# instance fields
.field final synthetic a:Lt/j;


# direct methods
.method constructor <init>(Lt/j;)V
    .locals 0

    iput-object p1, p0, Lw/n0;->a:Lt/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lt/k;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lw/n0;->a:Lt/j;

    invoke-virtual {v0, p1}, Lt/j;->b(Lt/k;)V

    iget-object p1, p0, Lw/n0;->a:Lt/j;

    return-object p1
.end method
