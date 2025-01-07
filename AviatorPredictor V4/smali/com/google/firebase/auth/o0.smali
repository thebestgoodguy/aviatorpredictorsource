.class public final Lcom/google/firebase/auth/o0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/auth/o0$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/google/firebase/auth/FirebaseAuth;

.field private b:Ljava/lang/Long;

.field private c:Lcom/google/firebase/auth/p0$b;

.field private d:Ljava/util/concurrent/Executor;

.field private e:Ljava/lang/String;

.field private f:Landroid/app/Activity;

.field private g:Lcom/google/firebase/auth/p0$a;

.field private h:Lcom/google/firebase/auth/k0;

.field private i:Lcom/google/firebase/auth/s0;

.field private j:Z


# direct methods
.method synthetic constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/Long;Lcom/google/firebase/auth/p0$b;Ljava/util/concurrent/Executor;Ljava/lang/String;Landroid/app/Activity;Lcom/google/firebase/auth/p0$a;Lcom/google/firebase/auth/k0;Lcom/google/firebase/auth/s0;ZLcom/google/firebase/auth/f1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/auth/o0;->a:Lcom/google/firebase/auth/FirebaseAuth;

    iput-object p5, p0, Lcom/google/firebase/auth/o0;->e:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/firebase/auth/o0;->b:Ljava/lang/Long;

    iput-object p3, p0, Lcom/google/firebase/auth/o0;->c:Lcom/google/firebase/auth/p0$b;

    iput-object p6, p0, Lcom/google/firebase/auth/o0;->f:Landroid/app/Activity;

    iput-object p4, p0, Lcom/google/firebase/auth/o0;->d:Ljava/util/concurrent/Executor;

    iput-object p7, p0, Lcom/google/firebase/auth/o0;->g:Lcom/google/firebase/auth/p0$a;

    iput-object p8, p0, Lcom/google/firebase/auth/o0;->h:Lcom/google/firebase/auth/k0;

    iput-object p9, p0, Lcom/google/firebase/auth/o0;->i:Lcom/google/firebase/auth/s0;

    iput-boolean p10, p0, Lcom/google/firebase/auth/o0;->j:Z

    return-void
.end method


# virtual methods
.method public final a()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/o0;->f:Landroid/app/Activity;

    return-object v0
.end method

.method public final b()Lcom/google/firebase/auth/FirebaseAuth;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/o0;->a:Lcom/google/firebase/auth/FirebaseAuth;

    return-object v0
.end method

.method public final c()Lcom/google/firebase/auth/k0;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/o0;->h:Lcom/google/firebase/auth/k0;

    return-object v0
.end method

.method public final d()Lcom/google/firebase/auth/p0$a;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/o0;->g:Lcom/google/firebase/auth/p0$a;

    return-object v0
.end method

.method public final e()Lcom/google/firebase/auth/p0$b;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/o0;->c:Lcom/google/firebase/auth/p0$b;

    return-object v0
.end method

.method public final f()Lcom/google/firebase/auth/s0;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/o0;->i:Lcom/google/firebase/auth/s0;

    return-object v0
.end method

.method public final g()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/o0;->b:Ljava/lang/Long;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/o0;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final i()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/o0;->d:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public final j()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/firebase/auth/o0;->j:Z

    return v0
.end method

.method public final k()Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/o0;->h:Lcom/google/firebase/auth/k0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
