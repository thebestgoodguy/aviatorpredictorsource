.class public final synthetic Lw2/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/firestore/j;


# instance fields
.field public final synthetic a:Lw2/h;

.field public final synthetic b:Lr2/c$b;


# direct methods
.method public synthetic constructor <init>(Lw2/h;Lr2/c$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw2/g;->a:Lw2/h;

    iput-object p2, p0, Lw2/g;->b:Lr2/c$b;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lcom/google/firebase/firestore/u;)V
    .locals 2

    iget-object v0, p0, Lw2/g;->a:Lw2/h;

    iget-object v1, p0, Lw2/g;->b:Lr2/c$b;

    check-cast p1, Lcom/google/firebase/firestore/m0;

    invoke-static {v0, v1, p1, p2}, Lw2/h;->c(Lw2/h;Lr2/c$b;Lcom/google/firebase/firestore/m0;Lcom/google/firebase/firestore/u;)V

    return-void
.end method
