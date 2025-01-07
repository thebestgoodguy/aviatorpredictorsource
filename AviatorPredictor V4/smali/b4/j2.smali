.class final Lb4/j2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ln3/g$b;
.implements Ln3/g$c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln3/g$b;",
        "Ln3/g$c<",
        "Lb4/j2;",
        ">;"
    }
.end annotation


# static fields
.field public static final e:Lb4/j2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb4/j2;

    invoke-direct {v0}, Lb4/j2;-><init>()V

    sput-object v0, Lb4/j2;->e:Lb4/j2;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ln3/g$c<",
            "*>;"
        }
    .end annotation

    return-object p0
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
