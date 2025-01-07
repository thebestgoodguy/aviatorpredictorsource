.class public Lcom/google/protobuf/a0$b;
.super Lcom/google/protobuf/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/google/protobuf/a0<",
        "TT;*>;>",
        "Lcom/google/protobuf/b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final b:Lcom/google/protobuf/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/protobuf/a0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/protobuf/b;-><init>()V

    iput-object p1, p0, Lcom/google/protobuf/a0$b;->b:Lcom/google/protobuf/a0;

    return-void
.end method


# virtual methods
.method public bridge synthetic c(Lcom/google/protobuf/k;Lcom/google/protobuf/r;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/a0$b;->i(Lcom/google/protobuf/k;Lcom/google/protobuf/r;)Lcom/google/protobuf/a0;

    move-result-object p1

    return-object p1
.end method

.method public i(Lcom/google/protobuf/k;Lcom/google/protobuf/r;)Lcom/google/protobuf/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/protobuf/k;",
            "Lcom/google/protobuf/r;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/protobuf/a0$b;->b:Lcom/google/protobuf/a0;

    invoke-static {v0, p1, p2}, Lcom/google/protobuf/a0;->P(Lcom/google/protobuf/a0;Lcom/google/protobuf/k;Lcom/google/protobuf/r;)Lcom/google/protobuf/a0;

    move-result-object p1

    return-object p1
.end method
