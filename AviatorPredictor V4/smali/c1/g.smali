.class public Lc1/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc1/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lc1/h<",
        "TK;TV;>;"
    }
.end annotation


# static fields
.field private static final a:Lc1/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc1/g;

    invoke-direct {v0}, Lc1/g;-><init>()V

    sput-object v0, Lc1/g;->a:Lc1/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static i()Lc1/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Lc1/g<",
            "TK;TV;>;"
        }
    .end annotation

    sget-object v0, Lc1/g;->a:Lc1/g;

    return-object v0
.end method


# virtual methods
.method public a()Lc1/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc1/h<",
            "TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method

.method public b()Lc1/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc1/h<",
            "TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method

.method public c(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lc1/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Ljava/util/Comparator<",
            "TK;>;)",
            "Lc1/h<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance p3, Lc1/i;

    invoke-direct {p3, p1, p2}, Lc1/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p3
.end method

.method public d(Ljava/lang/Object;Ljava/util/Comparator;)Lc1/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/util/Comparator<",
            "TK;>;)",
            "Lc1/h<",
            "TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method

.method public e(Ljava/lang/Object;Ljava/lang/Object;Lc1/h$a;Lc1/h;Lc1/h;)Lc1/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Lc1/h$a;",
            "Lc1/h<",
            "TK;TV;>;",
            "Lc1/h<",
            "TK;TV;>;)",
            "Lc1/h<",
            "TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method

.method public f()Lc1/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc1/h<",
            "TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method

.method public g()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getKey()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public h()Lc1/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc1/h<",
            "TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method

.method public isEmpty()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public size()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
