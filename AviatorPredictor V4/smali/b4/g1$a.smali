.class public final Lb4/g1$a;
.super Ln3/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb4/g1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ln3/b<",
        "Lb4/g0;",
        "Lb4/g1;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 2

    sget-object v0, Lb4/g0;->e:Lb4/g0$a;

    sget-object v1, Lb4/g1$a$a;->e:Lb4/g1$a$a;

    invoke-direct {p0, v0, v1}, Ln3/b;-><init>(Ln3/g$c;Lu3/l;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/e;)V
    .locals 0

    invoke-direct {p0}, Lb4/g1$a;-><init>()V

    return-void
.end method
