.class final Lb3/f1$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb3/u0$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/f1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lb3/u0$j<",
        "Lb3/f1;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lb3/f1$a;)V
    .locals 0

    invoke-direct {p0}, Lb3/f1$c;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)[B
    .locals 0

    check-cast p1, Lb3/f1;

    invoke-virtual {p0, p1}, Lb3/f1$c;->d(Lb3/f1;)[B

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b([B)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lb3/f1$c;->c([B)Lb3/f1;

    move-result-object p1

    return-object p1
.end method

.method public c([B)Lb3/f1;
    .locals 0

    invoke-static {p1}, Lb3/f1;->b([B)Lb3/f1;

    move-result-object p1

    return-object p1
.end method

.method public d(Lb3/f1;)[B
    .locals 0

    invoke-virtual {p1}, Lb3/f1;->m()Lb3/f1$b;

    move-result-object p1

    invoke-static {p1}, Lb3/f1$b;->d(Lb3/f1$b;)[B

    move-result-object p1

    return-object p1
.end method
