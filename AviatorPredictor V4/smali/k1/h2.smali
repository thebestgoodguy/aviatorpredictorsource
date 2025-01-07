.class public final synthetic Lk1/h2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/n;


# instance fields
.field public final synthetic a:Lk1/n2;


# direct methods
.method public synthetic constructor <init>(Lk1/n2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/h2;->a:Lk1/n2;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lk1/h2;->a:Lk1/n2;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, p1}, Lk1/n2;->p(Lk1/n2;Landroid/database/Cursor;)V

    return-void
.end method
