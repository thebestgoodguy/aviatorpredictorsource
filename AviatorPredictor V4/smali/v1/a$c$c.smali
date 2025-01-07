.class public final enum Lv1/a$c$c;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv1/a$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lv1/a$c$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum f:Lv1/a$c$c;

.field public static final enum g:Lv1/a$c$c;

.field public static final enum h:Lv1/a$c$c;

.field private static final synthetic i:[Lv1/a$c$c;


# instance fields
.field private final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lv1/a$c$c;

    const-string v1, "ORDER"

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lv1/a$c$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lv1/a$c$c;->f:Lv1/a$c$c;

    new-instance v1, Lv1/a$c$c;

    const-string v4, "ARRAY_CONFIG"

    const/4 v5, 0x1

    const/4 v6, 0x3

    invoke-direct {v1, v4, v5, v6}, Lv1/a$c$c;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lv1/a$c$c;->g:Lv1/a$c$c;

    new-instance v4, Lv1/a$c$c;

    const-string v7, "VALUEMODE_NOT_SET"

    invoke-direct {v4, v7, v3, v2}, Lv1/a$c$c;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lv1/a$c$c;->h:Lv1/a$c$c;

    new-array v6, v6, [Lv1/a$c$c;

    aput-object v0, v6, v2

    aput-object v1, v6, v5

    aput-object v4, v6, v3

    sput-object v6, Lv1/a$c$c;->i:[Lv1/a$c$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lv1/a$c$c;->e:I

    return-void
.end method

.method public static d(I)Lv1/a$c$c;
    .locals 1

    if-eqz p0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lv1/a$c$c;->g:Lv1/a$c$c;

    return-object p0

    :cond_1
    sget-object p0, Lv1/a$c$c;->f:Lv1/a$c$c;

    return-object p0

    :cond_2
    sget-object p0, Lv1/a$c$c;->h:Lv1/a$c$c;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lv1/a$c$c;
    .locals 1

    const-class v0, Lv1/a$c$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lv1/a$c$c;

    return-object p0
.end method

.method public static values()[Lv1/a$c$c;
    .locals 1

    sget-object v0, Lv1/a$c$c;->i:[Lv1/a$c$c;

    invoke-virtual {v0}, [Lv1/a$c$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lv1/a$c$c;

    return-object v0
.end method
