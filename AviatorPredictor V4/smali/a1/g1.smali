.class public final La1/g1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/auth/i;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "La1/g1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private e:La1/m1;

.field private f:La1/e1;

.field private g:Lcom/google/firebase/auth/n1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La1/h1;

    invoke-direct {v0}, La1/h1;-><init>()V

    sput-object v0, La1/g1;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(La1/m1;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La1/m1;

    iput-object v0, p0, La1/g1;->e:La1/m1;

    invoke-virtual {v0}, La1/m1;->P0()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    iput-object v1, p0, La1/g1;->f:La1/e1;

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La1/i1;

    invoke-virtual {v2}, La1/i1;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v2, La1/e1;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La1/i1;

    invoke-virtual {v3}, La1/i1;->h()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La1/i1;

    invoke-virtual {v4}, La1/i1;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, La1/m1;->T0()Z

    move-result v5

    invoke-direct {v2, v3, v4, v5}, La1/e1;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v2, p0, La1/g1;->f:La1/e1;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, La1/g1;->f:La1/e1;

    if-nez v0, :cond_2

    new-instance v0, La1/e1;

    invoke-virtual {p1}, La1/m1;->T0()Z

    move-result v1

    invoke-direct {v0, v1}, La1/e1;-><init>(Z)V

    iput-object v0, p0, La1/g1;->f:La1/e1;

    :cond_2
    invoke-virtual {p1}, La1/m1;->L0()Lcom/google/firebase/auth/n1;

    move-result-object p1

    iput-object p1, p0, La1/g1;->g:Lcom/google/firebase/auth/n1;

    return-void
.end method

.method constructor <init>(La1/m1;La1/e1;Lcom/google/firebase/auth/n1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La1/g1;->e:La1/m1;

    iput-object p2, p0, La1/g1;->f:La1/e1;

    iput-object p3, p0, La1/g1;->g:Lcom/google/firebase/auth/n1;

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final f0()Lcom/google/firebase/auth/g;
    .locals 1

    iget-object v0, p0, La1/g1;->f:La1/e1;

    return-object v0
.end method

.method public final k()Lcom/google/firebase/auth/z;
    .locals 1

    iget-object v0, p0, La1/g1;->e:La1/m1;

    return-object v0
.end method

.method public final r()Lcom/google/firebase/auth/h;
    .locals 1

    iget-object v0, p0, La1/g1;->g:Lcom/google/firebase/auth/n1;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lx/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, La1/g1;->e:La1/m1;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lx/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, La1/g1;->f:La1/e1;

    const/4 v2, 0x2

    invoke-static {p1, v2, v1, p2, v3}, Lx/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, La1/g1;->g:Lcom/google/firebase/auth/n1;

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, p2, v3}, Lx/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lx/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
