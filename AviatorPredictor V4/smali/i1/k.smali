.class public final synthetic Li1/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/t;


# static fields
.field public static final synthetic a:Li1/k;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Li1/k;

    invoke-direct {v0}, Li1/k;-><init>()V

    sput-object v0, Li1/k;->a:Li1/k;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li1/q;

    invoke-static {p1}, Li1/l;->f(Li1/q;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
