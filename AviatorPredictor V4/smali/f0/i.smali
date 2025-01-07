.class public final Lf0/i;
.super Lp/b;
.source ""


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lp/b;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final o()Lo0/h;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/common/api/internal/d;->a()Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object v0

    new-instance v1, Lf0/k;

    invoke-direct {v1, p0}, Lf0/k;-><init>(Lf0/i;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/d$a;->b(Lu/j;)Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ls/c;

    sget-object v2, Lf0/b;->b:Ls/c;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/d$a;->d([Ls/c;)Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/d$a;->a()Lcom/google/android/gms/common/api/internal/d;

    move-result-object v0

    invoke-virtual {p0, v0}, Lt/e;->f(Lcom/google/android/gms/common/api/internal/d;)Lo0/h;

    move-result-object v0

    return-object v0
.end method
