.class public final Lg0/d;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Ls/c;

.field public static final b:[Ls/c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ls/c;

    const-string v1, "CLIENT_TELEMETRY"

    const-wide/16 v2, 0x1

    invoke-direct {v0, v1, v2, v3}, Ls/c;-><init>(Ljava/lang/String;J)V

    sput-object v0, Lg0/d;->a:Ls/c;

    const/4 v1, 0x1

    new-array v1, v1, [Ls/c;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, Lg0/d;->b:[Ls/c;

    return-void
.end method
