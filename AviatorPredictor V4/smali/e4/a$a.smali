.class final Le4/a$a;
.super Lkotlin/coroutines/jvm/internal/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le4/a;->a(Le4/c;Ln3/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "kotlinx.coroutines.flow.AbstractFlow"
    f = "Flow.kt"
    l = {
        0xd4
    }
    m = "collect"
.end annotation


# instance fields
.field e:Ljava/lang/Object;

.field synthetic f:Ljava/lang/Object;

.field final synthetic g:Le4/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le4/a<",
            "TT;>;"
        }
    .end annotation
.end field

.field h:I


# direct methods
.method constructor <init>(Le4/a;Ln3/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le4/a<",
            "TT;>;",
            "Ln3/d<",
            "-",
            "Le4/a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Le4/a$a;->g:Le4/a;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ln3/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Le4/a$a;->f:Ljava/lang/Object;

    iget p1, p0, Le4/a$a;->h:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Le4/a$a;->h:I

    iget-object p1, p0, Le4/a$a;->g:Le4/a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Le4/a;->a(Le4/c;Ln3/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
