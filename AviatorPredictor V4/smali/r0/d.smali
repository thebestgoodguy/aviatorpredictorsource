.class public final Lr0/d;
.super Ljava/lang/Object;
.source ""


# direct methods
.method static a(I)Ljava/lang/StringBuilder;
    .locals 5

    const-string v0, "size"

    invoke-static {p0, v0}, Lr0/c;->b(ILjava/lang/String;)I

    new-instance v0, Ljava/lang/StringBuilder;

    int-to-long v1, p0

    const-wide/16 v3, 0x8

    mul-long v1, v1, v3

    const-wide/32 v3, 0x40000000

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int p0, v1

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    return-object v0
.end method
