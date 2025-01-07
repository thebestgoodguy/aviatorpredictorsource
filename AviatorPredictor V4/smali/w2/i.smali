.class public final synthetic Lw2/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lr2/c$b;


# direct methods
.method public synthetic constructor <init>(Lr2/c$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw2/i;->e:Lr2/c$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lw2/i;->e:Lr2/c$b;

    invoke-static {v0}, Lw2/j;->c(Lr2/c$b;)V

    return-void
.end method
