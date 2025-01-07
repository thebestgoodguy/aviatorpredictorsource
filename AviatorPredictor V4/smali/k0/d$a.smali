.class public Lk0/d$a;
.super Lt/j;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk0/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt/j<",
        "Lk0/d$b;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lt/j;-><init>()V

    return-void
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lt/j;->a()Lt/k;

    move-result-object v0

    check-cast v0, Lk0/d$b;

    invoke-interface {v0}, Lk0/d$b;->v()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
