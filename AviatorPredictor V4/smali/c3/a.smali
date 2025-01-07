.class public final Lc3/a;
.super Lb3/y;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc3/a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lb3/y<",
        "Lc3/a;",
        ">;"
    }
.end annotation


# static fields
.field private static final c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lb3/r0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/r0<",
            "*>;"
        }
    .end annotation
.end field

.field private b:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lc3/a;->j()Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lc3/a;->c:Ljava/lang/Class;

    return-void
.end method

.method private constructor <init>(Lb3/r0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb3/r0<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lb3/y;-><init>()V

    const-string v0, "delegateBuilder"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb3/r0;

    iput-object p1, p0, Lc3/a;->a:Lb3/r0;

    return-void
.end method

.method private static j()Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    :try_start_0
    const-class v0, Ld3/e;

    sget v1, Ld3/e;->w:I
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static k(Lb3/r0;)Lc3/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb3/r0<",
            "*>;)",
            "Lc3/a;"
        }
    .end annotation

    new-instance v0, Lc3/a;

    invoke-direct {v0, p0}, Lc3/a;-><init>(Lb3/r0;)V

    return-object v0
.end method


# virtual methods
.method public a()Lb3/q0;
    .locals 3

    new-instance v0, Lc3/a$b;

    iget-object v1, p0, Lc3/a;->a:Lb3/r0;

    invoke-virtual {v1}, Lb3/r0;->a()Lb3/q0;

    move-result-object v1

    iget-object v2, p0, Lc3/a;->b:Landroid/content/Context;

    invoke-direct {v0, v1, v2}, Lc3/a$b;-><init>(Lb3/q0;Landroid/content/Context;)V

    return-object v0
.end method

.method protected e()Lb3/r0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb3/r0<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lc3/a;->a:Lb3/r0;

    return-object v0
.end method

.method public i(Landroid/content/Context;)Lc3/a;
    .locals 0

    iput-object p1, p0, Lc3/a;->b:Landroid/content/Context;

    return-object p0
.end method
