.class public interface abstract Lcom/android/settingslib/suggestions/SuggestionControllerMixinCompat$SuggestionControllerHost;
.super Ljava/lang/Object;
.source "SuggestionControllerMixinCompat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/settingslib/suggestions/SuggestionControllerMixinCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "SuggestionControllerHost"
.end annotation


# virtual methods
.method public abstract getLoaderManager()Landroidx/loader/app/LoaderManager;
.end method

.method public abstract onSuggestionReady(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/service/settings/suggestions/Suggestion;",
            ">;)V"
        }
    .end annotation
.end method
