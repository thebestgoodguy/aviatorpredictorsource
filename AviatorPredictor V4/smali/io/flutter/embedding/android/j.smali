.class public final synthetic Lio/flutter/embedding/android/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/function/Predicate;


# static fields
.field public static final synthetic a:Lio/flutter/embedding/android/j;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/flutter/embedding/android/j;

    invoke-direct {v0}, Lio/flutter/embedding/android/j;-><init>()V

    sput-object v0, Lio/flutter/embedding/android/j;->a:Lio/flutter/embedding/android/j;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Landroid/view/textservice/SpellCheckerInfo;

    invoke-static {p1}, Lio/flutter/embedding/android/k;->d(Landroid/view/textservice/SpellCheckerInfo;)Z

    move-result p1

    return p1
.end method
