.class public abstract Lcom/google/firebase/firestore/m;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/firestore/m$d;,
        Lcom/google/firebase/firestore/m$a;,
        Lcom/google/firebase/firestore/m$b;,
        Lcom/google/firebase/firestore/m$e;,
        Lcom/google/firebase/firestore/m$c;
    }
.end annotation


# static fields
.field private static final a:Lcom/google/firebase/firestore/m$c;

.field private static final b:Lcom/google/firebase/firestore/m$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/firestore/m$c;

    invoke-direct {v0}, Lcom/google/firebase/firestore/m$c;-><init>()V

    sput-object v0, Lcom/google/firebase/firestore/m;->a:Lcom/google/firebase/firestore/m$c;

    new-instance v0, Lcom/google/firebase/firestore/m$e;

    invoke-direct {v0}, Lcom/google/firebase/firestore/m$e;-><init>()V

    sput-object v0, Lcom/google/firebase/firestore/m;->b:Lcom/google/firebase/firestore/m$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static varargs a([Ljava/lang/Object;)Lcom/google/firebase/firestore/m;
    .locals 1

    new-instance v0, Lcom/google/firebase/firestore/m$a;

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/google/firebase/firestore/m$a;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static varargs b([Ljava/lang/Object;)Lcom/google/firebase/firestore/m;
    .locals 1

    new-instance v0, Lcom/google/firebase/firestore/m$b;

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/google/firebase/firestore/m$b;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static c()Lcom/google/firebase/firestore/m;
    .locals 1

    sget-object v0, Lcom/google/firebase/firestore/m;->a:Lcom/google/firebase/firestore/m$c;

    return-object v0
.end method

.method public static e(D)Lcom/google/firebase/firestore/m;
    .locals 1

    new-instance v0, Lcom/google/firebase/firestore/m$d;

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/google/firebase/firestore/m$d;-><init>(Ljava/lang/Number;)V

    return-object v0
.end method

.method public static f(J)Lcom/google/firebase/firestore/m;
    .locals 1

    new-instance v0, Lcom/google/firebase/firestore/m$d;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/google/firebase/firestore/m$d;-><init>(Ljava/lang/Number;)V

    return-object v0
.end method

.method public static g()Lcom/google/firebase/firestore/m;
    .locals 1

    sget-object v0, Lcom/google/firebase/firestore/m;->b:Lcom/google/firebase/firestore/m$e;

    return-object v0
.end method


# virtual methods
.method abstract d()Ljava/lang/String;
.end method
