.class public final synthetic Lk1/w;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lk1/f0;


# direct methods
.method public synthetic constructor <init>(Lk1/f0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/w;->e:Lk1/f0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lk1/w;->e:Lk1/f0;

    invoke-static {v0}, Lk1/f0;->f(Lk1/f0;)V

    return-void
.end method
