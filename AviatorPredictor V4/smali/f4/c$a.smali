.class final Lf4/c$a;
.super Lkotlin/jvm/internal/j;
.source ""

# interfaces
.implements Lu3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf4/c;-><init>(Le4/c;Ln3/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/j;",
        "Lu3/p<",
        "Ljava/lang/Integer;",
        "Ln3/g$b;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# static fields
.field public static final e:Lf4/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf4/c$a;

    invoke-direct {v0}, Lf4/c$a;-><init>()V

    sput-object v0, Lf4/c$a;->e:Lf4/c$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(ILn3/g$b;)Ljava/lang/Integer;
    .locals 0

    add-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Ln3/g$b;

    invoke-virtual {p0, p1, p2}, Lf4/c$a;->a(ILn3/g$b;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
