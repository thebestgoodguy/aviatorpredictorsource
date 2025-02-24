.class public Landroidx/startup/InitializationProvider;
.super Landroid/content/ContentProvider;
.source "InitializationProvider.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public final delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 2
    .param p1, "uri"    # Landroid/net/Uri;
    .param p2, "selection"    # Ljava/lang/String;
    .param p3, "selectionArgs"    # [Ljava/lang/String;

    .line 73
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not allowed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 2
    .param p1, "uri"    # Landroid/net/Uri;

    .line 59
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not allowed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 2
    .param p1, "uri"    # Landroid/net/Uri;
    .param p2, "values"    # Landroid/content/ContentValues;

    .line 65
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not allowed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final onCreate()Z
    .locals 3

    .line 36
    invoke-virtual {p0}, Landroidx/startup/InitializationProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 37
    .local v0, "context":Landroid/content/Context;
    if-eqz v0, :cond_0

    .line 38
    invoke-static {v0}, Landroidx/startup/AppInitializer;->getInstance(Landroid/content/Context;)Landroidx/startup/AppInitializer;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/startup/AppInitializer;->discoverAndInitialize()V

    .line 42
    const/4 v1, 0x1

    return v1

    .line 40
    :cond_0
    new-instance v1, Landroidx/startup/StartupException;

    const-string v2, "Context cannot be null"

    invoke-direct {v1, v2}, Landroidx/startup/StartupException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 2
    .param p1, "uri"    # Landroid/net/Uri;
    .param p2, "projection"    # [Ljava/lang/String;
    .param p3, "selection"    # Ljava/lang/String;
    .param p4, "selectionArgs"    # [Ljava/lang/String;
    .param p5, "sortOrder"    # Ljava/lang/String;

    .line 53
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not allowed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 2
    .param p1, "uri"    # Landroid/net/Uri;
    .param p2, "values"    # Landroid/content/ContentValues;
    .param p3, "selection"    # Ljava/lang/String;
    .param p4, "selectionArgs"    # [Ljava/lang/String;

    .line 82
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not allowed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
