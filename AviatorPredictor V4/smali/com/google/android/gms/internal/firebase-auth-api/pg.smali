.class public final Lcom/google/android/gms/internal/firebase-auth-api/pg;
.super Lx/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/firebase-auth-api/pg;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final e:Lcom/google/firebase/auth/n0;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/qg;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/qg;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/pg;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/google/firebase/auth/n0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lx/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/pg;->e:Lcom/google/firebase/auth/n0;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/pg;->f:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/pg;->g:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final j0()Lcom/google/firebase/auth/n0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/pg;->e:Lcom/google/firebase/auth/n0;

    return-object v0
.end method

.method public final k0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/pg;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final l0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/pg;->g:Ljava/lang/String;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lx/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/pg;->e:Lcom/google/firebase/auth/n0;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lx/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/pg;->f:Ljava/lang/String;

    const/4 v1, 0x2

    invoke-static {p1, v1, p2, v3}, Lx/c;->m(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/pg;->g:Ljava/lang/String;

    const/4 v1, 0x3

    invoke-static {p1, v1, p2, v3}, Lx/c;->m(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, v0}, Lx/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
