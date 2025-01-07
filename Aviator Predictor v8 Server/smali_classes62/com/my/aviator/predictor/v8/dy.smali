.class public Lcom/my/aviator/predictor/v8/dy;
.super Ljava/lang/Object;


# instance fields
.field private a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private c:Landroid/app/Activity;

.field private d:I


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/dy;->a:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/my/aviator/predictor/v8/dy;->b:Ljava/util/HashMap;

    const/4 v0, 0x0

    iput v0, p0, Lcom/my/aviator/predictor/v8/dy;->d:I

    iput-object p1, p0, Lcom/my/aviator/predictor/v8/dy;->c:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/dy;->a:Ljava/util/HashMap;

    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/my/aviator/predictor/v8/dz;)V
    .locals 6

    invoke-static {}, Lcom/my/aviator/predictor/v8/ea;->a()Lcom/my/aviator/predictor/v8/ea;

    move-result-object v0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/my/aviator/predictor/v8/ea;->a(Lcom/my/aviator/predictor/v8/dy;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/my/aviator/predictor/v8/dz;)V

    return-void
.end method

.method public b()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/dy;->b:Ljava/util/HashMap;

    return-object v0
.end method

.method public c()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/my/aviator/predictor/v8/dy;->c:Landroid/app/Activity;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/my/aviator/predictor/v8/dy;->d:I

    return v0
.end method
