.class public final synthetic Lk1/i3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/t;


# static fields
.field public static final synthetic a:Lk1/i3;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lk1/i3;

    invoke-direct {v0}, Lk1/i3;-><init>()V

    sput-object v0, Lk1/i3;->a:Lk1/i3;

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

    check-cast p1, Landroid/database/Cursor;

    invoke-static {p1}, Lk1/s3;->d(Landroid/database/Cursor;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
