.class public final synthetic Lh2/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lh2/d$a;


# direct methods
.method public synthetic constructor <init>(Lh2/d$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh2/c;->e:Lh2/d$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lh2/c;->e:Lh2/d$a;

    invoke-static {v0}, Lh2/d$a;->a(Lh2/d$a;)V

    return-void
.end method
