.class public final synthetic Lk1/u1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/n;


# instance fields
.field public final synthetic a:Ljava/util/SortedSet;

.field public final synthetic b:Ll1/q;

.field public final synthetic c:Ll1/l;


# direct methods
.method public synthetic constructor <init>(Ljava/util/SortedSet;Ll1/q;Ll1/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/u1;->a:Ljava/util/SortedSet;

    iput-object p2, p0, Lk1/u1;->b:Ll1/q;

    iput-object p3, p0, Lk1/u1;->c:Ll1/l;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lk1/u1;->a:Ljava/util/SortedSet;

    iget-object v1, p0, Lk1/u1;->b:Ll1/q;

    iget-object v2, p0, Lk1/u1;->c:Ll1/l;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, v1, v2, p1}, Lk1/y1;->q(Ljava/util/SortedSet;Ll1/q;Ll1/l;Landroid/database/Cursor;)V

    return-void
.end method
