.class public final Ld4/i;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld4/i$c;,
        Ld4/i$a;,
        Ld4/i$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final a:Ld4/i$b;

.field private static final b:Ld4/i$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ld4/i$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ld4/i$b;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Ld4/i;->a:Ld4/i$b;

    new-instance v0, Ld4/i$c;

    invoke-direct {v0}, Ld4/i$c;-><init>()V

    sput-object v0, Ld4/i;->b:Ld4/i$c;

    return-void
.end method

.method public static final synthetic a()Ld4/i$c;
    .locals 1

    sget-object v0, Ld4/i;->b:Ld4/i$c;

    return-object v0
.end method

.method public static b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    return-object p0
.end method
