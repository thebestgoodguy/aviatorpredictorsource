.class public final synthetic La3/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:La3/d;


# direct methods
.method public synthetic constructor <init>(La3/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La3/c;->e:La3/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, La3/c;->e:La3/d;

    invoke-static {v0}, La3/d;->c(La3/d;)V

    return-void
.end method
