.class public final synthetic Lb1/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Ljava/util/Map$Entry;

.field public final synthetic f:Lf1/a;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map$Entry;Lf1/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/t;->e:Ljava/util/Map$Entry;

    iput-object p2, p0, Lb1/t;->f:Lf1/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lb1/t;->e:Ljava/util/Map$Entry;

    iget-object v1, p0, Lb1/t;->f:Lf1/a;

    invoke-static {v0, v1}, Lb1/u;->b(Ljava/util/Map$Entry;Lf1/a;)V

    return-void
.end method
