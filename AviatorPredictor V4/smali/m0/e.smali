.class public final Lm0/e;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lt/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt/a$g<",
            "Ln0/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lt/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt/a$g<",
            "Ln0/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lt/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt/a$a<",
            "Ln0/a;",
            "Lm0/a;",
            ">;"
        }
    .end annotation
.end field

.field static final d:Lt/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt/a$a<",
            "Ln0/a;",
            "Lm0/d;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lcom/google/android/gms/common/api/Scope;

.field public static final f:Lcom/google/android/gms/common/api/Scope;

.field public static final g:Lt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt/a<",
            "Lm0/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Lt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt/a<",
            "Lm0/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lt/a$g;

    invoke-direct {v0}, Lt/a$g;-><init>()V

    sput-object v0, Lm0/e;->a:Lt/a$g;

    new-instance v1, Lt/a$g;

    invoke-direct {v1}, Lt/a$g;-><init>()V

    sput-object v1, Lm0/e;->b:Lt/a$g;

    new-instance v2, Lm0/b;

    invoke-direct {v2}, Lm0/b;-><init>()V

    sput-object v2, Lm0/e;->c:Lt/a$a;

    new-instance v3, Lm0/c;

    invoke-direct {v3}, Lm0/c;-><init>()V

    sput-object v3, Lm0/e;->d:Lt/a$a;

    new-instance v4, Lcom/google/android/gms/common/api/Scope;

    const-string v5, "profile"

    invoke-direct {v4, v5}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v4, Lm0/e;->e:Lcom/google/android/gms/common/api/Scope;

    new-instance v4, Lcom/google/android/gms/common/api/Scope;

    const-string v5, "email"

    invoke-direct {v4, v5}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v4, Lm0/e;->f:Lcom/google/android/gms/common/api/Scope;

    new-instance v4, Lt/a;

    const-string v5, "SignIn.API"

    invoke-direct {v4, v5, v2, v0}, Lt/a;-><init>(Ljava/lang/String;Lt/a$a;Lt/a$g;)V

    sput-object v4, Lm0/e;->g:Lt/a;

    new-instance v0, Lt/a;

    const-string v2, "SignIn.INTERNAL_API"

    invoke-direct {v0, v2, v3, v1}, Lt/a;-><init>(Ljava/lang/String;Lt/a$a;Lt/a$g;)V

    sput-object v0, Lm0/e;->h:Lt/a;

    return-void
.end method
