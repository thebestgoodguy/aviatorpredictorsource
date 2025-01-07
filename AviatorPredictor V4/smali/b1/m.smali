.class public final synthetic Lb1/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lr1/b;


# static fields
.field public static final synthetic a:Lb1/m;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lb1/m;

    invoke-direct {v0}, Lb1/m;-><init>()V

    sput-object v0, Lb1/m;->a:Lb1/m;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
