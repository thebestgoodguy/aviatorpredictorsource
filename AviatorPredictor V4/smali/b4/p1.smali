.class public interface abstract Lb4/p1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ln3/g$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb4/p1$b;,
        Lb4/p1$a;
    }
.end annotation


# static fields
.field public static final a:Lb4/p1$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lb4/p1$b;->e:Lb4/p1$b;

    sput-object v0, Lb4/p1;->a:Lb4/p1$b;

    return-void
.end method


# virtual methods
.method public abstract a()Z
.end method

.method public abstract e()Z
.end method

.method public abstract h(ZZLu3/l;)Lb4/y0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lu3/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lk3/s;",
            ">;)",
            "Lb4/y0;"
        }
    .end annotation
.end method

.method public abstract l()Ljava/util/concurrent/CancellationException;
.end method

.method public abstract r(Ljava/util/concurrent/CancellationException;)V
.end method

.method public abstract v(Lb4/t;)Lb4/r;
.end method
