.class Lcom/oneplus/settings/OPVibrateIntensity$1;
.super Landroid/os/Handler;
.source "OPVibrateIntensity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/oneplus/settings/OPVibrateIntensity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/oneplus/settings/OPVibrateIntensity;


# direct methods
.method constructor <init>(Lcom/oneplus/settings/OPVibrateIntensity;Landroid/os/Looper;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/oneplus/settings/OPVibrateIntensity$1;->this$0:Lcom/oneplus/settings/OPVibrateIntensity;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 62
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 63
    iget p1, p1, Landroid/os/Message;->what:I

    const/16 v0, 0xa

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 66
    iget-object v0, p0, Lcom/oneplus/settings/OPVibrateIntensity$1;->this$0:Lcom/oneplus/settings/OPVibrateIntensity;

    invoke-static {v0}, Lcom/oneplus/settings/OPVibrateIntensity;->access$000(Lcom/oneplus/settings/OPVibrateIntensity;)Lcom/oneplus/settings/ui/OPListDialog;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 67
    iget-object p1, p0, Lcom/oneplus/settings/OPVibrateIntensity$1;->this$0:Lcom/oneplus/settings/OPVibrateIntensity;

    invoke-static {p1}, Lcom/oneplus/settings/OPVibrateIntensity;->access$000(Lcom/oneplus/settings/OPVibrateIntensity;)Lcom/oneplus/settings/ui/OPListDialog;

    move-result-object p1

    invoke-virtual {p1}, Lcom/oneplus/settings/ui/OPListDialog;->getRootContainer()Landroid/view/View;

    move-result-object p1

    :cond_1
    if-nez p1, :cond_2

    .line 70
    new-instance p1, Landroid/view/View;

    iget-object v0, p0, Lcom/oneplus/settings/OPVibrateIntensity$1;->this$0:Lcom/oneplus/settings/OPVibrateIntensity;

    invoke-static {v0}, Lcom/oneplus/settings/OPVibrateIntensity;->access$100(Lcom/oneplus/settings/OPVibrateIntensity;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    :cond_2
    const/4 v0, 0x1

    .line 72
    invoke-virtual {p1, v0}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 73
    iget-object p1, p0, Lcom/oneplus/settings/OPVibrateIntensity$1;->this$0:Lcom/oneplus/settings/OPVibrateIntensity;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    iget-object p0, p0, Lcom/oneplus/settings/OPVibrateIntensity$1;->this$0:Lcom/oneplus/settings/OPVibrateIntensity;

    .line 74
    invoke-static {p0}, Lcom/oneplus/settings/OPVibrateIntensity;->access$200(Lcom/oneplus/settings/OPVibrateIntensity;)I

    move-result p0

    const-string v0, "vibrate_on_touch_intensity"

    .line 73
    invoke-static {p1, v0, p0}, Landroid/provider/Settings$System;->putInt(Landroid/content/ContentResolver;Ljava/lang/String;I)Z

    :goto_0
    return-void
.end method
