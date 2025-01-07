.class Lio/flutter/embedding/android/q$c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/embedding/android/q$d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/android/q$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field a:Z

.field final synthetic b:Lio/flutter/embedding/android/q$c;


# direct methods
.method private constructor <init>(Lio/flutter/embedding/android/q$c;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/embedding/android/q$c$a;->b:Lio/flutter/embedding/android/q$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lio/flutter/embedding/android/q$c$a;->a:Z

    return-void
.end method

.method synthetic constructor <init>(Lio/flutter/embedding/android/q$c;Lio/flutter/embedding/android/q$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/embedding/android/q$c$a;-><init>(Lio/flutter/embedding/android/q$c;)V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 3

    iget-boolean v0, p0, Lio/flutter/embedding/android/q$c$a;->a:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/flutter/embedding/android/q$c$a;->a:Z

    iget-object v1, p0, Lio/flutter/embedding/android/q$c$a;->b:Lio/flutter/embedding/android/q$c;

    iget v2, v1, Lio/flutter/embedding/android/q$c;->b:I

    sub-int/2addr v2, v0

    iput v2, v1, Lio/flutter/embedding/android/q$c;->b:I

    iget-boolean v0, v1, Lio/flutter/embedding/android/q$c;->c:Z

    or-int/2addr p1, v0

    iput-boolean p1, v1, Lio/flutter/embedding/android/q$c;->c:Z

    if-nez v2, :cond_0

    if-nez p1, :cond_0

    iget-object p1, v1, Lio/flutter/embedding/android/q$c;->d:Lio/flutter/embedding/android/q;

    iget-object v0, v1, Lio/flutter/embedding/android/q$c;->a:Landroid/view/KeyEvent;

    invoke-static {p1, v0}, Lio/flutter/embedding/android/q;->b(Lio/flutter/embedding/android/q;Landroid/view/KeyEvent;)V

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "The onKeyEventHandledCallback should be called exactly once."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
