.class public Lj2/a$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lio/flutter/embedding/engine/a;

.field private final c:Lr2/b;

.field private final d:Lio/flutter/view/d;

.field private final e:Lio/flutter/plugin/platform/e;

.field private final f:Lj2/a$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/flutter/embedding/engine/a;Lr2/b;Lio/flutter/view/d;Lio/flutter/plugin/platform/e;Lj2/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj2/a$b;->a:Landroid/content/Context;

    iput-object p2, p0, Lj2/a$b;->b:Lio/flutter/embedding/engine/a;

    iput-object p3, p0, Lj2/a$b;->c:Lr2/b;

    iput-object p4, p0, Lj2/a$b;->d:Lio/flutter/view/d;

    iput-object p5, p0, Lj2/a$b;->e:Lio/flutter/plugin/platform/e;

    iput-object p6, p0, Lj2/a$b;->f:Lj2/a$a;

    return-void
.end method


# virtual methods
.method public a()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lj2/a$b;->a:Landroid/content/Context;

    return-object v0
.end method

.method public b()Lr2/b;
    .locals 1

    iget-object v0, p0, Lj2/a$b;->c:Lr2/b;

    return-object v0
.end method
