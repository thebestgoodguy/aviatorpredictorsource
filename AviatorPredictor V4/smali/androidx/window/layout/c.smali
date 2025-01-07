.class public final synthetic Landroidx/window/layout/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj/a;


# instance fields
.field public final synthetic a:Ld4/f;


# direct methods
.method public synthetic constructor <init>(Ld4/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/window/layout/c;->a:Ld4/f;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Landroidx/window/layout/c;->a:Ld4/f;

    check-cast p1, Landroidx/window/layout/WindowLayoutInfo;

    invoke-static {v0, p1}, Landroidx/window/layout/WindowInfoTrackerImpl$windowLayoutInfo$1;->a(Ld4/f;Landroidx/window/layout/WindowLayoutInfo;)V

    return-void
.end method
