.class Lf2/c$d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# instance fields
.field public final a:Lr2/b$a;

.field public final b:Lf2/c$b;


# direct methods
.method constructor <init>(Lr2/b$a;Lf2/c$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf2/c$d;->a:Lr2/b$a;

    iput-object p2, p0, Lf2/c$d;->b:Lf2/c$b;

    return-void
.end method
