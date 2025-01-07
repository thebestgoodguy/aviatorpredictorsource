.class abstract Lcom/google/protobuf/j$i;
.super Lcom/google/protobuf/j;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "i"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/protobuf/j;-><init>()V

    return-void
.end method


# virtual methods
.method protected final B()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected final D()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method abstract X(Lcom/google/protobuf/j;II)Z
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-super {p0}, Lcom/google/protobuf/j;->F()Lcom/google/protobuf/j$g;

    move-result-object v0

    return-object v0
.end method
