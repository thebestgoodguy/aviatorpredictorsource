.class Li1/b1$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li1/b1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:Ll1/l;

.field private b:Z


# direct methods
.method constructor <init>(Ll1/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/b1$b;->a:Ll1/l;

    return-void
.end method

.method static synthetic a(Li1/b1$b;)Z
    .locals 0

    iget-boolean p0, p0, Li1/b1$b;->b:Z

    return p0
.end method

.method static synthetic b(Li1/b1$b;Z)Z
    .locals 0

    iput-boolean p1, p0, Li1/b1$b;->b:Z

    return p1
.end method

.method static synthetic c(Li1/b1$b;)Ll1/l;
    .locals 0

    iget-object p0, p0, Li1/b1$b;->a:Ll1/l;

    return-object p0
.end method
