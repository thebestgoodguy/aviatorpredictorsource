.class public abstract Lkotlin/jvm/internal/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly3/b;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/jvm/internal/a$a;
    }
.end annotation


# static fields
.field public static final NO_RECEIVER:Ljava/lang/Object;


# instance fields
.field private final isTopLevel:Z

.field private final name:Ljava/lang/String;

.field private final owner:Ljava/lang/Class;

.field protected final receiver:Ljava/lang/Object;

.field private transient reflected:Ly3/b;

.field private final signature:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lkotlin/jvm/internal/a$a;->a()Lkotlin/jvm/internal/a$a;

    move-result-object v0

    sput-object v0, Lkotlin/jvm/internal/a;->NO_RECEIVER:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/a;->NO_RECEIVER:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/a;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method protected constructor <init>(Ljava/lang/Object;)V
    .locals 6

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/a;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method protected constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/jvm/internal/a;->receiver:Ljava/lang/Object;

    iput-object p2, p0, Lkotlin/jvm/internal/a;->owner:Ljava/lang/Class;

    iput-object p3, p0, Lkotlin/jvm/internal/a;->name:Ljava/lang/String;

    iput-object p4, p0, Lkotlin/jvm/internal/a;->signature:Ljava/lang/String;

    iput-boolean p5, p0, Lkotlin/jvm/internal/a;->isTopLevel:Z

    return-void
.end method


# virtual methods
.method public varargs call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/a;->getReflected()Ly3/b;

    move-result-object v0

    invoke-interface {v0, p1}, Ly3/b;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public callBy(Ljava/util/Map;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/a;->getReflected()Ly3/b;

    move-result-object v0

    invoke-interface {v0, p1}, Ly3/b;->callBy(Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public compute()Ly3/b;
    .locals 1

    iget-object v0, p0, Lkotlin/jvm/internal/a;->reflected:Ly3/b;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lkotlin/jvm/internal/a;->computeReflected()Ly3/b;

    move-result-object v0

    iput-object v0, p0, Lkotlin/jvm/internal/a;->reflected:Ly3/b;

    :cond_0
    return-object v0
.end method

.method protected abstract computeReflected()Ly3/b;
.end method

.method public getAnnotations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lkotlin/jvm/internal/a;->getReflected()Ly3/b;

    move-result-object v0

    invoke-interface {v0}, Ly3/a;->getAnnotations()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getBoundReceiver()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkotlin/jvm/internal/a;->receiver:Ljava/lang/Object;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkotlin/jvm/internal/a;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getOwner()Ly3/d;
    .locals 2

    iget-object v0, p0, Lkotlin/jvm/internal/a;->owner:Ljava/lang/Class;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lkotlin/jvm/internal/a;->isTopLevel:Z

    if-eqz v1, :cond_1

    invoke-static {v0}, Lkotlin/jvm/internal/l;->c(Ljava/lang/Class;)Ly3/d;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Class;)Ly3/c;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public getParameters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lkotlin/jvm/internal/a;->getReflected()Ly3/b;

    move-result-object v0

    invoke-interface {v0}, Ly3/b;->getParameters()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected getReflected()Ly3/b;
    .locals 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/a;->compute()Ly3/b;

    move-result-object v0

    if-eq v0, p0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lt3/b;

    invoke-direct {v0}, Lt3/b;-><init>()V

    throw v0
.end method

.method public getReturnType()Ly3/f;
    .locals 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/a;->getReflected()Ly3/b;

    move-result-object v0

    invoke-interface {v0}, Ly3/b;->getReturnType()Ly3/f;

    move-result-object v0

    return-object v0
.end method

.method public getSignature()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkotlin/jvm/internal/a;->signature:Ljava/lang/String;

    return-object v0
.end method

.method public getTypeParameters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lkotlin/jvm/internal/a;->getReflected()Ly3/b;

    move-result-object v0

    invoke-interface {v0}, Ly3/b;->getTypeParameters()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getVisibility()Ly3/g;
    .locals 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/a;->getReflected()Ly3/b;

    move-result-object v0

    invoke-interface {v0}, Ly3/b;->getVisibility()Ly3/g;

    move-result-object v0

    return-object v0
.end method

.method public isAbstract()Z
    .locals 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/a;->getReflected()Ly3/b;

    move-result-object v0

    invoke-interface {v0}, Ly3/b;->isAbstract()Z

    move-result v0

    return v0
.end method

.method public isFinal()Z
    .locals 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/a;->getReflected()Ly3/b;

    move-result-object v0

    invoke-interface {v0}, Ly3/b;->isFinal()Z

    move-result v0

    return v0
.end method

.method public isOpen()Z
    .locals 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/a;->getReflected()Ly3/b;

    move-result-object v0

    invoke-interface {v0}, Ly3/b;->isOpen()Z

    move-result v0

    return v0
.end method

.method public isSuspend()Z
    .locals 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/a;->getReflected()Ly3/b;

    move-result-object v0

    invoke-interface {v0}, Ly3/b;->isSuspend()Z

    move-result v0

    return v0
.end method
