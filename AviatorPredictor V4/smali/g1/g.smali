.class public final synthetic Lg1/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo0/a;


# instance fields
.field public final synthetic a:Lg1/i;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lg1/i;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/g;->a:Lg1/i;

    iput p2, p0, Lg1/g;->b:I

    return-void
.end method


# virtual methods
.method public final a(Lo0/h;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lg1/g;->a:Lg1/i;

    iget v1, p0, Lg1/g;->b:I

    invoke-static {v0, v1, p1}, Lg1/i;->e(Lg1/i;ILo0/h;)Lo0/h;

    move-result-object p1

    return-object p1
.end method
