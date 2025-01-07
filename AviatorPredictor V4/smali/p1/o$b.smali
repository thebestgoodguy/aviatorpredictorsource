.class Lp1/o$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp1/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# static fields
.field static final d:Lp1/o$b;


# instance fields
.field private final a:I

.field private final b:Lp1/o$b;

.field private final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lp1/o$b;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v1, v2}, Lp1/o$b;-><init>(Lp1/o$b;Ljava/lang/String;I)V

    sput-object v0, Lp1/o$b;->d:Lp1/o$b;

    return-void
.end method

.method constructor <init>(Lp1/o$b;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/o$b;->b:Lp1/o$b;

    iput-object p2, p0, Lp1/o$b;->c:Ljava/lang/String;

    iput p3, p0, Lp1/o$b;->a:I

    return-void
.end method


# virtual methods
.method a(Ljava/lang/String;)Lp1/o$b;
    .locals 2

    new-instance v0, Lp1/o$b;

    iget v1, p0, Lp1/o$b;->a:I

    add-int/lit8 v1, v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lp1/o$b;-><init>(Lp1/o$b;Ljava/lang/String;I)V

    return-object v0
.end method

.method b()I
    .locals 1

    iget v0, p0, Lp1/o$b;->a:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lp1/o$b;->a:I

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lp1/o$b;->c:Ljava/lang/String;

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lp1/o$b;->b:Lp1/o$b;

    invoke-virtual {v1}, Lp1/o$b;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lp1/o$b;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
