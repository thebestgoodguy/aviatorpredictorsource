.class public final synthetic Lk1/w2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lk1/z2;

.field public final synthetic f:[B

.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lk1/z2;[BIILjava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/w2;->e:Lk1/z2;

    iput-object p2, p0, Lk1/w2;->f:[B

    iput p3, p0, Lk1/w2;->g:I

    iput p4, p0, Lk1/w2;->h:I

    iput-object p5, p0, Lk1/w2;->i:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lk1/w2;->e:Lk1/z2;

    iget-object v1, p0, Lk1/w2;->f:[B

    iget v2, p0, Lk1/w2;->g:I

    iget v3, p0, Lk1/w2;->h:I

    iget-object v4, p0, Lk1/w2;->i:Ljava/util/Map;

    invoke-static {v0, v1, v2, v3, v4}, Lk1/z2;->i(Lk1/z2;[BIILjava/util/Map;)V

    return-void
.end method
