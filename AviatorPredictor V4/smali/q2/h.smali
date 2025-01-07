.class public Lq2/h;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lr2/j;

.field private final b:Lr2/j$c;


# direct methods
.method public constructor <init>(Lf2/a;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lq2/h$a;

    invoke-direct {v0, p0}, Lq2/h$a;-><init>(Lq2/h;)V

    iput-object v0, p0, Lq2/h;->b:Lr2/j$c;

    new-instance v1, Lr2/j;

    sget-object v2, Lr2/f;->a:Lr2/f;

    const-string v3, "flutter/navigation"

    invoke-direct {v1, p1, v3, v2}, Lr2/j;-><init>(Lr2/b;Ljava/lang/String;Lr2/k;)V

    iput-object v1, p0, Lq2/h;->a:Lr2/j;

    invoke-virtual {v1, v0}, Lr2/j;->e(Lr2/j$c;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    const-string v0, "NavigationChannel"

    const-string v1, "Sending message to pop route."

    invoke-static {v0, v1}, Le2/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lq2/h;->a:Lr2/j;

    const-string v1, "popRoute"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lr2/j;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Sending message to push route \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NavigationChannel"

    invoke-static {v1, v0}, Le2/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lq2/h;->a:Lr2/j;

    const-string v1, "pushRoute"

    invoke-virtual {v0, v1, p1}, Lr2/j;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Sending message to set initial route to \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NavigationChannel"

    invoke-static {v1, v0}, Le2/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lq2/h;->a:Lr2/j;

    const-string v1, "setInitialRoute"

    invoke-virtual {v0, v1, p1}, Lr2/j;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
