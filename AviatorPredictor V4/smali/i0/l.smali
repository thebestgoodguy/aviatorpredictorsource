.class final Li0/l;
.super Li0/d;
.source ""


# instance fields
.field private final synthetic a:Li0/j$b;


# direct methods
.method constructor <init>(Li0/j$b;)V
    .locals 0

    iput-object p1, p0, Li0/l;->a:Li0/j$b;

    invoke-direct {p0}, Li0/d;-><init>()V

    return-void
.end method


# virtual methods
.method public final q(Lcom/google/android/gms/common/api/Status;Lk0/f;)V
    .locals 2

    iget-object v0, p0, Li0/l;->a:Li0/j$b;

    new-instance v1, Li0/j$a;

    invoke-direct {v1, p1, p2}, Li0/j$a;-><init>(Lcom/google/android/gms/common/api/Status;Lk0/f;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->f(Lt/k;)V

    return-void
.end method
