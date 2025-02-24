.class final Landroidx/activity/ImmLeaksCleaner;
.super Ljava/lang/Object;
.source "ImmLeaksCleaner.java"

# interfaces
.implements Landroidx/lifecycle/LifecycleEventObserver;


# static fields
.field private static final INIT_FAILED:I = 0x2

.field private static final INIT_SUCCESS:I = 0x1

.field private static final NOT_INITIALIAZED:I

.field private static sHField:Ljava/lang/reflect/Field;

.field private static sNextServedViewField:Ljava/lang/reflect/Field;

.field private static sReflectedFieldsInitialized:I

.field private static sServedViewField:Ljava/lang/reflect/Field;


# instance fields
.field private mActivity:Landroid/app/Activity;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 39
    const/4 v0, 0x0

    sput v0, Landroidx/activity/ImmLeaksCleaner;->sReflectedFieldsInitialized:I

    return-void
.end method

.method constructor <init>(Landroid/app/Activity;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "activity"
        }
    .end annotation

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Landroidx/activity/ImmLeaksCleaner;->mActivity:Landroid/app/Activity;

    .line 48
    return-void
.end method

.method private static initializeReflectiveFields()V
    .locals 3

    .line 103
    const/4 v0, 0x2

    :try_start_0
    sput v0, Landroidx/activity/ImmLeaksCleaner;->sReflectedFieldsInitialized:I

    .line 104
    const-class v0, Landroid/view/inputmethod/InputMethodManager;

    const-string v1, "mServedView"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sput-object v0, Landroidx/activity/ImmLeaksCleaner;->sServedViewField:Ljava/lang/reflect/Field;

    .line 105
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 106
    const-class v0, Landroid/view/inputmethod/InputMethodManager;

    const-string v2, "mNextServedView"

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sput-object v0, Landroidx/activity/ImmLeaksCleaner;->sNextServedViewField:Ljava/lang/reflect/Field;

    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 108
    const-class v0, Landroid/view/inputmethod/InputMethodManager;

    const-string v2, "mH"

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sput-object v0, Landroidx/activity/ImmLeaksCleaner;->sHField:Ljava/lang/reflect/Field;

    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 110
    sput v1, Landroidx/activity/ImmLeaksCleaner;->sReflectedFieldsInitialized:I
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 113
    goto :goto_0

    .line 111
    :catch_0
    move-exception v0

    .line 114
    :goto_0
    return-void
.end method


# virtual methods
.method public onStateChanged(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 5
    .param p1, "source"    # Landroidx/lifecycle/LifecycleOwner;
    .param p2, "event"    # Landroidx/lifecycle/Lifecycle$Event;
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "source",
            "event"
        }
    .end annotation

    .line 52
    sget-object v0, Landroidx/lifecycle/Lifecycle$Event;->ON_DESTROY:Landroidx/lifecycle/Lifecycle$Event;

    if-eq p2, v0, :cond_0

    .line 53
    return-void

    .line 55
    :cond_0
    sget v0, Landroidx/activity/ImmLeaksCleaner;->sReflectedFieldsInitialized:I

    if-nez v0, :cond_1

    .line 56
    invoke-static {}, Landroidx/activity/ImmLeaksCleaner;->initializeReflectiveFields()V

    .line 58
    :cond_1
    sget v0, Landroidx/activity/ImmLeaksCleaner;->sReflectedFieldsInitialized:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 59
    iget-object v0, p0, Landroidx/activity/ImmLeaksCleaner;->mActivity:Landroid/app/Activity;

    const-string v1, "input_method"

    .line 60
    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 63
    .local v0, "inputMethodManager":Landroid/view/inputmethod/InputMethodManager;
    :try_start_0
    sget-object v1, Landroidx/activity/ImmLeaksCleaner;->sHField:Ljava/lang/reflect/Field;

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3

    .line 66
    .local v1, "lock":Ljava/lang/Object;
    nop

    .line 67
    if-nez v1, :cond_2

    .line 68
    return-void

    .line 70
    :cond_2
    monitor-enter v1

    .line 73
    :try_start_1
    sget-object v2, Landroidx/activity/ImmLeaksCleaner;->sServedViewField:Ljava/lang/reflect/Field;

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    .local v2, "servedView":Landroid/view/View;
    nop

    .line 79
    if-nez v2, :cond_3

    .line 80
    :try_start_2
    monitor-exit v1

    return-void

    .line 82
    :cond_3
    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 83
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-void

    .line 88
    :cond_4
    :try_start_3
    sget-object v3, Landroidx/activity/ImmLeaksCleaner;->sNextServedViewField:Ljava/lang/reflect/Field;

    const/4 v4, 0x0

    invoke-virtual {v3, v0, v4}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 91
    nop

    .line 92
    .end local v2    # "servedView":Landroid/view/View;
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 95
    invoke-virtual {v0}, Landroid/view/inputmethod/InputMethodManager;->isActive()Z

    goto :goto_1

    .line 89
    .restart local v2    # "servedView":Landroid/view/View;
    :catch_0
    move-exception v3

    .line 90
    .local v3, "e":Ljava/lang/IllegalAccessException;
    :try_start_5
    monitor-exit v1

    return-void

    .line 92
    .end local v2    # "servedView":Landroid/view/View;
    .end local v3    # "e":Ljava/lang/IllegalAccessException;
    :catchall_0
    move-exception v2

    goto :goto_0

    .line 76
    :catch_1
    move-exception v2

    .line 77
    .local v2, "e":Ljava/lang/ClassCastException;
    monitor-exit v1

    return-void

    .line 74
    .end local v2    # "e":Ljava/lang/ClassCastException;
    :catch_2
    move-exception v2

    .line 75
    .local v2, "e":Ljava/lang/IllegalAccessException;
    monitor-exit v1

    return-void

    .line 92
    .end local v2    # "e":Ljava/lang/IllegalAccessException;
    :goto_0
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v2

    .line 64
    .end local v1    # "lock":Ljava/lang/Object;
    :catch_3
    move-exception v1

    .line 65
    .local v1, "e":Ljava/lang/IllegalAccessException;
    return-void

    .line 97
    .end local v0    # "inputMethodManager":Landroid/view/inputmethod/InputMethodManager;
    .end local v1    # "e":Ljava/lang/IllegalAccessException;
    :cond_5
    :goto_1
    return-void
.end method
