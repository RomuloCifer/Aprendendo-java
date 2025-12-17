public class DNA {
    public static void main(String[] args){
    // Exemplos de DNA com e sem proteína.
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    String dna4  = "ATGTGA";
    String dna5  = "CCCATGAAATTTTGA";
    String dna6  = "GGGATGCCCGGGAAATGA";
    String dna7  = "ATGAAACCCGGGTTTTGA";
    String dna8  = "ATGCGATAGA";
    String dna9  = "ATGCCCGGG";
    String dna10 = "CCCTGAATGAAA";
    String dna11 = "AAAAAA";
    String dna12 = "ATGTG";

    String[] dnas = {dna1, dna2, dna3, dna4, dna5, dna6, dna7, dna8, dna9, dna10, dna11, dna12};

    for (String dna : dnas) {
      System.out.println(checarProteina(dna));
    }
}

    public static boolean checarProteina(String proteina) {
        if (proteina.indexOf("ATG") < 0) {
            return false;
        }
        if (proteina.length() < 6) {
            return false;}

        int lastThree = proteina.length() - 3;
        int startDNA = proteina.indexOf("ATG")+3;
        if (proteina.substring(startDNA, lastThree).length() % 3 == 0 && proteina.substring(lastThree).equals("TGA")) {
            return true;} 

        return false;
    }
    
}