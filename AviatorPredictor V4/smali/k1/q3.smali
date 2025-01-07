.class public final synthetic Lk1/q3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/n;


# instance fields
.field public final synthetic a:Lk1/q0$a;

.field public final synthetic b:Landroid/database/sqlite/SQLiteStatement;


# direct methods
.method public synthetic constructor <init>(Lk1/q0$a;Landroid/database/sqlite/SQLiteStatement;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/q3;->a:Lk1/q0$a;

    iput-object p2, p0, Lk1/q3;->b:Landroid/database/sqlite/SQLiteStatement;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lk1/q3;->a:Lk1/q0$a;

    iget-object v1, p0, Lk1/q3;->b:Landroid/database/sqlite/SQLiteStatement;

    check-cast p1, Ll1/u;

    invoke-static {v0, v1, p1}, Lk1/s3;->f(Lk1/q0$a;Landroid/database/sqlite/SQLiteStatement;Ll1/u;)V

    return-void
.end method
