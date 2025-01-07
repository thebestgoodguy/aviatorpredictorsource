.class public final synthetic Lk1/v1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/n;


# instance fields
.field public final synthetic a:Lk1/y1;

.field public final synthetic b:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lk1/y1;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/v1;->a:Lk1/y1;

    iput-object p2, p0, Lk1/v1;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lk1/v1;->a:Lk1/y1;

    iget-object v1, p0, Lk1/v1;->b:Ljava/util/Map;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, v1, p1}, Lk1/y1;->l(Lk1/y1;Ljava/util/Map;Landroid/database/Cursor;)V

    return-void
.end method
