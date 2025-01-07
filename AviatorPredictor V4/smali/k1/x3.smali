.class public final synthetic Lk1/x3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/n;


# instance fields
.field public final synthetic a:Lk1/y3;

.field public final synthetic b:Lp1/n;


# direct methods
.method public synthetic constructor <init>(Lk1/y3;Lp1/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/x3;->a:Lk1/y3;

    iput-object p2, p0, Lk1/x3;->b:Lp1/n;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lk1/x3;->a:Lk1/y3;

    iget-object v1, p0, Lk1/x3;->b:Lp1/n;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, v1, p1}, Lk1/y3;->m(Lk1/y3;Lp1/n;Landroid/database/Cursor;)V

    return-void
.end method
