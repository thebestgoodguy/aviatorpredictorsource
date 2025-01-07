.class final Lcom/google/firebase/auth/x1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo0/d;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:J

.field final synthetic c:Ljava/util/concurrent/TimeUnit;

.field final synthetic d:Lcom/google/firebase/auth/p0$b;

.field final synthetic e:Landroid/app/Activity;

.field final synthetic f:Ljava/util/concurrent/Executor;

.field final synthetic g:Z

.field final synthetic h:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;JLjava/util/concurrent/TimeUnit;Lcom/google/firebase/auth/p0$b;Landroid/app/Activity;Ljava/util/concurrent/Executor;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/auth/x1;->h:Lcom/google/firebase/auth/FirebaseAuth;

    iput-object p2, p0, Lcom/google/firebase/auth/x1;->a:Ljava/lang/String;

    iput-wide p3, p0, Lcom/google/firebase/auth/x1;->b:J

    iput-object p5, p0, Lcom/google/firebase/auth/x1;->c:Ljava/util/concurrent/TimeUnit;

    iput-object p6, p0, Lcom/google/firebase/auth/x1;->d:Lcom/google/firebase/auth/p0$b;

    iput-object p7, p0, Lcom/google/firebase/auth/x1;->e:Landroid/app/Activity;

    iput-object p8, p0, Lcom/google/firebase/auth/x1;->f:Ljava/util/concurrent/Executor;

    iput-boolean p9, p0, Lcom/google/firebase/auth/x1;->g:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lo0/h;)V
    .locals 13

    invoke-virtual {p1}, Lo0/h;->p()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lo0/h;->l()Ljava/lang/Exception;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lo0/h;->l()Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Error while validating application identity: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "FirebaseAuth"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "Proceeding without any application identifier."

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move-object v11, v1

    move-object v12, v11

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La1/t0;

    invoke-virtual {v0}, La1/t0;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La1/t0;

    invoke-virtual {p1}, La1/t0;->a()Ljava/lang/String;

    move-result-object p1

    move-object v11, p1

    move-object v12, v1

    :goto_1
    iget-object v2, p0, Lcom/google/firebase/auth/x1;->h:Lcom/google/firebase/auth/FirebaseAuth;

    iget-object v3, p0, Lcom/google/firebase/auth/x1;->a:Ljava/lang/String;

    iget-wide v4, p0, Lcom/google/firebase/auth/x1;->b:J

    iget-object v6, p0, Lcom/google/firebase/auth/x1;->c:Ljava/util/concurrent/TimeUnit;

    iget-object v7, p0, Lcom/google/firebase/auth/x1;->d:Lcom/google/firebase/auth/p0$b;

    iget-object v8, p0, Lcom/google/firebase/auth/x1;->e:Landroid/app/Activity;

    iget-object v9, p0, Lcom/google/firebase/auth/x1;->f:Ljava/util/concurrent/Executor;

    iget-boolean v10, p0, Lcom/google/firebase/auth/x1;->g:Z

    invoke-virtual/range {v2 .. v12}, Lcom/google/firebase/auth/FirebaseAuth;->Q(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;Lcom/google/firebase/auth/p0$b;Landroid/app/Activity;Ljava/util/concurrent/Executor;ZLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method
