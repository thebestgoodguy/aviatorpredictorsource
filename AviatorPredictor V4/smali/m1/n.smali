.class public Lm1/n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lm1/p;


# static fields
.field private static final a:Lm1/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm1/n;

    invoke-direct {v0}, Lm1/n;-><init>()V

    sput-object v0, Lm1/n;->a:Lm1/n;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d()Lm1/n;
    .locals 1

    sget-object v0, Lm1/n;->a:Lm1/n;

    return-object v0
.end method


# virtual methods
.method public a(Lx1/x;Lx0/o;)Lx1/x;
    .locals 0

    invoke-static {p2, p1}, Ll1/v;->d(Lx0/o;Lx1/x;)Lx1/x;

    move-result-object p1

    return-object p1
.end method

.method public b(Lx1/x;Lx1/x;)Lx1/x;
    .locals 0

    return-object p2
.end method

.method public c(Lx1/x;)Lx1/x;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method
