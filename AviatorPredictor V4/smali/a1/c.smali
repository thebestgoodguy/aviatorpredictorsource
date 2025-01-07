.class final La1/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo0/e;


# instance fields
.field final synthetic a:Lcom/google/firebase/auth/FirebaseAuth;

.field final synthetic b:La1/q0;

.field final synthetic c:Landroid/app/Activity;

.field final synthetic d:Lo0/i;

.field final synthetic e:La1/u0;


# direct methods
.method constructor <init>(La1/u0;Lcom/google/firebase/auth/FirebaseAuth;La1/q0;Landroid/app/Activity;Lo0/i;)V
    .locals 0

    iput-object p1, p0, La1/c;->e:La1/u0;

    iput-object p2, p0, La1/c;->a:Lcom/google/firebase/auth/FirebaseAuth;

    iput-object p3, p0, La1/c;->b:La1/q0;

    iput-object p4, p0, La1/c;->c:Landroid/app/Activity;

    iput-object p5, p0, La1/c;->d:Lo0/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Exception;)V
    .locals 4

    invoke-static {}, La1/u0;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "Problem retrieving SafetyNet Token: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, La1/c;->e:La1/u0;

    iget-object v0, p0, La1/c;->a:Lcom/google/firebase/auth/FirebaseAuth;

    iget-object v1, p0, La1/c;->b:La1/q0;

    iget-object v2, p0, La1/c;->c:Landroid/app/Activity;

    iget-object v3, p0, La1/c;->d:Lo0/i;

    invoke-static {p1, v0, v1, v2, v3}, La1/u0;->d(La1/u0;Lcom/google/firebase/auth/FirebaseAuth;La1/q0;Landroid/app/Activity;Lo0/i;)V

    return-void
.end method
