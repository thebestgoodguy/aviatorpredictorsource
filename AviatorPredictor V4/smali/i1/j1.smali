.class public final synthetic Li1/j1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo0/d;


# instance fields
.field public final synthetic a:Li1/k1;

.field public final synthetic b:Lo0/h;


# direct methods
.method public synthetic constructor <init>(Li1/k1;Lo0/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/j1;->a:Li1/k1;

    iput-object p2, p0, Li1/j1;->b:Lo0/h;

    return-void
.end method


# virtual methods
.method public final a(Lo0/h;)V
    .locals 2

    iget-object v0, p0, Li1/j1;->a:Li1/k1;

    iget-object v1, p0, Li1/j1;->b:Lo0/h;

    invoke-static {v0, v1, p1}, Li1/k1;->b(Li1/k1;Lo0/h;Lo0/h;)V

    return-void
.end method
