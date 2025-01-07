.class final synthetic Lf4/d$a;
.super Lkotlin/jvm/internal/h;
.source ""

# interfaces
.implements Lu3/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf4/d;-><clinit>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final e:Lf4/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf4/d$a;

    invoke-direct {v0}, Lf4/d$a;-><init>()V

    sput-object v0, Lf4/d$a;->e:Lf4/d$a;

    return-void
.end method

.method constructor <init>()V
    .locals 6

    const-class v2, Le4/c;

    const/4 v1, 0x3

    const-string v3, "emit"

    const-string v4, "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/h;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final b(Le4/c;Ljava/lang/Object;Ln3/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le4/c<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Object;",
            "Ln3/d<",
            "-",
            "Lk3/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p1, p2, p3}, Le4/c;->emit(Ljava/lang/Object;Ln3/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le4/c;

    check-cast p3, Ln3/d;

    invoke-virtual {p0, p1, p2, p3}, Lf4/d$a;->b(Le4/c;Ljava/lang/Object;Ln3/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
