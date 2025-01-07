.class public final Lb3/i0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb3/i0$a;
    }
.end annotation


# static fields
.field public static final a:Ljava/nio/charset/Charset;

.field public static final b:Ls0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    sput-object v0, Lb3/i0;->a:Ljava/nio/charset/Charset;

    sget-object v0, Lb3/u0;->f:Ls0/a;

    sput-object v0, Lb3/i0;->b:Ls0/a;

    return-void
.end method

.method public static a(Lb3/u0;)I
    .locals 0

    invoke-virtual {p0}, Lb3/u0;->h()I

    move-result p0

    return p0
.end method

.method public static b(Ljava/lang/String;Lb3/i0$a;)Lb3/u0$g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lb3/i0$a<",
            "TT;>;)",
            "Lb3/u0$g<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x3a

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    invoke-static {p0, v0, p1}, Lb3/u0$g;->g(Ljava/lang/String;ZLb3/u0$j;)Lb3/u0$g;

    move-result-object p0

    return-object p0
.end method

.method public static varargs c([[B)Lb3/u0;
    .locals 1

    new-instance v0, Lb3/u0;

    invoke-direct {v0, p0}, Lb3/u0;-><init>([[B)V

    return-object v0
.end method

.method public static d(Lb3/u0;)[[B
    .locals 0

    invoke-virtual {p0}, Lb3/u0;->q()[[B

    move-result-object p0

    return-object p0
.end method
