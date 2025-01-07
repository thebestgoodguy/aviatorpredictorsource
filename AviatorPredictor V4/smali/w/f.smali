.class public Lw/f;
.super Lx/a;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lw/f;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final e:I

.field final f:I

.field g:I

.field h:Ljava/lang/String;

.field i:Landroid/os/IBinder;

.field j:[Lcom/google/android/gms/common/api/Scope;

.field k:Landroid/os/Bundle;

.field l:Landroid/accounts/Account;

.field m:[Ls/c;

.field n:[Ls/c;

.field o:Z

.field p:I

.field q:Z

.field private r:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw/i1;

    invoke-direct {v0}, Lw/i1;-><init>()V

    sput-object v0, Lw/f;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Ls/c;[Ls/c;ZIZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lx/a;-><init>()V

    iput p1, p0, Lw/f;->e:I

    iput p2, p0, Lw/f;->f:I

    iput p3, p0, Lw/f;->g:I

    const-string p2, "com.google.android.gms"

    invoke-virtual {p2, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    iput-object p2, p0, Lw/f;->h:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p4, p0, Lw/f;->h:Ljava/lang/String;

    :goto_0
    const/4 p2, 0x2

    if-ge p1, p2, :cond_2

    if-eqz p5, :cond_1

    invoke-static {p5}, Lw/j$a;->f(Landroid/os/IBinder;)Lw/j;

    move-result-object p1

    invoke-static {p1}, Lw/a;->h(Lw/j;)Landroid/accounts/Account;

    move-result-object p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    iput-object p1, p0, Lw/f;->l:Landroid/accounts/Account;

    goto :goto_2

    :cond_2
    iput-object p5, p0, Lw/f;->i:Landroid/os/IBinder;

    iput-object p8, p0, Lw/f;->l:Landroid/accounts/Account;

    :goto_2
    iput-object p6, p0, Lw/f;->j:[Lcom/google/android/gms/common/api/Scope;

    iput-object p7, p0, Lw/f;->k:Landroid/os/Bundle;

    iput-object p9, p0, Lw/f;->m:[Ls/c;

    iput-object p10, p0, Lw/f;->n:[Ls/c;

    iput-boolean p11, p0, Lw/f;->o:Z

    iput p12, p0, Lw/f;->p:I

    iput-boolean p13, p0, Lw/f;->q:Z

    iput-object p14, p0, Lw/f;->r:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lx/a;-><init>()V

    const/4 v0, 0x6

    iput v0, p0, Lw/f;->e:I

    sget v0, Ls/e;->a:I

    iput v0, p0, Lw/f;->g:I

    iput p1, p0, Lw/f;->f:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lw/f;->o:Z

    iput-object p2, p0, Lw/f;->r:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lw/f;->r:Ljava/lang/String;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lw/i1;->a(Lw/f;Landroid/os/Parcel;I)V

    return-void
.end method
