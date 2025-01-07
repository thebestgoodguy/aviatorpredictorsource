.class public final Lv3/b;
.super Lv3/a;
.source ""


# instance fields
.field private final g:Lv3/b$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lv3/a;-><init>()V

    new-instance v0, Lv3/b$a;

    invoke-direct {v0}, Lv3/b$a;-><init>()V

    iput-object v0, p0, Lv3/b;->g:Lv3/b$a;

    return-void
.end method


# virtual methods
.method public c()Ljava/util/Random;
    .locals 2

    iget-object v0, p0, Lv3/b;->g:Lv3/b$a;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "implStorage.get()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Random;

    return-object v0
.end method
