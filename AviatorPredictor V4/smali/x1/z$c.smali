.class final Lx1/z$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/z;
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
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lcom/google/protobuf/b2$b;->o:Lcom/google/protobuf/b2$b;

    const-string v1, ""

    invoke-static {v0, v1, v0, v1}, Lcom/google/protobuf/o0;->d(Lcom/google/protobuf/b2$b;Ljava/lang/Object;Lcom/google/protobuf/b2$b;Ljava/lang/Object;)Lcom/google/protobuf/o0;

    move-result-object v0

    sput-object v0, Lx1/z$c;->a:Lcom/google/protobuf/o0;

    return-void
.end method
