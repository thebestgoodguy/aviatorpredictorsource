.class public final La1/o1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/auth/a0;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "La1/o1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final e:J

.field private final f:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La1/d;

    invoke-direct {v0}, La1/d;-><init>()V

    sput-object v0, La1/o1;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La1/o1;->e:J

    iput-wide p3, p0, La1/o1;->f:J

    return-void
.end method


# virtual methods
.method public final S()J
    .locals 2

    iget-wide v0, p0, La1/o1;->e:J

    return-wide v0
.end method

.method public final a()Lorg/json/JSONObject;
    .locals 4

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "lastSignInTimestamp"

    iget-wide v2, p0, La1/o1;->e:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "creationTimestamp"

    iget-wide v2, p0, La1/o1;->f:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public final c0()J
    .locals 2

    iget-wide v0, p0, La1/o1;->f:J

    return-wide v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lx/c;->a(Landroid/os/Parcel;)I

    move-result p2

    iget-wide v0, p0, La1/o1;->e:J

    const/4 v2, 0x1

    invoke-static {p1, v2, v0, v1}, Lx/c;->j(Landroid/os/Parcel;IJ)V

    iget-wide v0, p0, La1/o1;->f:J

    const/4 v2, 0x2

    invoke-static {p1, v2, v0, v1}, Lx/c;->j(Landroid/os/Parcel;IJ)V

    invoke-static {p1, p2}, Lx/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
