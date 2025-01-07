.class public final synthetic Lk1/v3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/n;


# instance fields
.field public final synthetic a:Lk1/y3;

.field public final synthetic b:Landroid/util/SparseArray;

.field public final synthetic c:[I


# direct methods
.method public synthetic constructor <init>(Lk1/y3;Landroid/util/SparseArray;[I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/v3;->a:Lk1/y3;

    iput-object p2, p0, Lk1/v3;->b:Landroid/util/SparseArray;

    iput-object p3, p0, Lk1/v3;->c:[I

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lk1/v3;->a:Lk1/y3;

    iget-object v1, p0, Lk1/v3;->b:Landroid/util/SparseArray;

    iget-object v2, p0, Lk1/v3;->c:[I

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, v1, v2, p1}, Lk1/y3;->n(Lk1/y3;Landroid/util/SparseArray;[ILandroid/database/Cursor;)V

    return-void
.end method
