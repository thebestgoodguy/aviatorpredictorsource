.class Lcom/bumptech/glide/load/model/ByteArrayLoader$Fetcher;
.super Ljava/lang/Object;
.source "ByteArrayLoader.java"

# interfaces
.implements Lcom/bumptech/glide/load/data/DataFetcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bumptech/glide/load/model/ByteArrayLoader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Fetcher"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Data:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/data/DataFetcher",
        "<TData;>;"
    }
.end annotation


# instance fields
.field private final converter:Lcom/bumptech/glide/load/model/ByteArrayLoader$Converter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/model/ByteArrayLoader$Converter",
            "<TData;>;"
        }
    .end annotation
.end field

.field private final model:[B


# direct methods
.method constructor <init>([BLcom/bumptech/glide/load/model/ByteArrayLoader$Converter;)V
    .locals 0
    .param p1, "model"    # [B
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Lcom/bumptech/glide/load/model/ByteArrayLoader$Converter",
            "<TData;>;)V"
        }
    .end annotation

    .prologue
    .line 60
    .local p0, "this":Lcom/bumptech/glide/load/model/ByteArrayLoader$Fetcher;, "Lcom/bumptech/glide/load/model/ByteArrayLoader$Fetcher<TData;>;"
    .local p2, "converter":Lcom/bumptech/glide/load/model/ByteArrayLoader$Converter;, "Lcom/bumptech/glide/load/model/ByteArrayLoader$Converter<TData;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object p1, p0, Lcom/bumptech/glide/load/model/ByteArrayLoader$Fetcher;->model:[B

    .line 62
    iput-object p2, p0, Lcom/bumptech/glide/load/model/ByteArrayLoader$Fetcher;->converter:Lcom/bumptech/glide/load/model/ByteArrayLoader$Converter;

    .line 63
    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 0

    .prologue
    .line 79
    .local p0, "this":Lcom/bumptech/glide/load/model/ByteArrayLoader$Fetcher;, "Lcom/bumptech/glide/load/model/ByteArrayLoader$Fetcher<TData;>;"
    return-void
.end method

.method public cleanup()V
    .locals 0

    .prologue
    .line 74
    .local p0, "this":Lcom/bumptech/glide/load/model/ByteArrayLoader$Fetcher;, "Lcom/bumptech/glide/load/model/ByteArrayLoader$Fetcher<TData;>;"
    return-void
.end method

.method public getDataClass()Ljava/lang/Class;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<TData;>;"
        }
    .end annotation

    .prologue
    .line 84
    .local p0, "this":Lcom/bumptech/glide/load/model/ByteArrayLoader$Fetcher;, "Lcom/bumptech/glide/load/model/ByteArrayLoader$Fetcher<TData;>;"
    iget-object v0, p0, Lcom/bumptech/glide/load/model/ByteArrayLoader$Fetcher;->converter:Lcom/bumptech/glide/load/model/ByteArrayLoader$Converter;

    invoke-interface {v0}, Lcom/bumptech/glide/load/model/ByteArrayLoader$Converter;->getDataClass()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public getDataSource()Lcom/bumptech/glide/load/DataSource;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .prologue
    .line 90
    .local p0, "this":Lcom/bumptech/glide/load/model/ByteArrayLoader$Fetcher;, "Lcom/bumptech/glide/load/model/ByteArrayLoader$Fetcher<TData;>;"
    sget-object v0, Lcom/bumptech/glide/load/DataSource;->LOCAL:Lcom/bumptech/glide/load/DataSource;

    return-object v0
.end method

.method public loadData(Lcom/bumptech/glide/Priority;Lcom/bumptech/glide/load/data/DataFetcher$DataCallback;)V
    .locals 3
    .param p1, "priority"    # Lcom/bumptech/glide/Priority;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/bumptech/glide/load/data/DataFetcher$DataCallback;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/Priority;",
            "Lcom/bumptech/glide/load/data/DataFetcher$DataCallback",
            "<-TData;>;)V"
        }
    .end annotation

    .prologue
    .line 67
    .local p0, "this":Lcom/bumptech/glide/load/model/ByteArrayLoader$Fetcher;, "Lcom/bumptech/glide/load/model/ByteArrayLoader$Fetcher<TData;>;"
    .local p2, "callback":Lcom/bumptech/glide/load/data/DataFetcher$DataCallback;, "Lcom/bumptech/glide/load/data/DataFetcher$DataCallback<-TData;>;"
    iget-object v1, p0, Lcom/bumptech/glide/load/model/ByteArrayLoader$Fetcher;->converter:Lcom/bumptech/glide/load/model/ByteArrayLoader$Converter;

    iget-object v2, p0, Lcom/bumptech/glide/load/model/ByteArrayLoader$Fetcher;->model:[B

    invoke-interface {v1, v2}, Lcom/bumptech/glide/load/model/ByteArrayLoader$Converter;->convert([B)Ljava/lang/Object;

    move-result-object v0

    .line 68
    .local v0, "result":Ljava/lang/Object;, "TData;"
    invoke-interface {p2, v0}, Lcom/bumptech/glide/load/data/DataFetcher$DataCallback;->onDataReady(Ljava/lang/Object;)V

    .line 69
    return-void
.end method
