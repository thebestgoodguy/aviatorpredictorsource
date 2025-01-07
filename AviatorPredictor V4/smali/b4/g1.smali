.class public abstract Lb4/g1;
.super Lb4/g0;
.source ""

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb4/g1$a;
    }
.end annotation


# static fields
.field public static final f:Lb4/g1$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb4/g1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb4/g1$a;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lb4/g1;->f:Lb4/g1$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb4/g0;-><init>()V

    return-void
.end method
