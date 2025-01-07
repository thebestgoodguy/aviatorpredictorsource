.class public final synthetic Ll1/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic e:Ll1/g;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ll1/g;

    invoke-direct {v0}, Ll1/g;-><init>()V

    sput-object v0, Ll1/g;->e:Ll1/g;

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

    check-cast p1, Ll1/i;

    check-cast p2, Ll1/i;

    invoke-static {p1, p2}, Ll1/h;->a(Ll1/i;Ll1/i;)I

    move-result p1

    return p1
.end method
