.class public Lt/e$a$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt/e$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Lu/k;

.field private b:Landroid/os/Looper;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lt/e$a;
    .locals 4

    iget-object v0, p0, Lt/e$a$a;->a:Lu/k;

    if-nez v0, :cond_0

    new-instance v0, Lu/a;

    invoke-direct {v0}, Lu/a;-><init>()V

    iput-object v0, p0, Lt/e$a$a;->a:Lu/k;

    :cond_0
    iget-object v0, p0, Lt/e$a$a;->b:Landroid/os/Looper;

    if-nez v0, :cond_1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    iput-object v0, p0, Lt/e$a$a;->b:Landroid/os/Looper;

    :cond_1
    new-instance v0, Lt/e$a;

    iget-object v1, p0, Lt/e$a$a;->a:Lu/k;

    iget-object v2, p0, Lt/e$a$a;->b:Landroid/os/Looper;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2, v3}, Lt/e$a;-><init>(Lu/k;Landroid/accounts/Account;Landroid/os/Looper;Lt/n;)V

    return-object v0
.end method

.method public b(Lu/k;)Lt/e$a$a;
    .locals 1

    const-string v0, "StatusExceptionMapper must not be null."

    invoke-static {p1, v0}, Lw/r;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lt/e$a$a;->a:Lu/k;

    return-object p0
.end method
