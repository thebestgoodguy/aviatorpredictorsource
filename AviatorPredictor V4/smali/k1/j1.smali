.class public final synthetic Lk1/j1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lk1/p1;

.field public final synthetic f:[B

.field public final synthetic g:I

.field public final synthetic h:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lk1/p1;[BILjava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/j1;->e:Lk1/p1;

    iput-object p2, p0, Lk1/j1;->f:[B

    iput p3, p0, Lk1/j1;->g:I

    iput-object p4, p0, Lk1/j1;->h:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lk1/j1;->e:Lk1/p1;

    iget-object v1, p0, Lk1/j1;->f:[B

    iget v2, p0, Lk1/j1;->g:I

    iget-object v3, p0, Lk1/j1;->h:Ljava/util/Map;

    invoke-static {v0, v1, v2, v3}, Lk1/p1;->j(Lk1/p1;[BILjava/util/Map;)V

    return-void
.end method
