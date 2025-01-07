.class public final synthetic Ll1/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic e:Ll1/p;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ll1/p;

    invoke-direct {v0}, Ll1/p;-><init>()V

    sput-object v0, Ll1/p;->e:Ll1/p;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ll1/s;

    check-cast p2, Ll1/s;

    invoke-static {p1, p2}, Ll1/q$a;->d(Ll1/s;Ll1/s;)I

    move-result p1

    return p1
.end method
