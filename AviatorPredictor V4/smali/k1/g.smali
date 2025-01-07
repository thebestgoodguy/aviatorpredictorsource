.class public final synthetic Lk1/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/y;


# instance fields
.field public final synthetic a:Lk1/k;


# direct methods
.method public synthetic constructor <init>(Lk1/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/g;->a:Lk1/k;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lk1/g;->a:Lk1/k;

    invoke-static {v0}, Lk1/k;->a(Lk1/k;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
