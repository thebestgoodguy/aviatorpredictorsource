.class abstract Lcom/bumptech/glide/load/model/stream/QMediaStoreUriLoader$Factory;
.super Ljava/lang/Object;
.source "QMediaStoreUriLoader.java"

# interfaces
.implements Lcom/bumptech/glide/load/model/ModelLoaderFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bumptech/glide/load/model/stream/QMediaStoreUriLoader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "Factory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<DataT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/model/ModelLoaderFactory",
        "<",
        "Landroid/net/Uri;",
        "TDataT;>;"
    }
.end annotation


# instance fields
.field private final context:Landroid/content/Context;

.field private final dataClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<TDataT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/Class;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class",
            "<TDataT;>;)V"
        }
    .end annotation

    .prologue
    .line 248
    .local p0, "this":Lcom/bumptech/glide/load/model/stream/QMediaStoreUriLoader$Factory;, "Lcom/bumptech/glide/load/model/stream/QMediaStoreUriLoader$Factory<TDataT;>;"
    .local p2, "dataClass":Ljava/lang/Class;, "Ljava/lang/Class<TDataT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 249
    iput-object p1, p0, Lcom/bumptech/glide/load/model/stream/QMediaStoreUriLoader$Factory;->context:Landroid/content/Context;

    .line 250
    iput-object p2, p0, Lcom/bumptech/glide/load/model/stream/QMediaStoreUriLoader$Factory;->dataClass:Ljava/lang/Class;

    .line 251
    return-void
.end method


# virtual methods
.method public final build(Lcom/bumptech/glide/load/model/MultiModelLoaderFactory;)Lcom/bumptech/glide/load/model/ModelLoader;
    .locals 5
    .param p1, "multiFactory"    # Lcom/bumptech/glide/load/model/MultiModelLoaderFactory;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/model/MultiModelLoaderFactory;",
            ")",
            "Lcom/bumptech/glide/load/model/ModelLoader",
            "<",
            "Landroid/net/Uri;",
            "TDataT;>;"
        }
    .end annotation

    .prologue
    .line 256
    .local p0, "this":Lcom/bumptech/glide/load/model/stream/QMediaStoreUriLoader$Factory;, "Lcom/bumptech/glide/load/model/stream/QMediaStoreUriLoader$Factory<TDataT;>;"
    new-instance v0, Lcom/bumptech/glide/load/model/stream/QMediaStoreUriLoader;

    iget-object v1, p0, Lcom/bumptech/glide/load/model/stream/QMediaStoreUriLoader$Factory;->context:Landroid/content/Context;

    const-class v2, Ljava/io/File;

    iget-object v3, p0, Lcom/bumptech/glide/load/model/stream/QMediaStoreUriLoader$Factory;->dataClass:Ljava/lang/Class;

    .line 258
    invoke-virtual {p1, v2, v3}, Lcom/bumptech/glide/load/model/MultiModelLoaderFactory;->build(Ljava/lang/Class;Ljava/lang/Class;)Lcom/bumptech/glide/load/model/ModelLoader;

    move-result-object v2

    const-class v3, Landroid/net/Uri;

    iget-object v4, p0, Lcom/bumptech/glide/load/model/stream/QMediaStoreUriLoader$Factory;->dataClass:Ljava/lang/Class;

    .line 259
    invoke-virtual {p1, v3, v4}, Lcom/bumptech/glide/load/model/MultiModelLoaderFactory;->build(Ljava/lang/Class;Ljava/lang/Class;)Lcom/bumptech/glide/load/model/ModelLoader;

    move-result-object v3

    iget-object v4, p0, Lcom/bumptech/glide/load/model/stream/QMediaStoreUriLoader$Factory;->dataClass:Ljava/lang/Class;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/bumptech/glide/load/model/stream/QMediaStoreUriLoader;-><init>(Landroid/content/Context;Lcom/bumptech/glide/load/model/ModelLoader;Lcom/bumptech/glide/load/model/ModelLoader;Ljava/lang/Class;)V

    .line 256
    return-object v0
.end method

.method public final teardown()V
    .locals 0

    .prologue
    .line 266
    .local p0, "this":Lcom/bumptech/glide/load/model/stream/QMediaStoreUriLoader$Factory;, "Lcom/bumptech/glide/load/model/stream/QMediaStoreUriLoader$Factory<TDataT;>;"
    return-void
.end method
