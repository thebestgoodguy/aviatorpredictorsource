.class public final synthetic Lk1/d3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/n;


# instance fields
.field public final synthetic a:Lk1/s3;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lk1/s3;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/d3;->a:Lk1/s3;

    iput-object p2, p0, Lk1/d3;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lk1/d3;->a:Lk1/s3;

    iget-object v1, p0, Lk1/d3;->b:Ljava/lang/String;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, v1, p1}, Lk1/s3;->p(Lk1/s3;Ljava/lang/String;Landroid/database/Cursor;)V

    return-void
.end method
