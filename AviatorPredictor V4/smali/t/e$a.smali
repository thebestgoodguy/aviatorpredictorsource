.class public Lt/e$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt/e$a$a;
    }
.end annotation


# static fields
.field public static final c:Lt/e$a;


# instance fields
.field public final a:Lu/k;

.field public final b:Landroid/os/Looper;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt/e$a$a;

    invoke-direct {v0}, Lt/e$a$a;-><init>()V

    invoke-virtual {v0}, Lt/e$a$a;->a()Lt/e$a;

    move-result-object v0

    sput-object v0, Lt/e$a;->c:Lt/e$a;

    return-void
.end method

.method private constructor <init>(Lu/k;Landroid/accounts/Account;Landroid/os/Looper;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt/e$a;->a:Lu/k;

    iput-object p3, p0, Lt/e$a;->b:Landroid/os/Looper;

    return-void
.end method

.method synthetic constructor <init>(Lu/k;Landroid/accounts/Account;Landroid/os/Looper;Lt/n;)V
    .locals 0

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2, p3}, Lt/e$a;-><init>(Lu/k;Landroid/accounts/Account;Landroid/os/Looper;)V

    return-void
.end method
