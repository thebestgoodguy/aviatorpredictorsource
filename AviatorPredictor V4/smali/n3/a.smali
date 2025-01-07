.class public abstract Ln3/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ln3/g$b;


# instance fields
.field private final key:Ln3/g$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln3/g$c<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ln3/g$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln3/g$c<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln3/a;->key:Ln3/g$c;

    return-void
.end method


# virtual methods
.method public fold(Ljava/lang/Object;Lu3/p;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lu3/p<",
            "-TR;-",
            "Ln3/g$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Ln3/g$b$a;->a(Ln3/g$b;Ljava/lang/Object;Lu3/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get(Ln3/g$c;)Ln3/g$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Ln3/g$b;",
            ">(",
            "Ln3/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Ln3/g$b$a;->b(Ln3/g$b;Ln3/g$c;)Ln3/g$b;

    move-result-object p1

    return-object p1
.end method

.method public getKey()Ln3/g$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ln3/g$c<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Ln3/a;->key:Ln3/g$c;

    return-object v0
.end method

.method public minusKey(Ln3/g$c;)Ln3/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln3/g$c<",
            "*>;)",
            "Ln3/g;"
        }
    .end annotation

    invoke-static {p0, p1}, Ln3/g$b$a;->c(Ln3/g$b;Ln3/g$c;)Ln3/g;

    move-result-object p1

    return-object p1
.end method

.method public plus(Ln3/g;)Ln3/g;
    .locals 0

    invoke-static {p0, p1}, Ln3/g$b$a;->d(Ln3/g$b;Ln3/g;)Ln3/g;

    move-result-object p1

    return-object p1
.end method
