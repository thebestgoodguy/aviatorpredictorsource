.class public final Lw/p0;
.super Lx/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lw/p0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final e:I

.field private final f:Landroid/accounts/Account;

.field private final g:I

.field private final h:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw/q0;

    invoke-direct {v0}, Lw/q0;-><init>()V

    sput-object v0, Lw/p0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILandroid/accounts/Account;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V
    .locals 0

    invoke-direct {p0}, Lx/a;-><init>()V

    iput p1, p0, Lw/p0;->e:I

    iput-object p2, p0, Lw/p0;->f:Landroid/accounts/Account;

    iput p3, p0, Lw/p0;->g:I

    iput-object p4, p0, Lw/p0;->h:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    return-void
.end method

.method public constructor <init>(Landroid/accounts/Account;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1, p2, p3}, Lw/p0;-><init>(ILandroid/accounts/Account;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lx/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget v1, p0, Lw/p0;->e:I

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Lx/c;->h(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lw/p0;->f:Landroid/accounts/Account;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lx/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget v1, p0, Lw/p0;->g:I

    const/4 v2, 0x3

    invoke-static {p1, v2, v1}, Lx/c;->h(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lw/p0;->h:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    const/4 v2, 0x4

    invoke-static {p1, v2, v1, p2, v3}, Lx/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lx/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
