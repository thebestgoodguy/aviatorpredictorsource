.class public final Lx3/c$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx3/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/e;)V
    .locals 0

    invoke-direct {p0}, Lx3/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lx3/c;
    .locals 1

    invoke-static {}, Lx3/c;->s()Lx3/c;

    move-result-object v0

    return-object v0
.end method
