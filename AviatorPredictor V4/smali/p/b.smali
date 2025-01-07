.class public abstract Lp/b;
.super Lt/e;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt/e<",
        "Lt/a$d$c;",
        ">;"
    }
.end annotation


# static fields
.field private static final k:Lt/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt/a$g<",
            "Lf0/j;",
            ">;"
        }
    .end annotation
.end field

.field private static final l:Lt/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt/a$a<",
            "Lf0/j;",
            "Lt/a$d$c;",
            ">;"
        }
    .end annotation
.end field

.field private static final m:Lt/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt/a<",
            "Lt/a$d$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lt/a$g;

    invoke-direct {v0}, Lt/a$g;-><init>()V

    sput-object v0, Lp/b;->k:Lt/a$g;

    new-instance v1, Lp/c;

    invoke-direct {v1}, Lp/c;-><init>()V

    sput-object v1, Lp/b;->l:Lt/a$a;

    new-instance v2, Lt/a;

    const-string v3, "SmsRetriever.API"

    invoke-direct {v2, v3, v1, v0}, Lt/a;-><init>(Ljava/lang/String;Lt/a$a;Lt/a$g;)V

    sput-object v2, Lp/b;->m:Lt/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    sget-object v0, Lp/b;->m:Lt/a;

    sget-object v1, Lt/e$a;->c:Lt/e$a;

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, v2, v1}, Lt/e;-><init>(Landroid/content/Context;Lt/a;Lt/a$d;Lt/e$a;)V

    return-void
.end method


# virtual methods
.method public abstract o()Lo0/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo0/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end method
