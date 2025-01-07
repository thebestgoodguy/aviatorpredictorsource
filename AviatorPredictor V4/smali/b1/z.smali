.class public final synthetic Lb1/z;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lr1/a$a;


# instance fields
.field public final synthetic a:Lr1/a$a;

.field public final synthetic b:Lr1/a$a;


# direct methods
.method public synthetic constructor <init>(Lr1/a$a;Lr1/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/z;->a:Lr1/a$a;

    iput-object p2, p0, Lb1/z;->b:Lr1/a$a;

    return-void
.end method


# virtual methods
.method public final a(Lr1/b;)V
    .locals 2

    iget-object v0, p0, Lb1/z;->a:Lr1/a$a;

    iget-object v1, p0, Lb1/z;->b:Lr1/a$a;

    invoke-static {v0, v1, p1}, Lb1/c0;->d(Lr1/a$a;Lr1/a$a;Lr1/b;)V

    return-void
.end method
