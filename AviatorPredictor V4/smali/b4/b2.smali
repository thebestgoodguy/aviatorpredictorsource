.class public final Lb4/b2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb4/y0;
.implements Lb4/r;


# static fields
.field public static final e:Lb4/b2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb4/b2;

    invoke-direct {v0}, Lb4/b2;-><init>()V

    sput-object v0, Lb4/b2;->e:Lb4/b2;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 0

    return-void
.end method

.method public getParent()Lb4/p1;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public i(Ljava/lang/Throwable;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NonDisposableHandle"

    return-object v0
.end method
