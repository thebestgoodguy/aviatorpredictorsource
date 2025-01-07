.class public final Lk0/c;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Lt/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt/a$g<",
            "Li0/m;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Lt/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt/a$a<",
            "Li0/m;",
            "Lt/a$d$c;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt/a<",
            "Lt/a$d$c;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final d:Lk0/d;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final e:Lk0/q;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lt/a$g;

    invoke-direct {v0}, Lt/a$g;-><init>()V

    sput-object v0, Lk0/c;->a:Lt/a$g;

    new-instance v1, Lk0/p;

    invoke-direct {v1}, Lk0/p;-><init>()V

    sput-object v1, Lk0/c;->b:Lt/a$a;

    new-instance v2, Lt/a;

    const-string v3, "SafetyNet.API"

    invoke-direct {v2, v3, v1, v0}, Lt/a;-><init>(Ljava/lang/String;Lt/a$a;Lt/a$g;)V

    sput-object v2, Lk0/c;->c:Lt/a;

    new-instance v0, Li0/j;

    invoke-direct {v0}, Li0/j;-><init>()V

    sput-object v0, Lk0/c;->d:Lk0/d;

    new-instance v0, Li0/n;

    invoke-direct {v0}, Li0/n;-><init>()V

    sput-object v0, Lk0/c;->e:Lk0/q;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lk0/e;
    .locals 1

    new-instance v0, Lk0/e;

    invoke-direct {v0, p0}, Lk0/e;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
