.class public final enum Lq2/i$f;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq2/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lq2/i$f;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum f:Lq2/i$f;

.field public static final enum g:Lq2/i$f;

.field public static final enum h:Lq2/i$f;

.field public static final enum i:Lq2/i$f;

.field private static final synthetic j:[Lq2/i$f;


# instance fields
.field private e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lq2/i$f;

    const-string v1, "PORTRAIT_UP"

    const/4 v2, 0x0

    const-string v3, "DeviceOrientation.portraitUp"

    invoke-direct {v0, v1, v2, v3}, Lq2/i$f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lq2/i$f;->f:Lq2/i$f;

    new-instance v1, Lq2/i$f;

    const-string v3, "PORTRAIT_DOWN"

    const/4 v4, 0x1

    const-string v5, "DeviceOrientation.portraitDown"

    invoke-direct {v1, v3, v4, v5}, Lq2/i$f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lq2/i$f;->g:Lq2/i$f;

    new-instance v3, Lq2/i$f;

    const-string v5, "LANDSCAPE_LEFT"

    const/4 v6, 0x2

    const-string v7, "DeviceOrientation.landscapeLeft"

    invoke-direct {v3, v5, v6, v7}, Lq2/i$f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lq2/i$f;->h:Lq2/i$f;

    new-instance v5, Lq2/i$f;

    const-string v7, "LANDSCAPE_RIGHT"

    const/4 v8, 0x3

    const-string v9, "DeviceOrientation.landscapeRight"

    invoke-direct {v5, v7, v8, v9}, Lq2/i$f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lq2/i$f;->i:Lq2/i$f;

    const/4 v7, 0x4

    new-array v7, v7, [Lq2/i$f;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lq2/i$f;->j:[Lq2/i$f;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lq2/i$f;->e:Ljava/lang/String;

    return-void
.end method

.method static d(Ljava/lang/String;)Lq2/i$f;
    .locals 5

    invoke-static {}, Lq2/i$f;->values()[Lq2/i$f;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget-object v4, v3, Lq2/i$f;->e:Ljava/lang/String;

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/NoSuchFieldException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No such DeviceOrientation: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lq2/i$f;
    .locals 1

    const-class v0, Lq2/i$f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lq2/i$f;

    return-object p0
.end method

.method public static values()[Lq2/i$f;
    .locals 1

    sget-object v0, Lq2/i$f;->j:[Lq2/i$f;

    invoke-virtual {v0}, [Lq2/i$f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lq2/i$f;

    return-object v0
.end method
