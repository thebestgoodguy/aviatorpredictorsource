.class public final synthetic Lv2/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lv2/t;

.field public final synthetic f:Lo0/i;


# direct methods
.method public synthetic constructor <init>(Lv2/t;Lo0/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv2/h;->e:Lv2/t;

    iput-object p2, p0, Lv2/h;->f:Lo0/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lv2/h;->e:Lv2/t;

    iget-object v1, p0, Lv2/h;->f:Lo0/i;

    invoke-static {v0, v1}, Lv2/t;->e(Lv2/t;Lo0/i;)V

    return-void
.end method
