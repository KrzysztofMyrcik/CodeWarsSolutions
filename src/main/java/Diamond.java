class Diamond {
    public static String print(int n) {
        StringBuilder sb = new StringBuilder();
        if (n <= 0) {
            return null;
        }
        if ((n | 1) == n) {
            int levels = n;
            int temp = levels - 2;
            int levels2 = 0;
            int spaces = levels / 2;
            do {
                for (int i = 0; i < spaces; i++) {
                    sb.append(" ");
                }
                spaces -= 1;
                for (int i = 0; i <= levels2; i++) {
                    sb.append("*");
                }
                sb.append(System.getProperty("line.separator"));
                levels2 += 2;
            } while (levels2 <= temp);
            do {
                for (int i = 0; i < spaces; i++) {
                    sb.append(" ");
                }
                spaces += 1;
                for (int i = 0; i < levels; i++) {
                    sb.append("*");
                }
                sb.append(System.getProperty("line.separator"));
                levels -= 2;
            } while (levels > 0);
        } else {
            return null;
        }
        return sb.toString();
    }
}
