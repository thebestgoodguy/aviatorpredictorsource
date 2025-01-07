.class abstract Li0/j$b;
.super Li0/e;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li0/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Li0/e<",
        "Lk0/d$b;",
        ">;"
    }
.end annotation


# instance fields
.field protected s:Li0/f;


# direct methods
.method public constructor <init>(Lt/f;)V
    .locals 0

    invoke-direct {p0, p1}, Li0/e;-><init>(Lt/f;)V

    new-instance p1, Li0/l;

    invoke-direct {p1, p0}, Li0/l;-><init>(Li0/j$b;)V

    iput-object p1, p0, Li0/j$b;->s:Li0/f;

    return-void
.end method


# virtual methods
.method protected synthetic c(Lcom/google/android/gms/common/api/Status;)Lt/k;
    .locals 2

    new-instance v0, Li0/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Li0/j$a;-><init>(Lcom/google/android/gms/common/api/Status;Lk0/f;)V

    return-object v0
.end method
