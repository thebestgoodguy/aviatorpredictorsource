.class public final Lcom/google/android/gms/internal/firebase-auth-api/uo;
.super Lx/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/firebase-auth-api/uo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Z

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Lcom/google/android/gms/internal/firebase-auth-api/jp;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:J

.field private n:J

.field private o:Z

.field private p:Lcom/google/firebase/auth/n1;

.field private q:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/vo;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/vo;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lx/a;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/jp;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jp;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->j:Lcom/google/android/gms/internal/firebase-auth-api/jp;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/jp;Ljava/lang/String;Ljava/lang/String;JJZLcom/google/firebase/auth/n1;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Lx/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->e:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->f:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->g:Z

    iput-object p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->h:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->i:Ljava/lang/String;

    if-nez p6, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/jp;

    invoke-direct {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jp;-><init>()V

    goto :goto_0

    :cond_0
    invoke-static {p6}, Lcom/google/android/gms/internal/firebase-auth-api/jp;->k0(Lcom/google/android/gms/internal/firebase-auth-api/jp;)Lcom/google/android/gms/internal/firebase-auth-api/jp;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->j:Lcom/google/android/gms/internal/firebase-auth-api/jp;

    iput-object p7, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->k:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->l:Ljava/lang/String;

    iput-wide p9, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->m:J

    iput-wide p11, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->n:J

    iput-boolean p13, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->o:Z

    iput-object p14, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->p:Lcom/google/firebase/auth/n1;

    if-nez p15, :cond_1

    new-instance p15, Ljava/util/ArrayList;

    invoke-direct {p15}, Ljava/util/ArrayList;-><init>()V

    :cond_1
    iput-object p15, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->q:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final A0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->j:Lcom/google/android/gms/internal/firebase-auth-api/jp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jp;->l0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final B0()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->g:Z

    return v0
.end method

.method public final C0()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->o:Z

    return v0
.end method

.method public final j0()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->m:J

    return-wide v0
.end method

.method public final k0()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->n:J

    return-wide v0
.end method

.method public final l0()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->i:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->i:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final m0()Lcom/google/firebase/auth/n1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->p:Lcom/google/firebase/auth/n1;

    return-object v0
.end method

.method public final n0(Lcom/google/firebase/auth/n1;)Lcom/google/android/gms/internal/firebase-auth-api/uo;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->p:Lcom/google/firebase/auth/n1;

    return-object p0
.end method

.method public final o0(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/uo;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->h:Ljava/lang/String;

    return-object p0
.end method

.method public final p0(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/uo;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->f:Ljava/lang/String;

    return-object p0
.end method

.method public final q0(Z)Lcom/google/android/gms/internal/firebase-auth-api/uo;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->o:Z

    return-object p0
.end method

.method public final r0(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/uo;
    .locals 0

    invoke-static {p1}, Lw/r;->e(Ljava/lang/String;)Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->k:Ljava/lang/String;

    return-object p0
.end method

.method public final s0(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/uo;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->i:Ljava/lang/String;

    return-object p0
.end method

.method public final t0(Ljava/util/List;)Lcom/google/android/gms/internal/firebase-auth-api/uo;
    .locals 1

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/jp;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jp;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->j:Lcom/google/android/gms/internal/firebase-auth-api/jp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jp;->l0()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public final u0()Lcom/google/android/gms/internal/firebase-auth-api/jp;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->j:Lcom/google/android/gms/internal/firebase-auth-api/jp;

    return-object v0
.end method

.method public final v0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->h:Ljava/lang/String;

    return-object v0
.end method

.method public final w0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    invoke-static {p1}, Lx/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->e:Ljava/lang/String;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Lx/c;->m(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->f:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, v3}, Lx/c;->m(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-boolean v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->g:Z

    const/4 v2, 0x4

    invoke-static {p1, v2, v1}, Lx/c;->c(Landroid/os/Parcel;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->h:Ljava/lang/String;

    const/4 v2, 0x5

    invoke-static {p1, v2, v1, v3}, Lx/c;->m(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->i:Ljava/lang/String;

    const/4 v2, 0x6

    invoke-static {p1, v2, v1, v3}, Lx/c;->m(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->j:Lcom/google/android/gms/internal/firebase-auth-api/jp;

    const/4 v2, 0x7

    invoke-static {p1, v2, v1, p2, v3}, Lx/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->k:Ljava/lang/String;

    const/16 v2, 0x8

    invoke-static {p1, v2, v1, v3}, Lx/c;->m(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->l:Ljava/lang/String;

    const/16 v2, 0x9

    invoke-static {p1, v2, v1, v3}, Lx/c;->m(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-wide v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->m:J

    const/16 v4, 0xa

    invoke-static {p1, v4, v1, v2}, Lx/c;->j(Landroid/os/Parcel;IJ)V

    iget-wide v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->n:J

    const/16 v4, 0xb

    invoke-static {p1, v4, v1, v2}, Lx/c;->j(Landroid/os/Parcel;IJ)V

    iget-boolean v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->o:Z

    const/16 v2, 0xc

    invoke-static {p1, v2, v1}, Lx/c;->c(Landroid/os/Parcel;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->p:Lcom/google/firebase/auth/n1;

    const/16 v2, 0xd

    invoke-static {p1, v2, v1, p2, v3}, Lx/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->q:Ljava/util/List;

    const/16 v1, 0xe

    invoke-static {p1, v1, p2, v3}, Lx/c;->q(Landroid/os/Parcel;ILjava/util/List;Z)V

    invoke-static {p1, v0}, Lx/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public final x0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final y0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->l:Ljava/lang/String;

    return-object v0
.end method

.method public final z0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/uo;->q:Ljava/util/List;

    return-object v0
.end method
