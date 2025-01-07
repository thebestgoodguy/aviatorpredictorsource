.class public final Lio/flutter/plugins/firebase/core/l$g$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/firebase/core/l$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lio/flutter/plugins/firebase/core/l$f;

.field private c:Ljava/lang/Boolean;

.field private d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lio/flutter/plugins/firebase/core/l$g;
    .locals 2

    new-instance v0, Lio/flutter/plugins/firebase/core/l$g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/flutter/plugins/firebase/core/l$g;-><init>(Lio/flutter/plugins/firebase/core/l$a;)V

    iget-object v1, p0, Lio/flutter/plugins/firebase/core/l$g$a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/firebase/core/l$g;->c(Ljava/lang/String;)V

    iget-object v1, p0, Lio/flutter/plugins/firebase/core/l$g$a;->b:Lio/flutter/plugins/firebase/core/l$f;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/firebase/core/l$g;->d(Lio/flutter/plugins/firebase/core/l$f;)V

    iget-object v1, p0, Lio/flutter/plugins/firebase/core/l$g$a;->c:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/firebase/core/l$g;->b(Ljava/lang/Boolean;)V

    iget-object v1, p0, Lio/flutter/plugins/firebase/core/l$g$a;->d:Ljava/util/Map;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/firebase/core/l$g;->e(Ljava/util/Map;)V

    return-object v0
.end method

.method public b(Ljava/lang/Boolean;)Lio/flutter/plugins/firebase/core/l$g$a;
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/firebase/core/l$g$a;->c:Ljava/lang/Boolean;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lio/flutter/plugins/firebase/core/l$g$a;
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/firebase/core/l$g$a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public d(Lio/flutter/plugins/firebase/core/l$f;)Lio/flutter/plugins/firebase/core/l$g$a;
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/firebase/core/l$g$a;->b:Lio/flutter/plugins/firebase/core/l$f;

    return-object p0
.end method

.method public e(Ljava/util/Map;)Lio/flutter/plugins/firebase/core/l$g$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/flutter/plugins/firebase/core/l$g$a;"
        }
    .end annotation

    iput-object p1, p0, Lio/flutter/plugins/firebase/core/l$g$a;->d:Ljava/util/Map;

    return-object p0
.end method
