.class final Li1/z0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Li1/x0;

.field private final b:I

.field private final c:Li1/s1;


# direct methods
.method constructor <init>(Li1/x0;ILi1/s1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/z0;->a:Li1/x0;

    iput p2, p0, Li1/z0;->b:I

    iput-object p3, p0, Li1/z0;->c:Li1/s1;

    return-void
.end method


# virtual methods
.method public a()Li1/x0;
    .locals 1

    iget-object v0, p0, Li1/z0;->a:Li1/x0;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Li1/z0;->b:I

    return v0
.end method

.method public c()Li1/s1;
    .locals 1

    iget-object v0, p0, Li1/z0;->c:Li1/s1;

    return-object v0
.end method
