.class public Ll1/j;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Lc1/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc1/c<",
            "Ll1/l;",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Ll1/l;->d()Ljava/util/Comparator;

    move-result-object v0

    invoke-static {v0}, Lc1/c$a;->c(Ljava/util/Comparator;)Lc1/c;

    move-result-object v0

    sput-object v0, Ll1/j;->a:Lc1/c;

    return-void
.end method

.method public static a()Lc1/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/i;",
            ">;"
        }
    .end annotation

    sget-object v0, Ll1/j;->a:Lc1/c;

    return-object v0
.end method

.method public static b()Lc1/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/s;",
            ">;"
        }
    .end annotation

    sget-object v0, Ll1/j;->a:Lc1/c;

    return-object v0
.end method

.method public static c()Lc1/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/w;",
            ">;"
        }
    .end annotation

    sget-object v0, Ll1/j;->a:Lc1/c;

    return-object v0
.end method
