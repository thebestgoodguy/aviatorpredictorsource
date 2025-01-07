.class final Lcom/google/firebase/auth/y1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo0/d;


# instance fields
.field final synthetic a:Lcom/google/firebase/auth/o0;

.field final synthetic b:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/o0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/auth/y1;->b:Lcom/google/firebase/auth/FirebaseAuth;

    iput-object p2, p0, Lcom/google/firebase/auth/y1;->a:Lcom/google/firebase/auth/o0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lo0/h;)V
    .locals 17

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lo0/h;->p()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    const-string v1, "Error while validating application identity: "

    invoke-virtual/range {p1 .. p1}, Lo0/h;->l()Ljava/lang/Exception;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual/range {p1 .. p1}, Lo0/h;->l()Ljava/lang/Exception;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_0
    const-string v3, "FirebaseAuth"

    invoke-static {v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, "Proceeding without any application identifier."

    invoke-static {v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move-object v11, v2

    move-object v12, v11

    goto :goto_0

    :cond_1
    invoke-virtual/range {p1 .. p1}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La1/t0;

    invoke-virtual {v1}, La1/t0;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La1/t0;

    invoke-virtual {v1}, La1/t0;->a()Ljava/lang/String;

    move-result-object v1

    move-object v12, v1

    move-object v11, v2

    :goto_0
    iget-object v1, v0, Lcom/google/firebase/auth/y1;->a:Lcom/google/firebase/auth/o0;

    invoke-virtual {v1}, Lcom/google/firebase/auth/o0;->g()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    iget-object v1, v0, Lcom/google/firebase/auth/y1;->b:Lcom/google/firebase/auth/FirebaseAuth;

    iget-object v2, v0, Lcom/google/firebase/auth/y1;->a:Lcom/google/firebase/auth/o0;

    invoke-virtual {v2}, Lcom/google/firebase/auth/o0;->h()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, Lcom/google/firebase/auth/y1;->a:Lcom/google/firebase/auth/o0;

    invoke-virtual {v3}, Lcom/google/firebase/auth/o0;->e()Lcom/google/firebase/auth/p0$b;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/google/firebase/auth/FirebaseAuth;->k0(Lcom/google/firebase/auth/FirebaseAuth;Ljava/lang/String;Lcom/google/firebase/auth/p0$b;)Lcom/google/firebase/auth/p0$b;

    move-result-object v14

    iget-object v1, v0, Lcom/google/firebase/auth/y1;->a:Lcom/google/firebase/auth/o0;

    invoke-virtual {v1}, Lcom/google/firebase/auth/o0;->c()Lcom/google/firebase/auth/k0;

    move-result-object v1

    invoke-static {v1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, La1/j;

    invoke-virtual {v4}, La1/j;->n0()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    iget-object v1, v0, Lcom/google/firebase/auth/y1;->b:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-static {v1}, Lcom/google/firebase/auth/FirebaseAuth;->l0(Lcom/google/firebase/auth/FirebaseAuth;)Lcom/google/android/gms/internal/firebase-auth-api/yl;

    move-result-object v1

    iget-object v5, v0, Lcom/google/firebase/auth/y1;->a:Lcom/google/firebase/auth/o0;

    invoke-virtual {v5}, Lcom/google/firebase/auth/o0;->h()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    iget-object v6, v0, Lcom/google/firebase/auth/y1;->b:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-static {v6}, Lcom/google/firebase/auth/FirebaseAuth;->q0(Lcom/google/firebase/auth/FirebaseAuth;)Ljava/lang/String;

    move-result-object v6

    iget-object v9, v0, Lcom/google/firebase/auth/y1;->a:Lcom/google/firebase/auth/o0;

    invoke-virtual {v9}, Lcom/google/firebase/auth/o0;->d()Lcom/google/firebase/auth/p0$a;

    move-result-object v9

    if-eqz v9, :cond_2

    const/4 v9, 0x1

    goto :goto_1

    :cond_2
    const/4 v9, 0x0

    :goto_1
    iget-object v2, v0, Lcom/google/firebase/auth/y1;->a:Lcom/google/firebase/auth/o0;

    invoke-virtual {v2}, Lcom/google/firebase/auth/o0;->j()Z

    move-result v10

    iget-object v2, v0, Lcom/google/firebase/auth/y1;->b:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-virtual {v2}, Lcom/google/firebase/auth/FirebaseAuth;->R()Z

    move-result v13

    iget-object v2, v0, Lcom/google/firebase/auth/y1;->a:Lcom/google/firebase/auth/o0;

    invoke-virtual {v2}, Lcom/google/firebase/auth/o0;->i()Ljava/util/concurrent/Executor;

    move-result-object v15

    iget-object v2, v0, Lcom/google/firebase/auth/y1;->a:Lcom/google/firebase/auth/o0;

    invoke-virtual {v2}, Lcom/google/firebase/auth/o0;->a()Landroid/app/Activity;

    move-result-object v16

    move-object v3, v1

    invoke-virtual/range {v3 .. v16}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->e(La1/j;Ljava/lang/String;Ljava/lang/String;JZZLjava/lang/String;Ljava/lang/String;ZLcom/google/firebase/auth/p0$b;Ljava/util/concurrent/Executor;Landroid/app/Activity;)Lo0/h;

    return-void

    :cond_3
    iget-object v1, v0, Lcom/google/firebase/auth/y1;->b:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-static {v1}, Lcom/google/firebase/auth/FirebaseAuth;->l0(Lcom/google/firebase/auth/FirebaseAuth;)Lcom/google/android/gms/internal/firebase-auth-api/yl;

    move-result-object v1

    iget-object v5, v0, Lcom/google/firebase/auth/y1;->a:Lcom/google/firebase/auth/o0;

    invoke-virtual {v5}, Lcom/google/firebase/auth/o0;->f()Lcom/google/firebase/auth/s0;

    move-result-object v5

    invoke-static {v5}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/firebase/auth/s0;

    iget-object v6, v0, Lcom/google/firebase/auth/y1;->b:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-static {v6}, Lcom/google/firebase/auth/FirebaseAuth;->q0(Lcom/google/firebase/auth/FirebaseAuth;)Ljava/lang/String;

    move-result-object v6

    iget-object v9, v0, Lcom/google/firebase/auth/y1;->a:Lcom/google/firebase/auth/o0;

    invoke-virtual {v9}, Lcom/google/firebase/auth/o0;->d()Lcom/google/firebase/auth/p0$a;

    move-result-object v9

    if-eqz v9, :cond_4

    const/4 v9, 0x1

    goto :goto_2

    :cond_4
    const/4 v9, 0x0

    :goto_2
    iget-object v2, v0, Lcom/google/firebase/auth/y1;->a:Lcom/google/firebase/auth/o0;

    invoke-virtual {v2}, Lcom/google/firebase/auth/o0;->j()Z

    move-result v10

    iget-object v2, v0, Lcom/google/firebase/auth/y1;->b:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-virtual {v2}, Lcom/google/firebase/auth/FirebaseAuth;->R()Z

    move-result v13

    iget-object v2, v0, Lcom/google/firebase/auth/y1;->a:Lcom/google/firebase/auth/o0;

    invoke-virtual {v2}, Lcom/google/firebase/auth/o0;->i()Ljava/util/concurrent/Executor;

    move-result-object v15

    iget-object v2, v0, Lcom/google/firebase/auth/y1;->a:Lcom/google/firebase/auth/o0;

    invoke-virtual {v2}, Lcom/google/firebase/auth/o0;->a()Landroid/app/Activity;

    move-result-object v16

    move-object v3, v1

    invoke-virtual/range {v3 .. v16}, Lcom/google/android/gms/internal/firebase-auth-api/yl;->f(La1/j;Lcom/google/firebase/auth/s0;Ljava/lang/String;JZZLjava/lang/String;Ljava/lang/String;ZLcom/google/firebase/auth/p0$b;Ljava/util/concurrent/Executor;Landroid/app/Activity;)Lo0/h;

    return-void
.end method
