.class final Lcom/google/android/gms/internal/firebase-auth-api/wi;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/hn;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/firebase-auth-api/sp;

.field final synthetic b:Lcom/google/android/gms/internal/firebase-auth-api/uo;

.field final synthetic c:Lcom/google/android/gms/internal/firebase-auth-api/am;

.field final synthetic d:Lcom/google/android/gms/internal/firebase-auth-api/bp;

.field final synthetic e:Lcom/google/android/gms/internal/firebase-auth-api/gn;

.field final synthetic f:Lcom/google/android/gms/internal/firebase-auth-api/ik;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/ik;Lcom/google/android/gms/internal/firebase-auth-api/sp;Lcom/google/android/gms/internal/firebase-auth-api/uo;Lcom/google/android/gms/internal/firebase-auth-api/am;Lcom/google/android/gms/internal/firebase-auth-api/bp;Lcom/google/android/gms/internal/firebase-auth-api/gn;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/wi;->f:Lcom/google/android/gms/internal/firebase-auth-api/ik;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/wi;->a:Lcom/google/android/gms/internal/firebase-auth-api/sp;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/wi;->b:Lcom/google/android/gms/internal/firebase-auth-api/uo;

    iput-object p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/wi;->c:Lcom/google/android/gms/internal/firebase-auth-api/am;

    iput-object p5, p0, Lcom/google/android/gms/internal/firebase-auth-api/wi;->d:Lcom/google/android/gms/internal/firebase-auth-api/bp;

    iput-object p6, p0, Lcom/google/android/gms/internal/firebase-auth-api/wi;->e:Lcom/google/android/gms/internal/firebase-auth-api/gn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 6

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/tp;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/wi;->a:Lcom/google/android/gms/internal/firebase-auth-api/sp;

    const-string v1, "EMAIL"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/sp;->n(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/wi;->b:Lcom/google/android/gms/internal/firebase-auth-api/uo;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/uo;->p0(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/uo;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/wi;->a:Lcom/google/android/gms/internal/firebase-auth-api/sp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/sp;->k()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/wi;->b:Lcom/google/android/gms/internal/firebase-auth-api/uo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/sp;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/uo;->p0(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/uo;

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/wi;->a:Lcom/google/android/gms/internal/firebase-auth-api/sp;

    const-string v2, "DISPLAY_NAME"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/sp;->n(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/wi;->b:Lcom/google/android/gms/internal/firebase-auth-api/uo;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/uo;->o0(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/uo;

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/wi;->a:Lcom/google/android/gms/internal/firebase-auth-api/sp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/sp;->j()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/wi;->b:Lcom/google/android/gms/internal/firebase-auth-api/uo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/sp;->j()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/uo;->o0(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/uo;

    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/wi;->a:Lcom/google/android/gms/internal/firebase-auth-api/sp;

    const-string v2, "PHOTO_URL"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/sp;->n(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/wi;->b:Lcom/google/android/gms/internal/firebase-auth-api/uo;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/uo;->s0(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/uo;

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/wi;->a:Lcom/google/android/gms/internal/firebase-auth-api/sp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/sp;->m()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/wi;->b:Lcom/google/android/gms/internal/firebase-auth-api/uo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/sp;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/uo;->s0(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/uo;

    :cond_5
    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/wi;->a:Lcom/google/android/gms/internal/firebase-auth-api/sp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/sp;->l()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/wi;->b:Lcom/google/android/gms/internal/firebase-auth-api/uo;

    const-string v1, "redacted"

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-static {v1}, Lb0/c;->c([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/uo;->r0(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/uo;

    :cond_6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/tp;->f()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_7

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_7
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/wi;->b:Lcom/google/android/gms/internal/firebase-auth-api/uo;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/uo;->t0(Ljava/util/List;)Lcom/google/android/gms/internal/firebase-auth-api/uo;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/wi;->c:Lcom/google/android/gms/internal/firebase-auth-api/am;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/wi;->d:Lcom/google/android/gms/internal/firebase-auth-api/bp;

    invoke-static {v1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/tp;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/tp;->e()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_8

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_8

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/tp;->a()J

    move-result-wide v4

    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/bp;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/bp;->o0()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v3, v2, v4, v1}, Lcom/google/android/gms/internal/firebase-auth-api/bp;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V

    move-object v1, p1

    :cond_8
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/wi;->b:Lcom/google/android/gms/internal/firebase-auth-api/uo;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/am;->i(Lcom/google/android/gms/internal/firebase-auth-api/bp;Lcom/google/android/gms/internal/firebase-auth-api/uo;)V

    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/wi;->e:Lcom/google/android/gms/internal/firebase-auth-api/gn;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/gn;->d(Ljava/lang/String;)V

    return-void
.end method
