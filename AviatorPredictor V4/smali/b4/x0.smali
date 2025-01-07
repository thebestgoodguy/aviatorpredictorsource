.class public final Lb4/x0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lb4/x0;

.field private static final b:Lb4/g0;

.field private static final c:Lb4/g0;

.field private static final d:Lb4/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb4/x0;

    invoke-direct {v0}, Lb4/x0;-><init>()V

    sput-object v0, Lb4/x0;->a:Lb4/x0;

    invoke-static {}, Lb4/f0;->a()Lb4/g0;

    move-result-object v0

    sput-object v0, Lb4/x0;->b:Lb4/g0;

    sget-object v0, Lb4/h2;->f:Lb4/h2;

    sput-object v0, Lb4/x0;->c:Lb4/g0;

    sget-object v0, Lkotlinx/coroutines/scheduling/b;->l:Lkotlinx/coroutines/scheduling/b;

    invoke-virtual {v0}, Lkotlinx/coroutines/scheduling/b;->R()Lb4/g0;

    move-result-object v0

    sput-object v0, Lb4/x0;->d:Lb4/g0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()Lb4/g0;
    .locals 1

    sget-object v0, Lb4/x0;->b:Lb4/g0;

    return-object v0
.end method

.method public static final b()Lb4/g0;
    .locals 1

    sget-object v0, Lb4/x0;->d:Lb4/g0;

    return-object v0
.end method

.method public static final c()Lb4/z1;
    .locals 1

    sget-object v0, Lkotlinx/coroutines/internal/q;->c:Lb4/z1;

    return-object v0
.end method
