.class Lcom/bumptech/glide/load/model/DataUrlLoader$StreamFactory$1;
.super Ljava/lang/Object;
.source "DataUrlLoader.java"

# interfaces
.implements Lcom/bumptech/glide/load/model/DataUrlLoader$DataDecoder;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bumptech/glide/load/model/DataUrlLoader$StreamFactory;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/model/DataUrlLoader$DataDecoder",
        "<",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/bumptech/glide/load/model/DataUrlLoader$StreamFactory;


# direct methods
.method constructor <init>(Lcom/bumptech/glide/load/model/DataUrlLoader$StreamFactory;)V
    .locals 0
    .param p1, "this$0"    # Lcom/bumptech/glide/load/model/DataUrlLoader$StreamFactory;

    .prologue
    .line 127
    .local p0, "this":Lcom/bumptech/glide/load/model/DataUrlLoader$StreamFactory$1;, "Lcom/bumptech/glide/load/model/DataUrlLoader$StreamFactory$1;"
    iput-object p1, p0, Lcom/bumptech/glide/load/model/DataUrlLoader$StreamFactory$1;->this$0:Lcom/bumptech/glide/load/model/DataUrlLoader$StreamFactory;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public close(Ljava/io/InputStream;)V
    .locals 0
    .param p1, "inputStream"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 152
    .local p0, "this":Lcom/bumptech/glide/load/model/DataUrlLoader$StreamFactory$1;, "Lcom/bumptech/glide/load/model/DataUrlLoader$StreamFactory$1;"
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 153
    return-void
.end method

.method public bridge synthetic close(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 127
    .local p0, "this":Lcom/bumptech/glide/load/model/DataUrlLoader$StreamFactory$1;, "Lcom/bumptech/glide/load/model/DataUrlLoader$StreamFactory$1;"
    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {p0, p1}, Lcom/bumptech/glide/load/model/DataUrlLoader$StreamFactory$1;->close(Ljava/io/InputStream;)V

    return-void
.end method

.method public decode(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 6
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .local p0, "this":Lcom/bumptech/glide/load/model/DataUrlLoader$StreamFactory$1;, "Lcom/bumptech/glide/load/model/DataUrlLoader$StreamFactory$1;"
    const/4 v5, 0x0

    .line 130
    const-string v4, "data:image"

    invoke-virtual {p1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 131
    new-instance v4, Ljava/lang/IllegalArgumentException;

    const-string v5, "Not a valid image data URL."

    invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 134
    :cond_0
    const/16 v4, 0x2c

    invoke-virtual {p1, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    .line 135
    .local v3, "commaIndex":I
    const/4 v4, -0x1

    if-ne v3, v4, :cond_1

    .line 136
    new-instance v4, Ljava/lang/IllegalArgumentException;

    const-string v5, "Missing comma in data URL."

    invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 139
    :cond_1
    invoke-virtual {p1, v5, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 140
    .local v1, "beforeComma":Ljava/lang/String;
    const-string v4, ";base64"

    invoke-virtual {v1, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 141
    new-instance v4, Ljava/lang/IllegalArgumentException;

    const-string v5, "Not a base64 image data URL."

    invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 144
    :cond_2
    add-int/lit8 v4, v3, 0x1

    invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 145
    .local v0, "afterComma":Ljava/lang/String;
    invoke-static {v0, v5}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v2

    .line 147
    .local v2, "bytes":[B
    new-instance v4, Ljava/io/ByteArrayInputStream;

    invoke-direct {v4, v2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    return-object v4
.end method

.method public bridge synthetic decode(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .prologue
    .line 127
    .local p0, "this":Lcom/bumptech/glide/load/model/DataUrlLoader$StreamFactory$1;, "Lcom/bumptech/glide/load/model/DataUrlLoader$StreamFactory$1;"
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/load/model/DataUrlLoader$StreamFactory$1;->decode(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public getDataClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    .prologue
    .line 157
    .local p0, "this":Lcom/bumptech/glide/load/model/DataUrlLoader$StreamFactory$1;, "Lcom/bumptech/glide/load/model/DataUrlLoader$StreamFactory$1;"
    const-class v0, Ljava/io/InputStream;

    return-object v0
.end method
