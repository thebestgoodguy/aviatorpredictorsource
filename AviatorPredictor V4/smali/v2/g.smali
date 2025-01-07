.class public final synthetic Lv2/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lv2/t;

.field public final synthetic f:Ljava/util/Map;

.field public final synthetic g:Lo0/i;


# direct methods
.method public synthetic constructor <init>(Lv2/t;Ljava/util/Map;Lo0/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv2/g;->e:Lv2/t;

    iput-object p2, p0, Lv2/g;->f:Ljava/util/Map;

    iput-object p3, p0, Lv2/g;->g:Lo0/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lv2/g;->e:Lv2/t;

    iget-object v1, p0, Lv2/g;->f:Ljava/util/Map;

    iget-object v2, p0, Lv2/g;->g:Lo0/i;

    invoke-static {v0, v1, v2}, Lv2/t;->w(Lv2/t;Ljava/util/Map;Lo0/i;)V

    return-void
.end method
