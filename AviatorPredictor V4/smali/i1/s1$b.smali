.class public Li1/s1$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li1/s1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field final a:Ll1/n;

.field final b:Li1/o;

.field private final c:Z

.field final d:Lc1/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc1/e<",
            "Ll1/l;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ll1/n;Li1/o;Lc1/e;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll1/n;",
            "Li1/o;",
            "Lc1/e<",
            "Ll1/l;",
            ">;Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/s1$b;->a:Ll1/n;

    iput-object p2, p0, Li1/s1$b;->b:Li1/o;

    iput-object p3, p0, Li1/s1$b;->d:Lc1/e;

    iput-boolean p4, p0, Li1/s1$b;->c:Z

    return-void
.end method

.method synthetic constructor <init>(Ll1/n;Li1/o;Lc1/e;ZLi1/s1$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Li1/s1$b;-><init>(Ll1/n;Li1/o;Lc1/e;Z)V

    return-void
.end method

.method static synthetic a(Li1/s1$b;)Z
    .locals 0

    iget-boolean p0, p0, Li1/s1$b;->c:Z

    return p0
.end method


# virtual methods
.method public b()Z
    .locals 1

    iget-boolean v0, p0, Li1/s1$b;->c:Z

    return v0
.end method
