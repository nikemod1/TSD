import java.io.*;

class program35 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String line;
        int count = 0;
        while ((line = br.readLine()) != null) {
            String[] words = line.split("\\s+");
            count += words.length;
        }
        System.out.println("Total words: " + count);
        br.close();
    }
}
