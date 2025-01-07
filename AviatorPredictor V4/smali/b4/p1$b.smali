.class public final Lb4/p1$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ln3/g$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb4/p1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln3/g$c<",
        "Lb4/p1;",
        ">;"
    }
.end annotation


# static fields
.field static final synthetic e:Lb4/p1$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb4/p1$b;

    invoke-direct {v0}, Lb4/p1$b;-><init>()V

    sput-object v0, Lb4/p1$b;->e:Lb4/p1$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
