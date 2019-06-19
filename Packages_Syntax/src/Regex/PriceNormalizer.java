package Regex;

public class PriceNormalizer {

    public static void main(String[] args) {
        String s = "Hewlett Packard Enterprise India Pvt Ltd";
        String s2 = "HEWLETT PACKARD ENTERPRISE     SINGAPORE PTE. LTD";
        String output = s2.toUpperCase().trim()
                .replaceAll("\\(M\\)", "MULTIMEDIA")
                .replaceAll("[^\\w\\d\\s\\-]", "")
                .replaceAll("(\\s?(LIMITED)|(LTD)|(LLC))$", "").trim()
                .replaceAll("(\\s?(PVT)|(PTE)|(PRIVATE)|(PVT L))$", "")
                .replaceAll("(HEWLETT)[\\s\\-](PACKARD)", "$1-$2")
                .trim();
        System.out.println(output);

    }
}
