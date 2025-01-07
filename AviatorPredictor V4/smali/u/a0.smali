.class public final Lu/a0;
.super Ln0/d;
.source ""

# interfaces
.implements Lt/f$a;
.implements Lt/f$b;


# static fields
.field private static final h:Lt/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt/a$a<",
            "+",
            "Lm0/f;",
            "Lm0/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/os/Handler;

.field private final c:Lt/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt/a$a<",
            "+",
            "Lm0/f;",
            "Lm0/a;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lw/d;

.field private f:Lm0/f;

.field private g:Lu/z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lm0/e;->c:Lt/a$a;

    sput-object v0, Lu/a0;->h:Lt/a$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lw/d;)V
    .locals 1

    sget-object v0, Lu/a0;->h:Lt/a$a;

    invoke-direct {p0}, Ln0/d;-><init>()V

    iput-object p1, p0, Lu/a0;->a:Landroid/content/Context;

    iput-object p2, p0, Lu/a0;->b:Landroid/os/Handler;

    const-string p1, "ClientSettings must not be null"

    invoke-static {p3, p1}, Lw/r;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw/d;

    iput-object p1, p0, Lu/a0;->e:Lw/d;

    invoke-virtual {p3}, Lw/d;->e()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lu/a0;->d:Ljava/util/Set;

    iput-object v0, p0, Lu/a0;->c:Lt/a$a;

    return-void
.end method

.method static bridge synthetic x(Lu/a0;)Lu/z;
    .locals 0

    iget-object p0, p0, Lu/a0;->g:Lu/z;

    return-object p0
.end method

.method static bridge synthetic y(Lu/a0;Ln0/l;)V
    .locals 3

    invoke-virtual {p1}, Ln0/l;->j0()Ls/a;

    move-result-object v0

    invoke-virtual {v0}, Ls/a;->n0()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Ln0/l;->k0()Lw/r0;

    move-result-object p1

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw/r0;

    invoke-virtual {p1}, Lw/r0;->j0()Ls/a;

    move-result-object v0

    invoke-virtual {v0}, Ls/a;->n0()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    const-string v2, "Sign-in succeeded with resolve account failure: "

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "SignInCoordinator"

    invoke-static {v2, p1, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    iget-object p1, p0, Lu/a0;->g:Lu/z;

    invoke-interface {p1, v0}, Lu/z;->a(Ls/a;)V

    :goto_0
    iget-object p0, p0, Lu/a0;->f:Lm0/f;

    invoke-interface {p0}, Lt/a$f;->k()V

    return-void

    :cond_1
    iget-object v0, p0, Lu/a0;->g:Lu/z;

    invoke-virtual {p1}, Lw/r0;->k0()Lw/j;

    move-result-object p1

    iget-object v1, p0, Lu/a0;->d:Ljava/util/Set;

    invoke-interface {v0, p1, v1}, Lu/z;->b(Lw/j;Ljava/util/Set;)V

    goto :goto_0
.end method


# virtual methods
.method public final A()V
    .locals 1

    iget-object v0, p0, Lu/a0;->f:Lm0/f;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lt/a$f;->k()V

    :cond_0
    return-void
.end method

.method public final a(Ls/a;)V
    .locals 1

    iget-object v0, p0, Lu/a0;->g:Lu/z;

    invoke-interface {v0, p1}, Lu/z;->a(Ls/a;)V

    return-void
.end method

.method public final f(I)V
    .locals 0

    iget-object p1, p0, Lu/a0;->f:Lm0/f;

    invoke-interface {p1}, Lt/a$f;->k()V

    return-void
.end method

.method public final h(Landroid/os/Bundle;)V
    .locals 0

    iget-object p1, p0, Lu/a0;->f:Lm0/f;

    invoke-interface {p1, p0}, Lm0/f;->j(Ln0/f;)V

    return-void
.end method

.method public final v(Ln0/l;)V
    .locals 2

    iget-object v0, p0, Lu/a0;->b:Landroid/os/Handler;

    new-instance v1, Lu/y;

    invoke-direct {v1, p0, p1}, Lu/y;-><init>(Lu/a0;Ln0/l;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final z(Lu/z;)V
    .locals 9

    iget-object v0, p0, Lu/a0;->f:Lm0/f;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lt/a$f;->k()V

    :cond_0
    iget-object v0, p0, Lu/a0;->e:Lw/d;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw/d;->i(Ljava/lang/Integer;)V

    iget-object v2, p0, Lu/a0;->c:Lt/a$a;

    iget-object v3, p0, Lu/a0;->a:Landroid/content/Context;

    iget-object v0, p0, Lu/a0;->b:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v4

    iget-object v5, p0, Lu/a0;->e:Lw/d;

    invoke-virtual {v5}, Lw/d;->f()Lm0/a;

    move-result-object v6

    move-object v7, p0

    move-object v8, p0

    invoke-virtual/range {v2 .. v8}, Lt/a$a;->a(Landroid/content/Context;Landroid/os/Looper;Lw/d;Ljava/lang/Object;Lt/f$a;Lt/f$b;)Lt/a$f;

    move-result-object v0

    iput-object v0, p0, Lu/a0;->f:Lm0/f;

    iput-object p1, p0, Lu/a0;->g:Lu/z;

    iget-object p1, p0, Lu/a0;->d:Ljava/util/Set;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lu/a0;->f:Lm0/f;

    invoke-interface {p1}, Lm0/f;->n()V

    return-void

    :cond_2
    :goto_0
    iget-object p1, p0, Lu/a0;->b:Landroid/os/Handler;

    new-instance v0, Lu/x;

    invoke-direct {v0, p0}, Lu/x;-><init>(Lu/a0;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
