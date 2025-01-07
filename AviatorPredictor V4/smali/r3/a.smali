.class public Lr3/a;
.super Lq3/a;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lq3/a;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Lv3/c;
    .locals 1

    new-instance v0, Lw3/a;

    invoke-direct {v0}, Lw3/a;-><init>()V

    return-object v0
.end method
