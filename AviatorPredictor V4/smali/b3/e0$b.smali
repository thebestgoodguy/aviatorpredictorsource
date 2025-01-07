.class public final Lb3/e0$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb3/e0$b$a;
    }
.end annotation


# instance fields
.field private final a:Lb3/f1;

.field private final b:Ljava/lang/Object;

.field public c:Lb3/h;


# direct methods
.method private constructor <init>(Lb3/f1;Ljava/lang/Object;Lb3/h;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "status"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb3/f1;

    iput-object p1, p0, Lb3/e0$b;->a:Lb3/f1;

    iput-object p2, p0, Lb3/e0$b;->b:Ljava/lang/Object;

    iput-object p3, p0, Lb3/e0$b;->c:Lb3/h;

    return-void
.end method

.method synthetic constructor <init>(Lb3/f1;Ljava/lang/Object;Lb3/h;Lb3/e0$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lb3/e0$b;-><init>(Lb3/f1;Ljava/lang/Object;Lb3/h;)V

    return-void
.end method

.method public static d()Lb3/e0$b$a;
    .locals 2

    new-instance v0, Lb3/e0$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb3/e0$b$a;-><init>(Lb3/e0$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lb3/e0$b;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public b()Lb3/h;
    .locals 1

    iget-object v0, p0, Lb3/e0$b;->c:Lb3/h;

    return-object v0
.end method

.method public c()Lb3/f1;
    .locals 1

    iget-object v0, p0, Lb3/e0$b;->a:Lb3/f1;

    return-object v0
.end method
