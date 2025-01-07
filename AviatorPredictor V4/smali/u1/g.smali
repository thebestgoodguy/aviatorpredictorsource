.class public final synthetic Lu1/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb1/h;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lu1/h$a;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lu1/h$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1/g;->a:Ljava/lang/String;

    iput-object p2, p0, Lu1/g;->b:Lu1/h$a;

    return-void
.end method


# virtual methods
.method public final a(Lb1/e;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lu1/g;->a:Ljava/lang/String;

    iget-object v1, p0, Lu1/g;->b:Lu1/h$a;

    invoke-static {v0, v1, p1}, Lu1/h;->a(Ljava/lang/String;Lu1/h$a;Lb1/e;)Lu1/f;

    move-result-object p1

    return-object p1
.end method
