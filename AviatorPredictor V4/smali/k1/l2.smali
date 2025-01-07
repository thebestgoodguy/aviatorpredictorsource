.class public final synthetic Lk1/l2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/t;


# instance fields
.field public final synthetic a:Lk1/n2;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lk1/n2;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/l2;->a:Lk1/n2;

    iput p2, p0, Lk1/l2;->b:I

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lk1/l2;->a:Lk1/n2;

    iget v1, p0, Lk1/l2;->b:I

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, v1, p1}, Lk1/n2;->v(Lk1/n2;ILandroid/database/Cursor;)Lm1/g;

    move-result-object p1

    return-object p1
.end method
