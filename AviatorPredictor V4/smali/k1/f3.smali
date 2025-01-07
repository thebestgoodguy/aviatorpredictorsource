.class public final synthetic Lk1/f3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/n;


# instance fields
.field public final synthetic a:Lp1/n;


# direct methods
.method public synthetic constructor <init>(Lp1/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/f3;->a:Lp1/n;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lk1/f3;->a:Lp1/n;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, p1}, Lk1/s3;->q(Lp1/n;Landroid/database/Cursor;)V

    return-void
.end method
