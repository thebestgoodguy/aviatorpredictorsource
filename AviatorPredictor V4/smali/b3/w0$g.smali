.class public final Lb3/w0$g;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb3/w0$g$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lb3/x;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lb3/a;

.field private final c:Lb3/w0$c;


# direct methods
.method constructor <init>(Ljava/util/List;Lb3/a;Lb3/w0$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lb3/x;",
            ">;",
            "Lb3/a;",
            "Lb3/w0$c;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lb3/w0$g;->a:Ljava/util/List;

    const-string p1, "attributes"

    invoke-static {p2, p1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb3/a;

    iput-object p1, p0, Lb3/w0$g;->b:Lb3/a;

    iput-object p3, p0, Lb3/w0$g;->c:Lb3/w0$c;

    return-void
.end method

.method public static d()Lb3/w0$g$a;
    .locals 1

    new-instance v0, Lb3/w0$g$a;

    invoke-direct {v0}, Lb3/w0$g$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lb3/x;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lb3/w0$g;->a:Ljava/util/List;

    return-object v0
.end method

.method public b()Lb3/a;
    .locals 1

    iget-object v0, p0, Lb3/w0$g;->b:Lb3/a;

    return-object v0
.end method

.method public c()Lb3/w0$c;
    .locals 1

    iget-object v0, p0, Lb3/w0$g;->c:Lb3/w0$c;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lb3/w0$g;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lb3/w0$g;

    iget-object v0, p0, Lb3/w0$g;->a:Ljava/util/List;

    iget-object v2, p1, Lb3/w0$g;->a:Ljava/util/List;

    invoke-static {v0, v2}, Lq0/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb3/w0$g;->b:Lb3/a;

    iget-object v2, p1, Lb3/w0$g;->b:Lb3/a;

    invoke-static {v0, v2}, Lq0/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb3/w0$g;->c:Lb3/w0$c;

    iget-object p1, p1, Lb3/w0$g;->c:Lb3/w0$c;

    invoke-static {v0, p1}, Lq0/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lb3/w0$g;->a:Ljava/util/List;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lb3/w0$g;->b:Lb3/a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lb3/w0$g;->c:Lb3/w0$c;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Lq0/i;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lq0/h;->c(Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lb3/w0$g;->a:Ljava/util/List;

    const-string v2, "addresses"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lb3/w0$g;->b:Lb3/a;

    const-string v2, "attributes"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lb3/w0$g;->c:Lb3/w0$c;

    const-string v2, "serviceConfig"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lq0/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
