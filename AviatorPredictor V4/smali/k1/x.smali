.class public final synthetic Lk1/x;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lk1/f0;

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Lk1/f0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/x;->e:Lk1/f0;

    iput p2, p0, Lk1/x;->f:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lk1/x;->e:Lk1/f0;

    iget v1, p0, Lk1/x;->f:I

    invoke-static {v0, v1}, Lk1/f0;->h(Lk1/f0;I)V

    return-void
.end method
