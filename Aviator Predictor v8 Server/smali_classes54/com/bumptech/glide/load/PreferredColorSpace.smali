.class public final enum Lcom/bumptech/glide/load/PreferredColorSpace;
.super Ljava/lang/Enum;
.source "PreferredColorSpace.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/bumptech/glide/load/PreferredColorSpace;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/bumptech/glide/load/PreferredColorSpace;

.field public static final enum DISPLAY_P3:Lcom/bumptech/glide/load/PreferredColorSpace;

.field public static final enum SRGB:Lcom/bumptech/glide/load/PreferredColorSpace;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 33
    new-instance v0, Lcom/bumptech/glide/load/PreferredColorSpace;

    const-string v1, "SRGB"

    invoke-direct {v0, v1, v2}, Lcom/bumptech/glide/load/PreferredColorSpace;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/bumptech/glide/load/PreferredColorSpace;->SRGB:Lcom/bumptech/glide/load/PreferredColorSpace;

    .line 35
    new-instance v0, Lcom/bumptech/glide/load/PreferredColorSpace;

    const-string v1, "DISPLAY_P3"

    invoke-direct {v0, v1, v3}, Lcom/bumptech/glide/load/PreferredColorSpace;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/bumptech/glide/load/PreferredColorSpace;->DISPLAY_P3:Lcom/bumptech/glide/load/PreferredColorSpace;

    .line 31
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/bumptech/glide/load/PreferredColorSpace;

    sget-object v1, Lcom/bumptech/glide/load/PreferredColorSpace;->SRGB:Lcom/bumptech/glide/load/PreferredColorSpace;

    aput-object v1, v0, v2

    sget-object v1, Lcom/bumptech/glide/load/PreferredColorSpace;->DISPLAY_P3:Lcom/bumptech/glide/load/PreferredColorSpace;

    aput-object v1, v0, v3

    sput-object v0, Lcom/bumptech/glide/load/PreferredColorSpace;->$VALUES:[Lcom/bumptech/glide/load/PreferredColorSpace;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 31
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/bumptech/glide/load/PreferredColorSpace;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 31
    const-class v0, Lcom/bumptech/glide/load/PreferredColorSpace;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/load/PreferredColorSpace;

    return-object v0
.end method

.method public static values()[Lcom/bumptech/glide/load/PreferredColorSpace;
    .locals 1

    .prologue
    .line 31
    sget-object v0, Lcom/bumptech/glide/load/PreferredColorSpace;->$VALUES:[Lcom/bumptech/glide/load/PreferredColorSpace;

    invoke-virtual {v0}, [Lcom/bumptech/glide/load/PreferredColorSpace;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/bumptech/glide/load/PreferredColorSpace;

    return-object v0
.end method
