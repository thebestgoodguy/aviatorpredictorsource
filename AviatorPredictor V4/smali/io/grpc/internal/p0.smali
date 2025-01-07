.class public final Lio/grpc/internal/p0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lb3/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/a$c<",
            "Lb3/d1;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lb3/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/a$c<",
            "Lb3/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "io.grpc.internal.GrpcAttributes.securityLevel"

    invoke-static {v0}, Lb3/a$c;->a(Ljava/lang/String;)Lb3/a$c;

    move-result-object v0

    sput-object v0, Lio/grpc/internal/p0;->a:Lb3/a$c;

    const-string v0, "io.grpc.internal.GrpcAttributes.clientEagAttrs"

    invoke-static {v0}, Lb3/a$c;->a(Ljava/lang/String;)Lb3/a$c;

    move-result-object v0

    sput-object v0, Lio/grpc/internal/p0;->b:Lb3/a$c;

    return-void
.end method
