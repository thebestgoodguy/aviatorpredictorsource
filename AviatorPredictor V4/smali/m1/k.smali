.class public abstract Lm1/k;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(ILm1/f;)Lm1/k;
    .locals 1

    new-instance v0, Lm1/b;

    invoke-direct {v0, p0, p1}, Lm1/b;-><init>(ILm1/f;)V

    return-object v0
.end method


# virtual methods
.method public b()Ll1/l;
    .locals 1

    invoke-virtual {p0}, Lm1/k;->d()Lm1/f;

    move-result-object v0

    invoke-virtual {v0}, Lm1/f;->g()Ll1/l;

    move-result-object v0

    return-object v0
.end method

.method public abstract c()I
.end method

.method public abstract d()Lm1/f;
.end method
