.class public final synthetic Lk1/m3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lk1/s3;


# direct methods
.method public synthetic constructor <init>(Lk1/s3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/m3;->e:Lk1/s3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lk1/m3;->e:Lk1/s3;

    invoke-static {v0}, Lk1/s3;->i(Lk1/s3;)V

    return-void
.end method
