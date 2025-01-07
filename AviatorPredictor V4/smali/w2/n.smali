.class public final synthetic Lw2/n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo0/d;


# instance fields
.field public final synthetic a:Lw2/o;

.field public final synthetic b:Lcom/google/firebase/firestore/FirebaseFirestore;

.field public final synthetic c:Lr2/c$b;


# direct methods
.method public synthetic constructor <init>(Lw2/o;Lcom/google/firebase/firestore/FirebaseFirestore;Lr2/c$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw2/n;->a:Lw2/o;

    iput-object p2, p0, Lw2/n;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    iput-object p3, p0, Lw2/n;->c:Lr2/c$b;

    return-void
.end method


# virtual methods
.method public final a(Lo0/h;)V
    .locals 3

    iget-object v0, p0, Lw2/n;->a:Lw2/o;

    iget-object v1, p0, Lw2/n;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    iget-object v2, p0, Lw2/n;->c:Lr2/c$b;

    invoke-static {v0, v1, v2, p1}, Lw2/o;->e(Lw2/o;Lcom/google/firebase/firestore/FirebaseFirestore;Lr2/c$b;Lo0/h;)V

    return-void
.end method
