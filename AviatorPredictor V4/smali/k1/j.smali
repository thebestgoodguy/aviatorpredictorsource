.class public final synthetic Lk1/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lk1/k$a;


# direct methods
.method public synthetic constructor <init>(Lk1/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/j;->e:Lk1/k$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lk1/j;->e:Lk1/k$a;

    invoke-static {v0}, Lk1/k$a;->c(Lk1/k$a;)V

    return-void
.end method
