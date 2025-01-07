.class public abstract Lq0/r;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Lq0/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq0/r$a;

    invoke-direct {v0}, Lq0/r$a;-><init>()V

    sput-object v0, Lq0/r;->a:Lq0/r;

    return-void
.end method

.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lq0/r;
    .locals 1

    sget-object v0, Lq0/r;->a:Lq0/r;

    return-object v0
.end method


# virtual methods
.method public abstract a()J
.end method
