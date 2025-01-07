.class public Lcom/google/protobuf/r;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/r$a;
    }
.end annotation


# static fields
.field private static b:Z = true

.field private static volatile c:Lcom/google/protobuf/r;

.field static final d:Lcom/google/protobuf/r;


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/google/protobuf/r$a;",
            "Lcom/google/protobuf/a0$e<",
            "**>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/protobuf/r;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/protobuf/r;-><init>(Z)V

    sput-object v0, Lcom/google/protobuf/r;->d:Lcom/google/protobuf/r;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/protobuf/r;->a:Ljava/util/Map;

    return-void
.end method

.method constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/google/protobuf/r;->a:Ljava/util/Map;

    return-void
.end method

.method public static b()Lcom/google/protobuf/r;
    .locals 2

    sget-object v0, Lcom/google/protobuf/r;->c:Lcom/google/protobuf/r;

    if-nez v0, :cond_2

    const-class v1, Lcom/google/protobuf/r;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/protobuf/r;->c:Lcom/google/protobuf/r;

    if-nez v0, :cond_1

    sget-boolean v0, Lcom/google/protobuf/r;->b:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/protobuf/q;->a()Lcom/google/protobuf/r;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/google/protobuf/r;->d:Lcom/google/protobuf/r;

    :goto_0
    sput-object v0, Lcom/google/protobuf/r;->c:Lcom/google/protobuf/r;

    :cond_1
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :goto_1
    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/protobuf/v0;I)Lcom/google/protobuf/a0$e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ContainingType::",
            "Lcom/google/protobuf/v0;",
            ">(TContainingType;I)",
            "Lcom/google/protobuf/a0$e<",
            "TContainingType;*>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/protobuf/r;->a:Ljava/util/Map;

    new-instance v1, Lcom/google/protobuf/r$a;

    invoke-direct {v1, p1, p2}, Lcom/google/protobuf/r$a;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/protobuf/a0$e;

    return-object p1
.end method
