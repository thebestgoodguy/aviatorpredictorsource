.class public final synthetic Lk1/o2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lk1/r2;


# direct methods
.method public synthetic constructor <init>(Lk1/r2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/o2;->e:Lk1/r2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lk1/o2;->e:Lk1/r2;

    invoke-static {v0}, Lk1/r2;->c(Lk1/r2;)V

    return-void
.end method
