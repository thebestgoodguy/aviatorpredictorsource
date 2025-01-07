.class Lo1/u$d;
.super Lb3/g$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo1/u;->j(Lo0/i;Ljava/lang/Object;Lo0/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo0/i;

.field final synthetic b:Lo1/u;


# direct methods
.method constructor <init>(Lo1/u;Lo0/i;)V
    .locals 0

    iput-object p1, p0, Lo1/u$d;->b:Lo1/u;

    iput-object p2, p0, Lo1/u$d;->a:Lo0/i;

    invoke-direct {p0}, Lb3/g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lb3/f1;Lb3/u0;)V
    .locals 2

    invoke-virtual {p1}, Lb3/f1;->o()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p1, p0, Lo1/u$d;->a:Lo0/i;

    invoke-virtual {p1}, Lo0/i;->a()Lo0/h;

    move-result-object p1

    invoke-virtual {p1}, Lo0/h;->o()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lo1/u$d;->a:Lo0/i;

    new-instance p2, Lcom/google/firebase/firestore/u;

    sget-object v0, Lcom/google/firebase/firestore/u$a;->s:Lcom/google/firebase/firestore/u$a;

    const-string v1, "Received onClose with status OK, but no message."

    invoke-direct {p2, v1, v0}, Lcom/google/firebase/firestore/u;-><init>(Ljava/lang/String;Lcom/google/firebase/firestore/u$a;)V

    invoke-virtual {p1, p2}, Lo0/i;->b(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lo1/u$d;->a:Lo0/i;

    iget-object v0, p0, Lo1/u$d;->b:Lo1/u;

    invoke-static {v0, p1}, Lo1/u;->e(Lo1/u;Lb3/f1;)Lcom/google/firebase/firestore/u;

    move-result-object p1

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lo1/u$d;->a:Lo0/i;

    invoke-virtual {v0, p1}, Lo0/i;->c(Ljava/lang/Object;)V

    return-void
.end method
