.class public final Lcom/google/android/gms/internal/firebase-auth-api/oh;
.super Lx/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/firebase-auth-api/oh;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final e:Lcom/google/android/gms/internal/firebase-auth-api/cq;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/ph;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ph;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/oh;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/cq;)V
    .locals 0

    invoke-direct {p0}, Lx/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/oh;->e:Lcom/google/android/gms/internal/firebase-auth-api/cq;

    return-void
.end method


# virtual methods
.method public final j0()Lcom/google/android/gms/internal/firebase-auth-api/cq;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/oh;->e:Lcom/google/android/gms/internal/firebase-auth-api/cq;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lx/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/oh;->e:Lcom/google/android/gms/internal/firebase-auth-api/cq;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lx/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lx/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
