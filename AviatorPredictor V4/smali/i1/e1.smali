.class public final synthetic Li1/e1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo0/a;


# instance fields
.field public final synthetic a:Li1/g1;


# direct methods
.method public synthetic constructor <init>(Li1/g1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/e1;->a:Li1/g1;

    return-void
.end method


# virtual methods
.method public final a(Lo0/h;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Li1/e1;->a:Li1/g1;

    invoke-static {v0, p1}, Li1/g1;->b(Li1/g1;Lo0/h;)Lo0/h;

    move-result-object p1

    return-object p1
.end method
