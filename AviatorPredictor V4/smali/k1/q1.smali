.class public final synthetic Lk1/q1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic e:Lk1/q1;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lk1/q1;

    invoke-direct {v0}, Lk1/q1;-><init>()V

    sput-object v0, Lk1/q1;->e:Lk1/q1;

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

    check-cast p1, Ll1/q;

    check-cast p2, Ll1/q;

    invoke-static {p1, p2}, Lk1/y1;->n(Ll1/q;Ll1/q;)I

    move-result p1

    return p1
.end method
