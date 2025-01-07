.class Lv1/a$c$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/protobuf/d0$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv1/a$c$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/protobuf/d0$d<",
        "Lv1/a$c$b;",
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

    invoke-virtual {p0, p1}, Lv1/a$c$b$a;->b(I)Lv1/a$c$b;

    move-result-object p1

    return-object p1
.end method

.method public b(I)Lv1/a$c$b;
    .locals 0

    invoke-static {p1}, Lv1/a$c$b;->d(I)Lv1/a$c$b;

    move-result-object p1

    return-object p1
.end method
