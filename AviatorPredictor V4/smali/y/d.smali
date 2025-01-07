.class public final Ly/d;
.super Lt/e;
.source ""

# interfaces
.implements Lw/x;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt/e<",
        "Lw/y;",
        ">;",
        "Lw/x;"
    }
.end annotation


# static fields
.field private static final k:Lt/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt/a$g<",
            "Ly/e;",
            ">;"
        }
    .end annotation
.end field

.field private static final l:Lt/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt/a$a<",
            "Ly/e;",
            "Lw/y;",
            ">;"
        }
    .end annotation
.end field

.field private static final m:Lt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt/a<",
            "Lw/y;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic n:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lt/a$g;

    invoke-direct {v0}, Lt/a$g;-><init>()V

    sput-object v0, Ly/d;->k:Lt/a$g;

    new-instance v1, Ly/c;

    invoke-direct {v1}, Ly/c;-><init>()V

    sput-object v1, Ly/d;->l:Lt/a$a;

    new-instance v2, Lt/a;

    const-string v3, "ClientTelemetry.API"

    invoke-direct {v2, v3, v1, v0}, Lt/a;-><init>(Ljava/lang/String;Lt/a$a;Lt/a$g;)V

    sput-object v2, Ly/d;->m:Lt/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lw/y;)V
    .locals 2

    sget-object v0, Ly/d;->m:Lt/a;

    sget-object v1, Lt/e$a;->c:Lt/e$a;

    invoke-direct {p0, p1, v0, p2, v1}, Lt/e;-><init>(Landroid/content/Context;Lt/a;Lt/a$d;Lt/e$a;)V

    return-void
.end method


# virtual methods
.method public final a(Lw/v;)Lo0/h;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/v;",
            ")",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/common/api/internal/d;->a()Lcom/google/android/gms/common/api/internal/d$a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ls/c;

    sget-object v2, Lg0/d;->a:Ls/c;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/d$a;->d([Ls/c;)Lcom/google/android/gms/common/api/internal/d$a;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/common/api/internal/d$a;->c(Z)Lcom/google/android/gms/common/api/internal/d$a;

    new-instance v1, Ly/b;

    invoke-direct {v1, p1}, Ly/b;-><init>(Lw/v;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/d$a;->b(Lu/j;)Lcom/google/android/gms/common/api/internal/d$a;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/d$a;->a()Lcom/google/android/gms/common/api/internal/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lt/e;->d(Lcom/google/android/gms/common/api/internal/d;)Lo0/h;

    move-result-object p1

    return-object p1
.end method
