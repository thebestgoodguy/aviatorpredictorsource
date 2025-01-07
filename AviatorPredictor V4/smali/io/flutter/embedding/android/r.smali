.class public Lio/flutter/embedding/android/r;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/embedding/android/r$e;,
        Lio/flutter/embedding/android/r$d;,
        Lio/flutter/embedding/android/r$c;
    }
.end annotation


# static fields
.field public static final a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:[Lio/flutter/embedding/android/r$d;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lio/flutter/embedding/android/r$a;

    invoke-direct {v0}, Lio/flutter/embedding/android/r$a;-><init>()V

    sput-object v0, Lio/flutter/embedding/android/r;->a:Ljava/util/HashMap;

    new-instance v0, Lio/flutter/embedding/android/r$b;

    invoke-direct {v0}, Lio/flutter/embedding/android/r$b;-><init>()V

    sput-object v0, Lio/flutter/embedding/android/r;->b:Ljava/util/HashMap;

    const/4 v0, 0x3

    new-array v0, v0, [Lio/flutter/embedding/android/r$d;

    new-instance v1, Lio/flutter/embedding/android/r$d;

    const/4 v2, 0x2

    new-array v3, v2, [Lio/flutter/embedding/android/r$c;

    new-instance v4, Lio/flutter/embedding/android/r$c;

    const-wide/32 v5, 0x700e0

    const-wide v7, 0x200000100L

    invoke-direct {v4, v5, v6, v7, v8}, Lio/flutter/embedding/android/r$c;-><init>(JJ)V

    const/4 v5, 0x0

    aput-object v4, v3, v5

    new-instance v4, Lio/flutter/embedding/android/r$c;

    const-wide/32 v6, 0x700e4

    const-wide v8, 0x200000101L

    invoke-direct {v4, v6, v7, v8, v9}, Lio/flutter/embedding/android/r$c;-><init>(JJ)V

    const/4 v6, 0x1

    aput-object v4, v3, v6

    const/16 v4, 0x1000

    invoke-direct {v1, v4, v3}, Lio/flutter/embedding/android/r$d;-><init>(I[Lio/flutter/embedding/android/r$c;)V

    aput-object v1, v0, v5

    new-instance v1, Lio/flutter/embedding/android/r$d;

    new-array v3, v2, [Lio/flutter/embedding/android/r$c;

    new-instance v4, Lio/flutter/embedding/android/r$c;

    const-wide/32 v7, 0x700e1

    const-wide v9, 0x200000102L

    invoke-direct {v4, v7, v8, v9, v10}, Lio/flutter/embedding/android/r$c;-><init>(JJ)V

    aput-object v4, v3, v5

    new-instance v4, Lio/flutter/embedding/android/r$c;

    const-wide/32 v7, 0x700e5

    const-wide v9, 0x200000103L

    invoke-direct {v4, v7, v8, v9, v10}, Lio/flutter/embedding/android/r$c;-><init>(JJ)V

    aput-object v4, v3, v6

    invoke-direct {v1, v6, v3}, Lio/flutter/embedding/android/r$d;-><init>(I[Lio/flutter/embedding/android/r$c;)V

    aput-object v1, v0, v6

    new-instance v1, Lio/flutter/embedding/android/r$d;

    new-array v3, v2, [Lio/flutter/embedding/android/r$c;

    new-instance v4, Lio/flutter/embedding/android/r$c;

    const-wide/32 v7, 0x700e2

    const-wide v9, 0x200000104L

    invoke-direct {v4, v7, v8, v9, v10}, Lio/flutter/embedding/android/r$c;-><init>(JJ)V

    aput-object v4, v3, v5

    new-instance v4, Lio/flutter/embedding/android/r$c;

    const-wide/32 v7, 0x700e6

    const-wide v9, 0x200000105L

    invoke-direct {v4, v7, v8, v9, v10}, Lio/flutter/embedding/android/r$c;-><init>(JJ)V

    aput-object v4, v3, v6

    invoke-direct {v1, v2, v3}, Lio/flutter/embedding/android/r$d;-><init>(I[Lio/flutter/embedding/android/r$c;)V

    aput-object v1, v0, v2

    sput-object v0, Lio/flutter/embedding/android/r;->c:[Lio/flutter/embedding/android/r$d;

    return-void
.end method

.method public static a()[Lio/flutter/embedding/android/r$e;
    .locals 8

    const/4 v0, 0x1

    new-array v0, v0, [Lio/flutter/embedding/android/r$e;

    new-instance v7, Lio/flutter/embedding/android/r$e;

    const/high16 v2, 0x100000

    const-wide/32 v3, 0x70039

    const-wide v5, 0x100000104L

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lio/flutter/embedding/android/r$e;-><init>(IJJ)V

    const/4 v1, 0x0

    aput-object v7, v0, v1

    return-object v0
.end method
