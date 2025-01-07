.class final Lcom/google/protobuf/s1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/protobuf/s1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/protobuf/s1;->a(Lcom/google/protobuf/j;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/protobuf/j;


# direct methods
.method constructor <init>(Lcom/google/protobuf/j;)V
    .locals 0

    iput-object p1, p0, Lcom/google/protobuf/s1$a;->a:Lcom/google/protobuf/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)B
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/s1$a;->a:Lcom/google/protobuf/j;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/j;->r(I)B

    move-result p1

    return p1
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/s1$a;->a:Lcom/google/protobuf/j;

    invoke-virtual {v0}, Lcom/google/protobuf/j;->size()I

    move-result v0

    return v0
.end method
