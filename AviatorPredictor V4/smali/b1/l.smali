.class public final synthetic Lb1/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lr1/b;


# instance fields
.field public final synthetic a:Lb1/n;

.field public final synthetic b:Lb1/d;


# direct methods
.method public synthetic constructor <init>(Lb1/n;Lb1/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/l;->a:Lb1/n;

    iput-object p2, p0, Lb1/l;->b:Lb1/d;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lb1/l;->a:Lb1/n;

    iget-object v1, p0, Lb1/l;->b:Lb1/d;

    invoke-static {v0, v1}, Lb1/n;->f(Lb1/n;Lb1/d;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
