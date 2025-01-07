.class public final Lf4/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ln3/g$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf4/a$a;
    }
.end annotation


# static fields
.field public static final g:Lf4/a$a;


# instance fields
.field public final e:Ljava/lang/Throwable;

.field private final f:Ln3/g$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln3/g$c<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf4/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf4/a$a;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lf4/a;->g:Lf4/a$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/a;->e:Ljava/lang/Throwable;

    sget-object p1, Lf4/a;->g:Lf4/a$a;

    iput-object p1, p0, Lf4/a;->f:Ln3/g$c;

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

    iget-object v0, p0, Lf4/a;->f:Ln3/g$c;

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
