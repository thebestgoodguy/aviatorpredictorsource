.class public final synthetic Lx0/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu1/h$a;


# static fields
.field public static final synthetic a:Lx0/g;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lx0/g;

    invoke-direct {v0}, Lx0/g;-><init>()V

    sput-object v0, Lx0/g;->a:Lx0/g;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p1, Landroid/content/Context;

    invoke-static {p1}, Lcom/google/firebase/FirebaseCommonRegistrar;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
