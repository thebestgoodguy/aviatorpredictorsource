.class public final synthetic Lu2/g0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo0/d;


# instance fields
.field public final synthetic a:Lu2/r0;

.field public final synthetic b:Lu2/t0$i;


# direct methods
.method public synthetic constructor <init>(Lu2/r0;Lu2/t0$i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/g0;->a:Lu2/r0;

    iput-object p2, p0, Lu2/g0;->b:Lu2/t0$i;

    return-void
.end method


# virtual methods
.method public final a(Lo0/h;)V
    .locals 2

    iget-object v0, p0, Lu2/g0;->a:Lu2/r0;

    iget-object v1, p0, Lu2/g0;->b:Lu2/t0$i;

    invoke-static {v0, v1, p1}, Lu2/r0;->L(Lu2/r0;Lu2/t0$i;Lo0/h;)V

    return-void
.end method
