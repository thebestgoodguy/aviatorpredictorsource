.class public final Lk0/i;
.super Lx/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lk0/i;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final e:J

.field public final f:[Lk0/a;

.field public final g:I

.field private final h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk0/j;

    invoke-direct {v0}, Lk0/j;-><init>()V

    sput-object v0, Lk0/i;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(J[Lk0/a;IZ)V
    .locals 0

    invoke-direct {p0}, Lx/a;-><init>()V

    iput-wide p1, p0, Lk0/i;->e:J

    iput-object p3, p0, Lk0/i;->f:[Lk0/a;

    iput-boolean p5, p0, Lk0/i;->h:Z

    if-eqz p5, :cond_0

    iput p4, p0, Lk0/i;->g:I

    return-void

    :cond_0
    const/4 p1, -0x1

    iput p1, p0, Lk0/i;->g:I

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lx/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-wide v1, p0, Lk0/i;->e:J

    const/4 v3, 0x2

    invoke-static {p1, v3, v1, v2}, Lx/c;->j(Landroid/os/Parcel;IJ)V

    iget-object v1, p0, Lk0/i;->f:[Lk0/a;

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lx/c;->p(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    iget p2, p0, Lk0/i;->g:I

    const/4 v1, 0x4

    invoke-static {p1, v1, p2}, Lx/c;->h(Landroid/os/Parcel;II)V

    iget-boolean p2, p0, Lk0/i;->h:Z

    const/4 v1, 0x5

    invoke-static {p1, v1, p2}, Lx/c;->c(Landroid/os/Parcel;IZ)V

    invoke-static {p1, v0}, Lx/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
