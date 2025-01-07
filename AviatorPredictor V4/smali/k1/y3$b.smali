.class Lk1/y3$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk1/y3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field a:Lc1/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc1/e<",
            "Ll1/l;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ll1/l;->i()Lc1/e;

    move-result-object v0

    iput-object v0, p0, Lk1/y3$b;->a:Lc1/e;

    return-void
.end method

.method synthetic constructor <init>(Lk1/y3$a;)V
    .locals 0

    invoke-direct {p0}, Lk1/y3$b;-><init>()V

    return-void
.end method
