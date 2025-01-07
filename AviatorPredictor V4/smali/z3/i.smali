.class public final Lz3/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lz3/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lz3/b<",
        "TR;>;"
    }
.end annotation


# instance fields
.field private final a:Lz3/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz3/b<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final b:Lu3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu3/l<",
            "TT;TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lz3/b;Lu3/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz3/b<",
            "+TT;>;",
            "Lu3/l<",
            "-TT;+TR;>;)V"
        }
    .end annotation

    const-string v0, "sequence"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transformer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz3/i;->a:Lz3/b;

    iput-object p2, p0, Lz3/i;->b:Lu3/l;

    return-void
.end method

.method public static final synthetic a(Lz3/i;)Lz3/b;
    .locals 0

    iget-object p0, p0, Lz3/i;->a:Lz3/b;

    return-object p0
.end method

.method public static final synthetic b(Lz3/i;)Lu3/l;
    .locals 0

    iget-object p0, p0, Lz3/i;->b:Lu3/l;

    return-object p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TR;>;"
        }
    .end annotation

    new-instance v0, Lz3/i$a;

    invoke-direct {v0, p0}, Lz3/i$a;-><init>(Lz3/i;)V

    return-object v0
.end method
