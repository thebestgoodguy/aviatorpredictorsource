.class final La1/d0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo0/f;


# instance fields
.field final synthetic a:Lo0/i;

.field final synthetic b:Lcom/google/firebase/auth/FirebaseAuth;

.field final synthetic c:La1/q0;

.field final synthetic d:Landroid/app/Activity;

.field final synthetic e:La1/u0;


# direct methods
.method constructor <init>(La1/u0;Lo0/i;Lcom/google/firebase/auth/FirebaseAuth;La1/q0;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, La1/d0;->e:La1/u0;

    iput-object p2, p0, La1/d0;->a:Lo0/i;

    iput-object p3, p0, La1/d0;->b:Lcom/google/firebase/auth/FirebaseAuth;

    iput-object p4, p0, La1/d0;->c:La1/q0;

    iput-object p5, p0, La1/d0;->d:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic d(Ljava/lang/Object;)V
    .locals 4

    check-cast p1, Lk0/d$a;

    invoke-static {p1}, La1/j0;->a(Lk0/d$a;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, La1/d0;->a:Lo0/i;

    new-instance v1, La1/t0;

    invoke-virtual {p1}, Lk0/d$a;->c()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, La1/t0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lo0/i;->c(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object p1, p0, La1/d0;->e:La1/u0;

    iget-object v0, p0, La1/d0;->b:Lcom/google/firebase/auth/FirebaseAuth;

    iget-object v1, p0, La1/d0;->c:La1/q0;

    iget-object v2, p0, La1/d0;->d:Landroid/app/Activity;

    iget-object v3, p0, La1/d0;->a:Lo0/i;

    invoke-static {p1, v0, v1, v2, v3}, La1/u0;->d(La1/u0;Lcom/google/firebase/auth/FirebaseAuth;La1/q0;Landroid/app/Activity;Lo0/i;)V

    return-void
.end method
