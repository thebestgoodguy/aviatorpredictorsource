.class public final Lp2/a$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Landroid/graphics/Rect;

.field public final b:Lp2/a$d;

.field public final c:Lp2/a$c;


# direct methods
.method public constructor <init>(Landroid/graphics/Rect;Lp2/a$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp2/a$b;->a:Landroid/graphics/Rect;

    iput-object p2, p0, Lp2/a$b;->b:Lp2/a$d;

    sget-object p1, Lp2/a$c;->f:Lp2/a$c;

    iput-object p1, p0, Lp2/a$b;->c:Lp2/a$c;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Rect;Lp2/a$d;Lp2/a$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp2/a$b;->a:Landroid/graphics/Rect;

    iput-object p2, p0, Lp2/a$b;->b:Lp2/a$d;

    iput-object p3, p0, Lp2/a$b;->c:Lp2/a$c;

    return-void
.end method
