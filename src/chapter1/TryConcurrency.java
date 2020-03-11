package chapter1;

/**
 * @author Administrator
 */
public class TryConcurrency {
    public static void main(String[] args){
        enjoyMusic();
        BrowseNews();
    }

    private static void enjoyMusic() {
        System.out.println("enjoyMusic...");

    }

    private static void BrowseNews() {
        System.out.println("BrowseNews...");
    }
}
