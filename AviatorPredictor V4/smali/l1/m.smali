.class public final synthetic Ll1/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic e:Ljava/util/Comparator;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Comparator;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/m;->e:Ljava/util/Comparator;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Ll1/m;->e:Ljava/util/Comparator;

    check-cast p1, Ll1/i;

    check-cast p2, Ll1/i;

    invoke-static {v0, p1, p2}, Ll1/n;->i(Ljava/util/Comparator;Ll1/i;Ll1/i;)I

    move-result p1

    return p1
.end method
