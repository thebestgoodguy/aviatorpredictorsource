.class public final Lf0/b;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Ls/c;

.field public static final b:Ls/c;

.field public static final c:Ls/c;

.field public static final d:[Ls/c;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Ls/c;

    const-string v1, "sms_code_autofill"

    const-wide/16 v2, 0x2

    invoke-direct {v0, v1, v2, v3}, Ls/c;-><init>(Ljava/lang/String;J)V

    sput-object v0, Lf0/b;->a:Ls/c;

    new-instance v1, Ls/c;

    const-string v2, "sms_retrieve"

    const-wide/16 v3, 0x1

    invoke-direct {v1, v2, v3, v4}, Ls/c;-><init>(Ljava/lang/String;J)V

    sput-object v1, Lf0/b;->b:Ls/c;

    new-instance v2, Ls/c;

    const-string v3, "user_consent"

    const-wide/16 v4, 0x3

    invoke-direct {v2, v3, v4, v5}, Ls/c;-><init>(Ljava/lang/String;J)V

    sput-object v2, Lf0/b;->c:Ls/c;

    const/4 v3, 0x3

    new-array v3, v3, [Ls/c;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    const/4 v0, 0x2

    aput-object v2, v3, v0

    sput-object v3, Lf0/b;->d:[Ls/c;

    return-void
.end method
