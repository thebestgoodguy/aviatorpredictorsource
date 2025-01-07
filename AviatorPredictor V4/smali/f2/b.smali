.class public final synthetic Lf2/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lf2/c;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Lf2/c$d;

.field public final synthetic h:Ljava/nio/ByteBuffer;

.field public final synthetic i:I

.field public final synthetic j:J


# direct methods
.method public synthetic constructor <init>(Lf2/c;Ljava/lang/String;Lf2/c$d;Ljava/nio/ByteBuffer;IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf2/b;->e:Lf2/c;

    iput-object p2, p0, Lf2/b;->f:Ljava/lang/String;

    iput-object p3, p0, Lf2/b;->g:Lf2/c$d;

    iput-object p4, p0, Lf2/b;->h:Ljava/nio/ByteBuffer;

    iput p5, p0, Lf2/b;->i:I

    iput-wide p6, p0, Lf2/b;->j:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lf2/b;->e:Lf2/c;

    iget-object v1, p0, Lf2/b;->f:Ljava/lang/String;

    iget-object v2, p0, Lf2/b;->g:Lf2/c$d;

    iget-object v3, p0, Lf2/b;->h:Ljava/nio/ByteBuffer;

    iget v4, p0, Lf2/b;->i:I

    iget-wide v5, p0, Lf2/b;->j:J

    invoke-static/range {v0 .. v6}, Lf2/c;->g(Lf2/c;Ljava/lang/String;Lf2/c$d;Ljava/nio/ByteBuffer;IJ)V

    return-void
.end method
