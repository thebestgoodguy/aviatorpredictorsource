.class final La4/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lz3/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lz3/b<",
        "Lx3/c;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/CharSequence;

.field private final b:I

.field private final c:I

.field private final d:Lu3/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu3/p<",
            "Ljava/lang/CharSequence;",
            "Ljava/lang/Integer;",
            "Lk3/l<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;IILu3/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "II",
            "Lu3/p<",
            "-",
            "Ljava/lang/CharSequence;",
            "-",
            "Ljava/lang/Integer;",
            "Lk3/l<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getNextMatch"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La4/c;->a:Ljava/lang/CharSequence;

    iput p2, p0, La4/c;->b:I

    iput p3, p0, La4/c;->c:I

    iput-object p4, p0, La4/c;->d:Lu3/p;

    return-void
.end method

.method public static final synthetic a(La4/c;)Lu3/p;
    .locals 0

    iget-object p0, p0, La4/c;->d:Lu3/p;

    return-object p0
.end method

.method public static final synthetic b(La4/c;)Ljava/lang/CharSequence;
    .locals 0

    iget-object p0, p0, La4/c;->a:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public static final synthetic c(La4/c;)I
    .locals 0

    iget p0, p0, La4/c;->c:I

    return p0
.end method

.method public static final synthetic d(La4/c;)I
    .locals 0

    iget p0, p0, La4/c;->b:I

    return p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lx3/c;",
            ">;"
        }
    .end annotation

    new-instance v0, La4/c$a;

    invoke-direct {v0, p0}, La4/c$a;-><init>(La4/c;)V

    return-object v0
.end method
