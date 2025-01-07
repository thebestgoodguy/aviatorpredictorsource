.class final Lq0/a$e;
.super Lq0/a$c;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "e"
.end annotation


# static fields
.field static final b:I

.field static final c:Lq0/a$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1f

    invoke-static {v0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result v0

    sput v0, Lq0/a$e;->b:I

    new-instance v0, Lq0/a$e;

    invoke-direct {v0}, Lq0/a$e;-><init>()V

    sput-object v0, Lq0/a$e;->c:Lq0/a$e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const-string v0, "CharMatcher.whitespace()"

    invoke-direct {p0, v0}, Lq0/a$c;-><init>(Ljava/lang/String;)V

    return-void
.end method
