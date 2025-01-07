.class public final La3/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj2/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La3/a$a;
    }
.end annotation


# static fields
.field public static final b:La3/a$a;


# instance fields
.field private a:Lr2/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La3/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La3/a$a;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, La3/a;->b:La3/a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b()V
    .locals 2

    iget-object v0, p0, La3/a;->a:Lr2/j;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lr2/j;->e(Lr2/j$c;)V

    :goto_0
    iput-object v1, p0, La3/a;->a:Lr2/j;

    return-void
.end method


# virtual methods
.method public final a(Lr2/b;Landroid/content/Context;)V
    .locals 2

    const-string v0, "messenger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lr2/j;

    const-string v1, "PonnamKarthik/fluttertoast"

    invoke-direct {v0, p1, v1}, Lr2/j;-><init>(Lr2/b;Ljava/lang/String;)V

    iput-object v0, p0, La3/a;->a:Lr2/j;

    new-instance p1, La3/d;

    invoke-direct {p1, p2}, La3/d;-><init>(Landroid/content/Context;)V

    iget-object p2, p0, La3/a;->a:Lr2/j;

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2, p1}, Lr2/j;->e(Lr2/j$c;)V

    :goto_0
    return-void
.end method

.method public c(Lj2/a$b;)V
    .locals 2

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lj2/a$b;->b()Lr2/b;

    move-result-object v0

    const-string v1, "binding.binaryMessenger"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lj2/a$b;->a()Landroid/content/Context;

    move-result-object p1

    const-string v1, "binding.applicationContext"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, p1}, La3/a;->a(Lr2/b;Landroid/content/Context;)V

    return-void
.end method

.method public d(Lj2/a$b;)V
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, La3/a;->b()V

    return-void
.end method
