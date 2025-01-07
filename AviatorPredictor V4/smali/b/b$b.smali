.class Lb/b$b;
.super Lb/b$e;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lb/b$e<",
        "TK;TV;>;"
    }
.end annotation


# direct methods
.method constructor <init>(Lb/b$c;Lb/b$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/b$c<",
            "TK;TV;>;",
            "Lb/b$c<",
            "TK;TV;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lb/b$e;-><init>(Lb/b$c;Lb/b$c;)V

    return-void
.end method


# virtual methods
.method d(Lb/b$c;)Lb/b$c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/b$c<",
            "TK;TV;>;)",
            "Lb/b$c<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object p1, p1, Lb/b$c;->g:Lb/b$c;

    return-object p1
.end method

.method e(Lb/b$c;)Lb/b$c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/b$c<",
            "TK;TV;>;)",
            "Lb/b$c<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object p1, p1, Lb/b$c;->h:Lb/b$c;

    return-object p1
.end method
