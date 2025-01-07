.class public abstract Ll1/q$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll1/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(JLl1/q$a;)Ll1/q$b;
    .locals 1

    new-instance v0, Ll1/c;

    invoke-direct {v0, p0, p1, p2}, Ll1/c;-><init>(JLl1/q$a;)V

    return-object v0
.end method

.method public static b(JLl1/w;Ll1/l;I)Ll1/q$b;
    .locals 0

    invoke-static {p2, p3, p4}, Ll1/q$a;->h(Ll1/w;Ll1/l;I)Ll1/q$a;

    move-result-object p2

    invoke-static {p0, p1, p2}, Ll1/q$b;->a(JLl1/q$a;)Ll1/q$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract c()Ll1/q$a;
.end method

.method public abstract d()J
.end method
