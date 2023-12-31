package com.adsmodule.api.adsModule.retrofit;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class AdsResponseModel {

    private String url;
    private AppOpenAdsDTO app_open_ads = new AppOpenAdsDTO();
    private BannerAdsDTO banner_ads = new BannerAdsDTO();
    private NativeAdsDTO native_ads = new NativeAdsDTO();
    private InterstitialAdsDTO interstitial_ads = new InterstitialAdsDTO();
    private RewardedAdsDTO rewarded_ads = new RewardedAdsDTO();
    private MobileStickyAdsDTO mobile_sticky_ads = new MobileStickyAdsDTO();
    private CollapsibleAdsDTO collapsible_ads = new CollapsibleAdsDTO();
    private CustomAdsJsonDTO custom_ads_json = new CustomAdsJsonDTO();
    private ExtraDataFieldDTO extra_data_field = new ExtraDataFieldDTO();
    private String app_name = "";
    private String package_name;
    private boolean show_ads;
    private String ads_open_type;
    private int ads_count;
    private String version_name;
    private String button_bg;
    private String button_text_color;
    private String common_text_color;
    private String ads_bg;
    private String backpress_ads_type;
    private int backPress_count;

    public String getAds_sequence_type() {
        return ads_sequence_type;
    }

    public void setAds_sequence_type(String ads_sequence_type) {
        this.ads_sequence_type = ads_sequence_type;
    }

    private String ads_sequence_type;

    public String getBackPress_ads_type() {
        return backpress_ads_type;
    }

    public void setBackPress_ads_type(String backPress_ads_type) {
        this.backpress_ads_type = backPress_ads_type;
    }

    public int getBackPress_count() {
        return backPress_count;
    }

    public void setBackPress_count(int backPress_count) {
        this.backPress_count = backPress_count;
    }

    public String getButton_bg() {
        return button_bg;
    }

    public void setButton_bg(String button_bg) {
        this.button_bg = button_bg;
    }

    public String getCommon_text_color() {
        return common_text_color;
    }

    public void setCommon_text_color(String common_text_color) {
        this.common_text_color = common_text_color;
    }

    public String getButton_text_color() {
        return button_text_color;
    }

    public void setButton_text_color(String button_text_color) {
        this.button_text_color = button_text_color;
    }

    public String getAd_bg() {
        return ads_bg;
    }

    public void setAd_bg(String ad_bg) {
        this.ads_bg = ad_bg;
    }


    public String getMonetize_platform() {
        return monetize_platform;
    }

    public void setMonetize_platform(String monetize_platform) {
        this.monetize_platform = monetize_platform;
    }
    @SerializedName(value = "monetize_platform", alternate = {"testads_platform"})
    String monetize_platform;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public AppOpenAdsDTO getApp_open_ads() {
        return app_open_ads;
    }

    public void setApp_open_ads(AppOpenAdsDTO app_open_ads) {
        this.app_open_ads = app_open_ads;
    }

    public BannerAdsDTO getBanner_ads() {
        return banner_ads;
    }

    public void setBanner_ads(BannerAdsDTO banner_ads) {
        this.banner_ads = banner_ads;
    }

    public NativeAdsDTO getNative_ads() {
        return native_ads;
    }

    public void setNative_ads(NativeAdsDTO native_ads) {
        this.native_ads = native_ads;
    }

    public InterstitialAdsDTO getInterstitial_ads() {
        return interstitial_ads;
    }

    public void setInterstitial_ads(InterstitialAdsDTO interstitial_ads) {
        this.interstitial_ads = interstitial_ads;
    }

    public RewardedAdsDTO getRewarded_ads() {
        return rewarded_ads;
    }

    public void setRewarded_ads(RewardedAdsDTO rewarded_ads) {
        this.rewarded_ads = rewarded_ads;
    }

    public MobileStickyAdsDTO getMobile_sticky_ads() {
        return mobile_sticky_ads;
    }

    public void setMobile_sticky_ads(MobileStickyAdsDTO mobile_sticky_ads) {
        this.mobile_sticky_ads = mobile_sticky_ads;
    }

    public CollapsibleAdsDTO getCollapsible_ads() {
        return collapsible_ads;
    }

    public void setCollapsible_ads(CollapsibleAdsDTO collapsible_ads) {
        this.collapsible_ads = collapsible_ads;
    }

    public CustomAdsJsonDTO getCustom_ads_json() {
        return custom_ads_json;
    }

    public void setCustom_ads_json(CustomAdsJsonDTO custom_ads_json) {
        this.custom_ads_json = custom_ads_json;
    }

    public ExtraDataFieldDTO getExtra_data_field() {
        return extra_data_field;
    }

    public void setExtra_data_field(ExtraDataFieldDTO extra_data_field) {
        this.extra_data_field = extra_data_field;
    }

    public String getApp_name() {
        return app_name;
    }

    public void setApp_name(String app_name) {
        this.app_name = app_name;
    }

    public String getPackage_name() {
        return package_name;
    }

    public void setPackage_name(String package_name) {
        this.package_name = package_name;
    }

    public boolean isShow_ads() {
        return show_ads;
    }

    public void setShow_ads(boolean show_ads) {
        this.show_ads = show_ads;
    }

    public String getAds_open_type() {
        return ads_open_type;
    }

    public void setAds_open_type(String ads_open_type) {
        this.ads_open_type = ads_open_type;
    }

    public int getAds_count() {
        return ads_count;
    }

    public void setAds_count(int ads_count) {
        this.ads_count = ads_count;
    }

    public String getVersion_name() {
        return version_name;
    }

    public void setVersion_name(String version_name) {
        this.version_name = version_name;
    }

    public static class AppOpenAdsDTO {
        private String Admob = "";
        private String Facebook = "";
        private String Adx = "";

        public String getAdmob() {
            return Admob;
        }

        public void setAdmob(String admob) {
            this.Admob = admob;
        }

        public String getFacebook() {
            return Facebook;
        }

        public void setFacebook(String Facebook) {
            this.Facebook = Facebook;
        }

        public String getAdx() {
            return Adx;
        }

        public void setAdx(String adx) {
            this.Adx = adx;
        }
    }

    public static class BannerAdsDTO {
        private String Admob = "";
        private String Facebook = "";
        private String Adx = "";

        public String getAdmob() {
            return Admob;
        }

        public void setAdmob(String admob) {
            this.Admob = admob;
        }

        public String getFacebook() {
            return Facebook;
        }

        public void setFacebook(String Facebook) {
            this.Facebook = Facebook;
        }

        public String getAdx() {
            return Adx;
        }

        public void setAdx(String adx) {
            this.Adx = adx;
        }
    }

    public static class NativeAdsDTO {
        private String Admob = "";
        private String Facebook = "";
        private String Adx = "";

        public String getAdmob() {
            return Admob;
        }

        public void setAdmob(String admob) {
            this.Admob = admob;
        }

        public String getFacebook() {
            return Facebook;
        }

        public void setFacebook(String Facebook) {
            this.Facebook = Facebook;
        }

        public String getAdx() {
            return Adx;
        }

        public void setAdx(String adx) {
            this.Adx = adx;
        }
    }

    public static class InterstitialAdsDTO {
        private String Admob = "";
        private String Facebook = "";
        private String Adx = "";

        public String getAdmob() {
            return Admob;
        }

        public void setAdmob(String admob) {
            this.Admob = admob;
        }

        public String getFacebook() {
            return Facebook;
        }

        public void setFacebook(String Facebook) {
            this.Facebook = Facebook;
        }

        public String getAdx() {
            return Adx;
        }

        public void setAdx(String adx) {
            this.Adx = adx;
        }
    }

    public static class RewardedAdsDTO {
        private String Admob = "";
        private String Facebook = "";
        private String Adx = "";

        public String getAdmob() {
            return Admob;
        }

        public void setAdmob(String admob) {
            this.Admob = admob;
        }

        public String getFacebook() {
            return Facebook;
        }

        public void setFacebook(String Facebook) {
            this.Facebook = Facebook;
        }

        public String getAdx() {
            return Adx;
        }

        public void setAdx(String adx) {
            this.Adx = adx;
        }
    }

    public static class CollapsibleAdsDTO {
        private String Admob = "";
        private String Facebook = "";
        private String Adx = "";

        public String getAdmob() {
            return Admob;
        }

        public void setAdmob(String admob) {
            this.Admob = admob;
        }

        public String getFacebook() {
            return Facebook;
        }

        public void setFacebook(String Facebook) {
            this.Facebook = Facebook;
        }

        public String getAdx() {
            return Adx;
        }

        public void setAdx(String adx) {
            this.Adx = adx;
        }
    }

    public static class CustomAdsJsonDTO {
    }

    public static class ExtraDataFieldDTO {

        @SerializedName("Categories")
        private CategoriesDTO categories;

        public CategoriesDTO getCategories() {
            return categories;
        }

        public void setCategories(CategoriesDTO categories) {
            this.categories = categories;
        }

        public static class CategoriesDTO implements Serializable{
            @SerializedName("Trending")
            private TrendingDTO trending;
            @SerializedName("Christmas")
            private ChristmasDTO christmas;
            @SerializedName("Kpop")
            private KpopDTO kpop;
            @SerializedName("Animal")
            private AnimalDTO animal;
            @SerializedName("Nature")
            private NatureDTO nature;
            @SerializedName("Modern")
            private ModernDTO modern;
            @SerializedName("CuteAndFunny")
            private CuteAndFunnyDTO cuteAndFunny;
            @SerializedName("Neon")
            private NeonDTO neon;
            @SerializedName("Love")
            private LoveDTO love;
            @SerializedName("CallOfDuty")
            private CallOfDutyDTO callOfDuty;
            @SerializedName("Anime")
            private AnimeDTO anime;
            @SerializedName("Soccer")
            private SoccerDTO soccer;
            @SerializedName("LiveTrending")
            private LiveTrendingDTO liveTrending;
            @SerializedName("LiveChristmas")
            private LiveChristmasDTO liveChristmas;
            @SerializedName("LiveKpop")
            private LiveKpopDTO liveKpop;
            @SerializedName("LiveNeon")
            private LiveNeonDTO liveNeon;
            @SerializedName("LiveLove")
            private LiveLoveDTO liveLove;
            @SerializedName("LiveCallOfDuty")
            private LiveCallOfDutyDTO liveCallOfDuty;
            @SerializedName("LiveAnime")
            private LiveAnimeDTO liveAnime;
            @SerializedName("LiveSoccer")
            private LiveSoccerDTO liveSoccer;
            @SerializedName("LiveCuteAndFunny")
            private LiveCuteAndFunnyDTO liveCuteAndFunny;
            @SerializedName("LiveNature")
            private LiveNatureDTO liveNature;
            @SerializedName("LiveModern")
            private LiveModernDTO liveModern;
            @SerializedName("LiveAnimal")
            private LiveAnimalDTO liveAnimal;

            public TrendingDTO getTrending() {
                return trending;
            }

            public void setTrending(TrendingDTO trending) {
                this.trending = trending;
            }

            public ChristmasDTO getChristmas() {
                return christmas;
            }

            public void setChristmas(ChristmasDTO christmas) {
                this.christmas = christmas;
            }

            public KpopDTO getKpop() {
                return kpop;
            }

            public void setKpop(KpopDTO kpop) {
                this.kpop = kpop;
            }

            public AnimalDTO getAnimal() {
                return animal;
            }

            public void setAnimal(AnimalDTO animal) {
                this.animal = animal;
            }

            public NatureDTO getNature() {
                return nature;
            }

            public void setNature(NatureDTO nature) {
                this.nature = nature;
            }

            public ModernDTO getModern() {
                return modern;
            }

            public void setModern(ModernDTO modern) {
                this.modern = modern;
            }

            public CuteAndFunnyDTO getCuteAndFunny() {
                return cuteAndFunny;
            }

            public void setCuteAndFunny(CuteAndFunnyDTO cuteAndFunny) {
                this.cuteAndFunny = cuteAndFunny;
            }

            public NeonDTO getNeon() {
                return neon;
            }

            public void setNeon(NeonDTO neon) {
                this.neon = neon;
            }

            public LoveDTO getLove() {
                return love;
            }

            public void setLove(LoveDTO love) {
                this.love = love;
            }

            public CallOfDutyDTO getCallOfDuty() {
                return callOfDuty;
            }

            public void setCallOfDuty(CallOfDutyDTO callOfDuty) {
                this.callOfDuty = callOfDuty;
            }

            public AnimeDTO getAnime() {
                return anime;
            }

            public void setAnime(AnimeDTO anime) {
                this.anime = anime;
            }

            public SoccerDTO getSoccer() {
                return soccer;
            }

            public void setSoccer(SoccerDTO soccer) {
                this.soccer = soccer;
            }

            public LiveTrendingDTO getLiveTrending() {
                return liveTrending;
            }

            public void setLiveTrending(LiveTrendingDTO liveTrending) {
                this.liveTrending = liveTrending;
            }

            public LiveChristmasDTO getLiveChristmas() {
                return liveChristmas;
            }

            public void setLiveChristmas(LiveChristmasDTO liveChristmas) {
                this.liveChristmas = liveChristmas;
            }

            public LiveKpopDTO getLiveKpop() {
                return liveKpop;
            }

            public void setLiveKpop(LiveKpopDTO liveKpop) {
                this.liveKpop = liveKpop;
            }

            public LiveNeonDTO getLiveNeon() {
                return liveNeon;
            }

            public void setLiveNeon(LiveNeonDTO liveNeon) {
                this.liveNeon = liveNeon;
            }

            public LiveLoveDTO getLiveLove() {
                return liveLove;
            }

            public void setLiveLove(LiveLoveDTO liveLove) {
                this.liveLove = liveLove;
            }

            public LiveCallOfDutyDTO getLiveCallOfDuty() {
                return liveCallOfDuty;
            }

            public void setLiveCallOfDuty(LiveCallOfDutyDTO liveCallOfDuty) {
                this.liveCallOfDuty = liveCallOfDuty;
            }

            public LiveAnimeDTO getLiveAnime() {
                return liveAnime;
            }

            public void setLiveAnime(LiveAnimeDTO liveAnime) {
                this.liveAnime = liveAnime;
            }

            public LiveSoccerDTO getLiveSoccer() {
                return liveSoccer;
            }

            public void setLiveSoccer(LiveSoccerDTO liveSoccer) {
                this.liveSoccer = liveSoccer;
            }

            public LiveCuteAndFunnyDTO getLiveCuteAndFunny() {
                return liveCuteAndFunny;
            }

            public void setLiveCuteAndFunny(LiveCuteAndFunnyDTO liveCuteAndFunny) {
                this.liveCuteAndFunny = liveCuteAndFunny;
            }

            public LiveNatureDTO getLiveNature() {
                return liveNature;
            }

            public void setLiveNature(LiveNatureDTO liveNature) {
                this.liveNature = liveNature;
            }

            public LiveModernDTO getLiveModern() {
                return liveModern;
            }

            public void setLiveModern(LiveModernDTO liveModern) {
                this.liveModern = liveModern;
            }

            public LiveAnimalDTO getLiveAnimal() {
                return liveAnimal;
            }

            public void setLiveAnimal(LiveAnimalDTO liveAnimal) {
                this.liveAnimal = liveAnimal;
            }

            public static class TrendingDTO implements Serializable{
                @SerializedName("urls")
                private List<String> urls;

                public List<String> getUrls() {
                    return urls;
                }

                public void setUrls(List<String> urls) {
                    this.urls = urls;
                }
            }

            public static class ChristmasDTO implements Serializable{
                @SerializedName("urls")
                private List<String> urls;

                public List<String> getUrls() {
                    return urls;
                }

                public void setUrls(List<String> urls) {
                    this.urls = urls;
                }
            }

            public static class KpopDTO implements Serializable{
                @SerializedName("urls")
                private List<String> urls;

                public List<String> getUrls() {
                    return urls;
                }

                public void setUrls(List<String> urls) {
                    this.urls = urls;
                }
            }

            public static class AnimalDTO implements Serializable{
                @SerializedName("urls")
                private List<String> urls;

                public List<String> getUrls() {
                    return urls;
                }

                public void setUrls(List<String> urls) {
                    this.urls = urls;
                }
            }

            public static class NatureDTO implements Serializable{
                @SerializedName("urls")
                private List<String> urls;

                public List<String> getUrls() {
                    return urls;
                }

                public void setUrls(List<String> urls) {
                    this.urls = urls;
                }
            }

            public static class ModernDTO implements Serializable{
                @SerializedName("urls")
                private List<String> urls;

                public List<String> getUrls() {
                    return urls;
                }

                public void setUrls(List<String> urls) {
                    this.urls = urls;
                }
            }

            public static class CuteAndFunnyDTO implements Serializable{
                @SerializedName("urls")
                private List<String> urls;

                public List<String> getUrls() {
                    return urls;
                }

                public void setUrls(List<String> urls) {
                    this.urls = urls;
                }
            }

            public static class NeonDTO implements Serializable{
                @SerializedName("urls")
                private List<String> urls;

                public List<String> getUrls() {
                    return urls;
                }

                public void setUrls(List<String> urls) {
                    this.urls = urls;
                }
            }

            public static class LoveDTO implements Serializable{
                @SerializedName("urls")
                private List<String> urls;

                public List<String> getUrls() {
                    return urls;
                }

                public void setUrls(List<String> urls) {
                    this.urls = urls;
                }
            }

            public static class CallOfDutyDTO implements Serializable{
                @SerializedName("urls")
                private List<String> urls;

                public List<String> getUrls() {
                    return urls;
                }

                public void setUrls(List<String> urls) {
                    this.urls = urls;
                }
            }

            public static class AnimeDTO implements Serializable{
                @SerializedName("urls")
                private List<String> urls;

                public List<String> getUrls() {
                    return urls;
                }

                public void setUrls(List<String> urls) {
                    this.urls = urls;
                }
            }

            public static class SoccerDTO implements Serializable{
                @SerializedName("urls")
                private List<String> urls;

                public List<String> getUrls() {
                    return urls;
                }

                public void setUrls(List<String> urls) {
                    this.urls = urls;
                }
            }

            public static class LiveTrendingDTO implements Serializable{
                @SerializedName("urls")
                private List<String> urls;

                public List<String> getUrls() {
                    return urls;
                }

                public void setUrls(List<String> urls) {
                    this.urls = urls;
                }
            }

            public static class LiveChristmasDTO implements Serializable{
                @SerializedName("urls")
                private List<String> urls;

                public List<String> getUrls() {
                    return urls;
                }

                public void setUrls(List<String> urls) {
                    this.urls = urls;
                }
            }

            public static class LiveKpopDTO implements Serializable{
                @SerializedName("urls")
                private List<String> urls;

                public List<String> getUrls() {
                    return urls;
                }

                public void setUrls(List<String> urls) {
                    this.urls = urls;
                }
            }

            public static class LiveNeonDTO implements Serializable{
                @SerializedName("urls")
                private List<String> urls;

                public List<String> getUrls() {
                    return urls;
                }

                public void setUrls(List<String> urls) {
                    this.urls = urls;
                }
            }

            public static class LiveLoveDTO implements Serializable{
                @SerializedName("urls")
                private List<String> urls;

                public List<String> getUrls() {
                    return urls;
                }

                public void setUrls(List<String> urls) {
                    this.urls = urls;
                }
            }

            public static class LiveCallOfDutyDTO implements Serializable{
                @SerializedName("urls")
                private List<String> urls;

                public List<String> getUrls() {
                    return urls;
                }

                public void setUrls(List<String> urls) {
                    this.urls = urls;
                }
            }

            public static class LiveAnimeDTO implements Serializable {
                @SerializedName("urls")
                private List<String> urls;

                public List<String> getUrls() {
                    return urls;
                }

                public void setUrls(List<String> urls) {
                    this.urls = urls;
                }
            }

            public static class LiveSoccerDTO implements Serializable{
                @SerializedName("urls")
                private List<String> urls;

                public List<String> getUrls() {
                    return urls;
                }

                public void setUrls(List<String> urls) {
                    this.urls = urls;
                }
            }

            public static class LiveCuteAndFunnyDTO implements Serializable{
                @SerializedName("urls")
                private List<String> urls;

                public List<String> getUrls() {
                    return urls;
                }

                public void setUrls(List<String> urls) {
                    this.urls = urls;
                }
            }

            public static class LiveNatureDTO implements Serializable{
                @SerializedName("urls")
                private List<String> urls;

                public List<String> getUrls() {
                    return urls;
                }

                public void setUrls(List<String> urls) {
                    this.urls = urls;
                }
            }

            public static class LiveModernDTO implements Serializable{
                @SerializedName("urls")
                private List<String> urls;

                public List<String> getUrls() {
                    return urls;
                }

                public void setUrls(List<String> urls) {
                    this.urls = urls;
                }
            }

            public static class LiveAnimalDTO implements Serializable{
                @SerializedName("urls")
                private List<String> urls;

                public List<String> getUrls() {
                    return urls;
                }

                public void setUrls(List<String> urls) {
                    this.urls = urls;
                }
            }
        }

    }

    private class MobileStickyAdsDTO {
        private String Admob = "";
        private String Facebook = "";
        private String Adx = "";

        public String getAdmob() {
            return Admob;
        }

        public void setAdmob(String admob) {
            this.Admob = admob;
        }

        public String getFacebook() {
            return Facebook;
        }

        public void setFacebook(String Facebook) {
            this.Facebook = Facebook;
        }

        public String getAdx() {
            return Adx;
        }

        public void setAdx(String adx) {
            this.Adx = adx;
        }
    }
}
