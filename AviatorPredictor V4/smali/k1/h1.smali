.class public final synthetic Lk1/h1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/t;


# instance fields
.field public final synthetic a:Lk1/i1;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lk1/i1;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/h1;->a:Lk1/i1;

    iput-object p2, p0, Lk1/h1;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lk1/h1;->a:Lk1/i1;

    iget-object v1, p0, Lk1/h1;->b:Ljava/lang/String;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, v1, p1}, Lk1/i1;->f(Lk1/i1;Ljava/lang/String;Landroid/database/Cursor;)Lh1/j;

    move-result-object p1

    return-object p1
.end method
