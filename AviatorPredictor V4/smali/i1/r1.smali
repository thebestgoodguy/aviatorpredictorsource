.class public final synthetic Li1/r1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic e:Li1/s1;


# direct methods
.method public synthetic constructor <init>(Li1/s1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/r1;->e:Li1/s1;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Li1/r1;->e:Li1/s1;

    check-cast p1, Li1/n;

    check-cast p2, Li1/n;

    invoke-static {v0, p1, p2}, Li1/s1;->a(Li1/s1;Li1/n;Li1/n;)I

    move-result p1

    return p1
.end method
