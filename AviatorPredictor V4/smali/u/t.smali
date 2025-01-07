.class public final synthetic Lu/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lu/g;


# direct methods
.method public synthetic constructor <init>(Lu/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu/t;->e:Lu/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lu/t;->e:Lu/g;

    invoke-virtual {v0}, Lu/g;->n()V

    return-void
.end method
