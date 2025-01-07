.class public Lb0/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb0/d;


# static fields
.field private static final a:Lb0/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb0/f;

    invoke-direct {v0}, Lb0/f;-><init>()V

    sput-object v0, Lb0/f;->a:Lb0/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lb0/d;
    .locals 1

    sget-object v0, Lb0/f;->a:Lb0/f;

    return-object v0
.end method


# virtual methods
.method public final a()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method
