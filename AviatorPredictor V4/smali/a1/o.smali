.class final La1/o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final e:Ljava/lang/String;

.field final synthetic f:La1/p;


# direct methods
.method constructor <init>(La1/p;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, La1/o;->f:La1/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, La1/o;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, La1/o;->e:Ljava/lang/String;

    invoke-static {v0}, Lx0/e;->p(Ljava/lang/String;)Lx0/e;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Lx0/e;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/auth/FirebaseAuth;->m()Lcom/google/firebase/auth/z;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/firebase/auth/FirebaseAuth;->g(Z)Lo0/h;

    move-result-object v0

    invoke-static {}, La1/p;->a()Lz/a;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Token refreshing started"

    invoke-virtual {v1, v3, v2}, Lz/a;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v1, La1/n;

    invoke-direct {v1, p0}, La1/n;-><init>(La1/o;)V

    invoke-virtual {v0, v1}, Lo0/h;->e(Lo0/e;)Lo0/h;

    :cond_0
    return-void
.end method
