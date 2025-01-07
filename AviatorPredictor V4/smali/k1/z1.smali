.class public final synthetic Lk1/z1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/n;


# instance fields
.field public final synthetic a:Lk1/c2;

.field public final synthetic b:[I

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lk1/c2;[ILjava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/z1;->a:Lk1/c2;

    iput-object p2, p0, Lk1/z1;->b:[I

    iput-object p3, p0, Lk1/z1;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lk1/z1;->a:Lk1/c2;

    iget-object v1, p0, Lk1/z1;->b:[I

    iget-object v2, p0, Lk1/z1;->c:Ljava/util/List;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, v1, v2, p1}, Lk1/c2;->q(Lk1/c2;[ILjava/util/List;Landroid/database/Cursor;)V

    return-void
.end method
