.class public Lk1/y0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:Ll1/i;

.field private b:Lm1/d;


# direct methods
.method constructor <init>(Ll1/i;Lm1/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/y0;->a:Ll1/i;

    iput-object p2, p0, Lk1/y0;->b:Lm1/d;

    return-void
.end method


# virtual methods
.method public a()Ll1/i;
    .locals 1

    iget-object v0, p0, Lk1/y0;->a:Ll1/i;

    return-object v0
.end method

.method public b()Lm1/d;
    .locals 1

    iget-object v0, p0, Lk1/y0;->b:Lm1/d;

    return-object v0
.end method
