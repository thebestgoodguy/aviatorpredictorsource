.class public final synthetic Lk1/y;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lk1/f0;

.field public final synthetic f:Lcom/google/protobuf/j;


# direct methods
.method public synthetic constructor <init>(Lk1/f0;Lcom/google/protobuf/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/y;->e:Lk1/f0;

    iput-object p2, p0, Lk1/y;->f:Lcom/google/protobuf/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lk1/y;->e:Lk1/f0;

    iget-object v1, p0, Lk1/y;->f:Lcom/google/protobuf/j;

    invoke-static {v0, v1}, Lk1/f0;->j(Lk1/f0;Lcom/google/protobuf/j;)V

    return-void
.end method
