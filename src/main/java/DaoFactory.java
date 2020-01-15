public class DaoFactory {
    private static Ads adsDao;

    //switch out the ListAdsDao for your MySQLAdsDao
    private static Config config = new Config();

    public static Ads getAdsDao() {
        if (adsDao == null) {

            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }
}
