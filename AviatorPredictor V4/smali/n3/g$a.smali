.class public final Ln3/g$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln3/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Ln3/g;Ln3/g;)Ln3/g;
    .locals 1

    const-string v0, "this"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ln3/h;->e:Ln3/h;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Ln3/g$a$a;->e:Ln3/g$a$a;

    invoke-interface {p1, p0, v0}, Ln3/g;->fold(Ljava/lang/Object;Lu3/p;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln3/g;

    :goto_0
    return-object p0
.end method
