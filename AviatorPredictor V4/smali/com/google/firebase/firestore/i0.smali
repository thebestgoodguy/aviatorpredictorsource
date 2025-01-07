.class public final synthetic Lcom/google/firebase/firestore/i0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/firestore/j;


# instance fields
.field public final synthetic a:Lo0/i;

.field public final synthetic b:Lo0/i;

.field public final synthetic c:Lcom/google/firebase/firestore/q0;


# direct methods
.method public synthetic constructor <init>(Lo0/i;Lo0/i;Lcom/google/firebase/firestore/q0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/firestore/i0;->a:Lo0/i;

    iput-object p2, p0, Lcom/google/firebase/firestore/i0;->b:Lo0/i;

    iput-object p3, p0, Lcom/google/firebase/firestore/i0;->c:Lcom/google/firebase/firestore/q0;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lcom/google/firebase/firestore/u;)V
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/firestore/i0;->a:Lo0/i;

    iget-object v1, p0, Lcom/google/firebase/firestore/i0;->b:Lo0/i;

    iget-object v2, p0, Lcom/google/firebase/firestore/i0;->c:Lcom/google/firebase/firestore/q0;

    check-cast p1, Lcom/google/firebase/firestore/m0;

    invoke-static {v0, v1, v2, p1, p2}, Lcom/google/firebase/firestore/k0;->a(Lo0/i;Lo0/i;Lcom/google/firebase/firestore/q0;Lcom/google/firebase/firestore/m0;Lcom/google/firebase/firestore/u;)V

    return-void
.end method
