.class public abstract Lv3/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv3/c$a;
    }
.end annotation


# static fields
.field public static final e:Lv3/c$a;

.field private static final f:Lv3/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv3/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lv3/c$a;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lv3/c;->e:Lv3/c$a;

    sget-object v0, Lp3/b;->a:Lp3/a;

    invoke-virtual {v0}, Lp3/a;->b()Lv3/c;

    move-result-object v0

    sput-object v0, Lv3/c;->f:Lv3/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()Lv3/c;
    .locals 1

    sget-object v0, Lv3/c;->f:Lv3/c;

    return-object v0
.end method


# virtual methods
.method public abstract b()I
.end method
