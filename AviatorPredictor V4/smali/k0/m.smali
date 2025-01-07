.class public final Lk0/m;
.super Lx/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lk0/m;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final e:I

.field private final f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk0/n;

    invoke-direct {v0}, Lk0/n;-><init>()V

    sput-object v0, Lk0/m;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 0

    invoke-direct {p0}, Lx/a;-><init>()V

    iput p1, p0, Lk0/m;->e:I

    iput-boolean p2, p0, Lk0/m;->f:Z

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    invoke-static {p1}, Lx/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget v0, p0, Lk0/m;->e:I

    const/4 v1, 0x2

    invoke-static {p1, v1, v0}, Lx/c;->h(Landroid/os/Parcel;II)V

    iget-boolean v0, p0, Lk0/m;->f:Z

    const/4 v1, 0x3

    invoke-static {p1, v1, v0}, Lx/c;->c(Landroid/os/Parcel;IZ)V

    invoke-static {p1, p2}, Lx/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
