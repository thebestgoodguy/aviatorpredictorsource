.class Lcom/bumptech/glide/load/model/UnitModelLoader$UnitFetcher;
.super Ljava/lang/Object;
.source "UnitModelLoader.java"

# interfaces
.implements Lcom/bumptech/glide/load/data/DataFetcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bumptech/glide/load/model/UnitModelLoader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "UnitFetcher"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Model:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/data/DataFetcher",
        "<TModel;>;"
    }
.end annotation


# instance fields
.field private final resource:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TModel;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TModel;)V"
        }
    .end annotation

    .prologue
    .line 48
    .local p0, "this":Lcom/bumptech/glide/load/model/UnitModelLoader$UnitFetcher;, "Lcom/bumptech/glide/load/model/UnitModelLoader$UnitFetcher<TModel;>;"
    .local p1, "resource":Ljava/lang/Object;, "TModel;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Lcom/bumptech/glide/load/model/UnitModelLoader$UnitFetcher;->resource:Ljava/lang/Object;

    .line 50
    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 0

    .prologue
    .line 66
    .local p0, "this":Lcom/bumptech/glide/load/model/UnitModelLoader$UnitFetcher;, "Lcom/bumptech/glide/load/model/UnitModelLoader$UnitFetcher<TModel;>;"
    return-void
.end method

.method public cleanup()V
    .locals 0

    .prologue
    .line 61
    .local p0, "this":Lcom/bumptech/glide/load/model/UnitModelLoader$UnitFetcher;, "Lcom/bumptech/glide/load/model/UnitModelLoader$UnitFetcher<TModel;>;"
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
            "<TModel;>;"
        }
    .end annotation

    .prologue
    .line 72
    .local p0, "this":Lcom/bumptech/glide/load/model/UnitModelLoader$UnitFetcher;, "Lcom/bumptech/glide/load/model/UnitModelLoader$UnitFetcher<TModel;>;"
    iget-object v0, p0, Lcom/bumptech/glide/load/model/UnitModelLoader$UnitFetcher;->resource:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public getDataSource()Lcom/bumptech/glide/load/DataSource;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .prologue
    .line 78
    .local p0, "this":Lcom/bumptech/glide/load/model/UnitModelLoader$UnitFetcher;, "Lcom/bumptech/glide/load/model/UnitModelLoader$UnitFetcher<TModel;>;"
    sget-object v0, Lcom/bumptech/glide/load/DataSource;->LOCAL:Lcom/bumptech/glide/load/DataSource;

    return-object v0
.end method

.method public loadData(Lcom/bumptech/glide/Priority;Lcom/bumptech/glide/load/data/DataFetcher$DataCallback;)V
    .locals 1
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
            "<-TModel;>;)V"
        }
    .end annotation

    .prologue
    .line 55
    .local p0, "this":Lcom/bumptech/glide/load/model/UnitModelLoader$UnitFetcher;, "Lcom/bumptech/glide/load/model/UnitModelLoader$UnitFetcher<TModel;>;"
    .local p2, "callback":Lcom/bumptech/glide/load/data/DataFetcher$DataCallback;, "Lcom/bumptech/glide/load/data/DataFetcher$DataCallback<-TModel;>;"
    iget-object v0, p0, Lcom/bumptech/glide/load/model/UnitModelLoader$UnitFetcher;->resource:Ljava/lang/Object;

    invoke-interface {p2, v0}, Lcom/bumptech/glide/load/data/DataFetcher$DataCallback;->onDataReady(Ljava/lang/Object;)V

    .line 56
    return-void
.end method
