.class public Li1/s0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/firestore/a0;


# instance fields
.field private final a:Li1/l0;

.field private final b:Li1/y0;

.field private final c:Li1/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li1/h<",
            "Li1/u1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Li1/l0;Li1/y0;Li1/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li1/l0;",
            "Li1/y0;",
            "Li1/h<",
            "Li1/u1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/s0;->a:Li1/l0;

    iput-object p2, p0, Li1/s0;->b:Li1/y0;

    iput-object p3, p0, Li1/s0;->c:Li1/h;

    return-void
.end method


# virtual methods
.method public remove()V
    .locals 2

    iget-object v0, p0, Li1/s0;->c:Li1/h;

    invoke-virtual {v0}, Li1/h;->d()V

    iget-object v0, p0, Li1/s0;->a:Li1/l0;

    iget-object v1, p0, Li1/s0;->b:Li1/y0;

    invoke-virtual {v0, v1}, Li1/l0;->X(Li1/y0;)V

    return-void
.end method
