.class public final synthetic Lk1/d2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic e:Lk1/d2;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lk1/d2;

    invoke-direct {v0}, Lk1/d2;-><init>()V

    sput-object v0, Lk1/d2;->e:Lk1/d2;

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

    check-cast p1, Lm1/g;

    check-cast p2, Lm1/g;

    invoke-static {p1, p2}, Lk1/n2;->u(Lm1/g;Lm1/g;)I

    move-result p1

    return p1
.end method
