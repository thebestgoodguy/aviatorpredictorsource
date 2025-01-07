.class public Lkotlin/jvm/internal/l;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Lkotlin/jvm/internal/m;

.field private static final b:[Ly3/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "kotlin.reflect.jvm.internal.ReflectionFactoryImpl"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/internal/m;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    goto :goto_0

    :catch_0
    nop

    :goto_0
    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Lkotlin/jvm/internal/m;

    invoke-direct {v0}, Lkotlin/jvm/internal/m;-><init>()V

    :goto_1
    sput-object v0, Lkotlin/jvm/internal/l;->a:Lkotlin/jvm/internal/m;

    const/4 v0, 0x0

    new-array v0, v0, [Ly3/c;

    sput-object v0, Lkotlin/jvm/internal/l;->b:[Ly3/c;

    return-void
.end method

.method public static a(Lkotlin/jvm/internal/g;)Ly3/e;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/l;->a:Lkotlin/jvm/internal/m;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/m;->a(Lkotlin/jvm/internal/g;)Ly3/e;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/Class;)Ly3/c;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/l;->a:Lkotlin/jvm/internal/m;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Class;)Ly3/c;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/Class;)Ly3/d;
    .locals 2

    sget-object v0, Lkotlin/jvm/internal/l;->a:Lkotlin/jvm/internal/m;

    const-string v1, ""

    invoke-virtual {v0, p0, v1}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Class;Ljava/lang/String;)Ly3/d;

    move-result-object p0

    return-object p0
.end method

.method public static d(Lkotlin/jvm/internal/f;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/l;->a:Lkotlin/jvm/internal/m;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/m;->d(Lkotlin/jvm/internal/f;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lkotlin/jvm/internal/j;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/l;->a:Lkotlin/jvm/internal/m;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/m;->e(Lkotlin/jvm/internal/j;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
