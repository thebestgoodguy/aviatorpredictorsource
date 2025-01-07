.class public abstract Lb4/g0;
.super Ln3/a;
.source ""

# interfaces
.implements Ln3/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb4/g0$a;
    }
.end annotation


# static fields
.field public static final e:Lb4/g0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb4/g0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb4/g0$a;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lb4/g0;->e:Lb4/g0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Ln3/e;->d:Ln3/e$b;

    invoke-direct {p0, v0}, Ln3/a;-><init>(Ln3/g$c;)V

    return-void
.end method


# virtual methods
.method public abstract F(Ln3/g;Ljava/lang/Runnable;)V
.end method

.method public H(Ln3/g;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
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

    invoke-static {p0, p1}, Ln3/e$a;->a(Ln3/e;Ln3/g$c;)Ln3/g$b;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ln3/d;)Ln3/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ln3/d<",
            "-TT;>;)",
            "Ln3/d<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lkotlinx/coroutines/internal/f;

    invoke-direct {v0, p0, p1}, Lkotlinx/coroutines/internal/f;-><init>(Lb4/g0;Ln3/d;)V

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

    invoke-static {p0, p1}, Ln3/e$a;->b(Ln3/e;Ln3/g$c;)Ln3/g;

    move-result-object p1

    return-object p1
.end method

.method public final n(Ln3/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln3/d<",
            "*>;)V"
        }
    .end annotation

    check-cast p1, Lkotlinx/coroutines/internal/f;

    invoke-virtual {p1}, Lkotlinx/coroutines/internal/f;->r()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lb4/r0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lb4/r0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
