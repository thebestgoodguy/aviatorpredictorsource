.class public final synthetic Lw2/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo0/e;


# instance fields
.field public final synthetic a:Lw2/e;

.field public final synthetic b:Lr2/c$b;


# direct methods
.method public synthetic constructor <init>(Lw2/e;Lr2/c$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw2/d;->a:Lw2/e;

    iput-object p2, p0, Lw2/d;->b:Lr2/c$b;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Lw2/d;->a:Lw2/e;

    iget-object v1, p0, Lw2/d;->b:Lr2/c$b;

    invoke-static {v0, v1, p1}, Lw2/e;->d(Lw2/e;Lr2/c$b;Ljava/lang/Exception;)V

    return-void
.end method
