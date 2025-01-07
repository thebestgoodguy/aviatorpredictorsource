.class public Lk1/l0$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk1/l0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field final a:J

.field final b:I

.field final c:I


# direct methods
.method constructor <init>(JII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lk1/l0$b;->a:J

    iput p3, p0, Lk1/l0$b;->b:I

    iput p4, p0, Lk1/l0$b;->c:I

    return-void
.end method

.method public static a(J)Lk1/l0$b;
    .locals 3

    new-instance v0, Lk1/l0$b;

    const/16 v1, 0xa

    const/16 v2, 0x3e8

    invoke-direct {v0, p0, p1, v1, v2}, Lk1/l0$b;-><init>(JII)V

    return-object v0
.end method
