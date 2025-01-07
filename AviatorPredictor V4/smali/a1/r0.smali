.class final La1/r0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo0/e;


# instance fields
.field final synthetic a:Lo0/i;


# direct methods
.method constructor <init>(La1/u0;Lo0/i;)V
    .locals 0

    iput-object p2, p0, La1/r0;->a:Lo0/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Exception;)V
    .locals 3

    invoke-static {}, La1/u0;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Failed to get reCAPTCHA token with error [%s]- calling backend without app verification"

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, La1/r0;->a:Lo0/i;

    new-instance v0, La1/t0;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, La1/t0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lo0/i;->c(Ljava/lang/Object;)V

    return-void
.end method
