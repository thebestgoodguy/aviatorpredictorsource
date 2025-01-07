.class Lw1/a$c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/protobuf/d0$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw1/a$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/protobuf/d0$d<",
        "Lw1/a$c;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(I)Lcom/google/protobuf/d0$c;
    .locals 0

    invoke-virtual {p0, p1}, Lw1/a$c$a;->b(I)Lw1/a$c;

    move-result-object p1

    return-object p1
.end method

.method public b(I)Lw1/a$c;
    .locals 0

    invoke-static {p1}, Lw1/a$c;->d(I)Lw1/a$c;

    move-result-object p1

    return-object p1
.end method
