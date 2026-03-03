public class OPPSBannerApp6 {
    public class BannerOOPS {

    public static void main(String[] args) {

        // Build banner at declaration
        String[] banner = buildBanner();

        // Enhanced for loop to print
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Combine letters O O P S
    public static String[] buildBanner() {
        String[] o1 = buildO();
        String[] o2 = buildO();
        String[] p = buildP();
        String[] s = buildS();

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = o1[i] + "  " + o2[i] + "  " + p[i] + "  " + s[i];
        }

        return banner;
    }

    // Letter O (7x9)
    public static String[] buildO() {
        return new String[]{
                String.join("", "    ***   "),
                String.join("", "  **   ** "),
                String.join("", " ***   ***"),
                String.join("", " ***   ***"),
                String.join("", " ***   ***"),
                String.join("", "  **   ** "),
                String.join("", "    ***   ")
        };
    }

    // Letter P (7x9)
    public static String[] buildP() {
        return new String[]{
                String.join("", " ******  "),
                String.join("", "**     **"),
                String.join("", "**     **"),
                String.join("", "*******  "),
                String.join("", "**       "),
                String.join("", "**       "),
                String.join("", "**       ")
        };
    }

    // Letter S (7x9)
    public static String[] buildS() {
        return new String[]{
                String.join("", "  *****  "),
                String.join("", "  *       "),
                String.join("", " **      "),
                String.join("", " *****   "),
                String.join("", "    **   "),
                String.join("", "    *    "),
                String.join("", "*****   ")
        };
    }
}}