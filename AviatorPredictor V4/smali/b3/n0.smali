.class public abstract Lb3/n0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb3/n0$c;,
        Lb3/n0$j;,
        Lb3/n0$h;,
        Lb3/n0$d;,
        Lb3/n0$b;,
        Lb3/n0$e;,
        Lb3/n0$f;,
        Lb3/n0$i;,
        Lb3/n0$g;
    }
.end annotation


# static fields
.field public static final a:Lb3/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/a$c<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "health-checking-config"

    invoke-static {v0}, Lb3/a$c;->a(Ljava/lang/String;)Lb3/a$c;

    move-result-object v0

    sput-object v0, Lb3/n0;->a:Lb3/a$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract b(Lb3/f1;)V
.end method

.method public abstract c(Lb3/n0$g;)V
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public abstract e()V
.end method
