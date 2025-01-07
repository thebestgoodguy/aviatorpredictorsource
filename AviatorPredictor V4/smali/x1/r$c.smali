.class final Lx1/r$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# static fields
.field static final a:Lcom/google/protobuf/o0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/o0<",
            "Ljava/lang/String;",
            "Lx1/x;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Lcom/google/protobuf/b2$b;->o:Lcom/google/protobuf/b2$b;

    sget-object v1, Lcom/google/protobuf/b2$b;->q:Lcom/google/protobuf/b2$b;

    invoke-static {}, Lx1/x;->i0()Lx1/x;

    move-result-object v2

    const-string v3, ""

    invoke-static {v0, v3, v1, v2}, Lcom/google/protobuf/o0;->d(Lcom/google/protobuf/b2$b;Ljava/lang/Object;Lcom/google/protobuf/b2$b;Ljava/lang/Object;)Lcom/google/protobuf/o0;

    move-result-object v0

    sput-object v0, Lx1/r$c;->a:Lcom/google/protobuf/o0;

    return-void
.end method
