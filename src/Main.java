import java.io.*;

public class Main {

    public static void main(String[] args) {

        try {
            File file = new File("statistic.txt");
            File file1 = new File("text.txt");
            file.createNewFile();

            FileInputStream fis = new FileInputStream("text.txt");
            FileWriter fileWriter = new FileWriter("statistic.txt");

            int countSl = 0;
            int countSim = 0;

            byte[] bytesArray = new byte[(int) file1.length()];
            fis.read(bytesArray);
            String s = new String(bytesArray);
            String[] data = s.split(" ");
            for (int i = 0; i < data.length; i++) {
                countSl++;
            }
            for (int i = 0; i < s.length(); i++) {
                countSim++;
            }
            int spaceCount = 0;
            for (char c : s.toCharArray()) {
                if (c == ' ') {
                    spaceCount++;
                }
            }

            fileWriter.write("Слов в тексте: " + countSl);
            fileWriter.write("\nКол-во символов в тексте: " + countSim);
            fileWriter.write("\nКол-во символов в тексте без пробелов: " + (countSim - spaceCount));

            System.out.println(("Слов в тексте: " + countSl));
            System.out.println(("Кол-во символов в тексте: " + countSim));
            System.out.println(("Кол-во символов в тексте без пробелов: " + (countSim - spaceCount)));

            fileWriter.flush();
            fileWriter.close();

            } catch(IOException e){
                e.printStackTrace();
            }
        }
    }

