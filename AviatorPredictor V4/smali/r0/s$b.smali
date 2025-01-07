.class final Lr0/s$b;
.super Lr0/j;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr0/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        ">",
        "Lr0/j<",
        "TK;>;"
    }
.end annotation


# instance fields
.field private final transient g:Lr0/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr0/i<",
            "TK;*>;"
        }
    .end annotation
.end field

.field private final transient h:Lr0/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr0/h<",
            "TK;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lr0/i;Lr0/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr0/i<",
            "TK;*>;",
            "Lr0/h<",
            "TK;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lr0/j;-><init>()V

    iput-object p1, p0, Lr0/s$b;->g:Lr0/i;

    iput-object p2, p0, Lr0/s$b;->h:Lr0/h;

    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lr0/s$b;->g:Lr0/i;

    invoke-virtual {v0, p1}, Lr0/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method i([Ljava/lang/Object;I)I
    .locals 1

    invoke-virtual {p0}, Lr0/s$b;->u()Lr0/h;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lr0/h;->i([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lr0/s$b;->t()Lr0/x;

    move-result-object v0

    return-object v0
.end method

.method s()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lr0/s$b;->g:Lr0/i;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public t()Lr0/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lr0/x<",
            "TK;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lr0/s$b;->u()Lr0/h;

    move-result-object v0

    invoke-virtual {v0}, Lr0/h;->t()Lr0/x;

    move-result-object v0

    return-object v0
.end method

.method public u()Lr0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lr0/h<",
            "TK;>;"
        }
    .end annotation

    iget-object v0, p0, Lr0/s$b;->h:Lr0/h;

    return-object v0
.end method
