.class public Lcom/google/firebase/auth/p0$a;
.super Lx/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/auth/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/firebase/auth/p0$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/auth/m1;

    invoke-direct {v0}, Lcom/google/firebase/auth/m1;-><init>()V

    sput-object v0, Lcom/google/firebase/auth/p0$a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lx/a;-><init>()V

    return-void
.end method

.method public static j0()Lcom/google/firebase/auth/p0$a;
    .locals 1

    new-instance v0, Lcom/google/firebase/auth/p0$a;

    invoke-direct {v0}, Lcom/google/firebase/auth/p0$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p1}, Lx/c;->a(Landroid/os/Parcel;)I

    move-result p2

    invoke-static {p1, p2}, Lx/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
