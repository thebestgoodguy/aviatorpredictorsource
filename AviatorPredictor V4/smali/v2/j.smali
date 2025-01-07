.class public final synthetic Lv2/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lw2/o$a;


# instance fields
.field public final synthetic a:Lv2/t;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lv2/t;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv2/j;->a:Lv2/t;

    iput-object p2, p0, Lv2/j;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/firebase/firestore/t0;)V
    .locals 2

    iget-object v0, p0, Lv2/j;->a:Lv2/t;

    iget-object v1, p0, Lv2/j;->b:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lv2/t;->b(Lv2/t;Ljava/lang/String;Lcom/google/firebase/firestore/t0;)V

    return-void
.end method
