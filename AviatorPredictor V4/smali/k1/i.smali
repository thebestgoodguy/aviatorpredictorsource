.class public final synthetic Lk1/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lq0/p;


# instance fields
.field public final synthetic a:Lk1/f0;


# direct methods
.method public synthetic constructor <init>(Lk1/f0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/i;->a:Lk1/f0;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lk1/i;->a:Lk1/f0;

    invoke-virtual {v0}, Lk1/f0;->E()Lk1/n;

    move-result-object v0

    return-object v0
.end method
