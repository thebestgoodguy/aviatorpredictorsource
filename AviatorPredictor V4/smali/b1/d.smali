.class public final Lb1/d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb1/d$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "-TT;>;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lb1/q;",
            ">;"
        }
    .end annotation
.end field

.field private final c:I

.field private final d:I

.field private final e:Lb1/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb1/h<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/util/Set;Ljava/util/Set;IILb1/h;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "-TT;>;>;",
            "Ljava/util/Set<",
            "Lb1/q;",
            ">;II",
            "Lb1/h<",
            "TT;>;",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lb1/d;->a:Ljava/util/Set;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lb1/d;->b:Ljava/util/Set;

    iput p3, p0, Lb1/d;->c:I

    iput p4, p0, Lb1/d;->d:I

    iput-object p5, p0, Lb1/d;->e:Lb1/h;

    invoke-static {p6}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lb1/d;->f:Ljava/util/Set;

    return-void
.end method

.method synthetic constructor <init>(Ljava/util/Set;Ljava/util/Set;IILb1/h;Ljava/util/Set;Lb1/d$a;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lb1/d;-><init>(Ljava/util/Set;Ljava/util/Set;IILb1/h;Ljava/util/Set;)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/Object;Lb1/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lb1/d;->n(Ljava/lang/Object;Lb1/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;Lb1/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lb1/d;->o(Ljava/lang/Object;Lb1/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/Class;)Lb1/d$b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lb1/d$b<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lb1/d$b;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lb1/d$b;-><init>(Ljava/lang/Class;[Ljava/lang/Class;Lb1/d$a;)V

    return-object v0
.end method

.method public static varargs d(Ljava/lang/Class;[Ljava/lang/Class;)Lb1/d$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Ljava/lang/Class<",
            "-TT;>;)",
            "Lb1/d$b<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    new-instance v0, Lb1/d$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lb1/d$b;-><init>(Ljava/lang/Class;[Ljava/lang/Class;Lb1/d$a;)V

    return-object v0
.end method

.method public static i(Ljava/lang/Object;Ljava/lang/Class;)Lb1/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lb1/d<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lb1/d;->j(Ljava/lang/Class;)Lb1/d$b;

    move-result-object p1

    new-instance v0, Lb1/b;

    invoke-direct {v0, p0}, Lb1/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lb1/d$b;->e(Lb1/h;)Lb1/d$b;

    move-result-object p0

    invoke-virtual {p0}, Lb1/d$b;->c()Lb1/d;

    move-result-object p0

    return-object p0
.end method

.method public static j(Ljava/lang/Class;)Lb1/d$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lb1/d$b<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0}, Lb1/d;->c(Ljava/lang/Class;)Lb1/d$b;

    move-result-object p0

    invoke-static {p0}, Lb1/d$b;->a(Lb1/d$b;)Lb1/d$b;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic n(Ljava/lang/Object;Lb1/e;)Ljava/lang/Object;
    .locals 0

    return-object p0
.end method

.method private static synthetic o(Ljava/lang/Object;Lb1/e;)Ljava/lang/Object;
    .locals 0

    return-object p0
.end method

.method public static varargs p(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)Lb1/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Ljava/lang/Class<",
            "-TT;>;)",
            "Lb1/d<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    invoke-static {p1, p2}, Lb1/d;->d(Ljava/lang/Class;[Ljava/lang/Class;)Lb1/d$b;

    move-result-object p1

    new-instance p2, Lb1/c;

    invoke-direct {p2, p0}, Lb1/c;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Lb1/d$b;->e(Lb1/h;)Lb1/d$b;

    move-result-object p0

    invoke-virtual {p0}, Lb1/d$b;->c()Lb1/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public e()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lb1/q;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lb1/d;->b:Ljava/util/Set;

    return-object v0
.end method

.method public f()Lb1/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb1/h<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lb1/d;->e:Lb1/h;

    return-object v0
.end method

.method public g()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "-TT;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lb1/d;->a:Ljava/util/Set;

    return-object v0
.end method

.method public h()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lb1/d;->f:Ljava/util/Set;

    return-object v0
.end method

.method public k()Z
    .locals 2

    iget v0, p0, Lb1/d;->c:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public l()Z
    .locals 2

    iget v0, p0, Lb1/d;->c:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public m()Z
    .locals 1

    iget v0, p0, Lb1/d;->d:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Component<"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lb1/d;->a:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ">{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lb1/d;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lb1/d;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", deps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb1/d;->b:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
