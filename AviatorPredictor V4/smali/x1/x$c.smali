.class public final enum Lx1/x$c;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lx1/x$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum f:Lx1/x$c;

.field public static final enum g:Lx1/x$c;

.field public static final enum h:Lx1/x$c;

.field public static final enum i:Lx1/x$c;

.field public static final enum j:Lx1/x$c;

.field public static final enum k:Lx1/x$c;

.field public static final enum l:Lx1/x$c;

.field public static final enum m:Lx1/x$c;

.field public static final enum n:Lx1/x$c;

.field public static final enum o:Lx1/x$c;

.field public static final enum p:Lx1/x$c;

.field public static final enum q:Lx1/x$c;

.field private static final synthetic r:[Lx1/x$c;


# instance fields
.field private final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Lx1/x$c;

    const-string v1, "NULL_VALUE"

    const/4 v2, 0x0

    const/16 v3, 0xb

    invoke-direct {v0, v1, v2, v3}, Lx1/x$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lx1/x$c;->f:Lx1/x$c;

    new-instance v1, Lx1/x$c;

    const-string v4, "BOOLEAN_VALUE"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v5}, Lx1/x$c;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lx1/x$c;->g:Lx1/x$c;

    new-instance v4, Lx1/x$c;

    const-string v6, "INTEGER_VALUE"

    const/4 v7, 0x2

    invoke-direct {v4, v6, v7, v7}, Lx1/x$c;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lx1/x$c;->h:Lx1/x$c;

    new-instance v6, Lx1/x$c;

    const-string v8, "DOUBLE_VALUE"

    const/4 v9, 0x3

    invoke-direct {v6, v8, v9, v9}, Lx1/x$c;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lx1/x$c;->i:Lx1/x$c;

    new-instance v8, Lx1/x$c;

    const-string v10, "TIMESTAMP_VALUE"

    const/4 v11, 0x4

    const/16 v12, 0xa

    invoke-direct {v8, v10, v11, v12}, Lx1/x$c;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lx1/x$c;->j:Lx1/x$c;

    new-instance v10, Lx1/x$c;

    const-string v13, "STRING_VALUE"

    const/4 v14, 0x5

    const/16 v15, 0x11

    invoke-direct {v10, v13, v14, v15}, Lx1/x$c;-><init>(Ljava/lang/String;II)V

    sput-object v10, Lx1/x$c;->k:Lx1/x$c;

    new-instance v13, Lx1/x$c;

    const-string v15, "BYTES_VALUE"

    const/4 v11, 0x6

    const/16 v9, 0x12

    invoke-direct {v13, v15, v11, v9}, Lx1/x$c;-><init>(Ljava/lang/String;II)V

    sput-object v13, Lx1/x$c;->l:Lx1/x$c;

    new-instance v9, Lx1/x$c;

    const-string v15, "REFERENCE_VALUE"

    const/4 v7, 0x7

    invoke-direct {v9, v15, v7, v14}, Lx1/x$c;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lx1/x$c;->m:Lx1/x$c;

    new-instance v15, Lx1/x$c;

    const-string v7, "GEO_POINT_VALUE"

    const/16 v14, 0x8

    invoke-direct {v15, v7, v14, v14}, Lx1/x$c;-><init>(Ljava/lang/String;II)V

    sput-object v15, Lx1/x$c;->n:Lx1/x$c;

    new-instance v7, Lx1/x$c;

    const-string v14, "ARRAY_VALUE"

    const/16 v5, 0x9

    invoke-direct {v7, v14, v5, v5}, Lx1/x$c;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lx1/x$c;->o:Lx1/x$c;

    new-instance v14, Lx1/x$c;

    const-string v5, "MAP_VALUE"

    invoke-direct {v14, v5, v12, v11}, Lx1/x$c;-><init>(Ljava/lang/String;II)V

    sput-object v14, Lx1/x$c;->p:Lx1/x$c;

    new-instance v5, Lx1/x$c;

    const-string v12, "VALUETYPE_NOT_SET"

    invoke-direct {v5, v12, v3, v2}, Lx1/x$c;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lx1/x$c;->q:Lx1/x$c;

    const/16 v12, 0xc

    new-array v12, v12, [Lx1/x$c;

    aput-object v0, v12, v2

    const/4 v0, 0x1

    aput-object v1, v12, v0

    const/4 v0, 0x2

    aput-object v4, v12, v0

    const/4 v0, 0x3

    aput-object v6, v12, v0

    const/4 v0, 0x4

    aput-object v8, v12, v0

    const/4 v0, 0x5

    aput-object v10, v12, v0

    aput-object v13, v12, v11

    const/4 v0, 0x7

    aput-object v9, v12, v0

    const/16 v0, 0x8

    aput-object v15, v12, v0

    const/16 v0, 0x9

    aput-object v7, v12, v0

    const/16 v0, 0xa

    aput-object v14, v12, v0

    aput-object v5, v12, v3

    sput-object v12, Lx1/x$c;->r:[Lx1/x$c;

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

    iput p3, p0, Lx1/x$c;->e:I

    return-void
.end method

.method public static d(I)Lx1/x$c;
    .locals 1

    if-eqz p0, :cond_7

    const/4 v0, 0x1

    if-eq p0, v0, :cond_6

    const/4 v0, 0x2

    if-eq p0, v0, :cond_5

    const/4 v0, 0x3

    if-eq p0, v0, :cond_4

    const/4 v0, 0x5

    if-eq p0, v0, :cond_3

    const/4 v0, 0x6

    if-eq p0, v0, :cond_2

    const/16 v0, 0x11

    if-eq p0, v0, :cond_1

    const/16 v0, 0x12

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, Lx1/x$c;->f:Lx1/x$c;

    return-object p0

    :pswitch_1
    sget-object p0, Lx1/x$c;->j:Lx1/x$c;

    return-object p0

    :pswitch_2
    sget-object p0, Lx1/x$c;->o:Lx1/x$c;

    return-object p0

    :pswitch_3
    sget-object p0, Lx1/x$c;->n:Lx1/x$c;

    return-object p0

    :cond_0
    sget-object p0, Lx1/x$c;->l:Lx1/x$c;

    return-object p0

    :cond_1
    sget-object p0, Lx1/x$c;->k:Lx1/x$c;

    return-object p0

    :cond_2
    sget-object p0, Lx1/x$c;->p:Lx1/x$c;

    return-object p0

    :cond_3
    sget-object p0, Lx1/x$c;->m:Lx1/x$c;

    return-object p0

    :cond_4
    sget-object p0, Lx1/x$c;->i:Lx1/x$c;

    return-object p0

    :cond_5
    sget-object p0, Lx1/x$c;->h:Lx1/x$c;

    return-object p0

    :cond_6
    sget-object p0, Lx1/x$c;->g:Lx1/x$c;

    return-object p0

    :cond_7
    sget-object p0, Lx1/x$c;->q:Lx1/x$c;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lx1/x$c;
    .locals 1

    const-class v0, Lx1/x$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lx1/x$c;

    return-object p0
.end method

.method public static values()[Lx1/x$c;
    .locals 1

    sget-object v0, Lx1/x$c;->r:[Lx1/x$c;

    invoke-virtual {v0}, [Lx1/x$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lx1/x$c;

    return-object v0
.end method
