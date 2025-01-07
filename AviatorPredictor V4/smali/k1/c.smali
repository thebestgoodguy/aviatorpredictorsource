.class public final synthetic Lk1/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic e:Lk1/c;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lk1/c;

    invoke-direct {v0}, Lk1/c;-><init>()V

    sput-object v0, Lk1/c;->e:Lk1/c;

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

    check-cast p1, Lk1/e;

    check-cast p2, Lk1/e;

    invoke-static {p1, p2}, Lk1/e;->a(Lk1/e;Lk1/e;)I

    move-result p1

    return p1
.end method
