.class final Lcom/google/firebase/auth/f2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo0/a;


# instance fields
.field final synthetic a:Lcom/google/firebase/auth/e;

.field final synthetic b:Lcom/google/firebase/auth/z;


# direct methods
.method constructor <init>(Lcom/google/firebase/auth/z;Lcom/google/firebase/auth/e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/auth/f2;->b:Lcom/google/firebase/auth/z;

    iput-object p2, p0, Lcom/google/firebase/auth/f2;->a:Lcom/google/firebase/auth/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lo0/h;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p1}, Lo0/h;->m()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/auth/b0;

    iget-object v0, p0, Lcom/google/firebase/auth/f2;->b:Lcom/google/firebase/auth/z;

    invoke-virtual {v0}, Lcom/google/firebase/auth/z;->C0()Lx0/e;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Lx0/e;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/auth/f2;->a:Lcom/google/firebase/auth/e;

    invoke-virtual {p1}, Lcom/google/firebase/auth/b0;->g()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/google/firebase/auth/FirebaseAuth;->b0(Lcom/google/firebase/auth/e;Ljava/lang/String;)Lo0/h;

    move-result-object p1

    return-object p1
.end method
