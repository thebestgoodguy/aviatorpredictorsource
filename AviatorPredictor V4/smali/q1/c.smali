.class public final synthetic Lq1/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lq1/g;


# direct methods
.method public synthetic constructor <init>(Lq1/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq1/c;->a:Lq1/g;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lq1/c;->a:Lq1/g;

    invoke-static {v0}, Lq1/g;->e(Lq1/g;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
