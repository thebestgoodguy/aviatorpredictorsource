.class public final Ln0/h;
.super Lx/a;
.source ""

# interfaces
.implements Lt/k;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Ln0/h;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln0/i;

    invoke-direct {v0}, Ln0/i;-><init>()V

    sput-object v0, Ln0/h;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lx/a;-><init>()V

    iput-object p1, p0, Ln0/h;->e:Ljava/util/List;

    iput-object p2, p0, Ln0/h;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final i0()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Ln0/h;->f:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/common/api/Status;->j:Lcom/google/android/gms/common/api/Status;

    return-object v0

    :cond_0
    sget-object v0, Lcom/google/android/gms/common/api/Status;->n:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lx/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget-object v0, p0, Ln0/h;->e:Ljava/util/List;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lx/c;->o(Landroid/os/Parcel;ILjava/util/List;Z)V

    iget-object v0, p0, Ln0/h;->f:Ljava/lang/String;

    const/4 v1, 0x2

    invoke-static {p1, v1, v0, v2}, Lx/c;->m(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, p2}, Lx/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
