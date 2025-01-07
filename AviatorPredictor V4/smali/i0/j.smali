.class public Li0/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk0/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li0/j$a;,
        Li0/j$b;
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lt/f;[BLjava/lang/String;)Lt/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt/f;",
            "[B",
            "Ljava/lang/String;",
            ")",
            "Lt/g<",
            "Lk0/d$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Li0/k;

    invoke-direct {v0, p0, p1, p2}, Li0/k;-><init>(Lt/f;[BLjava/lang/String;)V

    invoke-virtual {p0, v0}, Lt/f;->a(Lcom/google/android/gms/common/api/internal/b;)Lcom/google/android/gms/common/api/internal/b;

    move-result-object p0

    return-object p0
.end method
