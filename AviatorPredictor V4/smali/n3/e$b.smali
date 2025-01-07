.class public final Ln3/e$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ln3/g$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln3/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln3/g$c<",
        "Ln3/e;",
        ">;"
    }
.end annotation


# static fields
.field static final synthetic e:Ln3/e$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln3/e$b;

    invoke-direct {v0}, Ln3/e$b;-><init>()V

    sput-object v0, Ln3/e$b;->e:Ln3/e$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
