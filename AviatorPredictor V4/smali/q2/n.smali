.class public Lq2/n;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq2/n$b;
    }
.end annotation


# instance fields
.field public final a:Lr2/j;

.field private b:Lq2/n$b;

.field public final c:Lr2/j$c;


# direct methods
.method public constructor <init>(Lf2/a;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lq2/n$a;

    invoke-direct {v0, p0}, Lq2/n$a;-><init>(Lq2/n;)V

    iput-object v0, p0, Lq2/n;->c:Lr2/j$c;

    new-instance v1, Lr2/j;

    sget-object v2, Lr2/f;->a:Lr2/f;

    const-string v3, "flutter/spellcheck"

    invoke-direct {v1, p1, v3, v2}, Lr2/j;-><init>(Lr2/b;Ljava/lang/String;Lr2/k;)V

    iput-object v1, p0, Lq2/n;->a:Lr2/j;

    invoke-virtual {v1, v0}, Lr2/j;->e(Lr2/j$c;)V

    return-void
.end method

.method static synthetic a(Lq2/n;)Lq2/n$b;
    .locals 0

    iget-object p0, p0, Lq2/n;->b:Lq2/n$b;

    return-object p0
.end method


# virtual methods
.method public b(Lq2/n$b;)V
    .locals 0

    iput-object p1, p0, Lq2/n;->b:Lq2/n$b;

    return-void
.end method
