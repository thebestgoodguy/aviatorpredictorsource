.class public final La1/n0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field private static final f:La1/n0;


# instance fields
.field private final e:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La1/n0;

    invoke-direct {v0}, La1/n0;-><init>()V

    sput-object v0, La1/n0;->f:La1/n0;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/c8;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/c8;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, La1/n0;->e:Landroid/os/Handler;

    return-void
.end method

.method public static a()La1/n0;
    .locals 1

    sget-object v0, La1/n0;->f:La1/n0;

    return-object v0
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, La1/n0;->e:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
