.class public final Lo1/s0$c;
.super Lo1/s0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo1/s0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:I

.field private final b:Lo1/n;


# direct methods
.method public constructor <init>(ILo1/n;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo1/s0;-><init>(Lo1/s0$a;)V

    iput p1, p0, Lo1/s0$c;->a:I

    iput-object p2, p0, Lo1/s0$c;->b:Lo1/n;

    return-void
.end method


# virtual methods
.method public a()Lo1/n;
    .locals 1

    iget-object v0, p0, Lo1/s0$c;->b:Lo1/n;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lo1/s0$c;->a:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ExistenceFilterWatchChange{targetId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lo1/s0$c;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", existenceFilter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lo1/s0$c;->b:Lo1/n;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
