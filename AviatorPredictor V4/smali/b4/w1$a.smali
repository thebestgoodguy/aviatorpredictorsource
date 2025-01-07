.class final Lb4/w1$a;
.super Lb4/v1;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb4/w1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final i:Lb4/w1;

.field private final j:Lb4/w1$b;

.field private final k:Lb4/s;

.field private final l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lb4/w1;Lb4/w1$b;Lb4/s;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lb4/v1;-><init>()V

    iput-object p1, p0, Lb4/w1$a;->i:Lb4/w1;

    iput-object p2, p0, Lb4/w1$a;->j:Lb4/w1$b;

    iput-object p3, p0, Lb4/w1$a;->k:Lb4/s;

    iput-object p4, p0, Lb4/w1$a;->l:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lb4/w1$a;->y(Ljava/lang/Throwable;)V

    sget-object p1, Lk3/s;->a:Lk3/s;

    return-object p1
.end method

.method public y(Ljava/lang/Throwable;)V
    .locals 3

    iget-object p1, p0, Lb4/w1$a;->i:Lb4/w1;

    iget-object v0, p0, Lb4/w1$a;->j:Lb4/w1$b;

    iget-object v1, p0, Lb4/w1$a;->k:Lb4/s;

    iget-object v2, p0, Lb4/w1$a;->l:Ljava/lang/Object;

    invoke-static {p1, v0, v1, v2}, Lb4/w1;->q(Lb4/w1;Lb4/w1$b;Lb4/s;Ljava/lang/Object;)V

    return-void
.end method
