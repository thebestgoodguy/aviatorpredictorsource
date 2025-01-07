.class public final synthetic Lk1/w3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/n;


# instance fields
.field public final synthetic a:Lk1/y3;

.field public final synthetic b:Li1/c1;

.field public final synthetic c:Lk1/y3$c;


# direct methods
.method public synthetic constructor <init>(Lk1/y3;Li1/c1;Lk1/y3$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/w3;->a:Lk1/y3;

    iput-object p2, p0, Lk1/w3;->b:Li1/c1;

    iput-object p3, p0, Lk1/w3;->c:Lk1/y3$c;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lk1/w3;->a:Lk1/y3;

    iget-object v1, p0, Lk1/w3;->b:Li1/c1;

    iget-object v2, p0, Lk1/w3;->c:Lk1/y3$c;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, v1, v2, p1}, Lk1/y3;->l(Lk1/y3;Li1/c1;Lk1/y3$c;Landroid/database/Cursor;)V

    return-void
.end method
