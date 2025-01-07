.class public final Lb3/k$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb3/k$b$a;
    }
.end annotation


# instance fields
.field private final a:Lb3/c;

.field private final b:I

.field private final c:Z


# direct methods
.method constructor <init>(Lb3/c;IZ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "callOptions"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb3/c;

    iput-object p1, p0, Lb3/k$b;->a:Lb3/c;

    iput p2, p0, Lb3/k$b;->b:I

    iput-boolean p3, p0, Lb3/k$b;->c:Z

    return-void
.end method

.method public static a()Lb3/k$b$a;
    .locals 1

    new-instance v0, Lb3/k$b$a;

    invoke-direct {v0}, Lb3/k$b$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lq0/h;->c(Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lb3/k$b;->a:Lb3/c;

    const-string v2, "callOptions"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget v1, p0, Lb3/k$b;->b:I

    const-string v2, "previousAttempts"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->b(Ljava/lang/String;I)Lq0/h$b;

    move-result-object v0

    iget-boolean v1, p0, Lb3/k$b;->c:Z

    const-string v2, "isTransparentRetry"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->e(Ljava/lang/String;Z)Lq0/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lq0/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
