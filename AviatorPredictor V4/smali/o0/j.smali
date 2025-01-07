.class public final Lo0/j;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Ljava/util/concurrent/Executor;

.field static final b:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo0/e0;

    invoke-direct {v0}, Lo0/e0;-><init>()V

    sput-object v0, Lo0/j;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Lo0/d0;

    invoke-direct {v0}, Lo0/d0;-><init>()V

    sput-object v0, Lo0/j;->b:Ljava/util/concurrent/Executor;

    return-void
.end method
