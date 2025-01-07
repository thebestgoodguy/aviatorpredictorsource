.class public Lk0/a;
.super Lx/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lk0/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final e:Ljava/lang/String;

.field public final f:[B

.field public final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk0/h;

    invoke-direct {v0}, Lk0/h;-><init>()V

    sput-object v0, Lk0/a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[BI)V
    .locals 0

    invoke-direct {p0}, Lx/a;-><init>()V

    iput-object p1, p0, Lk0/a;->e:Ljava/lang/String;

    iput-object p2, p0, Lk0/a;->f:[B

    iput p3, p0, Lk0/a;->g:I

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lx/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget-object v0, p0, Lk0/a;->e:Ljava/lang/String;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Lx/c;->m(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v0, p0, Lk0/a;->f:[B

    const/4 v1, 0x3

    invoke-static {p1, v1, v0, v2}, Lx/c;->f(Landroid/os/Parcel;I[BZ)V

    iget v0, p0, Lk0/a;->g:I

    const/4 v1, 0x4

    invoke-static {p1, v1, v0}, Lx/c;->h(Landroid/os/Parcel;II)V

    invoke-static {p1, p2}, Lx/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
