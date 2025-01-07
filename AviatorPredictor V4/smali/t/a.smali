.class public final Lt/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt/a$f;,
        Lt/a$b;,
        Lt/a$g;,
        Lt/a$c;,
        Lt/a$d;,
        Lt/a$a;,
        Lt/a$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O::",
        "Lt/a$d;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lt/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt/a$a<",
            "*TO;>;"
        }
    .end annotation
.end field

.field private final b:Lt/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt/a$g<",
            "*>;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lt/a$a;Lt/a$g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C::",
            "Lt/a$f;",
            ">(",
            "Ljava/lang/String;",
            "Lt/a$a<",
            "TC;TO;>;",
            "Lt/a$g<",
            "TC;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Cannot construct an Api with a null ClientBuilder"

    invoke-static {p2, v0}, Lw/r;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Cannot construct an Api with a null ClientKey"

    invoke-static {p3, v0}, Lw/r;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lt/a;->c:Ljava/lang/String;

    iput-object p2, p0, Lt/a;->a:Lt/a$a;

    iput-object p3, p0, Lt/a;->b:Lt/a$g;

    return-void
.end method


# virtual methods
.method public final a()Lt/a$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt/a$a<",
            "*TO;>;"
        }
    .end annotation

    iget-object v0, p0, Lt/a;->a:Lt/a$a;

    return-object v0
.end method

.method public final b()Lt/a$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt/a$c<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lt/a;->b:Lt/a$g;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lt/a;->c:Ljava/lang/String;

    return-object v0
.end method
