.class final Lcom/google/firebase/auth/g2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo0/a;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/google/firebase/auth/e;

.field final synthetic c:Lcom/google/firebase/auth/z;


# direct methods
.method constructor <init>(Lcom/google/firebase/auth/z;Ljava/lang/String;Lcom/google/firebase/auth/e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/auth/g2;->c:Lcom/google/firebase/auth/z;

    iput-object p2, p0, Lcom/google/firebase/auth/g2;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/firebase/auth/g2;->b:Lcom/google/firebase/auth/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lo0/h;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p1}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/auth/b0;

    iget-object v0, p0, Lcom/google/firebase/auth/g2;->c:Lcom/google/firebase/auth/z;

    invoke-virtual {v0}, Lcom/google/firebase/auth/z;->C0()Lx0/e;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Lx0/e;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/firebase/auth/b0;->g()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lcom/google/firebase/auth/g2;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/firebase/auth/g2;->b:Lcom/google/firebase/auth/e;

    invoke-virtual {v0, p1, v1, v2}, Lcom/google/firebase/auth/FirebaseAuth;->i0(Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/auth/e;)Lo0/h;

    move-result-object p1

    return-object p1
.end method
