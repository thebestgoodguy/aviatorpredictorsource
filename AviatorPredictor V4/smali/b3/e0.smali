.class public abstract Lb3/e0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb3/e0$b;
    }
.end annotation


# static fields
.field public static final a:Lb3/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/a$c<",
            "Lb3/e0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "io.grpc.config-selector"

    invoke-static {v0}, Lb3/a$c;->a(Ljava/lang/String;)Lb3/a$c;

    move-result-object v0

    sput-object v0, Lb3/e0;->a:Lb3/a$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Lb3/n0$f;)Lb3/e0$b;
.end method
