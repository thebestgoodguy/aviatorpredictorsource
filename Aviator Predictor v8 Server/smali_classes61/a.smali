.class final enum La;
.super Ljava/lang/Enum;


# static fields
.field public static final enum a:La;

.field public static final enum b:La;

.field public static final enum c:La;

.field public static final enum d:La;

.field public static final enum e:La;

.field public static final enum f:La;

.field public static final enum g:La;

.field public static final enum h:La;

.field public static final enum i:La;

.field public static final enum j:La;

.field public static final enum k:La;

.field public static final enum l:La;

.field public static final enum m:La;

.field public static final enum n:La;

.field private static final o:Lag;

.field private static final synthetic p:[La;


# instance fields
.field private final q:I


# direct methods
.method static constructor <clinit>()V
    .locals 17

    new-instance v0, La;

    const-string v1, "RESPONSE_CODE_UNSPECIFIED"

    const/4 v2, 0x0

    const/16 v3, -0x3e7

    invoke-direct {v0, v1, v2, v3}, La;-><init>(Ljava/lang/String;II)V

    sput-object v0, La;->a:La;

    new-instance v1, La;

    const-string v3, "SERVICE_TIMEOUT"

    const/4 v4, 0x1

    const/4 v5, -0x3

    invoke-direct {v1, v3, v4, v5}, La;-><init>(Ljava/lang/String;II)V

    sput-object v1, La;->b:La;

    new-instance v3, La;

    const-string v5, "FEATURE_NOT_SUPPORTED"

    const/4 v6, 0x2

    const/4 v7, -0x2

    invoke-direct {v3, v5, v6, v7}, La;-><init>(Ljava/lang/String;II)V

    sput-object v3, La;->c:La;

    new-instance v5, La;

    const-string v7, "SERVICE_DISCONNECTED"

    const/4 v8, 0x3

    const/4 v9, -0x1

    invoke-direct {v5, v7, v8, v9}, La;-><init>(Ljava/lang/String;II)V

    sput-object v5, La;->d:La;

    new-instance v7, La;

    const-string v9, "OK"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v2}, La;-><init>(Ljava/lang/String;II)V

    sput-object v7, La;->e:La;

    new-instance v9, La;

    const-string v11, "USER_CANCELED"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12, v4}, La;-><init>(Ljava/lang/String;II)V

    sput-object v9, La;->f:La;

    new-instance v11, La;

    const-string v13, "SERVICE_UNAVAILABLE"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14, v6}, La;-><init>(Ljava/lang/String;II)V

    sput-object v11, La;->g:La;

    new-instance v13, La;

    const-string v15, "BILLING_UNAVAILABLE"

    const/4 v6, 0x7

    invoke-direct {v13, v15, v6, v8}, La;-><init>(Ljava/lang/String;II)V

    sput-object v13, La;->h:La;

    new-instance v15, La;

    const-string v8, "ITEM_UNAVAILABLE"

    const/16 v4, 0x8

    invoke-direct {v15, v8, v4, v10}, La;-><init>(Ljava/lang/String;II)V

    sput-object v15, La;->i:La;

    new-instance v8, La;

    const-string v10, "DEVELOPER_ERROR"

    const/16 v2, 0x9

    invoke-direct {v8, v10, v2, v12}, La;-><init>(Ljava/lang/String;II)V

    sput-object v8, La;->j:La;

    new-instance v10, La;

    const-string v2, "ERROR"

    const/16 v12, 0xa

    invoke-direct {v10, v2, v12, v14}, La;-><init>(Ljava/lang/String;II)V

    sput-object v10, La;->k:La;

    new-instance v2, La;

    const-string v12, "ITEM_ALREADY_OWNED"

    const/16 v14, 0xb

    invoke-direct {v2, v12, v14, v6}, La;-><init>(Ljava/lang/String;II)V

    sput-object v2, La;->l:La;

    new-instance v12, La;

    const-string v6, "ITEM_NOT_OWNED"

    const/16 v14, 0xc

    invoke-direct {v12, v6, v14, v4}, La;-><init>(Ljava/lang/String;II)V

    sput-object v12, La;->m:La;

    new-instance v6, La;

    const-string v14, "EXPIRED_OFFER_TOKEN"

    const/16 v4, 0xd

    move-object/from16 v16, v12

    const/16 v12, 0xb

    invoke-direct {v6, v14, v4, v12}, La;-><init>(Ljava/lang/String;II)V

    sput-object v6, La;->n:La;

    const/16 v12, 0xe

    new-array v12, v12, [La;

    const/4 v14, 0x0

    aput-object v0, v12, v14

    const/4 v0, 0x1

    aput-object v1, v12, v0

    const/4 v0, 0x2

    aput-object v3, v12, v0

    const/4 v0, 0x3

    aput-object v5, v12, v0

    const/4 v0, 0x4

    aput-object v7, v12, v0

    const/4 v0, 0x5

    aput-object v9, v12, v0

    const/4 v0, 0x6

    aput-object v11, v12, v0

    const/4 v0, 0x7

    aput-object v13, v12, v0

    const/16 v0, 0x8

    aput-object v15, v12, v0

    const/16 v0, 0x9

    aput-object v8, v12, v0

    const/16 v0, 0xa

    aput-object v10, v12, v0

    const/16 v0, 0xb

    aput-object v2, v12, v0

    const/16 v0, 0xc

    aput-object v16, v12, v0

    aput-object v6, v12, v4

    sput-object v12, La;->p:[La;

    new-instance v0, Laf;

    invoke-direct {v0}, Laf;-><init>()V

    invoke-static {}, La;->values()[La;

    move-result-object v1

    array-length v2, v1

    :goto_0
    if-ge v14, v2, :cond_0

    aget-object v3, v1, v14

    iget v4, v3, La;->q:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4, v3}, Laf;->a(Ljava/lang/Object;Ljava/lang/Object;)Laf;

    add-int/lit8 v14, v14, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Laf;->a()Lag;

    move-result-object v0

    sput-object v0, La;->o:Lag;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, La;->q:I

    return-void
.end method

.method static a(I)La;
    .locals 2

    sget-object v0, La;->o:Lag;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0, p0}, Lag;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object p0, La;->a:La;

    return-object p0

    :cond_0
    invoke-virtual {v0, p0}, Lag;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La;

    return-object p0
.end method

.method public static values()[La;
    .locals 1

    sget-object v0, La;->p:[La;

    invoke-virtual {v0}, [La;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La;

    return-object v0
.end method
