.class public final Lf4/d;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Lu3/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu3/q<",
            "Le4/c<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Object;",
            "Ln3/d<",
            "-",
            "Lk3/s;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lf4/d$a;->e:Lf4/d$a;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu3/q;

    sput-object v0, Lf4/d;->a:Lu3/q;

    return-void
.end method

.method public static final synthetic a()Lu3/q;
    .locals 1

    sget-object v0, Lf4/d;->a:Lu3/q;

    return-object v0
.end method
