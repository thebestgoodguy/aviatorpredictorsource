.class public final Lb4/k2;
.super Ln3/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb4/k2$a;
    }
.end annotation


# static fields
.field public static final f:Lb4/k2$a;


# instance fields
.field public e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb4/k2$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb4/k2$a;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lb4/k2;->f:Lb4/k2$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lb4/k2;->f:Lb4/k2$a;

    invoke-direct {p0, v0}, Ln3/a;-><init>(Ln3/g$c;)V

    return-void
.end method
