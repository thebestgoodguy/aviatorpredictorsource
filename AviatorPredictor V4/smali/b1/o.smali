.class public final synthetic Lb1/o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lr1/b;


# instance fields
.field public final synthetic a:Lb1/i;


# direct methods
.method public synthetic constructor <init>(Lb1/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/o;->a:Lb1/i;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lb1/o;->a:Lb1/i;

    invoke-static {v0}, Lb1/n$b;->a(Lb1/i;)Lb1/i;

    move-result-object v0

    return-object v0
.end method
