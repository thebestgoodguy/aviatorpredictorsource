.class final Lcom/google/firebase/auth/z1;
.super Lcom/google/firebase/auth/p0$b;
.source ""


# instance fields
.field final synthetic b:Lcom/google/firebase/auth/p0$b;

.field final synthetic c:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/firebase/auth/p0$b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/auth/z1;->c:Lcom/google/firebase/auth/FirebaseAuth;

    iput-object p2, p0, Lcom/google/firebase/auth/z1;->b:Lcom/google/firebase/auth/p0$b;

    invoke-direct {p0}, Lcom/google/firebase/auth/p0$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final b(Ljava/lang/String;Lcom/google/firebase/auth/p0$a;)V
    .locals 1

    iget-object p2, p0, Lcom/google/firebase/auth/z1;->b:Lcom/google/firebase/auth/p0$b;

    iget-object v0, p0, Lcom/google/firebase/auth/z1;->c:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->m0(Lcom/google/firebase/auth/FirebaseAuth;)La1/l1;

    move-result-object v0

    invoke-virtual {v0}, La1/l1;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/google/firebase/auth/p0;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/auth/n0;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/google/firebase/auth/p0$b;->c(Lcom/google/firebase/auth/n0;)V

    return-void
.end method

.method public final c(Lcom/google/firebase/auth/n0;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/z1;->b:Lcom/google/firebase/auth/p0$b;

    invoke-virtual {v0, p1}, Lcom/google/firebase/auth/p0$b;->c(Lcom/google/firebase/auth/n0;)V

    return-void
.end method

.method public final d(Lx0/k;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/z1;->b:Lcom/google/firebase/auth/p0$b;

    invoke-virtual {v0, p1}, Lcom/google/firebase/auth/p0$b;->d(Lx0/k;)V

    return-void
.end method
