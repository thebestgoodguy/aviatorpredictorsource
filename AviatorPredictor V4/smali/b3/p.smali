.class public final enum Lb3/p;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lb3/p;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum e:Lb3/p;

.field public static final enum f:Lb3/p;

.field public static final enum g:Lb3/p;

.field public static final enum h:Lb3/p;

.field public static final enum i:Lb3/p;

.field private static final synthetic j:[Lb3/p;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lb3/p;

    const-string v1, "CONNECTING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lb3/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb3/p;->e:Lb3/p;

    new-instance v1, Lb3/p;

    const-string v3, "READY"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lb3/p;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lb3/p;->f:Lb3/p;

    new-instance v3, Lb3/p;

    const-string v5, "TRANSIENT_FAILURE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lb3/p;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lb3/p;->g:Lb3/p;

    new-instance v5, Lb3/p;

    const-string v7, "IDLE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lb3/p;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lb3/p;->h:Lb3/p;

    new-instance v7, Lb3/p;

    const-string v9, "SHUTDOWN"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lb3/p;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lb3/p;->i:Lb3/p;

    const/4 v9, 0x5

    new-array v9, v9, [Lb3/p;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, Lb3/p;->j:[Lb3/p;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb3/p;
    .locals 1

    const-class v0, Lb3/p;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb3/p;

    return-object p0
.end method

.method public static values()[Lb3/p;
    .locals 1

    sget-object v0, Lb3/p;->j:[Lb3/p;

    invoke-virtual {v0}, [Lb3/p;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb3/p;

    return-object v0
.end method
