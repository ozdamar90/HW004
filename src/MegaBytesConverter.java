public class MegaBytesConverter {
    public static void main(String[] args) {
printMegaBytesAndKiloBytes(10000);
    }
    public static void printMegaBytesAndKiloBytes(int kilobytes){
        if (kilobytes<0){
            System.out.println("İnvalid Value");

        }else {
            int convertBytes=kilobytes;
            int megaByte=(convertBytes/1024);
            int remainingKiloByte=(convertBytes%1024);
            System.out.println(convertBytes+" KB="+megaByte+" MB and "+remainingKiloByte+" KB");
        }

    }

}
