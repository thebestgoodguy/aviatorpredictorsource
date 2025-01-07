.class public Lv2/u;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/lang/Exception;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lv2/u;->a:Ljava/lang/Exception;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv2/u;->a:Ljava/lang/Exception;

    return-void
.end method

.method public static a()Lv2/u;
    .locals 1

    new-instance v0, Lv2/u;

    invoke-direct {v0}, Lv2/u;-><init>()V

    return-object v0
.end method

.method public static b(Ljava/lang/Exception;)Lv2/u;
    .locals 1

    new-instance v0, Lv2/u;

    invoke-direct {v0, p0}, Lv2/u;-><init>(Ljava/lang/Exception;)V

    return-object v0
.end method
