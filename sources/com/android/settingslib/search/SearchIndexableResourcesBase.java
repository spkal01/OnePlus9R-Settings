package com.android.settingslib.search;

import com.android.settings.AllInOneTetherSettings;
import com.android.settings.DisplaySettings;
import com.android.settings.LegalSettings;
import com.android.settings.TetherSettings;
import com.android.settings.accounts.AccountDashboardFragment;
import com.android.settings.accounts.ManagedProfileSettings;
import com.android.settings.applications.AppAndNotificationDashboardFragment;
import com.android.settings.applications.DefaultAppSettings;
import com.android.settings.applications.assist.ManageAssist;
import com.android.settings.applications.specialaccess.SpecialAccessSettings;
import com.android.settings.applications.specialaccess.deviceadmin.DeviceAdminSettings;
import com.android.settings.applications.specialaccess.interactacrossprofiles.InteractAcrossProfilesSettings;
import com.android.settings.applications.specialaccess.pictureinpicture.PictureInPictureSettings;
import com.android.settings.applications.specialaccess.premiumsms.PremiumSmsAccess;
import com.android.settings.applications.specialaccess.vrlistener.VrListenerSettings;
import com.android.settings.backup.BackupSettingsFragment;
import com.android.settings.backup.PrivacySettings;
import com.android.settings.backup.UserBackupSettingsActivity;
import com.android.settings.biometrics.face.FaceSettings;
import com.android.settings.datausage.BillingCycleSettings;
import com.android.settings.datausage.DataSaverSummary;
import com.android.settings.datausage.UnrestrictedDataAccess;
import com.android.settings.datetime.DateTimeSettings;
import com.android.settings.datetime.timezone.TimeZoneSettings;
import com.android.settings.deletionhelper.AutomaticStorageManagerSettings;
import com.android.settings.development.WirelessDebuggingFragment;
import com.android.settings.development.featureflags.FeatureFlagsDashboard;
import com.android.settings.development.graphicsdriver.GraphicsDriverDashboard;
import com.android.settings.development.qstile.DevelopmentTileConfigFragment;
import com.android.settings.deviceinfo.StorageDashboardFragment;
import com.android.settings.deviceinfo.StorageSettings;
import com.android.settings.deviceinfo.aboutphone.MyDeviceInfoFragment;
import com.android.settings.deviceinfo.firmwareversion.FirmwareVersionSettings;
import com.android.settings.deviceinfo.hardwareinfo.HardwareInfoFragment;
import com.android.settings.display.ColorModePreferenceFragment;
import com.android.settings.display.ToggleFontSizePreferenceFragment;
import com.android.settings.dream.DreamSettings;
import com.android.settings.enterprise.EnterprisePrivacySettings;
import com.android.settings.gestures.DeviceControlsSettings;
import com.android.settings.gestures.DoubleTapScreenSettings;
import com.android.settings.gestures.DoubleTwistGestureSettings;
import com.android.settings.gestures.GlobalActionsPanelSettings;
import com.android.settings.gestures.PickupGestureSettings;
import com.android.settings.gestures.PowerMenuSettings;
import com.android.settings.gestures.SystemNavigationGestureSettings;
import com.android.settings.gestures.TapScreenGestureSettings;
import com.android.settings.inputmethod.AvailableVirtualKeyboardFragment;
import com.android.settings.inputmethod.PhysicalKeyboardFragment;
import com.android.settings.inputmethod.UserDictionaryList;
import com.android.settings.inputmethod.VirtualKeyboardFragment;
import com.android.settings.language.LanguageAndInputSettings;
import com.android.settings.localepicker.LocaleListEditor;
import com.android.settings.location.LocationSettings;
import com.android.settings.location.RecentLocationRequestSeeAllFragment;
import com.android.settings.network.NetworkDashboardFragment;
import com.android.settings.nfc.PaymentSettings;
import com.android.settings.notification.BubbleNotificationSettings;
import com.android.settings.notification.ConfigureNotificationSettings;
import com.android.settings.notification.NotificationAccessSettings;
import com.android.settings.notification.SoundSettings;
import com.android.settings.notification.app.AppBubbleNotificationSettings;
import com.android.settings.notification.zen.ZenAccessSettings;
import com.android.settings.notification.zen.ZenModeAutomationSettings;
import com.android.settings.notification.zen.ZenModeBlockedEffectsSettings;
import com.android.settings.notification.zen.ZenModeBypassingAppsSettings;
import com.android.settings.notification.zen.ZenModeCallsSettings;
import com.android.settings.notification.zen.ZenModeConversationsSettings;
import com.android.settings.notification.zen.ZenModeMessagesSettings;
import com.android.settings.notification.zen.ZenModePeopleSettings;
import com.android.settings.notification.zen.ZenModeSettings;
import com.android.settings.notification.zen.ZenModeSoundVibrationSettings;
import com.android.settings.print.PrintSettingsFragment;
import com.android.settings.privacy.PrivacyDashboardFragment;
import com.android.settings.security.EncryptionAndCredential;
import com.android.settings.security.InstallCertificateFromStorage;
import com.android.settings.security.ScreenPinningSettings;
import com.android.settings.security.SecuritySettings;
import com.android.settings.security.screenlock.ScreenLockSettings;
import com.android.settings.security.trustagent.TrustAgentSettings;
import com.android.settings.sound.MediaControlsSettings;
import com.android.settings.support.SupportDashboardActivity;
import com.android.settings.system.ResetDashboardFragment;
import com.android.settings.system.SystemDashboardFragment;
import com.android.settings.tts.TextToSpeechSettings;
import com.android.settings.tts.TtsEnginePreferenceFragment;
import com.android.settings.users.UserSettings;
import com.android.settings.wifi.ConfigureWifiSettings;
import com.android.settings.wifi.WifiSettings;
import com.android.settings.wifi.WifiSettings2;
import com.android.settings.wifi.tether.WifiTetherSettings;
import com.oneplus.settings.OPAdvancedSettings;
import com.oneplus.settings.OPButtonsAndGesturesSettings;
import com.oneplus.settings.OPGestureSettings;
import com.oneplus.settings.OPLongPressPowerButtonSettings;
import com.oneplus.settings.OPMotionCompensation;
import com.oneplus.settings.OPScreenRefreshRate;
import com.oneplus.settings.OPScreenResolutionAdjust;
import com.oneplus.settings.OPStatusBarCustomizeSettings;
import com.oneplus.settings.OPThemeSettings;
import com.oneplus.settings.OPVideoEnhancerSettings;
import com.oneplus.settings.OPVideoGraphicsDynamicOptimizationSettings;
import com.oneplus.settings.OPVideoSuperCompensation;
import com.oneplus.settings.aboutphone.OPAboutPhone;
import com.oneplus.settings.better.OPGamingMode;
import com.oneplus.settings.better.OPNightMode;
import com.oneplus.settings.better.OPReadingMode;
import com.oneplus.settings.better.OPReadingModeTurnOnSettings;
import com.oneplus.settings.better.OPScreenColorMode;
import com.oneplus.settings.laboratory.OPLabFeatureActivity;
import com.oneplus.settings.navigationbargestures.OPNavigationBarGesturesSettings;
import com.oneplus.settings.network.OPDualChannelNetworkAccelerationSettings;
import com.oneplus.settings.others.OPExperienceImprovementFragment;
import com.oneplus.settings.others.OPSmartSideBarSettings;
import com.oneplus.settings.others.OPToolsSettings;
import com.oneplus.settings.product.OPProductInfoSettings;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SearchIndexableResourcesBase implements SearchIndexableResources {
    private final Set<SearchIndexableData> mProviders = new HashSet();

    public SearchIndexableResourcesBase() {
        addIndex(new SearchIndexableData(AllInOneTetherSettings.class, AllInOneTetherSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(DisplaySettings.class, DisplaySettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(LegalSettings.class, LegalSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(TetherSettings.class, TetherSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(AccountDashboardFragment.class, AccountDashboardFragment.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(ManagedProfileSettings.class, ManagedProfileSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(AppAndNotificationDashboardFragment.class, AppAndNotificationDashboardFragment.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(DefaultAppSettings.class, DefaultAppSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(ManageAssist.class, ManageAssist.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(SpecialAccessSettings.class, SpecialAccessSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(DeviceAdminSettings.class, DeviceAdminSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(InteractAcrossProfilesSettings.class, InteractAcrossProfilesSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(PictureInPictureSettings.class, PictureInPictureSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(PremiumSmsAccess.class, PremiumSmsAccess.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(VrListenerSettings.class, VrListenerSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(BackupSettingsFragment.class, BackupSettingsFragment.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(PrivacySettings.class, PrivacySettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(UserBackupSettingsActivity.class, UserBackupSettingsActivity.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(FaceSettings.class, FaceSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(BillingCycleSettings.class, BillingCycleSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(DataSaverSummary.class, DataSaverSummary.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(UnrestrictedDataAccess.class, UnrestrictedDataAccess.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(DateTimeSettings.class, DateTimeSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(TimeZoneSettings.class, TimeZoneSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(AutomaticStorageManagerSettings.class, AutomaticStorageManagerSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(WirelessDebuggingFragment.class, WirelessDebuggingFragment.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(FeatureFlagsDashboard.class, FeatureFlagsDashboard.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(GraphicsDriverDashboard.class, GraphicsDriverDashboard.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(DevelopmentTileConfigFragment.class, DevelopmentTileConfigFragment.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(StorageDashboardFragment.class, StorageDashboardFragment.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(StorageSettings.class, StorageSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(MyDeviceInfoFragment.class, MyDeviceInfoFragment.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(FirmwareVersionSettings.class, FirmwareVersionSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(HardwareInfoFragment.class, HardwareInfoFragment.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(ColorModePreferenceFragment.class, ColorModePreferenceFragment.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(ToggleFontSizePreferenceFragment.class, ToggleFontSizePreferenceFragment.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(DreamSettings.class, DreamSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(EnterprisePrivacySettings.class, EnterprisePrivacySettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(DeviceControlsSettings.class, DeviceControlsSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(DoubleTapScreenSettings.class, DoubleTapScreenSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(DoubleTwistGestureSettings.class, DoubleTwistGestureSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(GlobalActionsPanelSettings.class, GlobalActionsPanelSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(PickupGestureSettings.class, PickupGestureSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(PowerMenuSettings.class, PowerMenuSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(SystemNavigationGestureSettings.class, SystemNavigationGestureSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(TapScreenGestureSettings.class, TapScreenGestureSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(AvailableVirtualKeyboardFragment.class, AvailableVirtualKeyboardFragment.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(PhysicalKeyboardFragment.class, PhysicalKeyboardFragment.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(UserDictionaryList.class, UserDictionaryList.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(VirtualKeyboardFragment.class, VirtualKeyboardFragment.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(LanguageAndInputSettings.class, LanguageAndInputSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(LocaleListEditor.class, LocaleListEditor.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(LocationSettings.class, LocationSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(RecentLocationRequestSeeAllFragment.class, RecentLocationRequestSeeAllFragment.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(NetworkDashboardFragment.class, NetworkDashboardFragment.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(PaymentSettings.class, PaymentSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(BubbleNotificationSettings.class, BubbleNotificationSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(ConfigureNotificationSettings.class, ConfigureNotificationSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(NotificationAccessSettings.class, NotificationAccessSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(SoundSettings.class, SoundSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(AppBubbleNotificationSettings.class, AppBubbleNotificationSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(ZenAccessSettings.class, ZenAccessSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(ZenModeAutomationSettings.class, ZenModeAutomationSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(ZenModeBlockedEffectsSettings.class, ZenModeBlockedEffectsSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(ZenModeBypassingAppsSettings.class, ZenModeBypassingAppsSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(ZenModeCallsSettings.class, ZenModeCallsSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(ZenModeConversationsSettings.class, ZenModeConversationsSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(ZenModeMessagesSettings.class, ZenModeMessagesSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(ZenModePeopleSettings.class, ZenModePeopleSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(ZenModeSettings.class, ZenModeSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(ZenModeSoundVibrationSettings.class, ZenModeSoundVibrationSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(PrintSettingsFragment.class, PrintSettingsFragment.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(PrivacyDashboardFragment.class, PrivacyDashboardFragment.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(EncryptionAndCredential.class, EncryptionAndCredential.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(InstallCertificateFromStorage.class, InstallCertificateFromStorage.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(ScreenPinningSettings.class, ScreenPinningSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(SecuritySettings.class, SecuritySettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(ScreenLockSettings.class, ScreenLockSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(TrustAgentSettings.class, TrustAgentSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(MediaControlsSettings.class, MediaControlsSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(SupportDashboardActivity.class, SupportDashboardActivity.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(ResetDashboardFragment.class, ResetDashboardFragment.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(SystemDashboardFragment.class, SystemDashboardFragment.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(TextToSpeechSettings.class, TextToSpeechSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(TtsEnginePreferenceFragment.class, TtsEnginePreferenceFragment.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(UserSettings.class, UserSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(ConfigureWifiSettings.class, ConfigureWifiSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(WifiSettings.class, WifiSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(WifiSettings2.class, WifiSettings2.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(WifiTetherSettings.class, WifiTetherSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(OPAdvancedSettings.class, OPAdvancedSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(OPButtonsAndGesturesSettings.class, OPButtonsAndGesturesSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(OPGestureSettings.class, OPGestureSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(OPLongPressPowerButtonSettings.class, OPLongPressPowerButtonSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(OPMotionCompensation.class, OPMotionCompensation.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(OPScreenRefreshRate.class, OPScreenRefreshRate.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(OPScreenResolutionAdjust.class, OPScreenResolutionAdjust.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(OPStatusBarCustomizeSettings.class, OPStatusBarCustomizeSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(OPThemeSettings.class, OPThemeSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(OPVideoEnhancerSettings.class, OPVideoEnhancerSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(OPVideoGraphicsDynamicOptimizationSettings.class, OPVideoGraphicsDynamicOptimizationSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(OPVideoSuperCompensation.class, OPVideoSuperCompensation.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(OPAboutPhone.class, OPAboutPhone.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(OPGamingMode.class, OPGamingMode.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(OPNightMode.class, OPNightMode.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(OPReadingMode.class, OPReadingMode.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(OPReadingModeTurnOnSettings.class, OPReadingModeTurnOnSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(OPScreenColorMode.class, OPScreenColorMode.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(OPLabFeatureActivity.class, OPLabFeatureActivity.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(OPNavigationBarGesturesSettings.class, OPNavigationBarGesturesSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(OPDualChannelNetworkAccelerationSettings.class, OPDualChannelNetworkAccelerationSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(OPExperienceImprovementFragment.class, OPExperienceImprovementFragment.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(OPSmartSideBarSettings.class, OPSmartSideBarSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(OPToolsSettings.class, OPToolsSettings.SEARCH_INDEX_DATA_PROVIDER));
        addIndex(new SearchIndexableData(OPProductInfoSettings.class, OPProductInfoSettings.SEARCH_INDEX_DATA_PROVIDER));
    }

    public void addIndex(SearchIndexableData searchIndexableData) {
        this.mProviders.add(searchIndexableData);
    }

    @Override // com.android.settingslib.search.SearchIndexableResources
    public Collection<SearchIndexableData> getProviderValues() {
        return this.mProviders;
    }
}