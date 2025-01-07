.class public final synthetic Lk1/s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/y;


# instance fields
.field public final synthetic a:Lk1/f0;

.field public final synthetic b:Ljava/util/Set;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Lx0/o;


# direct methods
.method public synthetic constructor <init>(Lk1/f0;Ljava/util/Set;Ljava/util/List;Lx0/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/s;->a:Lk1/f0;

    iput-object p2, p0, Lk1/s;->b:Ljava/util/Set;

    iput-object p3, p0, Lk1/s;->c:Ljava/util/List;

    iput-object p4, p0, Lk1/s;->d:Lx0/o;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lk1/s;->a:Lk1/f0;

    iget-object v1, p0, Lk1/s;->b:Ljava/util/Set;

    iget-object v2, p0, Lk1/s;->c:Ljava/util/List;

    iget-object v3, p0, Lk1/s;->d:Lx0/o;

    invoke-static {v0, v1, v2, v3}, Lk1/f0;->n(Lk1/f0;Ljava/util/Set;Ljava/util/List;Lx0/o;)Lk1/m;

    move-result-object v0

    return-object v0
.end method
