.class Lb3/j$b;
.super Lb3/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:Lb3/d;

.field private final b:Lb3/h;


# direct methods
.method private constructor <init>(Lb3/d;Lb3/h;)V
    .locals 0

    invoke-direct {p0}, Lb3/d;-><init>()V

    iput-object p1, p0, Lb3/j$b;->a:Lb3/d;

    const-string p1, "interceptor"

    invoke-static {p2, p1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb3/h;

    iput-object p1, p0, Lb3/j$b;->b:Lb3/h;

    return-void
.end method

.method synthetic constructor <init>(Lb3/d;Lb3/h;Lb3/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lb3/j$b;-><init>(Lb3/d;Lb3/h;)V

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lb3/j$b;->a:Lb3/d;

    invoke-virtual {v0}, Lb3/d;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h(Lb3/v0;Lb3/c;)Lb3/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ReqT:",
            "Ljava/lang/Object;",
            "RespT:",
            "Ljava/lang/Object;",
            ">(",
            "Lb3/v0<",
            "TReqT;TRespT;>;",
            "Lb3/c;",
            ")",
            "Lb3/g<",
            "TReqT;TRespT;>;"
        }
    .end annotation

    iget-object v0, p0, Lb3/j$b;->b:Lb3/h;

    iget-object v1, p0, Lb3/j$b;->a:Lb3/d;

    invoke-interface {v0, p1, p2, v1}, Lb3/h;->a(Lb3/v0;Lb3/c;Lb3/d;)Lb3/g;

    move-result-object p1

    return-object p1
.end method
