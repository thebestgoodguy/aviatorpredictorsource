.class public abstract Lb3/o0;
.super Lb3/n0$c;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb3/o0$a;
    }
.end annotation


# static fields
.field private static final a:Lb3/w0$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb3/o0$a;

    invoke-direct {v0}, Lb3/o0$a;-><init>()V

    invoke-static {v0}, Lb3/w0$c;->a(Ljava/lang/Object;)Lb3/w0$c;

    move-result-object v0

    sput-object v0, Lb3/o0;->a:Lb3/w0$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb3/n0$c;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()I
.end method

.method public abstract d()Z
.end method

.method public e(Ljava/util/Map;)Lb3/w0$c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;)",
            "Lb3/w0$c;"
        }
    .end annotation

    sget-object p1, Lb3/o0;->a:Lb3/w0$c;

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final hashCode()I
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lq0/h;->c(Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    invoke-virtual {p0}, Lb3/o0;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "policy"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    invoke-virtual {p0}, Lb3/o0;->c()I

    move-result v1

    const-string v2, "priority"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->b(Ljava/lang/String;I)Lq0/h$b;

    move-result-object v0

    invoke-virtual {p0}, Lb3/o0;->d()Z

    move-result v1

    const-string v2, "available"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->e(Ljava/lang/String;Z)Lq0/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lq0/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
