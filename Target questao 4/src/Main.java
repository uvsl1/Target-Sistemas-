public class Main {

    public static void main (String[] args) {

        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double others = 19849.53;
        double total = sp + rj + mg + es + others;

        double percentageSp = (sp / total) * 100;
        double percentageRJ = (rj / total) * 100;
        double percentageMG = (mg / total) * 100;
        double percentageEs = (es / total) * 100;
        double percentageOthers = (others / total) * 100;

        System.out.println("Percentual de representação por estado:");
        System.out.printf("SP: %.2f%%\n", percentageSp);
        System.out.printf("RJ: %.2f%%\n", percentageRJ);
        System.out.printf("MG: %.2f%%\n", percentageMG);
        System.out.printf("ES: %.2f%%\n", percentageEs);
        System.out.printf("Outros: %.2f%%\n", percentageOthers);
    }
}
