.class public final synthetic Lk1/m1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/n;


# instance fields
.field public final synthetic a:Lk1/p1;

.field public final synthetic b:Lp1/m;

.field public final synthetic c:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lk1/p1;Lp1/m;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/m1;->a:Lk1/p1;

    iput-object p2, p0, Lk1/m1;->b:Lp1/m;

    iput-object p3, p0, Lk1/m1;->c:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lk1/m1;->a:Lk1/p1;

    iget-object v1, p0, Lk1/m1;->b:Lp1/m;

    iget-object v2, p0, Lk1/m1;->c:Ljava/util/Map;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, v1, v2, p1}, Lk1/p1;->l(Lk1/p1;Lp1/m;Ljava/util/Map;Landroid/database/Cursor;)V

    return-void
.end method
