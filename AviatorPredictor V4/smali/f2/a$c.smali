.class Lf2/a$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lr2/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field private final a:Lf2/c;


# direct methods
.method private constructor <init>(Lf2/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf2/a$c;->a:Lf2/c;

    return-void
.end method

.method synthetic constructor <init>(Lf2/c;Lf2/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lf2/a$c;-><init>(Lf2/c;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lr2/b$a;Lr2/b$c;)V
    .locals 1

    iget-object v0, p0, Lf2/a$c;->a:Lf2/c;

    invoke-virtual {v0, p1, p2, p3}, Lf2/c;->a(Ljava/lang/String;Lr2/b$a;Lr2/b$c;)V

    return-void
.end method

.method public b(Ljava/lang/String;Lr2/b$a;)V
    .locals 1

    iget-object v0, p0, Lf2/a$c;->a:Lf2/c;

    invoke-virtual {v0, p1, p2}, Lf2/c;->b(Ljava/lang/String;Lr2/b$a;)V

    return-void
.end method

.method public c(Ljava/lang/String;Ljava/nio/ByteBuffer;)V
    .locals 2

    iget-object v0, p0, Lf2/a$c;->a:Lf2/c;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Lf2/c;->e(Ljava/lang/String;Ljava/nio/ByteBuffer;Lr2/b$b;)V

    return-void
.end method

.method public e(Ljava/lang/String;Ljava/nio/ByteBuffer;Lr2/b$b;)V
    .locals 1

    iget-object v0, p0, Lf2/a$c;->a:Lf2/c;

    invoke-virtual {v0, p1, p2, p3}, Lf2/c;->e(Ljava/lang/String;Ljava/nio/ByteBuffer;Lr2/b$b;)V

    return-void
.end method
