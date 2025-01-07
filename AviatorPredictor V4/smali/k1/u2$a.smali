.class Lk1/u2$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/database/sqlite/SQLiteTransactionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk1/u2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lk1/u2;


# direct methods
.method constructor <init>(Lk1/u2;)V
    .locals 0

    iput-object p1, p0, Lk1/u2$a;->a:Lk1/u2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBegin()V
    .locals 1

    iget-object v0, p0, Lk1/u2$a;->a:Lk1/u2;

    invoke-static {v0}, Lk1/u2;->p(Lk1/u2;)Lk1/c2;

    move-result-object v0

    invoke-virtual {v0}, Lk1/c2;->n()V

    return-void
.end method

.method public onCommit()V
    .locals 1

    iget-object v0, p0, Lk1/u2$a;->a:Lk1/u2;

    invoke-static {v0}, Lk1/u2;->p(Lk1/u2;)Lk1/c2;

    move-result-object v0

    invoke-virtual {v0}, Lk1/c2;->i()V

    return-void
.end method

.method public onRollback()V
    .locals 0

    return-void
.end method
