.class public final La1/m1;
.super Lcom/google/firebase/auth/z;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "La1/m1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private e:Lcom/google/android/gms/internal/firebase-auth-api/bp;

.field private f:La1/i1;

.field private final g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/util/List;

.field private j:Ljava/util/List;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/Boolean;

.field private m:La1/o1;

.field private n:Z

.field private o:Lcom/google/firebase/auth/n1;

.field private p:La1/f0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La1/n1;

    invoke-direct {v0}, La1/n1;-><init>()V

    sput-object v0, La1/m1;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/bp;La1/i1;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;La1/o1;ZLcom/google/firebase/auth/n1;La1/f0;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/auth/z;-><init>()V

    iput-object p1, p0, La1/m1;->e:Lcom/google/android/gms/internal/firebase-auth-api/bp;

    iput-object p2, p0, La1/m1;->f:La1/i1;

    iput-object p3, p0, La1/m1;->g:Ljava/lang/String;

    iput-object p4, p0, La1/m1;->h:Ljava/lang/String;

    iput-object p5, p0, La1/m1;->i:Ljava/util/List;

    iput-object p6, p0, La1/m1;->j:Ljava/util/List;

    iput-object p7, p0, La1/m1;->k:Ljava/lang/String;

    iput-object p8, p0, La1/m1;->l:Ljava/lang/Boolean;

    iput-object p9, p0, La1/m1;->m:La1/o1;

    iput-boolean p10, p0, La1/m1;->n:Z

    iput-object p11, p0, La1/m1;->o:Lcom/google/firebase/auth/n1;

    iput-object p12, p0, La1/m1;->p:La1/f0;

    return-void
.end method

.method public constructor <init>(Lx0/e;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/auth/z;-><init>()V

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lx0/e;->q()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, La1/m1;->g:Ljava/lang/String;

    const-string p1, "com.google.firebase.auth.internal.DefaultFirebaseUser"

    iput-object p1, p0, La1/m1;->h:Ljava/lang/String;

    const-string p1, "2"

    iput-object p1, p0, La1/m1;->k:Ljava/lang/String;

    invoke-virtual {p0, p2}, La1/m1;->E0(Ljava/util/List;)Lcom/google/firebase/auth/z;

    return-void
.end method


# virtual methods
.method public final C0()Lx0/e;
    .locals 1

    iget-object v0, p0, La1/m1;->g:Ljava/lang/String;

    invoke-static {v0}, Lx0/e;->p(Ljava/lang/String;)Lx0/e;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic D0()Lcom/google/firebase/auth/z;
    .locals 0

    invoke-virtual {p0}, La1/m1;->N0()La1/m1;

    return-object p0
.end method

.method public final declared-synchronized E0(Ljava/util/List;)Lcom/google/firebase/auth/z;
    .locals 5

    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, La1/m1;->i:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, La1/m1;->j:Ljava/util/List;

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/firebase/auth/x0;

    invoke-interface {v2}, Lcom/google/firebase/auth/x0;->h()Ljava/lang/String;

    move-result-object v3

    const-string v4, "firebase"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, La1/i1;

    iput-object v3, p0, La1/m1;->f:La1/i1;

    goto :goto_1

    :cond_0
    iget-object v3, p0, La1/m1;->j:Ljava/util/List;

    invoke-interface {v2}, Lcom/google/firebase/auth/x0;->h()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    iget-object v3, p0, La1/m1;->i:Ljava/util/List;

    check-cast v2, La1/i1;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, La1/m1;->f:La1/i1;

    if-nez p1, :cond_2

    iget-object p1, p0, La1/m1;->i:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La1/i1;

    iput-object p1, p0, La1/m1;->f:La1/i1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final F()Z
    .locals 1

    iget-object v0, p0, La1/m1;->f:La1/i1;

    invoke-virtual {v0}, La1/i1;->F()Z

    move-result v0

    return v0
.end method

.method public final F0()Lcom/google/android/gms/internal/firebase-auth-api/bp;
    .locals 1

    iget-object v0, p0, La1/m1;->e:Lcom/google/android/gms/internal/firebase-auth-api/bp;

    return-object v0
.end method

.method public final G0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La1/m1;->e:Lcom/google/android/gms/internal/firebase-auth-api/bp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/bp;->m0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final H0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La1/m1;->e:Lcom/google/android/gms/internal/firebase-auth-api/bp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/bp;->p0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final I0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, La1/m1;->j:Ljava/util/List;

    return-object v0
.end method

.method public final J0(Lcom/google/android/gms/internal/firebase-auth-api/bp;)V
    .locals 0

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/bp;

    iput-object p1, p0, La1/m1;->e:Lcom/google/android/gms/internal/firebase-auth-api/bp;

    return-void
.end method

.method public final K0(Ljava/util/List;)V
    .locals 3

    sget-object v0, La1/f0;->CREATOR:Landroid/os/Parcelable$Creator;

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/firebase/auth/i0;

    instance-of v2, v1, Lcom/google/firebase/auth/s0;

    if-eqz v2, :cond_1

    check-cast v1, Lcom/google/firebase/auth/s0;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance p1, La1/f0;

    invoke-direct {p1, v0}, La1/f0;-><init>(Ljava/util/List;)V

    move-object v0, p1

    :cond_3
    :goto_1
    iput-object v0, p0, La1/m1;->p:La1/f0;

    return-void
.end method

.method public final L0()Lcom/google/firebase/auth/n1;
    .locals 1

    iget-object v0, p0, La1/m1;->o:Lcom/google/firebase/auth/n1;

    return-object v0
.end method

.method public final M0(Ljava/lang/String;)La1/m1;
    .locals 0

    iput-object p1, p0, La1/m1;->k:Ljava/lang/String;

    return-object p0
.end method

.method public final N0()La1/m1;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, La1/m1;->l:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final O0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, La1/m1;->p:La1/f0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, La1/f0;->j0()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    return-object v0
.end method

.method public final P0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, La1/m1;->i:Ljava/util/List;

    return-object v0
.end method

.method public final Q0(Lcom/google/firebase/auth/n1;)V
    .locals 0

    iput-object p1, p0, La1/m1;->o:Lcom/google/firebase/auth/n1;

    return-void
.end method

.method public final R()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La1/m1;->f:La1/i1;

    invoke-virtual {v0}, La1/i1;->R()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final R0(Z)V
    .locals 0

    iput-boolean p1, p0, La1/m1;->n:Z

    return-void
.end method

.method public final S0(La1/o1;)V
    .locals 0

    iput-object p1, p0, La1/m1;->m:La1/o1;

    return-void
.end method

.method public final T0()Z
    .locals 1

    iget-boolean v0, p0, La1/m1;->n:Z

    return v0
.end method

.method public final X()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La1/m1;->f:La1/i1;

    invoke-virtual {v0}, La1/i1;->X()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La1/m1;->f:La1/i1;

    invoke-virtual {v0}, La1/i1;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La1/m1;->f:La1/i1;

    invoke-virtual {v0}, La1/i1;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final l()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, La1/m1;->f:La1/i1;

    invoke-virtual {v0}, La1/i1;->l()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final l0()Lcom/google/firebase/auth/a0;
    .locals 1

    iget-object v0, p0, La1/m1;->m:La1/o1;

    return-object v0
.end method

.method public final synthetic m0()Lcom/google/firebase/auth/g0;
    .locals 1

    new-instance v0, La1/f;

    invoke-direct {v0, p0}, La1/f;-><init>(La1/m1;)V

    return-object v0
.end method

.method public final n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La1/m1;->f:La1/i1;

    invoke-virtual {v0}, La1/i1;->n()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final n0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/google/firebase/auth/x0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, La1/m1;->i:Ljava/util/List;

    return-object v0
.end method

.method public final o0()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, La1/m1;->e:Lcom/google/android/gms/internal/firebase-auth-api/bp;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/bp;->m0()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/bp;->m0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La1/b0;->a(Ljava/lang/String;)Lcom/google/firebase/auth/b0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/auth/b0;->b()Ljava/util/Map;

    move-result-object v0

    const-string v2, "firebase"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_0

    const-string v1, "tenant"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_0
    return-object v1
.end method

.method public final p0()Z
    .locals 4

    iget-object v0, p0, La1/m1;->l:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_0
    iget-object v0, p0, La1/m1;->e:Lcom/google/android/gms/internal/firebase-auth-api/bp;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/bp;->m0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La1/b0;->a(Ljava/lang/String;)Lcom/google/firebase/auth/b0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/auth/b0;->e()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const-string v0, ""

    :goto_0
    iget-object v1, p0, La1/m1;->i:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-gt v1, v3, :cond_3

    if-eqz v0, :cond_2

    const-string v1, "custom"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    const/4 v2, 0x1

    :cond_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, La1/m1;->l:Ljava/lang/Boolean;

    :cond_4
    iget-object v0, p0, La1/m1;->l:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lx/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, La1/m1;->e:Lcom/google/android/gms/internal/firebase-auth-api/bp;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lx/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, La1/m1;->f:La1/i1;

    const/4 v2, 0x2

    invoke-static {p1, v2, v1, p2, v3}, Lx/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, La1/m1;->g:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, v3}, Lx/c;->m(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, La1/m1;->h:Ljava/lang/String;

    const/4 v2, 0x4

    invoke-static {p1, v2, v1, v3}, Lx/c;->m(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, La1/m1;->i:Ljava/util/List;

    const/4 v2, 0x5

    invoke-static {p1, v2, v1, v3}, Lx/c;->q(Landroid/os/Parcel;ILjava/util/List;Z)V

    iget-object v1, p0, La1/m1;->j:Ljava/util/List;

    const/4 v2, 0x6

    invoke-static {p1, v2, v1, v3}, Lx/c;->o(Landroid/os/Parcel;ILjava/util/List;Z)V

    iget-object v1, p0, La1/m1;->k:Ljava/lang/String;

    const/4 v2, 0x7

    invoke-static {p1, v2, v1, v3}, Lx/c;->m(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-virtual {p0}, La1/m1;->p0()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/16 v2, 0x8

    invoke-static {p1, v2, v1, v3}, Lx/c;->d(Landroid/os/Parcel;ILjava/lang/Boolean;Z)V

    iget-object v1, p0, La1/m1;->m:La1/o1;

    const/16 v2, 0x9

    invoke-static {p1, v2, v1, p2, v3}, Lx/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-boolean v1, p0, La1/m1;->n:Z

    const/16 v2, 0xa

    invoke-static {p1, v2, v1}, Lx/c;->c(Landroid/os/Parcel;IZ)V

    iget-object v1, p0, La1/m1;->o:Lcom/google/firebase/auth/n1;

    const/16 v2, 0xb

    invoke-static {p1, v2, v1, p2, v3}, Lx/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, La1/m1;->p:La1/f0;

    const/16 v2, 0xc

    invoke-static {p1, v2, v1, p2, v3}, Lx/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lx/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
