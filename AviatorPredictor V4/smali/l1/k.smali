.class public final synthetic Ll1/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic e:Ll1/k;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ll1/k;

    invoke-direct {v0}, Ll1/k;-><init>()V

    sput-object v0, Ll1/k;->e:Ll1/k;

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

    check-cast p1, Ll1/l;

    check-cast p2, Ll1/l;

    invoke-virtual {p1, p2}, Ll1/l;->g(Ll1/l;)I

    move-result p1

    return p1
.end method
