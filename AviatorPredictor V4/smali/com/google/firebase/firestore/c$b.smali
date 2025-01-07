.class public final enum Lcom/google/firebase/firestore/c$b;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/firestore/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/firebase/firestore/c$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum e:Lcom/google/firebase/firestore/c$b;

.field public static final enum f:Lcom/google/firebase/firestore/c$b;

.field public static final enum g:Lcom/google/firebase/firestore/c$b;

.field private static final synthetic h:[Lcom/google/firebase/firestore/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/google/firebase/firestore/c$b;

    const-string v1, "ADDED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/firebase/firestore/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/firebase/firestore/c$b;->e:Lcom/google/firebase/firestore/c$b;

    new-instance v1, Lcom/google/firebase/firestore/c$b;

    const-string v3, "MODIFIED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/google/firebase/firestore/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/google/firebase/firestore/c$b;->f:Lcom/google/firebase/firestore/c$b;

    new-instance v3, Lcom/google/firebase/firestore/c$b;

    const-string v5, "REMOVED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/google/firebase/firestore/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/google/firebase/firestore/c$b;->g:Lcom/google/firebase/firestore/c$b;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/google/firebase/firestore/c$b;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lcom/google/firebase/firestore/c$b;->h:[Lcom/google/firebase/firestore/c$b;

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

.method public static valueOf(Ljava/lang/String;)Lcom/google/firebase/firestore/c$b;
    .locals 1

    const-class v0, Lcom/google/firebase/firestore/c$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/firestore/c$b;

    return-object p0
.end method

.method public static values()[Lcom/google/firebase/firestore/c$b;
    .locals 1

    sget-object v0, Lcom/google/firebase/firestore/c$b;->h:[Lcom/google/firebase/firestore/c$b;

    invoke-virtual {v0}, [Lcom/google/firebase/firestore/c$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/firebase/firestore/c$b;

    return-object v0
.end method
