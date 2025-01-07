.class public final synthetic Lp1/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lp1/g$b;


# direct methods
.method public synthetic constructor <init>(Lp1/g$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/h;->e:Lp1/g$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lp1/h;->e:Lp1/g$b;

    invoke-static {v0}, Lp1/g$b;->a(Lp1/g$b;)V

    return-void
.end method
