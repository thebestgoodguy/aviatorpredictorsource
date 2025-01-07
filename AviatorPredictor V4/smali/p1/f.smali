.class public final synthetic Lp1/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo0/a;


# instance fields
.field public final synthetic a:Lo0/i;


# direct methods
.method public synthetic constructor <init>(Lo0/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/f;->a:Lo0/i;

    return-void
.end method


# virtual methods
.method public final a(Lo0/h;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lp1/f;->a:Lo0/i;

    invoke-static {v0, p1}, Lp1/g;->a(Lo0/i;Lo0/h;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method
