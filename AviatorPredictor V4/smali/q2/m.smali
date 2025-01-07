.class public Lq2/m;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq2/m$b;,
        Lq2/m$a;
    }
.end annotation


# instance fields
.field public final a:Lr2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr2/a<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lf2/a;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lr2/a;

    sget-object v1, Lr2/e;->a:Lr2/e;

    const-string v2, "flutter/settings"

    invoke-direct {v0, p1, v2, v1}, Lr2/a;-><init>(Lr2/b;Ljava/lang/String;Lr2/h;)V

    iput-object v0, p0, Lq2/m;->a:Lr2/a;

    return-void
.end method


# virtual methods
.method public a()Lq2/m$a;
    .locals 2

    new-instance v0, Lq2/m$a;

    iget-object v1, p0, Lq2/m;->a:Lr2/a;

    invoke-direct {v0, v1}, Lq2/m$a;-><init>(Lr2/a;)V

    return-object v0
.end method
