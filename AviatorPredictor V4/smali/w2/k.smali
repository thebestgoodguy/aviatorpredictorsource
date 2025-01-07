.class public final synthetic Lw2/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/firestore/t0$a;


# instance fields
.field public final synthetic a:Lw2/o;

.field public final synthetic b:Lcom/google/firebase/firestore/FirebaseFirestore;

.field public final synthetic c:Lr2/c$b;

.field public final synthetic d:Ljava/lang/Long;


# direct methods
.method public synthetic constructor <init>(Lw2/o;Lcom/google/firebase/firestore/FirebaseFirestore;Lr2/c$b;Ljava/lang/Long;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw2/k;->a:Lw2/o;

    iput-object p2, p0, Lw2/k;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    iput-object p3, p0, Lw2/k;->c:Lr2/c$b;

    iput-object p4, p0, Lw2/k;->d:Ljava/lang/Long;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/firebase/firestore/t0;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lw2/k;->a:Lw2/o;

    iget-object v1, p0, Lw2/k;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    iget-object v2, p0, Lw2/k;->c:Lr2/c$b;

    iget-object v3, p0, Lw2/k;->d:Ljava/lang/Long;

    invoke-static {v0, v1, v2, v3, p1}, Lw2/o;->f(Lw2/o;Lcom/google/firebase/firestore/FirebaseFirestore;Lr2/c$b;Ljava/lang/Long;Lcom/google/firebase/firestore/t0;)Lv2/u;

    move-result-object p1

    return-object p1
.end method
