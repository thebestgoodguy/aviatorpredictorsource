.class public final synthetic Lb1/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lr1/b;


# instance fields
.field public final synthetic a:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/f;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lb1/f;->a:Ljava/lang/String;

    invoke-static {v0}, Lb1/g;->a(Ljava/lang/String;)Lb1/i;

    move-result-object v0

    return-object v0
.end method
