.class abstract Lcom/google/protobuf/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/protobuf/l1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/g$b;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/g$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/protobuf/g;-><init>()V

    return-void
.end method

.method public static S(Ljava/nio/ByteBuffer;Z)Lcom/google/protobuf/g;
    .locals 1

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/protobuf/g$b;

    invoke-direct {v0, p0, p1}, Lcom/google/protobuf/g$b;-><init>(Ljava/nio/ByteBuffer;Z)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Direct buffers not yet supported"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
